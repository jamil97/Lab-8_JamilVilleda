/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab.pkg8_jamilvilleda;

import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author usuario
 */
public class Principal extends javax.swing.JFrame {

    /**
     * Creates new form Principal
     */
    public Principal() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jd_administrador = new javax.swing.JDialog();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jp_AgregarProductos = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        tf_nombreProducto = new javax.swing.JTextField();
        tf_cantidadProducto = new javax.swing.JTextField();
        tf_precioProducto = new javax.swing.JTextField();
        jdc_fechaProducto = new com.toedter.calendar.JDateChooser();
        bt_AgregarProductos = new javax.swing.JButton();
        jp_ModificarProductos = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jt_Productos = new javax.swing.JTable();
        bt_ModificarProductos = new javax.swing.JButton();
        bt_EliminarProductos = new javax.swing.JButton();
        jp_AgregarCliente = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        tf_numeroCuenta = new javax.swing.JTextField();
        tf_nombreCliente = new javax.swing.JTextField();
        tf_contraCliente = new javax.swing.JTextField();
        tf_numeroIdentidad = new javax.swing.JTextField();
        tf_saldoCliente = new javax.swing.JTextField();
        bt_agregarCliente = new javax.swing.JButton();
        jp_ModificarCliente = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jt_Clientes = new javax.swing.JTable();
        bt_modificarCliente = new javax.swing.JButton();
        bt_eliminarCliente = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        tf_usuario = new javax.swing.JTextField();
        tf_contra = new javax.swing.JTextField();
        bt_ingresar = new javax.swing.JButton();

        jLabel4.setText("Nombre del producto: ");

        jLabel5.setText("Cantidad de Producto");

        jLabel6.setText("Precio del Producto");

        jLabel7.setText("Fecha de Caducidad");

