
package com.umg.internal;

import com.umg.oracle.Conexion;
import java.awt.event.KeyEvent;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

public class Usuarios extends javax.swing.JInternalFrame {

    int opcion;
    Conexion conexion;
    
    public Usuarios() {
        initComponents();
        this.setTitle("Administración de Usuarios");
        conexion = new Conexion();    
        textcodigo.setEnabled(false);
        busqueda.setEnabled(false);
        btnGuardar.setEnabled(false);
        btnSalir.setEnabled(false);   
        activarcampos(false);
        tablaregistros.setModel(cargar_registros());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        textcontrasena = new javax.swing.JPasswordField();
        jLabel2 = new javax.swing.JLabel();
        textusuario = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        textnombre = new javax.swing.JTextField();
        textapellido = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        textcodigo = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        btnSalir = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnNuevo = new javax.swing.JButton();
        btnGuardar = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        busqueda = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaregistros = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(0, 102, 255));
        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createTitledBorder("")), "Datos del Usuario"));

        jLabel5.setText("Nombre:");

        jLabel6.setText("Apellido:");

        jLabel2.setText("Contraseña:");

        jLabel1.setText("Usuario:");

        jLabel10.setText("Codigo Usuario");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel10)
                        .addGap(18, 18, 18)
                        .addComponent(textcodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel5)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(textapellido, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(textnombre, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(textcontrasena, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(textusuario, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(77, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textcodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textusuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textcontrasena, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textnombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textapellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addContainerGap(63, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Opciones"));

        btnSalir.setText("Cancelar");
        btnSalir.setToolTipText("Cancelar");
        btnSalir.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnSalir.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        btnSalir.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        btnEliminar.setText("Borrar");
        btnEliminar.setToolTipText("Eliminar Usuario");
        btnEliminar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnEliminar.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        btnEliminar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        btnNuevo.setText("Nuevo");
        btnNuevo.setToolTipText("Nuevo Usuario");
        btnNuevo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnNuevo.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        btnNuevo.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoActionPerformed(evt);
            }
        });

        btnGuardar.setText("Guardar");
        btnGuardar.setToolTipText("Guardar Cambios");
        btnGuardar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnGuardar.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        btnGuardar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        btnEditar.setText("Editar");
        btnEditar.setToolTipText("Modificar Usuario");
        btnEditar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnEditar.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        btnEditar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });

        jLabel4.setText("Buscar por Codigo:");

        busqueda.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        busqueda.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                busquedaKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                busquedaKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel4)
                    .addComponent(busqueda)
                    .addComponent(btnNuevo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnEditar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnEliminar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnGuardar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnSalir, javax.swing.GroupLayout.DEFAULT_SIZE, 133, Short.MAX_VALUE))
                .addContainerGap(39, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel4)
                .addGap(12, 12, 12)
                .addComponent(busqueda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnNuevo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnEditar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnEliminar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnGuardar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnSalir)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        tablaregistros.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tablaregistros.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaregistrosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tablaregistros);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/umg/imagenes/userrr.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(80, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 683, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(48, 48, 48)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(72, 72, 72)
                        .addComponent(jLabel3)))
                .addGap(75, 75, 75))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addComponent(jLabel3))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(32, 32, 32)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(81, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    private void buscar_registrios(int index) {
        try {
            int row = tablaregistros.getSelectedRow();
            String usu = tablaregistros.getModel().getValueAt(row+index, 0).toString();
            conexion.abrir();
            conexion.consulta("SELECT * FROM usuarios WHERE idusuario= '" + usu + "'");
            ResultSet datosBD = conexion.resultadoSQL;
            while (datosBD.next()) {
                    this.textcodigo.setText(datosBD.getString("idusuario"));
                    this.textcontrasena.setText(datosBD.getString("contrasena"));
                    this.textnombre.setText(datosBD.getString("nombre"));
                    this.textapellido.setText(datosBD.getString("apellido"));
                    this.textusuario.setText(datosBD.getString("usuario"));                    
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }finally{
            conexion.cerrar();
        }
    }
    private void buscar_registrios() {
        boolean encontrar = false;
        try {            
            String usu = this.busqueda.getText();
            conexion.abrir();
            conexion.consulta("SELECT * FROM usuarios WHERE idusuario= '" + usu + "'");
            
            
            ResultSet datosBD = conexion.resultadoSQL;
            while (datosBD.next()) {
                    this.textcodigo.setText(datosBD.getString("idusuario"));
                    this.textcontrasena.setText(datosBD.getString("contrasena"));
                    this.textnombre.setText(datosBD.getString("nombre"));
                    this.textapellido.setText(datosBD.getString("apellido"));
                    this.textusuario.setText(datosBD.getString("usuario"));     
                    encontrar = true;
            }
        } catch (SQLException e) {
            System.out.println(""+e);
        }finally{
            conexion.cerrar();
        }
        if(encontrar==false){
            limpiarcampos();
        }
    }
    private void limpiarcampos() {
        this.textcodigo.setText("");
        this.textusuario.setText("");
        this.textcontrasena.setText("");
        this.textnombre.setText("");
        this.textapellido.setText("");
    }
    private void activarcampos(boolean sino) {
 
        this.textusuario.setEnabled(sino);
        this.textcontrasena.setEnabled(sino);
        this.textnombre.setEnabled(sino);
        this.textapellido.setEnabled(sino);
    }
    private String obtenercodigo(){
        String respuesta = "0";
        int codigo = 0;   
        
        try {   
            conexion.abrir();
            conexion.consulta("SELECT COUNT(1) as resp from usuarios");          
            
            ResultSet datosBD = conexion.resultadoSQL;
            while (datosBD.next()) {
                codigo = Integer.parseInt(datosBD.getString("resp"));                
                respuesta = String.valueOf(codigo+1);
            }
        } catch (SQLException e) {
            System.out.println(""+e);
        }finally{
            conexion.cerrar();
        }    
        return respuesta;
    }
    
    private TableModel cargar_registros() {
        Object[] titulo = {"Codigo", "Usuarios", "Contraseña", "Nombre", "Apellido"};
        DefaultTableModel mdlUsuarios = new DefaultTableModel(null, titulo) {
            @Override
            public boolean isCellEditable(int row, int colum) {
                return false;
            }
        };
        try {
            this.conexion.abrir();
            conexion.consulta("SELECT * FROM usuarios");

            while (conexion.resultadoSQL.next()) {
     
                mdlUsuarios.addRow(new Object[]{
                    conexion.resultadoSQL.getString("idusuario"),
                    conexion.resultadoSQL.getString("usuario"),
                    conexion.resultadoSQL.getString("contrasena"),
                    conexion.resultadoSQL.getString("nombre"),
                    conexion.resultadoSQL.getString("apellido")                    
                });
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        } finally {
            conexion.cerrar();
        }
        return mdlUsuarios;
    }
    
    private void guardar() {
        if (!"".equals(textusuario.getText()) && 
            !"".equals(textcontrasena.getText()) && 
            !"".equals(textnombre.getText())&&
            !"".equals(textapellido.getText()) ) {
            conexion.abrir();
            conexion.consulta("INSERT INTO usuarios VALUES ('" + 
                    textcodigo.getText() + "','" + textnombre.getText() + "','" + textapellido.getText()
                    + "','" + textusuario.getText() + "','" + textcontrasena.getText() + "')");
            conexion.cerrar();
            JOptionPane.showMessageDialog(null, "Registro guardado exitosamente");
        }else {
            JOptionPane.showMessageDialog(null, "Favor ingrese informacion en los campos");
        }
    }
    private void modificar() {        
        if (!"".equals(textusuario.getText()) && 
            !"".equals(textcontrasena.getText()) && 
            !"".equals(textnombre.getText())&&
            !"".equals(textapellido.getText()) ) {
            conexion.abrir();
            conexion.consulta("UPDATE usuarios SET nombre = '" + textnombre.getText() 
                    + "', apellido = '" + textapellido.getText()
                    + "', usuario = '" + textusuario.getText() 
                    + "', contrasena = '" + textcontrasena.getText() 
                    + "'  WHERE idusuario = '"+textcodigo.getText()+"'");
            conexion.cerrar();
            JOptionPane.showMessageDialog(null, "Registro actualizado exitosamente");
        }else {
            JOptionPane.showMessageDialog(null, "Favor ingrese informacion en los campos");
        }     
         
        
    }
    private void eliminar() {       
       int p = JOptionPane.showConfirmDialog(null, "¿Desea Eliminar el registro?", "SISFACT", JOptionPane.YES_NO_OPTION);
            if (p == 0) {
                conexion.abrir();
                conexion.consulta("DELETE FROM usuarios WHERE idusuario = '" + textcodigo.getText()+"'");
                JOptionPane.showMessageDialog(null, "Registro eliminado exitosamente");
                conexion.cerrar();                    
            }
    }
    
    
    private void busquedaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_busquedaKeyPressed
        if(evt.getKeyCode()==KeyEvent.VK_ENTER){
            buscar_registrios();            
        }else{
            limpiarcampos();
        }
    }//GEN-LAST:event_busquedaKeyPressed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        opcion = 2;
        limpiarcampos();
        activarcampos(true);
        busqueda.setEnabled(true);
        busqueda.selectAll();

        btnNuevo.setEnabled(false);
        btnEditar.setEnabled(false);
        btnEliminar.setEnabled(false);

        btnGuardar.setEnabled(true);
        btnSalir.setEnabled(true);
        
    }//GEN-LAST:event_btnEditarActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        switch(opcion){
            case 1: guardar();break;
            case 2: modificar();break;
            case 3: eliminar();break;
        }

        tablaregistros.setModel(cargar_registros());
        limpiarcampos();
        activarcampos(false);
        btnGuardar.setEnabled(false);
        btnSalir.setEnabled(false);
        busqueda.setEnabled(false);
        

        btnNuevo.setEnabled(true);
        btnEditar.setEnabled(true);
        btnEliminar.setEnabled(true);
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoActionPerformed
        opcion = 1;
       
        
        limpiarcampos();
        activarcampos(true);
        
        this.textcodigo.setText(obtenercodigo());
        
        btnNuevo.setEnabled(false);
        btnEditar.setEnabled(false);
        btnEliminar.setEnabled(false);

        btnGuardar.setEnabled(true);
        btnSalir.setEnabled(true);
    }//GEN-LAST:event_btnNuevoActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        opcion = 3;
        limpiarcampos();
        activarcampos(false);
        busqueda.setEnabled(true);
        busqueda.selectAll();

        btnNuevo.setEnabled(false);
        btnEditar.setEnabled(false);
        btnEliminar.setEnabled(false);

        btnGuardar.setEnabled(true);
        btnSalir.setEnabled(true);
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        limpiarcampos();
        activarcampos(false);

        btnNuevo.setEnabled(true);
        btnEditar.setEnabled(true);
        btnEliminar.setEnabled(true);

        btnGuardar.setEnabled(false);
        btnSalir.setEnabled(false);
        busqueda.setEnabled(false);
        
    }//GEN-LAST:event_btnSalirActionPerformed

    private void busquedaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_busquedaKeyTyped
        char c=evt.getKeyChar();              
        if(Character.isLetter(c)) { 
            getToolkit().beep();                
            evt.consume();            
        } 
    }//GEN-LAST:event_busquedaKeyTyped

    private void tablaregistrosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaregistrosMouseClicked
       buscar_registrios(0);
    }//GEN-LAST:event_tablaregistrosMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnNuevo;
    private javax.swing.JButton btnSalir;
    private javax.swing.JTextField busqueda;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tablaregistros;
    private javax.swing.JTextField textapellido;
    private javax.swing.JTextField textcodigo;
    private javax.swing.JPasswordField textcontrasena;
    private javax.swing.JTextField textnombre;
    private javax.swing.JTextField textusuario;
    // End of variables declaration//GEN-END:variables

  
}
