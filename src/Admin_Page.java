
import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author laury
 */
public class Admin_Page extends javax.swing.JFrame {

    /**
     * Creates new form Admin_Page
     */
    public Admin_Page() {
        initComponents();
        //center the form
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jLabel_AppName = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel_Logout = new javax.swing.JLabel();
        jLabel_Dashboard = new javax.swing.JLabel();
        jLabel_Users = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(0, 153, 153));

        jPanel3.setBackground(new java.awt.Color(255, 51, 51));

        jPanel6.setBackground(new java.awt.Color(204, 255, 204));

        jLabel_AppName.setFont(new java.awt.Font("Bookman Old Style", 1, 36)); // NOI18N
        jLabel_AppName.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_AppName.setText("Administration Panel ");

        jLabel1.setFont(new java.awt.Font("Bookman Old Style", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 51, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Online Solar Housing Management System");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel_AppName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 403, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel_AppName, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addContainerGap(41, Short.MAX_VALUE))
        );

        jLabel_Logout.setBackground(new java.awt.Color(153, 0, 0));
        jLabel_Logout.setFont(new java.awt.Font("Bookman Old Style", 1, 20)); // NOI18N
        jLabel_Logout.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_Logout.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_Logout.setText("Logout");
        jLabel_Logout.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel_Logout.setOpaque(true);
        jLabel_Logout.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jLabel_LogoutFocusGained(evt);
            }
        });
        jLabel_Logout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel_LogoutMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel_LogoutMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel_LogoutMouseExited(evt);
            }
        });

        jLabel_Dashboard.setBackground(new java.awt.Color(153, 0, 0));
        jLabel_Dashboard.setFont(new java.awt.Font("Bookman Old Style", 1, 20)); // NOI18N
        jLabel_Dashboard.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_Dashboard.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_Dashboard.setText("System Report");
        jLabel_Dashboard.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel_Dashboard.setOpaque(true);
        jLabel_Dashboard.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jLabel_DashboardFocusGained(evt);
            }
        });
        jLabel_Dashboard.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel_DashboardMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel_DashboardMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel_DashboardMouseExited(evt);
            }
        });

        jLabel_Users.setBackground(new java.awt.Color(153, 0, 0));
        jLabel_Users.setFont(new java.awt.Font("Bookman Old Style", 1, 20)); // NOI18N
        jLabel_Users.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_Users.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_Users.setText("User Accounts");
        jLabel_Users.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel_Users.setOpaque(true);
        jLabel_Users.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jLabel_UsersFocusGained(evt);
            }
        });
        jLabel_Users.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel_UsersMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel_UsersMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel_UsersMouseExited(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel_Logout, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel_Dashboard, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel_Users, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(95, 95, 95)
                .addComponent(jLabel_Dashboard, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 122, Short.MAX_VALUE)
                .addComponent(jLabel_Users, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(109, 109, 109)
                .addComponent(jLabel_Logout, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(113, 113, 113))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 1306, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel_LogoutFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jLabel_LogoutFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel_LogoutFocusGained

    private void jLabel_LogoutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_LogoutMouseClicked

        // show a confirmation message before deleting the type
                int yes_or_no = JOptionPane.showConfirmDialog(null, "Are you sure you want to logout?", "Logout Property", JOptionPane.YES_NO_OPTION);

                if(yes_or_no == JOptionPane.YES_OPTION)
                {
                    
                    JOptionPane.showMessageDialog(null, "Logout Successful", "Logout Property", 1);

                    //show login page
                    Login loginform = new Login();
                    loginform.setVisible(true);
                    loginform.pack();
                    loginform.setLocationRelativeTo(null);
                    loginform.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

                    this.dispose();
                        
                        
                }else{
                    //show admin page
                    Admin_Page adminform = new Admin_Page();
                    adminform.setVisible(true);
                    adminform.pack();
                    adminform.setLocationRelativeTo(null);
                    adminform.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

                    this.dispose();
                }
        

    }//GEN-LAST:event_jLabel_LogoutMouseClicked

    private void jLabel_LogoutMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_LogoutMouseEntered

        jLabel_Logout.setBackground(Color.white);
        jLabel_Logout.setForeground(new Color(153,0,0));
    }//GEN-LAST:event_jLabel_LogoutMouseEntered

    private void jLabel_LogoutMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_LogoutMouseExited

        jLabel_Logout.setBackground(new Color(153,0,0));
        jLabel_Logout.setForeground(Color.white);

    }//GEN-LAST:event_jLabel_LogoutMouseExited

    private void jLabel_DashboardFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jLabel_DashboardFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel_DashboardFocusGained

    private void jLabel_DashboardMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_DashboardMouseClicked
        // TODO add your handling code here:
        //show total sales page
        Dashboard dashform = new Dashboard();
        dashform.setVisible(true);
        dashform.pack();
        dashform.setLocationRelativeTo(null);
        dashform.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }//GEN-LAST:event_jLabel_DashboardMouseClicked

    private void jLabel_DashboardMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_DashboardMouseEntered
        // TODO add your handling code here:
        jLabel_Dashboard.setBackground(Color.white);
        jLabel_Dashboard.setForeground(new Color(153,0,0));
    }//GEN-LAST:event_jLabel_DashboardMouseEntered

    private void jLabel_DashboardMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_DashboardMouseExited
        // TODO add your handling code here:
        jLabel_Dashboard.setBackground(new Color(153,0,0));
        jLabel_Dashboard.setForeground(Color.white);
    }//GEN-LAST:event_jLabel_DashboardMouseExited

    private void jLabel_UsersFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jLabel_UsersFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel_UsersFocusGained

    private void jLabel_UsersMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_UsersMouseClicked
        // TODO add your handling code here:
        Users usersform = new Users();
        usersform.setVisible(true);
        usersform.pack();
        usersform.setLocationRelativeTo(null);
        usersform.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        
    }//GEN-LAST:event_jLabel_UsersMouseClicked

    private void jLabel_UsersMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_UsersMouseEntered
        // TODO add your handling code here:
        jLabel_Users.setBackground(Color.white);
        jLabel_Users.setForeground(new Color(153,0,0));
    }//GEN-LAST:event_jLabel_UsersMouseEntered

    private void jLabel_UsersMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_UsersMouseExited
        // TODO add your handling code here:
        jLabel_Users.setBackground(new Color(153,0,0));
        jLabel_Users.setForeground(Color.white);
    }//GEN-LAST:event_jLabel_UsersMouseExited

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
            java.util.logging.Logger.getLogger(Admin_Page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Admin_Page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Admin_Page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Admin_Page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Admin_Page().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel_AppName;
    private javax.swing.JLabel jLabel_Dashboard;
    private javax.swing.JLabel jLabel_Logout;
    private javax.swing.JLabel jLabel_Users;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel6;
    // End of variables declaration//GEN-END:variables
}
