
package com.umg.internal;

import com.umg.oracle.Conexion;
import java.awt.event.KeyEvent;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Calendar;
import java.util.GregorianCalendar;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;


public class Ventas extends javax.swing.JInternalFrame {
    int idcliente, items;
    Conexion conexion;
    
    
    public Ventas() {
        initComponents();
        this.setTitle("Modulo de Ventas");
        activarcampos(false);
        textidproducto.setEnabled(false);
        
        limpiarcampos_cliente();
        limpiarcampos_producto();
        conexion = new Conexion(); 
        
        idcliente = 1;
        items = 0;
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        textnit = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        textnombre = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        textapellido = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        textdireccion = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        textidfactura = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        textprecio = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        textidproducto = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        textstock = new javax.swing.JTextField();
        textproducto = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        textcantidad = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabladetalle = new javax.swing.JTable();
        texttotal = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        realizarVenta = new javax.swing.JButton();
        cancelarVenta = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(0, 102, 255));
        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);

        jPanel2.setBackground(null);
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Facturacion"));

        jLabel4.setText("Buscar NIT:");

        textnit.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        textnit.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                textnitKeyPressed(evt);
            }
        });

        jLabel2.setText("Nombre:");

        jLabel5.setText("Apellido:");

        jLabel6.setText("Dirección:");

        jLabel7.setText("No. Factura:");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(textnit, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addGap(18, 18, 18)
                        .addComponent(textidfactura, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel6)
                                .addComponent(jLabel2))
                            .addGap(18, 18, 18)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(textdireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(textnombre, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addGap(7, 7, 7)
                            .addComponent(jLabel5)
                            .addGap(18, 18, 18)
                            .addComponent(textapellido, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel4)
                .addGap(12, 12, 12)
                .addComponent(textnit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(textnombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textapellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textdireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textidfactura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)))
        );

        jPanel3.setBackground(null);
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createTitledBorder("")), "Datos del Producto"));

        jLabel8.setText("Precio:");

        jLabel3.setText("Nombre:");

        jLabel10.setText("Codigo Producto:");

        textidproducto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                textidproductoKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                textidproductoKeyTyped(evt);
            }
        });

        jLabel9.setText("Stock:");

        jLabel11.setText("Cantidad:");

        textcantidad.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        textcantidad.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        textcantidad.setText("1");
        textcantidad.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                textcantidadKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                textcantidadKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel11)
                        .addGap(18, 18, 18)
                        .addComponent(textcantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addGap(18, 18, 18)
                        .addComponent(textprecio, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addGap(18, 18, 18)
                        .addComponent(textstock, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator2)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel10)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(18, 18, 18)
                                .addComponent(textproducto, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(textidproducto, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(63, Short.MAX_VALUE))))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(textidproducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(textproducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textprecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textstock, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textcantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11)))
        );

        tabladetalle.setBackground(null);
        tabladetalle.setFont(new java.awt.Font("sansserif", 0, 13)); // NOI18N
        tabladetalle.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Linea", "Idproducto", "Producto", "Precio", "Cantidad", "Subtotal"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tabladetalle);
        if (tabladetalle.getColumnModel().getColumnCount() > 0) {
            tabladetalle.getColumnModel().getColumn(0).setResizable(false);
            tabladetalle.getColumnModel().getColumn(1).setResizable(false);
            tabladetalle.getColumnModel().getColumn(2).setResizable(false);
            tabladetalle.getColumnModel().getColumn(3).setResizable(false);
            tabladetalle.getColumnModel().getColumn(4).setResizable(false);
            tabladetalle.getColumnModel().getColumn(5).setResizable(false);
        }

        texttotal.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N

        jLabel1.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        jLabel1.setText("TOTAL");

        realizarVenta.setText("Realizar Venta");
        realizarVenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                realizarVentaActionPerformed(evt);
            }
        });

        cancelarVenta.setText("Cancelar Venta");
        cancelarVenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelarVentaActionPerformed(evt);
            }
        });

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/umg/imagenes/icono_ventas.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 80, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 719, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(46, 46, 46)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(89, 89, 89)
                .addComponent(jLabel12)
                .addGap(143, 143, 143))
            .addGroup(layout.createSequentialGroup()
                .addGap(155, 155, 155)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(cancelarVenta, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(270, 270, 270)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(texttotal, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(realizarVenta, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(jLabel12))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(67, 67, 67)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(realizarVenta)
                .addGap(2, 2, 2)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(texttotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cancelarVenta))
                .addContainerGap(336, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    private void activarcampos(boolean sino) {
         
        this.textnombre.setEnabled(sino);
        this.textapellido.setEnabled(sino);
        this.textdireccion.setEnabled(sino);
        this.textidfactura.setEnabled(sino);
        
        this.textproducto.setEnabled(sino);        
        this.textprecio.setEnabled(sino);
        this.textstock.setEnabled(sino);        
        
    }
    private void limpiarcampos_cliente() {        
                
        this.textnombre.setText("");
        this.textapellido.setText("");
        this.textdireccion.setText("");
        this.textidfactura.setText("");

    }
    private void limpiarcampos_producto() {        
        this.textcantidad.setText("1");
       
        this.textproducto.setText("");      
        this.textprecio.setText("");
        this.textstock.setText("");

    }
    private void vaciartabla(JTable tb){
        DefaultTableModel mdl = (DefaultTableModel) tb.getModel();
        int tam = mdl.getRowCount();
        for (int i = 0; i < tam; i++) {
            mdl.removeRow(0);
        }
        tb.setModel(mdl);
        
    }
    private void agregarproducto() {        
    
        DefaultTableModel mdl = (DefaultTableModel) tabladetalle.getModel();
        String filas = String.valueOf( mdl.getRowCount() +1 );
        String idproducto = textidproducto.getText();
        String nombre = textproducto.getText();
        double cantidad = Double.parseDouble(textcantidad.getText());
        double precio = Double.parseDouble(textprecio.getText());
        double subtotal = (cantidad * precio);
        
        
        
        
        mdl.addRow(new String[] {filas,
                                 idproducto,
                                 nombre,
                                 String.valueOf(precio),
                                 String.valueOf(cantidad),
                                 String.valueOf(subtotal)});
        tabladetalle.setModel(mdl);
        limpiarcampos_producto();
        texttotal.setText(obtenerTotal());
        
    }
    private void guardarVenta(){
        
        int totalRow = tabladetalle.getRowCount();
        String sql = "";
        
        conexion.abrir();            
        sql = "INSERT INTO facturas VALUES ('" + 
            textidfactura.getText() + "','" + 
            String.valueOf(idcliente) + "'," + 
            "TO_DATE('"+obtenerFecha()+"', 'yyyy/mm/dd')" + ")";
                
        conexion.consulta(sql);
                
        for(int i=0;i<totalRow;i++){    
            sql = "INSERT INTO facturas_detalle VALUES ('" + 
                textidfactura.getText() + "','" + 
                String.valueOf(tabladetalle.getValueAt(i,0)) + "','" + 
                String.valueOf(tabladetalle.getValueAt(i,1)) + "','" + 
                String.valueOf(tabladetalle.getValueAt(i,4)) + "','" + 
                String.valueOf(tabladetalle.getValueAt(i,3)) + "')";
                conexion.consulta(sql);
        }  
    }
    
    private String obtenerfactura(){
        String respuesta = "0";
        int codigo = 0;   
        
        try {   
            conexion.abrir();
            conexion.consulta("SELECT MAX(idfactura) as resp from facturas");          
            
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
    private String obtenerFecha(){
        Calendar c = new GregorianCalendar();         
        String dia, mes, anio;       
        dia = Integer.toString(c.get(Calendar.DATE));
        mes = Integer.toString(c.get(Calendar.MONTH) + 1);
        anio = Integer.toString(c.get(Calendar.YEAR));  
        
        return String.valueOf(anio + "-" + mes +"-" + dia);     
        
    }
    private String obtenerTotal(){
        double total=0.0;
        int totalRow= tabladetalle.getRowCount();
        
        for(int i=0;i<totalRow;i++){            
            total+=Double.parseDouble(String.valueOf(tabladetalle.getValueAt(i,5)));;
        }
        return String.valueOf(total);
    }
    
    
    private void buscar_cliente() {
        boolean encontrar = false;
        try {            
            String nit = this.textnit.getText();
            conexion.abrir();
            conexion.consulta("SELECT * FROM clientes WHERE nit = '" + nit + "'");
            
            
            ResultSet datosBD = conexion.resultadoSQL;
            while (datosBD.next()) {                 
                    this.textnombre.setText(datosBD.getString("nombre"));
                    this.textapellido.setText(datosBD.getString("apellido"));
                    this.textdireccion.setText(datosBD.getString("direccion"));   
                    idcliente = Integer.parseInt(datosBD.getString("idcliente"));     
                    encontrar = true;
                    this.textidfactura.setText(obtenerfactura());
                    textidproducto.setEnabled(true);
                    textnit.transferFocus();
                    textidproducto.selectAll();
            }
        } catch (SQLException e) {
            System.out.println(""+e);
        }finally{
            conexion.cerrar();
        }
        if(encontrar==false){
            limpiarcampos_cliente();
        }
    }
    private void buscar_producto() {
        boolean encontrar = false;
        try {            
            String id = this.textidproducto.getText();
            conexion.abrir();
            conexion.consulta("SELECT * FROM productos WHERE idproducto = '" + id + "'");
            
            
            ResultSet datosBD = conexion.resultadoSQL;
            while (datosBD.next()) {                 
                    this.textproducto.setText(datosBD.getString("nombre"));
                    this.textprecio.setText(datosBD.getString("precio"));
                    this.textstock.setText(datosBD.getString("stock")); 
                    textidproducto.transferFocus();
                    textcantidad.selectAll();
                    encontrar = true;
            }
        } catch (SQLException e) {
            System.out.println(""+e);
        }finally{
            conexion.cerrar();
        }
        if(encontrar==false){
            limpiarcampos_producto();
        }
    }
    
    private void textnitKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textnitKeyPressed
        if(evt.getKeyCode()==KeyEvent.VK_ENTER){
            buscar_cliente();
            
        }else{
            limpiarcampos_cliente();
        }
    }//GEN-LAST:event_textnitKeyPressed

    private void textidproductoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textidproductoKeyPressed
        if(evt.getKeyCode()==KeyEvent.VK_ENTER){
            buscar_producto();
        }else{
            limpiarcampos_producto();
        }
    }//GEN-LAST:event_textidproductoKeyPressed
    private void textidproductoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textidproductoKeyTyped
        char c=evt.getKeyChar();
        if(Character.isLetter(c)) {
            getToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_textidproductoKeyTyped
    private void textcantidadKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textcantidadKeyPressed
        int cantidad = Integer.parseInt(textcantidad.getText());   
        int stock = Integer.parseInt(textstock.getText()); 
        
        if(evt.getKeyCode()==KeyEvent.VK_ENTER){
            if(cantidad > 0){
                if(cantidad <= stock){
                agregarproducto();                
                }else{
                    JOptionPane.showMessageDialog(null, "No hay suficientes productos en stock :(");
                }
                textcantidad.transferFocus();
                textidproducto.selectAll();
            }
            
        }   
        
    }//GEN-LAST:event_textcantidadKeyPressed

    private void textcantidadKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textcantidadKeyTyped
       char c=evt.getKeyChar();
        if(Character.isLetter(c)) {
            getToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_textcantidadKeyTyped

    private void realizarVentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_realizarVentaActionPerformed
        
        guardarVenta();
        vaciartabla(tabladetalle);
        limpiarcampos_cliente();
        limpiarcampos_producto();
        texttotal.setText("0.00");
        JOptionPane.showMessageDialog(null, "Venta Realizado Exitosamente!");


    }//GEN-LAST:event_realizarVentaActionPerformed

    private void cancelarVentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelarVentaActionPerformed
        
        int p = JOptionPane.showConfirmDialog(null, "¿Desea cancelar la venta :( ?", "SISFACT", JOptionPane.YES_NO_OPTION);
            if (p == 0) {
                vaciartabla(tabladetalle);
                limpiarcampos_cliente();
                limpiarcampos_producto(); 
                textidproducto.setText("");
                textnit.setText("CF");
                texttotal.setText("0.00");
            }
            
    }//GEN-LAST:event_cancelarVentaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cancelarVenta;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JButton realizarVenta;
    private javax.swing.JTable tabladetalle;
    private javax.swing.JTextField textapellido;
    private javax.swing.JTextField textcantidad;
    private javax.swing.JTextField textdireccion;
    private javax.swing.JTextField textidfactura;
    private javax.swing.JTextField textidproducto;
    private javax.swing.JTextField textnit;
    private javax.swing.JTextField textnombre;
    private javax.swing.JTextField textprecio;
    private javax.swing.JTextField textproducto;
    private javax.swing.JTextField textstock;
    private javax.swing.JTextField texttotal;
    // End of variables declaration//GEN-END:variables
}
