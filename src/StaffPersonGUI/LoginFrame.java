package StaffPersonGUI;
import vaccinationsystem.Admin;
import vaccinationsystem.Person;
import vaccinationsystem.Doctor;
import vaccinationsystem.ReservOfficer;
import vaccinationsystem.StoreKeeper;

/**
 *
 * @author Jesus
 */
public class LoginFrame extends javax.swing.JFrame {

    /**
     * Creates new form LoginFrame
     */
    public LoginFrame() {
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

        jLabelusername = new javax.swing.JLabel();
        jTextFieldusername = new javax.swing.JTextField();
        jLabelpassword = new javax.swing.JLabel();
        jPasswordFielduserpassword = new javax.swing.JPasswordField();
        jButtonlogin = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(153, 153, 153));

        jLabelusername.setText("Username");

        jTextFieldusername.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldusernameActionPerformed(evt);
            }
        });

        jLabelpassword.setText("Password");

        jPasswordFielduserpassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPasswordFielduserpasswordActionPerformed(evt);
            }
        });

        jButtonlogin.setText("Login");
        jButtonlogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonloginActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(61, 61, 61)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelusername)
                    .addComponent(jLabelpassword))
                .addGap(52, 52, 52)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jTextFieldusername)
                    .addComponent(jPasswordFielduserpassword, javax.swing.GroupLayout.DEFAULT_SIZE, 240, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(jButtonlogin)))
                .addContainerGap(73, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelusername)
                    .addComponent(jTextFieldusername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelpassword)
                    .addComponent(jPasswordFielduserpassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(77, 77, 77)
                .addComponent(jButtonlogin)
                .addContainerGap(52, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldusernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldusernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldusernameActionPerformed

    private void jPasswordFielduserpasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPasswordFielduserpasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jPasswordFielduserpasswordActionPerformed

    private void jButtonloginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonloginActionPerformed
        // TODO add your handling code here:
      
        person x = new Admin ()  ; 
        if (x.login(jTextFieldusername.getText(), jPasswordFielduserpassword.getText())){
            this.setVisible(false);
            new AdminDashboard ().setVisible(true);
        }
        else  {
            x = new Doctor ;
            if (x.login(jTextFieldusername.getText(), jPasswordFielduserpassword.getText() )){
                    this.setVisible(false);
            new DoctorDashboard ().setVisible(true);
            }
                }
        else  {
            x = new ReservationOfficer ; 
             if(x.login(jTextFieldusername.getText(),jPasswordFielduserpassword.getText() )) {
                 this.setVisible(false);
                new ReservationOfficerDashboard ().setVisible(true) ;
                }   
            }
            else  {
             x new = StoreKeeper ;
             if(x.login(jTextFieldusername.getText(), jPasswordFielduserpassword.getText())){
                this.setVisible(false);
                new StoreKeeperDashboard ().setVisible(false);
                }
             }
    
    }//GEN-LAST:event_jButtonloginActionPerformed

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
            java.util.logging.Logger.getLogger(LoginFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonlogin;
    private javax.swing.JLabel jLabelpassword;
    private javax.swing.JLabel jLabelusername;
    private javax.swing.JPasswordField jPasswordFielduserpassword;
    private javax.swing.JTextField jTextFieldusername;
    // End of variables declaration//GEN-END:variables

    private static class person {

        public person() {
        }

        private boolean login(String text, String text0) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }
    }
}