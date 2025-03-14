/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package favoriteSites;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author anil
 */
public class EditVisitForm extends javax.swing.JFrame {
    Connection conn = ConnectorSQL.getConnection();
    ResultSet rs = null;
    PreparedStatement pstmt = null;
    String username;
    int visitID;
    
    /**
     * Creates new form AddVisit
     */
    public EditVisitForm(String username,int visitID) {
        initComponents();
        this.username=username;
        this.visitID=visitID;
        setDefaultCloseOperation(EditVisitForm.DISPOSE_ON_CLOSE);
        showVisitData();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        countryNameField = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        cityNameField = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        yearField = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        seasonBox = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        featureBox = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        ratingBox = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        commentArea = new javax.swing.JTextArea();
        updateButton = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Country Name");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 70, 180, -1));

        countryNameField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                countryNameFieldActionPerformed(evt);
            }
        });
        getContentPane().add(countryNameField, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 70, 450, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("City Name");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 110, 160, -1));

        cityNameField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cityNameFieldActionPerformed(evt);
            }
        });
        getContentPane().add(cityNameField, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 110, 450, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Year");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 150, 120, -1));

        yearField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                yearFieldActionPerformed(evt);
            }
        });
        getContentPane().add(yearField, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 150, 450, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Season visited");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 190, 180, -1));

        seasonBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Spring", "Summer", "Autumn", "Winter" }));
        seasonBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                seasonBoxActionPerformed(evt);
            }
        });
        getContentPane().add(seasonBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 190, 450, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Best feature");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 230, 170, -1));

        featureBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "None", "Historic Places", "Castles", "pubs", "Museums", "Food", "Beaches ", "Natural Beauty" }));
        featureBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                featureBoxActionPerformed(evt);
            }
        });
        getContentPane().add(featureBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 230, 450, -1));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Rating");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 270, 130, -1));

        ratingBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "5", "4", "3", "2", "1" }));
        ratingBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ratingBoxActionPerformed(evt);
            }
        });
        getContentPane().add(ratingBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 270, 450, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Comments");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 300, 160, -1));

        commentArea.setColumns(20);
        commentArea.setRows(5);
        jScrollPane1.setViewportView(commentArea);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 330, 630, -1));

        updateButton.setText("update");
        updateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateButtonActionPerformed(evt);
            }
        });
        getContentPane().add(updateButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 440, 150, -1));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/minimal_dark_background_by_dapperfoxstudios_dcqzh5h-fullview.jpg"))); // NOI18N
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(-340, -10, 1290, 570));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void countryNameFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_countryNameFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_countryNameFieldActionPerformed

    private void cityNameFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cityNameFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cityNameFieldActionPerformed

    private void yearFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_yearFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_yearFieldActionPerformed

    private void seasonBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_seasonBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_seasonBoxActionPerformed

    private void featureBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_featureBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_featureBoxActionPerformed

    private void ratingBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ratingBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ratingBoxActionPerformed

    private void updateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateButtonActionPerformed
        editData();
    }//GEN-LAST:event_updateButtonActionPerformed

    private void editData(){
        
        String countryName = countryNameField.getText();
        String cityName = cityNameField.getText();
        String yearText = yearField.getText();
        String seasonVisited = (String) seasonBox.getSelectedItem();
        String bestFeature = (String) featureBox.getSelectedItem();
        String ratingText = (String) ratingBox.getSelectedItem();
        String userComment = commentArea.getText();
        int rating = rating = Integer.parseInt(ratingText);

        int yearVisited;
        try {
            yearVisited = Integer.parseInt(yearText);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Please enter a valid number"); 
         return;
        }

        try {
            String query = "UPDATE visits SET country_name = ?, city_name = ?, year_visited = ?, season_visited = ?, best_feature = ?, user_comment = ?, rating = ? WHERE visit_id = ? AND username = ?";
            PreparedStatement pstmt = conn.prepareStatement(query);
            pstmt.setString(1, countryName);
            pstmt.setString(2, cityName);
            pstmt.setInt(3, yearVisited);
            pstmt.setString(4, seasonVisited);
            pstmt.setString(5, bestFeature);
            pstmt.setString(6, userComment);
            pstmt.setInt(7, rating);
            pstmt.setInt(8, visitID); 
            pstmt.setString(9, this.username); 

            int rowsUpdated = pstmt.executeUpdate();
            if (rowsUpdated > 0) {
                JOptionPane.showMessageDialog(this, "Visit updated successfully!");
            } else {
                JOptionPane.showMessageDialog(this, "No visit found with the provided details.");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        
    }
    
    private void showVisitData() {
        String query = "SELECT * FROM visits WHERE visit_id = " + visitID;
        try {
            pstmt = conn.prepareStatement(query);
            rs = pstmt.executeQuery();

            if (rs.next()) {
                countryNameField.setText(rs.getString("country_name"));
                cityNameField.setText(rs.getString("city_name"));
                yearField.setText(String.valueOf(rs.getInt("year_visited")));
                seasonBox.setSelectedItem(rs.getString("season_visited"));
                featureBox.setSelectedItem(rs.getString("best_feature"));
                ratingBox.setSelectedItem(String.valueOf(rs.getInt("rating")));
                commentArea.setText(rs.getString("user_comment"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } 
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EditVisitForm("Anil",1).setVisible(true); 
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField cityNameField;
    private javax.swing.JTextArea commentArea;
    private javax.swing.JTextField countryNameField;
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
    private javax.swing.JComboBox<String> ratingBox;
    private javax.swing.JComboBox<String> seasonBox;
    private javax.swing.JButton updateButton;
    private javax.swing.JTextField yearField;
    // End of variables declaration//GEN-END:variables
}
