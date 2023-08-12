
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.table.DefaultTableModel;


public class Artistas extends javax.swing.JFrame {


    public Artistas() {
        initComponents();
        this.setTitle("Artistas"); // Cambia el título de la ventana
        this.setLocationRelativeTo(this);
        ConexionDB conexionDB = new ConexionDB();
        
         try {
            Connection connection = conexionDB.establecerConexion();
            listarArtistas(connection);
            connection.close();
        } catch (SQLException e) {
            // Manejar el error
            e.printStackTrace();
        }
    }
    
    public void listarArtistas(Connection connection) throws SQLException {
        // Realiza la consulta para obtener el listado de obras
        String consulta = "SELECT * FROM ARTISTA";
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery(consulta);

        // Utiliza los resultados para mostrar el listado en un componente (por ejemplo, JTable)
        // Aquí asumimos que tienes un JTable llamado "tablaObras"
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("ID");
        model.addColumn("Nombre");
        model.addColumn("Pais");
        model.addColumn("Fecha Nacimiento");

        while (resultSet.next()) {
            String id = resultSet.getString("ID_ARTISTA");
            String nombre = resultSet.getString("nombre");
            String pais = resultSet.getString("nacionalidad");
            String fecha = resultSet.getString("fecha_nacimiento");

            model.addRow(new Object[]{id, nombre, pais, fecha});
        }

        tabla_obras.setModel(model);

        resultSet.close();
        statement.close();
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        btn_obras = new javax.swing.JButton();
        btn_expo = new javax.swing.JButton();
        btn_categoria = new javax.swing.JButton();
        btn_inicio = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabla_obras = new javax.swing.JTable();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();

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

        btn_obras.setBackground(new java.awt.Color(255, 204, 204));
        btn_obras.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_obras.setText("Obras");
        btn_obras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_obrasActionPerformed(evt);
            }
        });
        jPanel1.add(btn_obras, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 160, 100, 30));

        btn_expo.setBackground(new java.awt.Color(255, 204, 204));
        btn_expo.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_expo.setText("Expos");
        btn_expo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_expoActionPerformed(evt);
            }
        });
        jPanel1.add(btn_expo, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 210, 100, 30));

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

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/obras.jpeg"))); // NOI18N
        jLabel1.setText("jLabel1");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 230, 400));

        tabla_obras.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane2.setViewportView(tabla_obras);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 30, 450, 290));

        jButton5.setBackground(new java.awt.Color(255, 51, 51));
        jButton5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton5.setText("Eliminar");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 330, 100, 40));

        jButton6.setBackground(new java.awt.Color(255, 204, 204));
        jButton6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton6.setText("Nuevo");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 330, 100, 40));

        jButton7.setBackground(new java.awt.Color(204, 204, 255));
        jButton7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton7.setText("Modificar");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 330, 100, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 789, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 396, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_inicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_inicioActionPerformed
        Artistas Artistas = new Artistas();
        Artistas.dispose();
        Inicio inicio = new Inicio();
        inicio.setVisible(true);
    }//GEN-LAST:event_btn_inicioActionPerformed

    private void btn_obrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_obrasActionPerformed
        Artistas Artistas = new Artistas();
        Artistas.dispose();
        Obras Obras = new Obras();
        Obras.setVisible(true);
    }//GEN-LAST:event_btn_obrasActionPerformed

    private void btn_expoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_expoActionPerformed
        Artistas Artistas = new Artistas();
        Artistas.dispose();
        Exposiciones Exposiciones = new Exposiciones();
        Exposiciones.setVisible(true);
    }//GEN-LAST:event_btn_expoActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        Artistas Artistas = new Artistas();
        Artistas.dispose();
        NuevoArtista NuevoArtista = new NuevoArtista();
        NuevoArtista.setVisible(true);
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        Artistas Artistas = new Artistas();
        Artistas.dispose();
        ModificarArtista ModificarArtista = new ModificarArtista();
        ModificarArtista.setVisible(true);
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        Artistas Artistas = new Artistas();
        Artistas.dispose();
        EliminarArtista EliminarArtista = new EliminarArtista();
        EliminarArtista.setVisible(true);
    }//GEN-LAST:event_jButton5ActionPerformed

    private void btn_categoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_categoriaActionPerformed
        Obras obras = new Obras();
        obras.dispose();
        Categorias categorias = new Categorias();
        categorias.setVisible(true);
    }//GEN-LAST:event_btn_categoriaActionPerformed
     
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
    private javax.swing.JButton btn_categoria;
    private javax.swing.JButton btn_expo;
    private javax.swing.JButton btn_inicio;
    private javax.swing.JButton btn_obras;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable tabla_obras;
    // End of variables declaration//GEN-END:variables
}
