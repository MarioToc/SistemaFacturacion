
package com.umg.reportes;

import com.umg.oracle.Conexion;
import java.awt.BorderLayout;
import java.awt.Container;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.view.JRViewer;


public class Grafica extends javax.swing.JInternalFrame {


    public Grafica() {
        initComponents();
        this.setTitle("Reporte Ganancia por Facturas");
    }
    
    public Grafica(String path) {
        this();
        try{
            Conexion conexion = new Conexion();  
            conexion.abrir();           
            JasperPrint print=JasperFillManager.fillReport(path, null,conexion.conexion);
            JRViewer viewer =new JRViewer(print);
            Container c = getContentPane();
            c.setLayout(new BorderLayout());
            c.add(viewer);
            conexion.cerrar();
        }catch(Exception jre){
            jre.printStackTrace();
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 794, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 418, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