        bt_AgregarProductos.setText("Agregar Producto");
        bt_AgregarProductos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bt_AgregarProductosMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jp_AgregarProductosLayout = new javax.swing.GroupLayout(jp_AgregarProductos);
        jp_AgregarProductos.setLayout(jp_AgregarProductosLayout);
        jp_AgregarProductosLayout.setHorizontalGroup(
            jp_AgregarProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jp_AgregarProductosLayout.createSequentialGroup()
                .addGroup(jp_AgregarProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jp_AgregarProductosLayout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(jp_AgregarProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(jp_AgregarProductosLayout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(tf_cantidadProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jp_AgregarProductosLayout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(18, 18, 18)
                                .addComponent(tf_nombreProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jp_AgregarProductosLayout.createSequentialGroup()
                                .addGroup(jp_AgregarProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jp_AgregarProductosLayout.createSequentialGroup()
                                        .addComponent(jLabel6)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jp_AgregarProductosLayout.createSequentialGroup()
                                        .addComponent(jLabel7)
                                        .addGap(28, 28, 28)))
                                .addGroup(jp_AgregarProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(tf_precioProducto, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                                    .addComponent(jdc_fechaProducto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                    .addGroup(jp_AgregarProductosLayout.createSequentialGroup()
                        .addGap(170, 170, 170)
                        .addComponent(bt_AgregarProductos)))
                .addContainerGap(252, Short.MAX_VALUE))
        );
        jp_AgregarProductosLayout.setVerticalGroup(
            jp_AgregarProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jp_AgregarProductosLayout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addGroup(jp_AgregarProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(tf_nombreProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addGroup(jp_AgregarProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(tf_cantidadProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(42, 42, 42)
                .addGroup(jp_AgregarProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(tf_precioProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(45, 45, 45)
                .addGroup(jp_AgregarProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(jdc_fechaProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 100, Short.MAX_VALUE)
                .addComponent(bt_AgregarProductos)
                .addGap(22, 22, 22))
        );

        jTabbedPane1.addTab("Agregar Productos", jp_AgregarProductos);

        jt_Productos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Nombre", "Cantidad", "Precio", "Fecha de Caducidad"
            }
        ));
        jScrollPane1.setViewportView(jt_Productos);

        bt_ModificarProductos.setText("Modificar");
        bt_ModificarProductos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bt_ModificarProductosMouseClicked(evt);
            }
        });

        bt_EliminarProductos.setText("Eliminar");
        bt_EliminarProductos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bt_EliminarProductosMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jp_ModificarProductosLayout = new javax.swing.GroupLayout(jp_ModificarProductos);
        jp_ModificarProductos.setLayout(jp_ModificarProductosLayout);
        jp_ModificarProductosLayout.setHorizontalGroup(
            jp_ModificarProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jp_ModificarProductosLayout.createSequentialGroup()
                .addGap(68, 68, 68)
                .addComponent(bt_ModificarProductos)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(bt_EliminarProductos)
                .addGap(119, 119, 119))
            .addGroup(jp_ModificarProductosLayout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(67, Short.MAX_VALUE))
        );
        jp_ModificarProductosLayout.setVerticalGroup(
            jp_ModificarProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jp_ModificarProductosLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 299, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jp_ModificarProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bt_ModificarProductos)
                    .addComponent(bt_EliminarProductos))
                .addContainerGap(40, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Modificar/Eliminar Productos", jp_ModificarProductos);

        jLabel8.setText("Nombre del Cliente:");

        jLabel9.setText("Numero de Cuenta: ");

        jLabel10.setText("Contraseña: ");

        jLabel11.setText("Numero de Identidad: ");

        jLabel12.setText("Saldo Disponible: ");

        bt_agregarCliente.setText("Agregar un Cliente");
        bt_agregarCliente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bt_agregarClienteMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jp_AgregarClienteLayout = new javax.swing.GroupLayout(jp_AgregarCliente);
        jp_AgregarCliente.setLayout(jp_AgregarClienteLayout);
        jp_AgregarClienteLayout.setHorizontalGroup(
            jp_AgregarClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jp_AgregarClienteLayout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(jp_AgregarClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jp_AgregarClienteLayout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(tf_nombreCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jp_AgregarClienteLayout.createSequentialGroup()
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(tf_numeroIdentidad, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jp_AgregarClienteLayout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(tf_contraCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jp_AgregarClienteLayout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addGap(34, 34, 34)
                        .addComponent(tf_numeroCuenta, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jp_AgregarClienteLayout.createSequentialGroup()
                        .addComponent(jLabel12)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jp_AgregarClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(bt_agregarCliente)
                            .addComponent(tf_saldoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(200, Short.MAX_VALUE))
        );
        jp_AgregarClienteLayout.setVerticalGroup(
            jp_AgregarClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jp_AgregarClienteLayout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addGroup(jp_AgregarClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(tf_nombreCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addGroup(jp_AgregarClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(tf_numeroCuenta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(46, 46, 46)
                .addGroup(jp_AgregarClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(tf_contraCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(46, 46, 46)
                .addGroup(jp_AgregarClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel11)
                    .addComponent(tf_numeroIdentidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39)
                .addGroup(jp_AgregarClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(tf_saldoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                .addComponent(bt_agregarCliente)
                .addGap(30, 30, 30))
        );

        jTabbedPane1.addTab("Agregar Cliente", jp_AgregarCliente);

        jt_Clientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Nombre", "Numero de Cuenta", "Contraseña", "Productos", "Numero de Identidad", "Saldo Disponible"
            }
        ));
        jScrollPane2.setViewportView(jt_Clientes);

        bt_modificarCliente.setText("Modificar Clientes");
        bt_modificarCliente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bt_modificarClienteMouseClicked(evt);
            }
        });

        bt_eliminarCliente.setText("Eliminar Clientes");
        bt_eliminarCliente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bt_eliminarClienteMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jp_ModificarClienteLayout = new javax.swing.GroupLayout(jp_ModificarCliente);
        jp_ModificarCliente.setLayout(jp_ModificarClienteLayout);
        jp_ModificarClienteLayout.setHorizontalGroup(
            jp_ModificarClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jp_ModificarClienteLayout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addComponent(bt_modificarCliente)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(bt_eliminarCliente)
                .addGap(88, 88, 88))
            .addGroup(jp_ModificarClienteLayout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 464, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(41, Short.MAX_VALUE))
        );
        jp_ModificarClienteLayout.setVerticalGroup(
            jp_ModificarClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jp_ModificarClienteLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 299, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                .addGroup(jp_ModificarClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bt_modificarCliente)
                    .addComponent(bt_eliminarCliente))
                .addGap(20, 20, 20))
        );

        jTabbedPane1.addTab("Modificar/Eliminar Cliente", jp_ModificarCliente);

        javax.swing.GroupLayout jd_administradorLayout = new javax.swing.GroupLayout(jd_administrador.getContentPane());
        jd_administrador.getContentPane().setLayout(jd_administradorLayout);
        jd_administradorLayout.setHorizontalGroup(
            jd_administradorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 557, Short.MAX_VALUE)
        );
        jd_administradorLayout.setVerticalGroup(
            jd_administradorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Ingresar al Sistema");

        jLabel2.setText("Usuario: ");

        jLabel3.setText("Contraseña: ");

        bt_ingresar.setText("Ingresar");
        bt_ingresar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bt_ingresarMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(173, 173, 173)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(tf_usuario)
                            .addComponent(tf_contra, javax.swing.GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(176, 176, 176)
                        .addComponent(bt_ingresar)))
                .addContainerGap(142, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel1)
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(tf_usuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(69, 69, 69)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(tf_contra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 84, Short.MAX_VALUE)
                .addComponent(bt_ingresar)
                .addGap(63, 63, 63))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bt_ingresarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_ingresarMouseClicked

        if (tf_contra.getText().equals(contra) && tf_usuario.getText().equals(usuario)) {
            JOptionPane.showMessageDialog(this, "Bienvenido al sistema Erick. ");
            Principal p = new Principal();
            p.dispose();

            jd_administrador.pack();
            jd_administrador.setModal(true);
            jd_administrador.setVisible(true);

        } else if (rootPaneCheckingEnabled) {

        } else {
            JOptionPane.showMessageDialog(this, "Usuario o contraseña incorrectos!");
        }

    }//GEN-LAST:event_bt_ingresarMouseClicked

    private void bt_AgregarProductosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_AgregarProductosMouseClicked

        Dba db = new Dba("./Tabla1.accdb");
        db.conectar();
        try {
            String nombre;
            int cantidad;
            int precio;
            String fecha = jdc_fechaProducto.getDate().toString();

            nombre = tf_nombreProducto.getText();
            cantidad = Integer.parseInt(tf_cantidadProducto.getText());
            precio = Integer.parseInt(tf_precioProducto.getText());

            db.query.execute("INSERT INTO Tabla1" + "(Cantidad,Precio,FechadeCaducidad,Nombre)" + " VALUES (" + cantidad + ", " + precio + ", '" + fecha + "', '" + nombre + "')");

            db.commit();
            JOptionPane.showMessageDialog(this, "Se ha agregado a la base de datos correctamente. ");

            DefaultTableModel modelo = (DefaultTableModel) jt_Productos.getModel();

            modelo.addRow(new Object[]{nombre, cantidad, precio, fecha});

        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        db.desconectar();

    }//GEN-LAST:event_bt_AgregarProductosMouseClicked

    private void bt_ModificarProductosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_ModificarProductosMouseClicked

        if (jt_Productos.getSelectedRow() >= 0) {
            Dba db = new Dba("./Tabla1.accdb");
            db.conectar();

            try {
                DefaultTableModel modelo = (DefaultTableModel) jt_Productos.getModel();
                String nombre = JOptionPane.showInputDialog(this, "Ingrese un nuevo nombre de producto.");
                String nombreproducto = JOptionPane.showInputDialog(this, "Ingrese el nombre del producto a modificar: ");
                int cantidad = Integer.parseInt(JOptionPane.showInputDialog(this, "Ingrese una nueva cantidad de producto."));
                int precio = Integer.parseInt(JOptionPane.showInputDialog(this, "Ingrese un nuevo precio de producto."));
                modelo.setValueAt(nombre, jt_Productos.getSelectedRow(), 3);
                modelo.setValueAt(cantidad, jt_Productos.getSelectedRow(), 0);
                modelo.setValueAt(precio, jt_Productos.getSelectedRow(), 1);

                db.query.execute("update Tabla1 set Nombre = '" + nombre + "' where Nombre = '" + nombreproducto + "'");
                db.query.execute("update Tabla1 set Cantidad = " + cantidad + " where Nombre = '" + nombreproducto + "'");
                db.query.execute("update Tabla1 set Precio = " + precio + " where Nombre = '" + nombreproducto + "'");
                db.commit();

                JOptionPane.showMessageDialog(this, "Se ha modificado la tabla y base correctamente.");
            } catch (SQLException e) {
                e.printStackTrace();
            }
            db.desconectar();
        }


    }//GEN-LAST:event_bt_ModificarProductosMouseClicked

    private void bt_EliminarProductosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_EliminarProductosMouseClicked

        if (jt_Productos.getSelectedRow() >= 0) {
            DefaultTableModel modelo = (DefaultTableModel) jt_Productos.getModel();
            modelo.removeRow(jt_Productos.getSelectedRow());
            jt_Productos.setModel(modelo);

            Dba db = new Dba("./Tabla1.accdb");
            db.conectar();

            String nombreproducto = JOptionPane.showInputDialog(this, "Ingrese el nombre del producto a eliminar: ");

            try {
                db.query.execute("delete from Tabla1 where Nombre = '" + nombreproducto + "' ");
            } catch (Exception e) {
            }

        }

    }//GEN-LAST:event_bt_EliminarProductosMouseClicked

    private void bt_agregarClienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_agregarClienteMouseClicked

        Dba db = new Dba("./Tabla1.accdb");
        db.conectar();

        try {

            String nombrecliente;
            String contraseña;
            int numerocuenta;
            String numeroidentidad;
            double saldodisponible;
            String productos;

            nombrecliente = tf_nombreCliente.getText();
            contraseña = tf_contra.getText();
            numerocuenta = Integer.parseInt(tf_numeroCuenta.getText());
            numeroidentidad = tf_numeroIdentidad.getText();
            saldodisponible = Double.parseDouble(tf_saldoCliente.getText());
            productos = "0";

            db.query.execute("INSERT INTO Clientes" + " (NumerodeCuenta,Contraseña,Productos,NumerodeIdentidad,SaldoDisponible,Nombre)" + " VALUES (" + numerocuenta + ", '" + contraseña + "', '" + productos + "', '" + numeroidentidad + "', " + saldodisponible + ", '" + nombrecliente + "')");
            db.commit();
            JOptionPane.showMessageDialog(this, "Se ha agregado el cliente a la base de datos correctamente. ");

            DefaultTableModel modeloclientes = (DefaultTableModel) jt_Clientes.getModel();

            modeloclientes.addRow(new Object[]{nombrecliente, numerocuenta, contraseña, productos, numeroidentidad, saldodisponible});

        } catch (SQLException e) {
            e.printStackTrace();
        }
        db.desconectar();


    }//GEN-LAST:event_bt_agregarClienteMouseClicked

    private void bt_modificarClienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_modificarClienteMouseClicked

        if (jt_Productos.getSelectedRow() >= 0) {
            Dba db = new Dba("./Tabla1.accdb");
            db.conectar();

            try {
                DefaultTableModel modelo = (DefaultTableModel) jt_Clientes.getModel();

                String nombreusuario;
                int numerocuenta;
                String contraseña;
                String numeroidentidad;
                double saldodisponible;
                String nombrecliente;

                nombrecliente = JOptionPane.showInputDialog(this, "Ingrese el nombre del cliente a modificar: ");
                nombreusuario = JOptionPane.showInputDialog(this, "Ingrese un nuevo nombre de Cliente: ");
                numerocuenta = Integer.parseInt(JOptionPane.showInputDialog(this, "Ingrese un nuevo numero de cuenta: "));
                contraseña = JOptionPane.showInputDialog(this, "Ingrese una nueva contraseña: ");
                numeroidentidad = JOptionPane.showInputDialog(this, "Ingrese un nuevo numero de identidad: ");
                saldodisponible = Double.parseDouble(JOptionPane.showInputDialog(this, "Ingrese un nuevo saldo: "));

                modelo.setValueAt(nombreusuario, jt_Clientes.getSelectedRow(), 0);
                modelo.setValueAt(numerocuenta, jt_Clientes.getSelectedRow(), 1);

                modelo.setValueAt(contraseña, jt_Clientes.getSelectedRow(), 3);
                modelo.setValueAt(numeroidentidad, jt_Clientes.getSelectedRow(), 4);
                modelo.setValueAt(saldodisponible, jt_Clientes.getSelectedRow(), 5);

                db.query.execute("update Clientes set NumerodeCuenta = " + numerocuenta + " where Nombre = '" + nombrecliente + "' ");
                db.query.execute("update Clientes set Contraseña = '" + contraseña + "' where Nombre = '" + nombrecliente + "' ");
                db.query.execute("update Clientes set NumerodeIdentidad = " + numeroidentidad + " where Nombre = '" + nombrecliente + "' ");
                db.query.execute("update Clientes set SaldoDisponible = " + saldodisponible + " where Nombre = '" + nombrecliente + "' ");
                db.query.execute("update Clientes set Nombre = '" + nombreusuario + "' where Nombre = '" + nombrecliente + "' ");
                db.commit();

                JOptionPane.showMessageDialog(this, "Se ha modificado la tabla y base correctamente.");
            } catch (SQLException e) {
                e.printStackTrace();
            }
            db.desconectar();
        }


    }//GEN-LAST:event_bt_modificarClienteMouseClicked

    private void bt_eliminarClienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_eliminarClienteMouseClicked

        if (jt_Clientes.getSelectedRow() >= 0) {
            DefaultTableModel modelo = (DefaultTableModel) jt_Clientes.getModel();
            modelo.removeRow(jt_Clientes.getSelectedRow());
            jt_Clientes.setModel(modelo);

            Dba db = new Dba("./Tabla1.accdb");
            db.conectar();

            String nombrecliente = JOptionPane.showInputDialog(this, "Ingrese el nombre del clienta a eliminar: ");

            try {
                db.query.execute("delete from Clientes where Nombre = '" + nombrecliente + "' ");
            } catch (Exception e) {
            }


    }//GEN-LAST:event_bt_eliminarClienteMouseClicked
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bt_AgregarProductos;
    private javax.swing.JButton bt_EliminarProductos;
    private javax.swing.JButton bt_ModificarProductos;
    private javax.swing.JButton bt_agregarCliente;
    private javax.swing.JButton bt_eliminarCliente;
    private javax.swing.JButton bt_ingresar;
    private javax.swing.JButton bt_modificarCliente;
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
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JDialog jd_administrador;
    private com.toedter.calendar.JDateChooser jdc_fechaProducto;
    private javax.swing.JPanel jp_AgregarCliente;
    private javax.swing.JPanel jp_AgregarProductos;
    private javax.swing.JPanel jp_ModificarCliente;
    private javax.swing.JPanel jp_ModificarProductos;
    private javax.swing.JTable jt_Clientes;
    private javax.swing.JTable jt_Productos;
    private javax.swing.JTextField tf_cantidadProducto;
    private javax.swing.JTextField tf_contra;
    private javax.swing.JTextField tf_contraCliente;
    private javax.swing.JTextField tf_nombreCliente;
    private javax.swing.JTextField tf_nombreProducto;
    private javax.swing.JTextField tf_numeroCuenta;
    private javax.swing.JTextField tf_numeroIdentidad;
    private javax.swing.JTextField tf_precioProducto;
    private javax.swing.JTextField tf_saldoCliente;
    private javax.swing.JTextField tf_usuario;
    // End of variables declaration//GEN-END:variables
String usuario = "erick123";
    String contra = "321kcire";

}
