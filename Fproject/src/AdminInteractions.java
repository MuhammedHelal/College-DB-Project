

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;



public class AdminInteractions extends javax.swing.JFrame {

    public AdminInteractions() {

        initComponents();
        this.setResizable(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();

        jTextField1 = new javax.swing.JTextField();
        jComboBox1 = new javax.swing.JComboBox<>();

        jButton8 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(0, 0, 0,80));
        jPanel2.setForeground(new java.awt.Color(0, 0, 0,80));

        jButton1.setBackground(new java.awt.Color(0, 124, 169));
        jButton1.setFont(new java.awt.Font("Goudy Old Style", 1, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Edit Account");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jTextField1.addActionListener(new java.awt.event.ActionListener() {

        jButton8.setBackground(new java.awt.Color(0, 124, 169));
        jButton8.setFont(new java.awt.Font("Goudy Old Style", 1, 18)); // NOI18N
        jButton8.setForeground(new java.awt.Color(255, 255, 255));
        jButton8.setText("Delete account");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        jButton7.setBackground(new java.awt.Color(0, 124, 169));
        jButton7.setFont(new java.awt.Font("Goudy Old Style", 1, 18)); // NOI18N
        jButton7.setForeground(new java.awt.Color(255, 255, 255));
        jButton7.setText("Search Phone");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);

                jButton7ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(272, 272, 272)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(183, 183, 183)
                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(241, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(424, 424, 424))

            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(298, Short.MAX_VALUE)
                .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(124, 124, 124)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(350, 350, 350))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(435, 435, 435)
                .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(176, 176, 176)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(84, 84, 84)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(254, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1070, 600));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 1070, 600));

                .addGap(125, 125, 125)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(77, 77, 77)
                .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(166, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1070, 600));
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1070, 600));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        setVisible(false);
        EditAccount obj = new EditAccount();
        obj.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
       String selectedItem = (String) jComboBox1.getSelectedItem();
    if (selectedItem.equals("Sum")) {
           if (selectedItem.equals("Sum")) {
        try {    
    Connection conn = DriverManager.getConnection("jdbc:derby://localhost:1527/E-Wallet", "root", "root");
        String sql = "SELECT SUM(DOUBLE(BALANCE)) FROM WALLET";
        Statement pstat = conn.createStatement();
        ResultSet rs = pstat.executeQuery(sql);
        if (rs.next()) {      
            double totalBalance = rs.getDouble(1);
            jTextField1.setText("Sum of balance = " + "(" + totalBalance + ")");
        }
            conn.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }}
    else if (selectedItem.equals("Average")) {
           if (selectedItem.equals("Average")) {
        try {    
    Connection conn = DriverManager.getConnection("jdbc:derby://localhost:1527/E-Wallet", "root", "root");
        String sql = "SELECT AVG(DOUBLE(BALANCE)) FROM WALLET";
        Statement pstat = conn.createStatement();
        ResultSet rs = pstat.executeQuery(sql);
        if (rs.next()) {      
            double averageBalance = rs.getDouble(1);
            jTextField1.setText("Average of balance= " + "(" + averageBalance + ")");
        }
            conn.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }}
    else if (selectedItem.equals("Maximum")) {
           if (selectedItem.equals("Maximum")) {
        try {    
    Connection conn = DriverManager.getConnection("jdbc:derby://localhost:1527/E-Wallet", "root", "root");
        String sql = "SELECT MAX(DOUBLE(BALANCE)) FROM WALLET";
        Statement pstat = conn.createStatement();
        ResultSet rs = pstat.executeQuery(sql);
        if (rs.next()) {      
            double MaximumBalance = rs.getDouble(1);
            jTextField1.setText("Maximum balance= " + "(" + MaximumBalance + ")");
        }
            conn.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }}
    else if (selectedItem.equals("Minimum")) {
           if (selectedItem.equals("Minimum")) {
        try {    
    Connection conn = DriverManager.getConnection("jdbc:derby://localhost:1527/E-Wallet", "root", "root");
        String sql = "SELECT MIN(DOUBLE(BALANCE)) FROM WALLET";
        Statement pstat = conn.createStatement();
        ResultSet rs = pstat.executeQuery(sql);
        if (rs.next()) {      
            double MinimumBalance = rs.getDouble(1);
            jTextField1.setText("Minimum balance= " + "(" + MinimumBalance + ")");
        }
            conn.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }}
    }//GEN-LAST:event_jComboBox1ActionPerformed

    /**
     * @param args the command line arguments
     */

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        String phone = JOptionPane.showInputDialog("Enter Phone Number:");
        try {
            Connection conn = DriverManager.getConnection("jdbc:derby://localhost:1527/E-Wallet", "root", "root");
            Statement st = conn.createStatement();
            if (searchPhone(phone)) {
                st.execute("DELETE from WALLET WHERE Phone='" + phone + "'");
                st.execute("DELETE from COUSTMER WHERE Phone='" + phone + "'");

                JOptionPane.showMessageDialog(this, "account deleted sucssfuly");
            } else {
                JOptionPane.showMessageDialog(this, "There is no account with this phone number");
            }
        } catch (SQLException ex) {
            Logger.getLogger(AdminInteractions.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        String phone = JOptionPane.showInputDialog("Enter Phone Number:");
        if (searchPhone(phone)) {
            JOptionPane.showMessageDialog(this, "phone is exist");
        } else {
            JOptionPane.showMessageDialog(this, "phone is not exist");
        }
    }//GEN-LAST:event_jButton7ActionPerformed

    public boolean searchPhone(String phone) {
        Connection conn;

        try {
            conn = DriverManager.getConnection("jdbc:derby://localhost:1527/E-Wallet", "root", "root");
            String query = "SELECT Phone from COUSTMER WHERE Phone LIKE '%" + phone + "%'";
            PreparedStatement st = conn.prepareStatement(query);
            ResultSet result = st.executeQuery();

            Exist = result.next();
        } catch (SQLException ex) {
            Logger.getLogger(AdminInteractions.class.getName()).log(Level.SEVERE, null, ex);
        }
        return Exist;
    }

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
            java.util.logging.Logger.getLogger(AdminInteractions.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdminInteractions.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdminInteractions.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdminInteractions.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdminInteractions().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox<String> jComboBox1;

    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
