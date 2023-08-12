
import java.sql.*;
import java.text.SimpleDateFormat;
import javax.swing.table.DefaultTableModel;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ModificarArtista extends javax.swing.JFrame {

    /**
     * Creates new form Obras
     */
    public ModificarArtista() {
        initComponents();
        this.setTitle("Modificar Artista"); // Cambia el título de la ventana
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
        btn_obras = new javax.swing.JButton();
        btn_inicio = new javax.swing.JButton();
        btn_volver = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        btn_agregar = new javax.swing.JButton();
        area_nombre = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        area_pais = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel4 = new javax.swing.JLabel();
        area_nacimiento = new javax.swing.JTextField();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel5 = new javax.swing.JLabel();
        area_id = new javax.swing.JTextField();
        jSeparator4 = new javax.swing.JSeparator();
        btn_mod = new javax.swing.JButton();

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

        btn_obras.setBackground(new java.awt.Color(255, 204, 204));
        btn_obras.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_obras.setText("Obras");
        btn_obras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_obrasActionPerformed(evt);
            }
        });
        jPanel1.add(btn_obras, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 260, 100, 30));

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
        btn_agregar.setText("Modificar");
        btn_agregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_agregarActionPerformed(evt);
            }
        });
        jPanel1.add(btn_agregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 280, 100, 40));

        area_nombre.setBorder(null);
        jPanel1.add(area_nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 140, 260, 30));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 180, 260, 10));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel2.setText("Nombre");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 110, -1, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel3.setText("Pais");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 200, -1, -1));

        area_pais.setBorder(null);
        jPanel1.add(area_pais, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 230, 110, 30));
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 90, 110, 10));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel4.setText("Fecha nacimiento");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 110, -1, -1));

        area_nacimiento.setBorder(null);
        jPanel1.add(area_nacimiento, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 140, 90, 30));
        jPanel1.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 180, 130, 10));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel5.setText("Buscar por ID");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 30, -1, -1));

        area_id.setBorder(null);
        jPanel1.add(area_id, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 60, 100, 30));
        jPanel1.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 270, 110, 10));

        btn_mod.setBackground(new java.awt.Color(255, 204, 204));
        btn_mod.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_mod.setText("Buscar");
        btn_mod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_modActionPerformed(evt);
            }
        });
        jPanel1.add(btn_mod, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 50, 100, 40));

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
        ModificarArtista ModificarArtista = new ModificarArtista();
        ModificarArtista.dispose();
        Inicio inicio = new Inicio();
        inicio.setVisible(true);
    }//GEN-LAST:event_btn_inicioActionPerformed

    private void btn_expoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_expoActionPerformed
        ModificarArtista ModificarArtista = new ModificarArtista();
        ModificarArtista.dispose();
        Exposiciones exposiciones = new Exposiciones();
        exposiciones.setVisible(true);
    }//GEN-LAST:event_btn_expoActionPerformed

    private void btn_artistaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_artistaActionPerformed
        ModificarArtista ModificarArtista = new ModificarArtista();
        ModificarArtista.dispose();
        Artistas artistas = new Artistas();
        artistas.setVisible(true);
    }//GEN-LAST:event_btn_artistaActionPerformed

    private void btn_obrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_obrasActionPerformed
        ModificarArtista ModificarArtista = new ModificarArtista();
        ModificarArtista.dispose();
        Obras Obras = new Obras();
        Obras.setVisible(true);
    }//GEN-LAST:event_btn_obrasActionPerformed

    private void btn_volverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_volverActionPerformed
        ModificarArtista ModificarArtista = new ModificarArtista();
        ModificarArtista.dispose();
        Artistas artistas = new Artistas();
        artistas.setVisible(true);
    }//GEN-LAST:event_btn_volverActionPerformed

    private void btn_agregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_agregarActionPerformed

        if (this.actualizarFecha()) {
            modificarArtista();
        }


    }//GEN-LAST:event_btn_agregarActionPerformed

    private void btn_modActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_modActionPerformed
        ConexionDB conexionDB = new ConexionDB();
        try {
            Connection connection = conexionDB.establecerConexion();
            int id = Integer.parseInt(area_id.getText());

            String sql = "SELECT * FROM ARTISTA WHERE ID_ARTISTA = ?";
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1, id);

            ResultSet resultSet = preparedStatement.executeQuery();

            if (resultSet.next()) {
                String nombre = resultSet.getString("nombre");
                String pais = resultSet.getString("nacionalidad");
                String fecha = resultSet.getString("fecha_nacimiento");

                // Cerrar el ResultSet y el PreparedStatement
                resultSet.close();
                preparedStatement.close();
                connection.close();
                area_nombre.setText(nombre);
                area_nacimiento.setText(fecha);
                area_pais.setText(pais);

            } else {
                // Cerrar el ResultSet y el PreparedStatement
                resultSet.close();
                preparedStatement.close();
                connection.close();

                // Mostrar un mensaje si no se encuentra la categoría
                javax.swing.JOptionPane.showMessageDialog(this, "Artista no encontrada con el ID proporcionado.");
            }

            // Cerrar la conexión
            preparedStatement.close();
            connection.close();

            Artistas Artistas = new Artistas();
            Artistas.listarArtistas(conexionDB.establecerConexion());

        } catch (SQLException e) {
            // Manejar el error
            e.printStackTrace();
            javax.swing.JOptionPane.showMessageDialog(this, "Error al modificar la Artista: " + e.getMessage());
        }
    }//GEN-LAST:event_btn_modActionPerformed

    public void modificarArtista() {
        ConexionDB conexionDB = new ConexionDB();
        try {
            Connection connection = conexionDB.establecerConexion();
            String titulo = area_nombre.getText();
            String fecha = area_nacimiento.getText();
            String pais = area_pais.getText();
            int id = Integer.parseInt(area_id.getText());
            // Preparar la consulta SQL con el nombre de la categoría a insertar
            String sql = "UPDATE ARTISTA SET nombre = ?, nacionalidad = ?, fecha_nacimiento = ?  WHERE id_artista = ?";
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, titulo);
            preparedStatement.setString(2, pais);
            preparedStatement.setString(3, fecha);
            preparedStatement.setInt(4, id);

            // Ejecutar la consulta de inserción
            preparedStatement.executeUpdate();

            int filasActualizadas = preparedStatement.executeUpdate();

            // Cerrar la conexión
            preparedStatement.close();
            connection.close();

            if (filasActualizadas > 0) {
                // Si se actualizó al menos una fila, mostrar un mensaje de éxito
                javax.swing.JOptionPane.showMessageDialog(this, "Artista modificada correctamente.");
            } else {
                // Si no se actualizó ninguna fila, mostrar un mensaje de que no se encontró la categoría
                javax.swing.JOptionPane.showMessageDialog(this, "No se encontró el artista con el ID proporcionado.");
            }

            Artistas Artistas = new Artistas();
            Artistas.listarArtistas(conexionDB.establecerConexion());

        } catch (SQLException e) {
            // Manejar el error
            e.printStackTrace();
            javax.swing.JOptionPane.showMessageDialog(this, "Error al agregar el artista: " + e.getMessage());
        }
    }

    public boolean actualizarFecha() {
        String fechaTexto = area_nacimiento.getText();

        try {
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            Date fecha = sdf.parse(fechaTexto);

            // Si la fecha se parsea correctamente, establecerla nuevamente en el campo de texto con el formato deseado
            area_nacimiento.setText(sdf.format(fecha));
            return true;
        } catch (ParseException ex) {
            // Si ocurre un error al parsear la fecha, mostrar un mensaje de error al usuario
            JOptionPane.showMessageDialog(this, "Formato de fecha incorrecto. Utiliza el formato yyyy-MM-dd.", "Error", JOptionPane.ERROR_MESSAGE);
            return false;
        }
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
    private javax.swing.JTextField area_id;
    private javax.swing.JTextField area_nacimiento;
    private javax.swing.JTextField area_nombre;
    private javax.swing.JTextField area_pais;
    private javax.swing.JButton btn_agregar;
    private javax.swing.JButton btn_artista;
    private javax.swing.JButton btn_expo;
    private javax.swing.JButton btn_inicio;
    private javax.swing.JButton btn_mod;
    private javax.swing.JButton btn_obras;
    private javax.swing.JButton btn_volver;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}