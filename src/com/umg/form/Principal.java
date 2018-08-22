package com.umg.form;
import com.umg.internal.Categorias;
import com.umg.internal.Clientes;
import com.umg.internal.Productos;
import com.umg.internal.Usuarios;
import com.umg.internal.Ventas;
import com.umg.reportes.GananciaFactura;
import com.umg.reportes.Grafica;

import com.umg.reportes.Inventario;
import com.umg.reportes.MejoresClientes;
import com.umg.reportes.ProductosVendidos;
import java.awt.Dimension;
import java.beans.PropertyVetoException;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JInternalFrame;
import javax.swing.JOptionPane;


public class Principal extends javax.swing.JFrame {

    public Principal() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setExtendedState(JFrame.MAXIMIZED_BOTH);
        this.setTitle("SISTEMA DE FACTURACION");
        this.setIconImage(new ImageIcon(getClass().getResource("/com/umg/imagenes/facturacion.png")).getImage()); 
        
    
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        desktopPane = new javax.swing.JDesktopPane();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        menuBar = new javax.swing.JMenuBar();
        fileMenu = new javax.swing.JMenu();
        menuUsuarios = new javax.swing.JMenu();
        menuClientes = new javax.swing.JMenu();
        menuCategorias = new javax.swing.JMenu();
        menuProductos = new javax.swing.JMenu();
        menuVentas = new javax.swing.JMenu();
        menuReportes = new javax.swing.JMenu();
        submenuProductos = new javax.swing.JMenuItem();
        submenuInventario = new javax.swing.JMenuItem();
        submenuMejoresClientes = new javax.swing.JMenuItem();
        submenuGanancias = new javax.swing.JMenuItem();
        submenuGraficaGanancias = new javax.swing.JMenuItem();
        menusalir = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        desktopPane.setBackground(new java.awt.Color(153, 255, 204));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/umg/imagenes/factura1.png"))); // NOI18N
        desktopPane.add(jLabel1);
        jLabel1.setBounds(130, 160, 390, 300);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/umg/imagenes/facturaccc.png"))); // NOI18N
        desktopPane.add(jLabel2);
        jLabel2.setBounds(680, 140, 440, 370);

        jTextField1.setFont(new java.awt.Font("Cooper Black", 0, 48)); // NOI18N
        jTextField1.setText("SISTEMA DE FACTURACION ");
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        desktopPane.add(jTextField1);
        jTextField1.setBounds(260, 40, 740, 62);

        menuBar.setBackground(new java.awt.Color(51, 51, 255));
        menuBar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        fileMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/umg/imagenes/facturacion.png"))); // NOI18N
        fileMenu.setMnemonic('f');
        fileMenu.setText("INICIO");
        menuBar.add(fileMenu);

