
import java.sql.*;
import javax.swing.table.DefaultTableModel;

public class NuevaCategoria extends javax.swing.JFrame {

    /**
     * Creates new form Obras
     */
    public NuevaCategoria() {
        initComponents();
        this.setTitle("Agregar Nueva Categoría"); // Cambia el título de la ventana
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

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        btn_expo = new javax.swing.JButton();
        btn_artista = new javax.swing.JButton();
        btn_obra = new javax.swing.JButton();
        btn_inicio = new javax.swing.JButton();
        btn_volver = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        btn_agregar = new javax.swing.JButton();
        area_categoria = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();

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

        btn_obra.setBackground(new java.awt.Color(255, 204, 204));
        btn_obra.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_obra.setText("Obras");
        btn_obra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_obraActionPerformed(evt);
            }
        });
        jPanel1.add(btn_obra, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 260, 100, 30));

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

        btn_agregar.setBackground(new java.awt.Color(255, 204, 204));
        btn_agregar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_agregar.setText("Agregar");
        btn_agregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_agregarActionPerformed(evt);
            }
        });
        jPanel1.add(btn_agregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 290, 100, 40));

        area_categoria.setBorder(null);
        jPanel1.add(area_categoria, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 100, 260, 30));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 140, 260, 10));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel2.setText("Nombre categoria");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 70, -1, -1));

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
        NuevaCategoria NuevaCategoria = new NuevaCategoria();
        NuevaCategoria.dispose();
        Inicio inicio = new Inicio();
        inicio.setVisible(true);
    }//GEN-LAST:event_btn_inicioActionPerformed

    private void btn_expoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_expoActionPerformed
        NuevaCategoria NuevaCategoria = new NuevaCategoria();
        NuevaCategoria.dispose();
        Exposiciones exposiciones = new Exposiciones();
        exposiciones.setVisible(true);
    }//GEN-LAST:event_btn_expoActionPerformed

    private void btn_artistaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_artistaActionPerformed
        NuevaCategoria NuevaCategoria = new NuevaCategoria();
        NuevaCategoria.dispose();
        Artistas artistas = new Artistas();
        artistas.setVisible(true);
    }//GEN-LAST:event_btn_artistaActionPerformed

    private void btn_obraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_obraActionPerformed
        NuevaCategoria NuevaCategoria = new NuevaCategoria();
        NuevaCategoria.dispose();
        Obras Obras = new Obras();
        Obras.setVisible(true);
    }//GEN-LAST:event_btn_obraActionPerformed

    private void btn_volverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_volverActionPerformed
        NuevaCategoria NuevaCategoria = new NuevaCategoria();
        NuevaCategoria.dispose();
        Categorias Categorias = new Categorias();
        Categorias.setVisible(true);
    }//GEN-LAST:event_btn_volverActionPerformed

    private void btn_agregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_agregarActionPerformed
        ConexionDB conexionDB = new ConexionDB();
        try {
            Connection connection = conexionDB.establecerConexion();
            String nombreCategoria = area_categoria.getText();
            // Preparar la consulta SQL con el nombre de la categoría a insertar
            String sql = "INSERT INTO CATEGORIA (DESCRIPCION) VALUES (?)";
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, nombreCategoria);

            // Ejecutar la consulta de inserción
            preparedStatement.executeUpdate();

            // Cerrar la conexión
            preparedStatement.close();
            connection.close();

            // Mostrar un mensaje de éxito o realizar alguna acción adicional
            javax.swing.JOptionPane.showMessageDialog(this, "Categoría agregada correctamente.");

            Categorias categoria = new Categorias();
            categoria.listarCategorias(conexionDB.establecerConexion());

        } catch (SQLException e) {
            // Manejar el error
            e.printStackTrace();
            javax.swing.JOptionPane.showMessageDialog(this, "Error al agregar la categoría: " + e.getMessage());
        }
    }//GEN-LAST:event_btn_agregarActionPerformed

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
    private javax.swing.JTextField area_categoria;
    private javax.swing.JButton btn_agregar;
    private javax.swing.JButton btn_artista;
    private javax.swing.JButton btn_expo;
    private javax.swing.JButton btn_inicio;
    private javax.swing.JButton btn_obra;
    private javax.swing.JButton btn_volver;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}