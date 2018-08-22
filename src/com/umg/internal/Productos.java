
package com.umg.internal;

import com.umg.oracle.Conexion;
import java.awt.event.KeyEvent;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

public class Productos extends javax.swing.JInternalFrame {
    int opcion;
    Conexion conexion;
    
    public Productos() {
        initComponents();
        this.setTitle("Administración de Productos");
        conexion = new Conexion();    
        textcodigo.setEnabled(false);
        busqueda.setEnabled(false);
        btnGuardar.setEnabled(false);
        btnSalir.setEnabled(false);   
        activarcampos(false);
        tablaregistros.setModel(cargar_registros());
        listar_categorias();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        btnSalir = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnNuevo = new javax.swing.JButton();
        btnGuardar = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        busqueda = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        textcosto = new javax.swing.JTextField();
        textprecio = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        textcodigo = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        textstock = new javax.swing.JTextField();
        textnombre = new javax.swing.JTextField();
        textcategoria = new javax.swing.JComboBox<String>();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaregistros = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(0, 102, 255));
        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);

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
                .addContainerGap(27, Short.MAX_VALUE))
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
                .addContainerGap(26, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createTitledBorder("")), "Datos del Producto"));

        jLabel5.setText("Costo:");

        jLabel6.setText("Precio:");

        jLabel2.setText("Nombre:");

        jLabel1.setText("Categoria:");

        textcosto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                textcostoKeyTyped(evt);
            }
        });

        textprecio.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                textprecioKeyTyped(evt);
            }
        });

        jLabel10.setText("Codigo Producto:");

        jLabel7.setText("Stock:");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel5)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(textprecio)
                            .addComponent(textcosto)
                            .addComponent(textnombre)
                            .addComponent(textcategoria, 0, 218, Short.MAX_VALUE)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addGap(18, 18, 18)
                        .addComponent(textcodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addGap(18, 18, 18)
                        .addComponent(textstock, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(139, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textcodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(textcategoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(textnombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textcosto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textprecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textstock, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addContainerGap(75, Short.MAX_VALUE))
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

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/umg/imagenes/productos.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(143, 143, 143)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(83, 83, 83)
                        .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(50, 50, 50)
                        .addComponent(jLabel3)
                        .addGap(9, 9, 9)))
                .addGap(27, 27, 27))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(106, 106, 106)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buscar_registrios(int index) {

        try {
            int row = tablaregistros.getSelectedRow();
            String usu = tablaregistros.getModel().getValueAt(row+index, 0).toString();
            conexion.abrir();
            conexion.consulta("select p.idproducto, c.idcategoria || '-' || c.nombre as categoria, p.nombre, p.costo, p.precio, p.stock "+
                    "from productos p join categorias c on (p.idcategoria = c.idcategoria) WHERE idproducto = '" + usu + "'");
            
            ResultSet datosBD = conexion.resultadoSQL;
            while (datosBD.next()) {
                    this.textcodigo.setText(datosBD.getString("idproducto"));
                    this.textcategoria.setSelectedItem(datosBD.getString("categoria"));
                    this.textnombre.setText(datosBD.getString("nombre"));
                    this.textcosto.setText(datosBD.getString("costo"));
                    this.textprecio.setText(datosBD.getString("precio"));   
                    this.textstock.setText(datosBD.getString("stock"));  
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
            conexion.consulta("select p.idproducto, c.idcategoria || '-' || c.nombre as categoria, p.nombre, p.costo, p.precio, p.stock "+
                    "from productos p join categorias c on (p.idcategoria = c.idcategoria) WHERE idproducto = '" + usu + "'");
            
            
            ResultSet datosBD = conexion.resultadoSQL;
            while (datosBD.next()) {
                    this.textcodigo.setText(datosBD.getString("idproducto"));
                    this.textcategoria.setSelectedItem(datosBD.getString("categoria"));
                    this.textnombre.setText(datosBD.getString("nombre"));
                    this.textcosto.setText(datosBD.getString("costo"));
                    this.textprecio.setText(datosBD.getString("precio"));   
                    this.textstock.setText(datosBD.getString("stock"));    
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
        //this.textcategoria.setText("");
        this.textnombre.setText("");
        this.textcosto.setText("");
        this.textprecio.setText("");  
        this.textstock.setText("");

    }
    private void activarcampos(boolean sino) {
         
        this.textcategoria.setEnabled(sino);
        this.textnombre.setEnabled(sino);
        this.textcosto.setEnabled(sino);
        this.textprecio.setEnabled(sino);
        this.textstock.setEnabled(sino);
        
        
    }
    private String obtenercodigo(){
        String respuesta = "0";
        int codigo = 0;   
        
        try {   
            conexion.abrir();
            conexion.consulta("SELECT MAX(idproducto) as resp from productos");          
            
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
    private void listar_categorias(){
        
        textcategoria.removeAllItems();
        textcategoria.addItem("Seleccione");
        conexion.abrir();
        conexion.consulta("SELECT * FROM categorias");
        try {
            while (conexion.resultadoSQL.next()) {
                textcategoria.addItem(conexion.resultadoSQL.getString("idcategoria")+"-"+conexion.resultadoSQL.getString("nombre"));
            }
        } catch (SQLException ex) {
            System.out.println(""+ex);
        }finally{
            conexion.cerrar();
        }
        

    }
    
    
    private TableModel cargar_registros() {
        Object[] titulo = {"Codigo", "Categoria", "Nombre", "Costo","Precio","Stock"};
        DefaultTableModel mdlUsuarios = new DefaultTableModel(null, titulo) {
            @Override
            public boolean isCellEditable(int row, int colum) {
                return false;
            }
        };
        try {
            this.conexion.abrir();
            conexion.consulta("select p.idproducto, c.idcategoria || '-' || c.nombre as categoria, p.nombre, p.costo, p.precio, p.stock "+
                    "from productos p join categorias c on (p.idcategoria = c.idcategoria)");

            while (conexion.resultadoSQL.next()) {
     
                mdlUsuarios.addRow(new Object[]{
                    conexion.resultadoSQL.getString("idproducto"),
                    conexion.resultadoSQL.getString("categoria"),
                    conexion.resultadoSQL.getString("nombre"),
                    conexion.resultadoSQL.getString("costo"),
                    conexion.resultadoSQL.getString("precio") ,
                    conexion.resultadoSQL.getString("stock")
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
        
        String item = (String) textcategoria.getSelectedItem();        
        String[] items = item.split("-");        
        String categoria = items[0];
        
        
        if (!"".equals(textcodigo.getText()) && 
            !"".equals(categoria) && 
            !"".equals(textnombre.getText()) && 
            !"".equals(textcosto.getText()) && 
            !"".equals(textprecio.getText()) && 
            !"".equals(textstock.getText())) {
            conexion.abrir();
            conexion.consulta("INSERT INTO productos VALUES ('" + 
                    textcodigo.getText() + "','" + 
                    categoria + "','" + 
                    textnombre.getText() + "','" + 
                    textcosto.getText() + "','" + 
                    textprecio.getText() + "','" + 
                    textstock.getText() + "')");
            conexion.cerrar();
            JOptionPane.showMessageDialog(null, "Registro guardado exitosamente");
        }else {
            JOptionPane.showMessageDialog(null, "Favor ingrese informacion en los campos");
        }
    }
    private void modificar() {       
        String item = (String) textcategoria.getSelectedItem();        
        String[] items = item.split("-");        
        String categoria = items[0];
        
        if (!"".equals(textcodigo.getText()) && 
            !"".equals(categoria) && 
            !"".equals(textnombre.getText()) && 
            !"".equals(textcosto.getText()) && 
            !"".equals(textprecio.getText()) && 
            !"".equals(textstock.getText())) {
            conexion.abrir();
            conexion.consulta("UPDATE productos SET idcategoria = '" + categoria 
                    + "', nombre = '" + textnombre.getText()
                    + "', costo = '" + textcosto.getText()
                    + "', precio = '" + textprecio.getText()
                    + "', stock = '" + textstock.getText() 
                    + "'  WHERE idproducto = '"+textcodigo.getText()+"'");
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
                conexion.consulta("DELETE FROM productos WHERE idproducto = '" + textcodigo.getText()+"'");
                JOptionPane.showMessageDialog(null, "Registro eliminado exitosamente");
                conexion.cerrar();                    
            }
    }
    
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

    private void busquedaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_busquedaKeyPressed
        if(evt.getKeyCode()==KeyEvent.VK_ENTER){
            buscar_registrios();
        }else{
            limpiarcampos();
        }
    }//GEN-LAST:event_busquedaKeyPressed

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

    private void textcostoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textcostoKeyTyped
       char c=evt.getKeyChar();
        if(Character.isLetter(c)) {
            getToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_textcostoKeyTyped

    private void textprecioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textprecioKeyTyped
        char c=evt.getKeyChar();
        if(Character.isLetter(c)) {
            getToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_textprecioKeyTyped


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
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tablaregistros;
    private javax.swing.JComboBox<String> textcategoria;
    private javax.swing.JTextField textcodigo;
    private javax.swing.JTextField textcosto;
    private javax.swing.JTextField textnombre;
    private javax.swing.JTextField textprecio;
    private javax.swing.JTextField textstock;
    // End of variables declaration//GEN-END:variables
}
