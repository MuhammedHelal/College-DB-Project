
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class AdminInteractions extends javax.swing.JFrame {

    public boolean Exist;

    public AdminInteractions() {

        initComponents();
        this.setResizable(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jComboBox1 = new javax.swing.JComboBox<>();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        Vcolumns = new javax.swing.JTextField();
        Vtable = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        Vname1 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jComboBox2 = new javax.swing.JComboBox<>();
        jTextField1 = new javax.swing.JTextField();
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

        jComboBox1.setBackground(new java.awt.Color(0, 124, 169));
        jComboBox1.setFont(new java.awt.Font("Goudy Old Style", 1, 18)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Sum", "Average", "Maximum", "Minimum" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(0, 124, 169));
        jButton2.setFont(new java.awt.Font("Goudy Old Style", 1, 18)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Delete ");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setBackground(new java.awt.Color(0, 124, 169));
        jButton3.setFont(new java.awt.Font("Goudy Old Style", 1, 18)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("Search");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setBackground(new java.awt.Color(0, 124, 169));
        jButton4.setFont(new java.awt.Font("Goudy Old Style", 1, 18)); // NOI18N
        jButton4.setForeground(new java.awt.Color(255, 255, 255));
        jButton4.setText("Delete View");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setBackground(new java.awt.Color(0, 124, 169));
        jButton5.setFont(new java.awt.Font("Goudy Old Style", 1, 18)); // NOI18N
        jButton5.setForeground(new java.awt.Color(255, 255, 255));
        jButton5.setText("Add View");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setBackground(new java.awt.Color(0, 124, 169));
        jButton6.setFont(new java.awt.Font("Goudy Old Style", 1, 18)); // NOI18N
        jButton6.setForeground(new java.awt.Color(255, 255, 255));
        jButton6.setText("Update View");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        Vcolumns.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VcolumnsActionPerformed(evt);
            }
        });

        Vtable.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VtableActionPerformed(evt);
            }
        });

        jLabel2.setText("View Name");

        jLabel3.setText("Columns in comma comma separated form");

        Vname1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Vname1ActionPerformed(evt);
            }
        });

        jLabel4.setText("View table");

        jComboBox2.setBackground(new java.awt.Color(0, 124, 169));
        jComboBox2.setFont(new java.awt.Font("Goudy Old Style", 1, 18)); // NOI18N
        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "IN", "ALL", "ANY" }));
        jComboBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox2ActionPerformed(evt);
            }
        });

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(178, 178, 178)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(Vtable, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(19, 19, 19))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(286, 286, 286)
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 141, Short.MAX_VALUE)
                                .addComponent(jLabel4)
                                .addGap(93, 93, 93)))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(Vcolumns, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel3)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jButton1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButton2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(67, 67, 67)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(37, 37, 37)
                                        .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap())))
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addGap(412, 412, 412)
                    .addComponent(Vname1, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(471, Short.MAX_VALUE)))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(66, 66, 66)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(41, 41, 41)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(38, 38, 38)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                        .addComponent(jLabel2))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(114, 114, 114)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(1, 1, 1)
                                .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(94, 94, 94)))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Vtable, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Vcolumns, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(81, 81, 81))
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                    .addContainerGap(365, Short.MAX_VALUE)
                    .addComponent(Vname1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(199, 199, 199)))
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
            }
        } else if (selectedItem.equals("Average")) {
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
            }
        } else if (selectedItem.equals("Maximum")) {
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
            }
        } else if (selectedItem.equals("Minimum")) {
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
            }
        }
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
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
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        String phone = JOptionPane.showInputDialog("Enter Phone Number:");
        if (searchPhone(phone)) {
            JOptionPane.showMessageDialog(this, "phone is exist");
        } else {
            JOptionPane.showMessageDialog(this, "phone is not exist");
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        String viewName = JOptionPane.showInputDialog("Enter View Name");
        String query = "DROP VIEW " + viewName + "";
        Connection conn;
        try {
            conn = DriverManager.getConnection("jdbc:derby://localhost:1527/E-Wallet", "root", "root");
            Statement st = conn.createStatement();
            int result = JOptionPane.showConfirmDialog(this, "confirm Delete");
            if (result == JOptionPane.YES_OPTION) {
                st.execute(query);
                JOptionPane.showMessageDialog(this, "Deleted Succesfully");
            } else {
                JOptionPane.showMessageDialog(this, "Nothing Changed");
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "Error! Check View Name");
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        String viewTable = Vtable.getText().trim();
        String viewName = Vname1.getText().trim();
        String viewColumns = Vcolumns.getText().trim();
        String query = "CREATE VIEW " + viewName + " AS SELECT " + viewColumns + " FROM " + viewTable + "";
        Connection conn;
        try {
            conn = DriverManager.getConnection("jdbc:derby://localhost:1527/E-Wallet", "root", "root");
            Statement st = conn.createStatement();
            st.execute(query);
            JOptionPane.showMessageDialog(this, "Created successfully");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "Wrong");
        }
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton6ActionPerformed

    private void VcolumnsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VcolumnsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_VcolumnsActionPerformed

    private void VtableActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VtableActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_VtableActionPerformed

    private void Vname1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Vname1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Vname1ActionPerformed

    private void jComboBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox2ActionPerformed
        
        String selectedItem = (String) jComboBox2.getSelectedItem();
        JTable table = new JTable();
        DefaultTableModel model = new DefaultTableModel();
        ResultSetMetaData meta;
        int columnCount;
        if (selectedItem.equals("IN")) {
            try {
                Connection conn = DriverManager.getConnection("jdbc:derby://localhost:1527/E-Wallet", "root", "root");
                String sql = "SELECT ID,name,Email from Admin Where Email IN (Select Email from COUSTMER)";
                Statement st = conn.createStatement();
                ResultSet rs = st.executeQuery(sql);
                meta = rs.getMetaData();
                columnCount = meta.getColumnCount();
            for (int i = 1; i <= columnCount; i++) {
                model.addColumn(meta.getColumnName(i));
            }
            while (rs.next()) {
                Object[] row = new Object[columnCount];
                for (int i = 1; i <= columnCount; i++) {
                    row[i - 1] = rs.getObject(i);
                }
                model.addRow(row);
            }

            table.setModel(model);

            JFrame frame = new JFrame("IN Query");
            frame.getContentPane().add(new JScrollPane(table));
            frame.pack();
            frame.setVisible(true);
            // Close the connection and statement
            rs.close();
            st.close();
            conn.close();
            } catch (SQLException ex) {
                ex.printStackTrace();
            }

        } else if (selectedItem.equals("ANY")) {
           try {
                Connection conn = DriverManager.getConnection("jdbc:derby://localhost:1527/E-Wallet", "root", "root");
                String sql = "SELECT DISTINCT c.phone,w.balance FROM coustmer c INNER JOIN wallet w ON c.phone = w.phone WHERE w.balance = ANY ( SELECT w2.balance FROM wallet w2 GROUP BY w2.balance HAVING COUNT(DISTINCT w2.phone) > 1) ORDER BY w.balance ASC";
                Statement st = conn.createStatement();
                ResultSet rs = st.executeQuery(sql);
                meta = rs.getMetaData();
                columnCount = meta.getColumnCount();
            for (int i = 1; i <= columnCount; i++) {
                model.addColumn(meta.getColumnName(i));
            }
            while (rs.next()) {
                Object[] row = new Object[columnCount];
                for (int i = 1; i <= columnCount; i++) {
                    row[i - 1] = rs.getObject(i);
                }
                model.addRow(row);
            }

            table.setModel(model);

            JFrame frame = new JFrame("ANY Query");
            frame.getContentPane().add(new JScrollPane(table));
            frame.pack();
            frame.setVisible(true);
            // Close the connection and statement
            rs.close();
            st.close();
            conn.close();
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
            
        }  else {}
    }//GEN-LAST:event_jComboBox2ActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

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
            @Override
            public void run() {
                new AdminInteractions().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Vcolumns;
    private javax.swing.JTextField Vname1;
    private javax.swing.JTextField Vtable;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
