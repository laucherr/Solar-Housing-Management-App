
import java.awt.Color;
import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.border.Border;


/**
 *
 * @author laury
 */

public class Main_Page extends javax.swing.JFrame {

    /**
     * Creates new form Main_Page
     */
    public Main_Page() {
        initComponents();
        
        //center the form
        this.setLocationRelativeTo(null);
        
        //set borders to the app name label
        //Border appname_border = BorderFactory.createMatteBorder(3, 3, 3, 3, new Color(153,153,0));
        Border appname_border = BorderFactory.createDashedBorder(new Color(153,153,0));
        jLabel_AppName.setBorder(appname_border);
        
        //set borders to the menu items
        Border menu_items_border = BorderFactory.createMatteBorder(0, 0, 1, 0, Color.yellow);
        jLabel_Property.setBorder(menu_items_border);
        jLabel_PropertyType.setBorder(menu_items_border);
        jLabel_PropertyImages.setBorder(menu_items_border);
        jLabel_Owners.setBorder(menu_items_border);
        jLabel_Clients.setBorder(menu_items_border);
        jLabel_Logout.setBorder(menu_items_border);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel_AppName = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel_PropertyType = new javax.swing.JLabel();
        jLabel_PropertyImages = new javax.swing.JLabel();
        jLabel_Owners = new javax.swing.JLabel();
        jLabel_Clients = new javax.swing.JLabel();
        jLabel_Property = new javax.swing.JLabel();
        jLabel_Logout = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 153, 153));

        jPanel2.setBackground(new java.awt.Color(204, 204, 0));

        jPanel3.setBackground(new java.awt.Color(255, 255, 204));

        jLabel_AppName.setFont(new java.awt.Font("Bookman Old Style", 1, 36)); // NOI18N
        jLabel_AppName.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_AppName.setText("User Panel");

        jLabel1.setFont(new java.awt.Font("Bookman Old Style", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 51, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Online Solar Housing Management System");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel_AppName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGap(0, 9, Short.MAX_VALUE)
                        .addComponent(jLabel1)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel_AppName, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addContainerGap())
        );

        jLabel_PropertyType.setBackground(new java.awt.Color(153, 153, 0));
        jLabel_PropertyType.setFont(new java.awt.Font("Bookman Old Style", 1, 20)); // NOI18N
        jLabel_PropertyType.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_PropertyType.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_PropertyType.setText("Locations for Solar Property");
        jLabel_PropertyType.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel_PropertyType.setOpaque(true);
        jLabel_PropertyType.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel_PropertyTypeMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel_PropertyTypeMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel_PropertyTypeMouseExited(evt);
            }
        });

        jLabel_PropertyImages.setBackground(new java.awt.Color(153, 153, 0));
        jLabel_PropertyImages.setFont(new java.awt.Font("Bookman Old Style", 1, 20)); // NOI18N
        jLabel_PropertyImages.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_PropertyImages.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_PropertyImages.setText("Images for Solar Property");
        jLabel_PropertyImages.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel_PropertyImages.setOpaque(true);
        jLabel_PropertyImages.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel_PropertyImagesMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel_PropertyImagesMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel_PropertyImagesMouseExited(evt);
            }
        });

        jLabel_Owners.setBackground(new java.awt.Color(153, 153, 0));
        jLabel_Owners.setFont(new java.awt.Font("Bookman Old Style", 1, 20)); // NOI18N
        jLabel_Owners.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_Owners.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_Owners.setText("Home Owners");
        jLabel_Owners.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel_Owners.setOpaque(true);
        jLabel_Owners.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel_OwnersMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel_OwnersMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel_OwnersMouseExited(evt);
            }
        });

        jLabel_Clients.setBackground(new java.awt.Color(153, 153, 0));
        jLabel_Clients.setFont(new java.awt.Font("Bookman Old Style", 1, 20)); // NOI18N
        jLabel_Clients.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_Clients.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_Clients.setText("Tenants");
        jLabel_Clients.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel_Clients.setOpaque(true);
        jLabel_Clients.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jLabel_ClientsFocusGained(evt);
            }
        });
        jLabel_Clients.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel_ClientsMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel_ClientsMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel_ClientsMouseExited(evt);
            }
        });

        jLabel_Property.setBackground(new java.awt.Color(153, 153, 0));
        jLabel_Property.setFont(new java.awt.Font("Bookman Old Style", 1, 20)); // NOI18N
        jLabel_Property.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_Property.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_Property.setText("Solar Property");
        jLabel_Property.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel_Property.setOpaque(true);
        jLabel_Property.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel_PropertyMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel_PropertyMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel_PropertyMouseExited(evt);
            }
        });

        jLabel_Logout.setBackground(new java.awt.Color(153, 153, 0));
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

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel_Logout, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel_Clients, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel_PropertyType, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel_PropertyImages, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel_Owners, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel_Property, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 55, Short.MAX_VALUE)
                .addComponent(jLabel_Property, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45)
                .addComponent(jLabel_PropertyType, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48)
                .addComponent(jLabel_PropertyImages, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(51, 51, 51)
                .addComponent(jLabel_Owners, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(54, 54, 54)
                .addComponent(jLabel_Clients, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(49, 49, 49)
                .addComponent(jLabel_Logout, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 1265, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel_PropertyMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_PropertyMouseEntered
        
        jLabel_Property.setBackground(Color.white);
        jLabel_Property.setForeground(new Color(153,153,0));
    }//GEN-LAST:event_jLabel_PropertyMouseEntered

    private void jLabel_PropertyMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_PropertyMouseExited
        
        jLabel_Property.setBackground(new Color(153,153,0));
        jLabel_Property.setForeground(Color.white);
        
    }//GEN-LAST:event_jLabel_PropertyMouseExited

    private void jLabel_PropertyTypeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_PropertyTypeMouseEntered
        
        jLabel_PropertyType.setBackground(Color.white);
        jLabel_PropertyType.setForeground(new Color(153,153,0));
        
    }//GEN-LAST:event_jLabel_PropertyTypeMouseEntered

    private void jLabel_PropertyTypeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_PropertyTypeMouseExited
        
        jLabel_PropertyType.setBackground(new Color(153,153,0));
        jLabel_PropertyType.setForeground(Color.white);
        
    }//GEN-LAST:event_jLabel_PropertyTypeMouseExited

    private void jLabel_PropertyImagesMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_PropertyImagesMouseEntered
        
        jLabel_PropertyImages.setBackground(Color.white);
        jLabel_PropertyImages.setForeground(new Color(153,153,0));
        
    }//GEN-LAST:event_jLabel_PropertyImagesMouseEntered

    private void jLabel_PropertyImagesMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_PropertyImagesMouseExited
        
        jLabel_PropertyImages.setBackground(new Color(153,153,0));
        jLabel_PropertyImages.setForeground(Color.white);
        
    }//GEN-LAST:event_jLabel_PropertyImagesMouseExited

    private void jLabel_OwnersMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_OwnersMouseEntered
        
        jLabel_Owners.setBackground(Color.white);
        jLabel_Owners.setForeground(new Color(153,153,0));
        
    }//GEN-LAST:event_jLabel_OwnersMouseEntered

    private void jLabel_OwnersMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_OwnersMouseExited
        
        jLabel_Owners.setBackground(new Color(153,153,0));
        jLabel_Owners.setForeground(Color.white);
        
    }//GEN-LAST:event_jLabel_OwnersMouseExited

    private void jLabel_ClientsMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_ClientsMouseEntered
        
        jLabel_Clients.setBackground(Color.white);
        jLabel_Clients.setForeground(new Color(153,153,0));
        
    }//GEN-LAST:event_jLabel_ClientsMouseEntered

    private void jLabel_ClientsMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_ClientsMouseExited
        
        jLabel_Clients.setBackground(new Color(153,153,0));
        jLabel_Clients.setForeground(Color.white);
        
    }//GEN-LAST:event_jLabel_ClientsMouseExited

    private void jLabel_PropertyTypeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_PropertyTypeMouseClicked
        
        //display the property type form
        
        Property_Type typeform = new Property_Type();
        typeform.setVisible(true);
        typeform.pack();
        typeform.setLocationRelativeTo(null);
        typeform.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        
    }//GEN-LAST:event_jLabel_PropertyTypeMouseClicked

    private void jLabel_OwnersMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_OwnersMouseClicked
        
        //show owners page
        Owners ownersform = new Owners();
        ownersform.setVisible(true);
        ownersform.pack();
        ownersform.setLocationRelativeTo(null);
        ownersform.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        
        
        //close the login window
        //this.dispose();
    }//GEN-LAST:event_jLabel_OwnersMouseClicked

    private void jLabel_ClientsFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jLabel_ClientsFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel_ClientsFocusGained

    private void jLabel_ClientsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_ClientsMouseClicked
        
        //show clients page
        Clients clientform = new Clients();
        clientform.setVisible(true);
        clientform.pack();
        clientform.setLocationRelativeTo(null);
        clientform.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        
    }//GEN-LAST:event_jLabel_ClientsMouseClicked

    private void jLabel_PropertyMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_PropertyMouseClicked
        
        //show property page
        Property propertyform = new Property();
        propertyform.setVisible(true);
        propertyform.pack();
        propertyform.setLocationRelativeTo(null);
        propertyform.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        
    }//GEN-LAST:event_jLabel_PropertyMouseClicked

    private void jLabel_PropertyImagesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_PropertyImagesMouseClicked
        
        //show image property page
        Image_Property imageform = new Image_Property();
        imageform.setVisible(true);
        imageform.pack();
        imageform.setLocationRelativeTo(null);
        imageform.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        
    }//GEN-LAST:event_jLabel_PropertyImagesMouseClicked

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
                    //show main page
                    Main_Page mainform = new Main_Page();
                    mainform.setVisible(true);
                    mainform.pack();
                    mainform.setLocationRelativeTo(null);
                    mainform.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

                    this.dispose();
                }
       
    }//GEN-LAST:event_jLabel_LogoutMouseClicked

    private void jLabel_LogoutMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_LogoutMouseEntered
        
        jLabel_Logout.setBackground(Color.white);
        jLabel_Logout.setForeground(new Color(153,153,0));
    }//GEN-LAST:event_jLabel_LogoutMouseEntered

    private void jLabel_LogoutMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_LogoutMouseExited
        
        jLabel_Logout.setBackground(new Color(153,153,0));
        jLabel_Logout.setForeground(Color.white);
        
    }//GEN-LAST:event_jLabel_LogoutMouseExited

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
            java.util.logging.Logger.getLogger(Main_Page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main_Page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main_Page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main_Page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main_Page().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel_AppName;
    private javax.swing.JLabel jLabel_Clients;
    private javax.swing.JLabel jLabel_Logout;
    private javax.swing.JLabel jLabel_Owners;
    private javax.swing.JLabel jLabel_Property;
    private javax.swing.JLabel jLabel_PropertyImages;
    private javax.swing.JLabel jLabel_PropertyType;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    // End of variables declaration//GEN-END:variables
}