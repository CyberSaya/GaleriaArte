
import java.sql.*;
import javax.swing.table.DefaultTableModel;


public class ModificarObra extends javax.swing.JFrame {

 
    public ModificarObra() {
        initComponents();
        this.setTitle("Modificar Obras De Arte"); // Cambia el título de la ventana
        this.setLocationRelativeTo(this);
        ConexionDB conexionDB = new ConexionDB();

        try {
            Connection connection = conexionDB.establecerConexion();
            connection.close();
        } catch (SQLException e) {
            // Manejar el error
            e.printStackTrace();
        }
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        btn_expo = new javax.swing.JButton();
        btn_artista = new javax.swing.JButton();
        btn_categoria = new javax.swing.JButton();
        btn_inicio = new javax.swing.JButton();
        btn_volver = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        btn_modificar = new javax.swing.JButton();
        area_titulo = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        area_anio = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel4 = new javax.swing.JLabel();
        area_artista = new javax.swing.JTextField();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel5 = new javax.swing.JLabel();
        area_categoria = new javax.swing.JTextField();
        jSeparator4 = new javax.swing.JSeparator();
        jLabel6 = new javax.swing.JLabel();
        area_id = new javax.swing.JTextField();
        jSeparator5 = new javax.swing.JSeparator();
        btn_agregar1 = new javax.swing.JButton();
        area_precio = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btn_expo.setBackground(new java.awt.Color(255, 204, 204));
        btn_expo.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_expo.setText("Expos");
        btn_expo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_expoActionPerformed(evt);
            }
        });
        jPanel1.add(btn_expo, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 160, 100, 30));

        btn_artista.setBackground(new java.awt.Color(255, 204, 204));
        btn_artista.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_artista.setText("Artistas");
        btn_artista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_artistaActionPerformed(evt);
            }
        });
        jPanel1.add(btn_artista, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 210, 100, 30));

        btn_categoria.setBackground(new java.awt.Color(255, 204, 204));
        btn_categoria.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_categoria.setText("Categoria");
        btn_categoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_categoriaActionPerformed(evt);
            }
        });
        jPanel1.add(btn_categoria, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 260, 100, 30));

        btn_inicio.setBackground(new java.awt.Color(255, 204, 204));
        btn_inicio.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_inicio.setText("Inicio");
        btn_inicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_inicioActionPerformed(evt);
            }
        });
        jPanel1.add(btn_inicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 110, 100, 30));

        btn_volver.setBackground(new java.awt.Color(255, 204, 204));
        btn_volver.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_volver.setText("Volver");
        btn_volver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_volverActionPerformed(evt);
            }
        });
        jPanel1.add(btn_volver, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 310, 100, 30));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/obras.jpeg"))); // NOI18N
        jLabel1.setText("jLabel1");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 230, 400));

        btn_modificar.setBackground(new java.awt.Color(255, 204, 204));
        btn_modificar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_modificar.setText("Modificar");
        btn_modificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_modificarActionPerformed(evt);
            }
        });
        jPanel1.add(btn_modificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 300, 100, 40));

        area_titulo.setBorder(null);
        jPanel1.add(area_titulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 140, 260, 30));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 180, 260, 10));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel2.setText("Titulo");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 110, -1, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel3.setText("Año");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 200, -1, -1));

        area_anio.setBorder(null);
        jPanel1.add(area_anio, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 230, 110, 30));
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 270, 110, 10));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel4.setText("ID Artista");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 110, -1, -1));

        area_artista.setBorder(null);
        jPanel1.add(area_artista, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 140, 90, 30));
        jPanel1.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 180, 130, 10));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel5.setText("ID Categoria");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 210, -1, -1));

        area_categoria.setBorder(null);
        jPanel1.add(area_categoria, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 240, 70, -1));
        jPanel1.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 270, 80, 20));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel6.setText("Buscar por ID");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 20, -1, -1));

        area_id.setBorder(null);
        jPanel1.add(area_id, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 50, 90, 30));
        jPanel1.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 90, 130, 10));

        btn_agregar1.setBackground(new java.awt.Color(255, 204, 204));
        btn_agregar1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_agregar1.setText("Buscar");
        btn_agregar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_agregar1ActionPerformed(evt);
            }
        });
        jPanel1.add(btn_agregar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 50, 100, 40));

        area_precio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                area_precioActionPerformed(evt);
            }
        });
        jPanel1.add(area_precio, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 230, 100, 30));

        jLabel7.setText("Precio");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 200, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 789, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 396, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_inicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_inicioActionPerformed
        ModificarObra ModificarObra = new ModificarObra();
        ModificarObra.dispose();
        Inicio inicio = new Inicio();
        inicio.setVisible(true);
    }//GEN-LAST:event_btn_inicioActionPerformed

    private void btn_expoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_expoActionPerformed
        ModificarObra ModificarObra = new ModificarObra();
        ModificarObra.dispose();
        Exposiciones exposiciones = new Exposiciones();
        exposiciones.setVisible(true);
    }//GEN-LAST:event_btn_expoActionPerformed

    private void btn_artistaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_artistaActionPerformed
        ModificarObra ModificarObra = new ModificarObra();
        ModificarObra.dispose();
        Artistas artistas = new Artistas();
        artistas.setVisible(true);
    }//GEN-LAST:event_btn_artistaActionPerformed

    private void btn_categoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_categoriaActionPerformed
        ModificarObra ModificarObra = new ModificarObra();
        ModificarObra.dispose();
        Categorias categorias = new Categorias();
        categorias.setVisible(true);
    }//GEN-LAST:event_btn_categoriaActionPerformed

    private void btn_volverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_volverActionPerformed
        ModificarObra ModificarObra = new ModificarObra();
        ModificarObra.dispose();
        Obras Obras = new Obras();
        Obras.setVisible(true);
    }//GEN-LAST:event_btn_volverActionPerformed

    private void btn_modificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_modificarActionPerformed
        ConexionDB conexionDB = new ConexionDB();
        try {
            Connection connection = conexionDB.establecerConexion();
            String titulo = area_titulo.getText();
            int artista = Integer.parseInt(area_artista.getText());
            int categoria = Integer.parseInt(area_categoria.getText());
            int anio = Integer.parseInt(area_anio.getText());
            int id = Integer.parseInt(area_id.getText());
            int precio = Integer.parseInt(area_precio.getText());
            // Preparar la consulta SQL con el nombre de la categoría a insertar
            String sql = "UPDATE Obras SET titulo = ?, anio = ?, id_artista = ?, id_categoria = ?, precio = ? WHERE id_obra = ?";
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, titulo);
            preparedStatement.setInt(2, anio);
            preparedStatement.setInt(3, artista);
            preparedStatement.setInt(4, categoria);
            preparedStatement.setInt(5, precio);
            preparedStatement.setInt(6, id);

            int filasActualizadas = preparedStatement.executeUpdate();

            // Cerrar la conexión
            preparedStatement.close();
            connection.close();

            if (filasActualizadas > 0) {
                // Si se actualizó al menos una fila, mostrar un mensaje de éxito
                javax.swing.JOptionPane.showMessageDialog(this, "Obra modificada correctamente.");
            } else {
                javax.swing.JOptionPane.showMessageDialog(this, "Error.");
            }

            Obras Obras = new Obras();
            Obras.listarObras(conexionDB.establecerConexion());

        } catch (SQLException e) {
            // Manejar el error
            e.printStackTrace();
            javax.swing.JOptionPane.showMessageDialog(this, "Error al modificar la obra: " + e.getMessage());
        }
    }//GEN-LAST:event_btn_modificarActionPerformed

    private void btn_agregar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_agregar1ActionPerformed
        ConexionDB conexionDB = new ConexionDB();
        try {
            Connection connection = conexionDB.establecerConexion();
            int id = Integer.parseInt(area_id.getText());
            // Preparar la consulta SQL con el nombre de la categoría a insertar
            String sql = "SELECT * FROM Obras WHERE id_obra = ?";
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1, id);

            ResultSet resultSet = preparedStatement.executeQuery();

            if (resultSet.next()) {
                String nombre = resultSet.getString("titulo");
                String anio = resultSet.getString("anio");
                String id_artista = resultSet.getString("id_artista");
                String id_categoria = resultSet.getString("id_categoria");
                String precio = resultSet.getString("precio");

                // Cerrar el ResultSet y el PreparedStatement
                resultSet.close();
                preparedStatement.close();
                connection.close();
                area_titulo.setText(nombre);
                area_anio.setText(anio);
                area_artista.setText(id_artista);
                area_categoria.setText(id_categoria);
                area_precio.setText(precio);

            } else {
                // Cerrar el ResultSet y el PreparedStatement
                resultSet.close();
                preparedStatement.close();
                connection.close();

                // Mostrar un mensaje si no se encuentra la categoría
                javax.swing.JOptionPane.showMessageDialog(this, "Obra no encontrada con el ID proporcionado.");
            }

            // Cerrar la conexión
            preparedStatement.close();
            connection.close();

            Categorias categoria = new Categorias();
            categoria.listarCategorias(conexionDB.establecerConexion());

        } catch (SQLException e) {
            // Manejar el error
            e.printStackTrace();
            javax.swing.JOptionPane.showMessageDialog(this, "Error al modificar la obra: " + e.getMessage());
        }
    }//GEN-LAST:event_btn_agregar1ActionPerformed

    private void area_precioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_area_precioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_area_precioActionPerformed

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
            java.util.logging.Logger.getLogger(Obras.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Obras.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Obras.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Obras.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Obras().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField area_anio;
    private javax.swing.JTextField area_artista;
    private javax.swing.JTextField area_categoria;
    private javax.swing.JTextField area_id;
    private javax.swing.JTextField area_precio;
    private javax.swing.JTextField area_titulo;
    private javax.swing.JButton btn_agregar1;
    private javax.swing.JButton btn_artista;
    private javax.swing.JButton btn_categoria;
    private javax.swing.JButton btn_expo;
    private javax.swing.JButton btn_inicio;
    private javax.swing.JButton btn_modificar;
    private javax.swing.JButton btn_volver;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
