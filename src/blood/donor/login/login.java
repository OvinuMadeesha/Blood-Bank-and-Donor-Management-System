/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package blood.donor.login;

import javax.swing.JOptionPane;

/**
 *
 * @author User
 */
public class login extends javax.swing.JFrame {

    
    public login() {
        initComponents();
        
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDesktopPane1 = new javax.swing.JDesktopPane();
        jvuser = new javax.swing.JTextField();
        jvpassword = new javax.swing.JPasswordField();
        blogin = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jvcheck = new javax.swing.JCheckBox();
        jLabel3 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jvuser.setBackground(new java.awt.Color(255, 230, 230));
        jvuser.setBorder(null);
        jvuser.setMargin(new java.awt.Insets(0, 0, 0, 0));
        jvuser.setMinimumSize(new java.awt.Dimension(0, 0));
        jvuser.setName(""); // NOI18N
        jvuser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jvuserActionPerformed(evt);
            }
        });
        getContentPane().add(jvuser, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 306, 140, 20));

        jvpassword.setBackground(new java.awt.Color(255, 230, 230));
        jvpassword.setBorder(null);
        getContentPane().add(jvpassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 346, 140, 20));

        blogin.setBackground(new java.awt.Color(178, 1, 12));
        blogin.setFont(new java.awt.Font("Poppins", 1, 12)); // NOI18N
        blogin.setForeground(new java.awt.Color(255, 255, 255));
        blogin.setText("Login");
        blogin.setAutoscrolls(true);
        blogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bloginActionPerformed(evt);
            }
        });
        getContentPane().add(blogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 410, 110, 30));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jvcheck.setBackground(new java.awt.Color(255, 255, 255));
        jvcheck.setFont(new java.awt.Font("Poppins Light", 0, 10)); // NOI18N
        jvcheck.setForeground(new java.awt.Color(255, 228, 235));
        jvcheck.setBorder(null);
        jvcheck.setContentAreaFilled(false);
        jvcheck.setFocusPainted(false);
        jvcheck.setFocusable(false);
        jvcheck.setMaximumSize(new java.awt.Dimension(10, 10));
        jvcheck.setMinimumSize(new java.awt.Dimension(10, 10));
        jvcheck.setPreferredSize(new java.awt.Dimension(10, 10));
        jvcheck.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jvcheckActionPerformed(evt);
            }
        });
        jPanel2.add(jvcheck, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -10, 30, 50));

        jLabel3.setFont(new java.awt.Font("Poppins", 0, 10)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(102, 102, 102));
        jLabel3.setText("Show  Password");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 100, 10));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 370, 210, 30));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 60, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 380, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\User\\Desktop\\blood donor login\\src\\blood\\donor\\login\\Pictures\\doe-sangue-hmpb-doe-sangue-ezgif.com-resize (1).gif")); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 130, 200, 140));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/blood/donor/login/Pictures/blood 2-01 1 (2).png"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1280, 720));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void bloginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bloginActionPerformed
        // If User didn't fill user name or password:
        if (jvuser.getText().equals("oras")&& jvpassword.getText().equals("1234"))
        {
            setVisible(false);
            new hom().setVisible(true);
            JOptionPane.showMessageDialog(null,"Login Successful");

        }
        // If User fill wrong user name or password:
        else 
            JOptionPane.showMessageDialog(null,"Wrong username or password!!!", "Message",JOptionPane.ERROR_MESSAGE);
        
    }//GEN-LAST:event_bloginActionPerformed

    private void jvcheckActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jvcheckActionPerformed
        // If Click Show Password:
        if (jvcheck.isSelected()){
            jvpassword.setEchoChar((char)0);
        }
        else{
            jvpassword.setEchoChar('*');
        }
    }//GEN-LAST:event_jvcheckActionPerformed

    private void jvuserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jvuserActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jvuserActionPerformed

   
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
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton blogin;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JCheckBox jvcheck;
    private javax.swing.JPasswordField jvpassword;
    private javax.swing.JTextField jvuser;
    // End of variables declaration//GEN-END:variables
}
