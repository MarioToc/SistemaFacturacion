package com.umg.oracle;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class Conexion {
    
    private final String host;
    private final String puerto;
    private final String esquema;
    private final String url;
    private final String usu;
    private final String pas;
    

    public Connection conexion;     //Crea la conexion del app al server mySQL
    public Statement consultaServer; //Envia nuestra consulta SQL al SERVER mySQL
    public PreparedStatement pConsultaServer;  //Ejecuta varias veces la sentencia SQL
    public ResultSet resultadoSQL;   //Resultado de las sentencias
    
    public Conexion() {       
        host = "localhost";
        puerto = "1521";
        esquema = "XE";
        usu = "FACT";
        pas = "mariotoc";
        url = "jdbc:oracle:thin:@" + host + ":" + puerto + ":" + esquema;        
    }
    
    public boolean abrir() {
        boolean conectado;
        try {
            conexion = DriverManager.getConnection(url, usu, pas);
            System.out.println("Conectado");
            conectado  = true;
        }catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error de conexión: " + e);
            conectado = false;
        }
        return conectado;
    }
    public void cerrar() {
        try {
            conexion.close();
            System.out.println("Desconectado");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "No es posible cerrar la conexión: " + ex);
        }
    }
    public void consulta(String sql) {
        try {
            consultaServer = conexion.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_READ_ONLY);
            resultadoSQL = consultaServer.executeQuery(sql);
            
        } catch (SQLException e) {
            
            System.out.println(sql);
            System.out.println(e);
            if(e.toString().contains("SQLIntegrityConstraintViolationException")){
                JOptionPane.showMessageDialog(null, "No es posible eliminar registro, porque tiene relacion con otro registro");
            }else{
                JOptionPane.showMessageDialog(null, "Un comando SQL no funciona: " + e );
            }
        }
    }
    
}
