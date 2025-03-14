/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package favoriteSites;

/**
 *
 * @author anil
 */
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class AddVisitForm extends javax.swing.JFrame {

    private String username;

    public AddVisitForm(String username) {
        this.username = username;
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

        jTextField5 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        cityField = new javax.swing.JTextField();
        yearField = new javax.swing.JTextField();
        countryField = new javax.swing.JTextField();
        seasonBox = new javax.swing.JComboBox<>();
        featureBox = new javax.swing.JComboBox<>();
        ratingBox = new javax.swing.JComboBox<>();
        addVisitButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        commentArea = new javax.swing.JTextArea();
        jLabel8 = new javax.swing.JLabel();

        jTextField5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField5ActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 153, 153));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Country Name");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 40, 180, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Season visited");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 160, 180, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Year");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 120, 120, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("City Name");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 80, 160, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Best feature");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 200, 170, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Comments");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 270, 160, -1));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Rating");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 240, 130, -1));

        cityField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cityFieldActionPerformed(evt);
            }
        });
        getContentPane().add(cityField, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 80, 450, -1));

        yearField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                yearFieldActionPerformed(evt);
            }
        });
        getContentPane().add(yearField, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 120, 450, -1));

        countryField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                countryFieldActionPerformed(evt);
            }
        });
        getContentPane().add(countryField, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 40, 450, -1));

        seasonBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Spring", "Summer", "Autumn", "Winter" }));
        seasonBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                seasonBoxActionPerformed(evt);
            }
        });
        getContentPane().add(seasonBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 160, 450, -1));

        featureBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "None", "Historic Places", "Castles", "pubs", "Museums", "Food", "Beaches ", "Natural Beauty" }));
        featureBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                featureBoxActionPerformed(evt);
            }
        });
        getContentPane().add(featureBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 200, 450, -1));

        ratingBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "5", "4", "3", "2", "1" }));
        ratingBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ratingBoxActionPerformed(evt);
            }
        });
        getContentPane().add(ratingBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 240, 450, -1));

        addVisitButton.setText("submit");
        addVisitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addVisitButtonActionPerformed(evt);
            }
        });
        getContentPane().add(addVisitButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 400, 210, -1));

        commentArea.setColumns(20);
        commentArea.setRows(5);
        jScrollPane1.setViewportView(commentArea);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 300, 630, -1));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/HD-wallpaper-flat-landscape-sunset-trees-minimal-design-landscape.jpg"))); // NOI18N
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 0, 780, 450));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cityFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cityFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cityFieldActionPerformed

    private void yearFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_yearFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_yearFieldActionPerformed

    private void countryFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_countryFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_countryFieldActionPerformed

    private void jTextField5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField5ActionPerformed

    private void seasonBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_seasonBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_seasonBoxActionPerformed

    private void featureBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_featureBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_featureBoxActionPerformed

    private void ratingBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ratingBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ratingBoxActionPerformed

    private void addVisitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addVisitButtonActionPerformed
        String countryName = countryField.getText();
        String cityName = cityField.getText();
        int yearVisited = Integer.parseInt(yearField.getText());
        String seasonVisited = (String) seasonBox.getSelectedItem();
        String bestFeature = (String) featureBox.getSelectedItem();
        String userComment = commentArea.getText();
        int rating = Integer.parseInt((String) ratingBox.getSelectedItem());
 
        try (Connection conn = ConnectorSQL.getConnection()) {
            String query = "INSERT INTO visits (username, country_name, city_name, year_visited, season_visited, best_feature, user_comment, rating) VALUES (?, ?, ?, ?, ?, ?, ?, ?)";
            PreparedStatement pstmt = conn.prepareStatement(query);
            pstmt.setString(1, this.username);
            pstmt.setString(2, countryName);
            pstmt.setString(3, cityName);
            pstmt.setInt(4, yearVisited);
            pstmt.setString(5, seasonVisited);
            pstmt.setString(6, bestFeature);
            pstmt.setString(7, userComment);
            pstmt.setInt(8, rating);

            pstmt.executeUpdate();
            JOptionPane.showMessageDialog(this, "Visit added successfully!");
            dispose();
        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Error adding visit: " + e.getMessage());
        }
    }//GEN-LAST:event_addVisitButtonActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddVisitForm("Anil").setVisible(true); 
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addVisitButton;
    private javax.swing.JTextField cityField;
    private javax.swing.JTextArea commentArea;
    private javax.swing.JTextField countryField;
    private javax.swing.JComboBox<String> featureBox;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JComboBox<String> ratingBox;
    private javax.swing.JComboBox<String> seasonBox;
    private javax.swing.JTextField yearField;
    // End of variables declaration//GEN-END:variables
}