        menuUsuarios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/umg/imagenes/user.png"))); // NOI18N
        menuUsuarios.setText("USUARIOS");
        menuUsuarios.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menuUsuariosMouseClicked(evt);
            }
        });
        menuBar.add(menuUsuarios);

        menuClientes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/umg/imagenes/user-add.png"))); // NOI18N
        menuClientes.setText("CLIENTES");
        menuClientes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menuClientesMouseClicked(evt);
            }
        });
        menuBar.add(menuClientes);

        menuCategorias.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/umg/imagenes/Inventory-maintenance.png"))); // NOI18N
        menuCategorias.setMnemonic('h');
        menuCategorias.setText("CATEGORIAS");
        menuCategorias.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menuCategoriasMouseClicked(evt);
            }
        });
        menuBar.add(menuCategorias);

        menuProductos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/umg/imagenes/product.png"))); // NOI18N
        menuProductos.setMnemonic('e');
        menuProductos.setText("PRODUCTOS");
        menuProductos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menuProductosMouseClicked(evt);
            }
        });
        menuBar.add(menuProductos);

        menuVentas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/umg/imagenes/shopping-bag-blue.png"))); // NOI18N
        menuVentas.setText("VENTAS");
        menuVentas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menuVentasMouseClicked(evt);
            }
        });
        menuBar.add(menuVentas);

        menuReportes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/umg/imagenes/pie-chart.png"))); // NOI18N
        menuReportes.setText("REPORTES");

        submenuProductos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/umg/imagenes/budget.png"))); // NOI18N
        submenuProductos.setText("Productos Mas Vendidos");
        submenuProductos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submenuProductosActionPerformed(evt);
            }
        });
        menuReportes.add(submenuProductos);

        submenuInventario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/umg/imagenes/Inventory-maintenance.png"))); // NOI18N
        submenuInventario.setText("Inventario");
        submenuInventario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submenuInventarioActionPerformed(evt);
            }
        });
        menuReportes.add(submenuInventario);

        submenuMejoresClientes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/umg/imagenes/Star-full32.png"))); // NOI18N
        submenuMejoresClientes.setText("Mejores Clientes");
        submenuMejoresClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submenuMejoresClientesActionPerformed(evt);
            }
        });
        menuReportes.add(submenuMejoresClientes);

        submenuGanancias.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/umg/imagenes/US-dollar.png"))); // NOI18N
        submenuGanancias.setText("Ganancias por Facturas");
        submenuGanancias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submenuGananciasActionPerformed(evt);
            }
        });
        menuReportes.add(submenuGanancias);

        submenuGraficaGanancias.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/umg/imagenes/Account.png"))); // NOI18N
        submenuGraficaGanancias.setText("Grafica de Ganancias por Fecha");
        submenuGraficaGanancias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submenuGraficaGananciasActionPerformed(evt);
            }
        });
        menuReportes.add(submenuGraficaGanancias);

        menuBar.add(menuReportes);

        menusalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/umg/imagenes/back.png"))); // NOI18N
        menusalir.setText("SALIR");
        menusalir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menusalirMouseClicked(evt);
            }
        });
        menuBar.add(menusalir);

        setJMenuBar(menuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(desktopPane, javax.swing.GroupLayout.DEFAULT_SIZE, 1009, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(desktopPane, javax.swing.GroupLayout.DEFAULT_SIZE, 458, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    public void centerJIF(JInternalFrame jif) {
        Dimension desktopSize = this.desktopPane.getSize();
        Dimension jInternalFrameSize = jif.getSize();
        int width = (desktopSize.width - jInternalFrameSize.width) / 2;
        int height = (desktopSize.height - jInternalFrameSize.height) / 2;
        jif.setLocation(width, height);
        jif.setVisible(true);
    }
    
    private void menuUsuariosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuUsuariosMouseClicked
        Usuarios form = new Usuarios();  
        boolean mostrar = true;

        for (int a=0;a<this.desktopPane.getComponentCount();a++){  
            if( form.getClass().isInstance( desktopPane.getComponent(a) )){
                mostrar=false;
            }
        }
        if(mostrar){ 
            this.desktopPane.add(form);
            try {
                form.setMaximum(true);
            } catch (PropertyVetoException e) {
                System.out.println("error: "+e);
            }
            form.toFront();
            form.setVisible(true);        
        }



    }//GEN-LAST:event_menuUsuariosMouseClicked
    private void menuCategoriasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuCategoriasMouseClicked
        Categorias form = new Categorias();  
        boolean mostrar = true;

        for (int a=0;a<this.desktopPane.getComponentCount();a++){  
            if( form.getClass().isInstance( desktopPane.getComponent(a) )){
                mostrar=false;
            }
        }
        if(mostrar){ 
            this.desktopPane.add(form);
            try {
                form.setMaximum(true);
            } catch (PropertyVetoException e) {
                System.out.println("error: "+e);
            }
            form.toFront();
            form.setVisible(true);        
        }
    }//GEN-LAST:event_menuCategoriasMouseClicked
    private void menuProductosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuProductosMouseClicked
        Productos form = new Productos();  
        boolean mostrar = true;

        for (int a=0;a<this.desktopPane.getComponentCount();a++){  
            if( form.getClass().isInstance( desktopPane.getComponent(a) )){
                mostrar=false;
            }
        }
        if(mostrar){ 
            this.desktopPane.add(form);
            try {
                form.setMaximum(true);
            } catch (PropertyVetoException e) {
                System.out.println("error: "+e);
            }
            form.toFront();
            form.setVisible(true);        
        }
    }//GEN-LAST:event_menuProductosMouseClicked
    private void menuVentasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuVentasMouseClicked
        Ventas form = new Ventas();  
        boolean mostrar = true;

        for (int a=0;a<this.desktopPane.getComponentCount();a++){  
            if( form.getClass().isInstance( desktopPane.getComponent(a) )){
                mostrar=false;
            }
        }
        if(mostrar){ 
            this.desktopPane.add(form);
            try {
                form.setMaximum(true);
            } catch (PropertyVetoException e) {
                System.out.println("error: "+e);
            }
            form.toFront();
            form.setVisible(true);        
        }
    }//GEN-LAST:event_menuVentasMouseClicked

    //SUBMENU REPORTES
    private void submenuProductosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submenuProductosActionPerformed
        
        String path = System.getProperty("user.dir").concat("/src/com/umg/jasper/productos.jasper");
        
        ProductosVendidos form = new ProductosVendidos(path);  
        boolean mostrar = true;

        for (int a=0;a<this.desktopPane.getComponentCount();a++){  
            if( form.getClass().isInstance( desktopPane.getComponent(a) )){
                mostrar=false;
            }
        }
        
        if(mostrar){ 
            this.desktopPane.add(form);
            try {
                form.setMaximum(true);
            } catch (PropertyVetoException e) {
                System.out.println("error: "+e);
            }
            form.toFront();
            form.setVisible(true);        
        }
    }//GEN-LAST:event_submenuProductosActionPerformed
    private void submenuInventarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submenuInventarioActionPerformed
        
        String path = System.getProperty("user.dir").concat("/src/com/umg/jasper/inventario.jasper");
        
        Inventario form = new Inventario(path);  
        boolean mostrar = true;

        for (int a=0;a<this.desktopPane.getComponentCount();a++){  
            if( form.getClass().isInstance( desktopPane.getComponent(a) )){
                mostrar=false;
            }
        }
        
        if(mostrar){ 
            this.desktopPane.add(form);
            try {
                form.setMaximum(true);
            } catch (PropertyVetoException e) {
                System.out.println("error: "+e);
            }
            form.toFront();
            form.setVisible(true);        
        }
    }//GEN-LAST:event_submenuInventarioActionPerformed
    private void submenuMejoresClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submenuMejoresClientesActionPerformed
        String path = System.getProperty("user.dir").concat("/src/com/umg/jasper/mejoresclientes.jasper");
        
        MejoresClientes form = new MejoresClientes(path);  
        boolean mostrar = true;

        for (int a=0;a<this.desktopPane.getComponentCount();a++){  
            if( form.getClass().isInstance( desktopPane.getComponent(a) )){
                mostrar=false;
            }
        }
        
        if(mostrar){ 
            this.desktopPane.add(form);
            try {
                form.setMaximum(true);
            } catch (PropertyVetoException e) {
                System.out.println("error: "+e);
            }
            form.toFront();
            form.setVisible(true);        
        }
        
    }//GEN-LAST:event_submenuMejoresClientesActionPerformed
    private void submenuGananciasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submenuGananciasActionPerformed
        String path = System.getProperty("user.dir").concat("/src/com/umg/jasper/gananciafactura.jasper");
        
        GananciaFactura form = new GananciaFactura(path);  
        boolean mostrar = true;
        //src/com/umg/jasper

        for (int a=0;a<this.desktopPane.getComponentCount();a++){  
            if( form.getClass().isInstance( desktopPane.getComponent(a) )){
                mostrar=false;
            }
        }
        if(mostrar){ 
            this.desktopPane.add(form);
            try {
                form.setMaximum(true);
            } catch (PropertyVetoException e) {
                System.out.println("error: "+e);
            }
            form.toFront();
            form.setVisible(true);        
        }
    }//GEN-LAST:event_submenuGananciasActionPerformed

    
    private void menusalirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menusalirMouseClicked
       
            int p = JOptionPane.showConfirmDialog(null, "¿Desea salir del sistema?", "SISFACT", JOptionPane.YES_NO_OPTION);
            if (p == 0) {
                System.exit(0);                     
            }
    }//GEN-LAST:event_menusalirMouseClicked
    private void menuClientesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuClientesMouseClicked
        
        Clientes form = new Clientes();  
        boolean mostrar = true;

        for (int a=0;a<this.desktopPane.getComponentCount();a++){  
            if( form.getClass().isInstance( desktopPane.getComponent(a) )){
                mostrar=false;
            }
        }
        if(mostrar){ 
            this.desktopPane.add(form);
            try {
                form.setMaximum(true);
            } catch (PropertyVetoException e) {
                System.out.println("error: "+e);
            }
            form.toFront();
            form.setVisible(true);        
        }
              
        
    }//GEN-LAST:event_menuClientesMouseClicked

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void submenuGraficaGananciasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submenuGraficaGananciasActionPerformed
String path = System.getProperty("user.dir").concat("/src/com/umg/jasper/Grafica.jasper");
        
        Grafica form = new Grafica(path);  
        boolean mostrar = true;
        //src/com/umg/jasper

        for (int a=0;a<this.desktopPane.getComponentCount();a++){  
            if( form.getClass().isInstance( desktopPane.getComponent(a) )){
                mostrar=false;
            }
        }
        if(mostrar){ 
            this.desktopPane.add(form);
            try {
                form.setMaximum(true);
            } catch (PropertyVetoException e) {
                System.out.println("error: "+e);
            }
            form.toFront();
            form.setVisible(true);        
        }        // TODO add your handling code here:
    }//GEN-LAST:event_submenuGraficaGananciasActionPerformed


    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane desktopPane;
    private javax.swing.JMenu fileMenu;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JMenu menuCategorias;
    private javax.swing.JMenu menuClientes;
    private javax.swing.JMenu menuProductos;
    private javax.swing.JMenu menuReportes;
    private javax.swing.JMenu menuUsuarios;
    private javax.swing.JMenu menuVentas;
    private javax.swing.JMenu menusalir;
    private javax.swing.JMenuItem submenuGanancias;
    private javax.swing.JMenuItem submenuGraficaGanancias;
    private javax.swing.JMenuItem submenuInventario;
    private javax.swing.JMenuItem submenuMejoresClientes;
    private javax.swing.JMenuItem submenuProductos;
    // End of variables declaration//GEN-END:variables

}
