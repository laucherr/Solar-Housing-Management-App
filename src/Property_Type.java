
import java.awt.Color;
import java.util.HashMap;
import javax.swing.BorderFactory;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import javax.swing.border.Border;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author laury
 */
public class Property_Type extends javax.swing.JFrame {

    /**
     * Creates new form Property_Type
     */
    public Property_Type() {
        initComponents();
        
        //[153,153,0] menu color
        
        //set borders to the jpanel title
        Border panel_border = BorderFactory.createMatteBorder(0, 0, 3, 0, new Color(125, 125, 125));
        jPanel_Title.setBorder(panel_border);
        
        //set borders to the jButtons
        Border button_border = BorderFactory.createMatteBorder(1, 1, 1, 1, new Color(255, 255, 255));
        jButton_Add.setBorder(button_border);
        jButton_Update.setBorder(button_border);
        jButton_Delete.setBorder(button_border);
        jButton_Refresh.setBorder(button_border);
        
        fillTypeList();
        
    }
    
    //function that populates the Type list using Type Hashmap
    
    public void fillTypeList()
    {
        Prop_Type type = new Prop_Type();
        
        HashMap<String, Integer> map = type.getTypesMap();
        
        DefaultListModel listModel = new DefaultListModel();
        
        int i = 0;
        
        for(String typeName: map.keySet())
        {
            listModel.add(i, typeName);
            i++;
        }
        
        jList1.setModel(listModel);
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
        jPanel_Title = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTextField_Id = new javax.swing.JTextField();
        jTextField_Name = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea_Description = new javax.swing.JTextArea();
        jButton_Add = new javax.swing.JButton();
        jButton_Refresh = new javax.swing.JButton();
        jButton_Update = new javax.swing.JButton();
        jButton_Delete = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        jButton_Clear = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 204, 0));

        jPanel_Title.setBackground(new java.awt.Color(153, 153, 0));

        jLabel1.setFont(new java.awt.Font("Bookman Old Style", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Location of Solar Property");

        javax.swing.GroupLayout jPanel_TitleLayout = new javax.swing.GroupLayout(jPanel_Title);
        jPanel_Title.setLayout(jPanel_TitleLayout);
        jPanel_TitleLayout.setHorizontalGroup(
            jPanel_TitleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel_TitleLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(223, 223, 223))
        );
        jPanel_TitleLayout.setVerticalGroup(
            jPanel_TitleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_TitleLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(28, Short.MAX_VALUE))
        );

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel2.setText("Name:");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel3.setText("Description:");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel4.setText("ID:");

        jTextField_Id.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jTextField_Id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_IdActionPerformed(evt);
            }
        });

        jTextField_Name.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jTextField_Name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_NameActionPerformed(evt);
            }
        });

        jTextArea_Description.setColumns(20);
        jTextArea_Description.setFont(new java.awt.Font("Monospaced", 0, 16)); // NOI18N
        jTextArea_Description.setRows(5);
        jScrollPane1.setViewportView(jTextArea_Description);

        jButton_Add.setBackground(new java.awt.Color(0, 204, 0));
        jButton_Add.setText("ADD");
        jButton_Add.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton_Add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_AddActionPerformed(evt);
            }
        });

        jButton_Refresh.setBackground(new java.awt.Color(255, 255, 51));
        jButton_Refresh.setText("REFRESH");
        jButton_Refresh.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton_Refresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_RefreshActionPerformed(evt);
            }
        });

        jButton_Update.setBackground(new java.awt.Color(255, 153, 0));
        jButton_Update.setText("UPDATE");
        jButton_Update.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton_Update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_UpdateActionPerformed(evt);
            }
        });

        jButton_Delete.setBackground(new java.awt.Color(255, 0, 0));
        jButton_Delete.setText("DELETE");
        jButton_Delete.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton_Delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_DeleteActionPerformed(evt);
            }
        });

        jList1.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jList1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jList1MouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(jList1);

        jButton_Clear.setBackground(new java.awt.Color(204, 51, 255));
        jButton_Clear.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton_Clear.setForeground(new java.awt.Color(255, 255, 255));
        jButton_Clear.setText("CLEAR");
        jButton_Clear.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton_Clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_ClearActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel_Title, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButton_Add, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jTextField_Id, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jTextField_Name)
                                    .addComponent(jScrollPane1))
                                .addGap(44, 44, 44)))
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 385, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(jButton_Update, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(41, 41, 41)
                        .addComponent(jButton_Delete, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32)
                        .addComponent(jButton_Clear, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                        .addComponent(jButton_Refresh, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel_Title, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(65, 65, 65)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField_Id, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(20, 20, 20)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField_Name, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(33, 33, 33)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 59, Short.MAX_VALUE))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
                    .addComponent(jScrollPane3))
                .addGap(81, 81, 81)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton_Add, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton_Update, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton_Refresh, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton_Delete, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton_Clear, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(52, 52, 52))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField_IdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_IdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_IdActionPerformed

    private void jTextField_NameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_NameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_NameActionPerformed

    private void jButton_RefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_RefreshActionPerformed
        
        // refresh the List data
        fillTypeList();
        
    }//GEN-LAST:event_jButton_RefreshActionPerformed

    private void jButton_DeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_DeleteActionPerformed
        
        try{
        
                 // remove the selected type
                Integer id = Integer.valueOf(jTextField_Id.getText());

                Prop_Type type = new Prop_Type(id,"","");

                if(!jTextField_Id.getText().trim().equals(""))// if the type id is not empty
                {
                  // show a confirmation message before deleting the type
                  int yes_or_no = JOptionPane.showConfirmDialog(null, "Are you sure you would like to delete this type of property", "Delete Type", JOptionPane.YES_NO_OPTION);

                  if(yes_or_no == JOptionPane.YES_OPTION)
                  {
                      if(type.execTypeQuery("remove", type))
                      {
                          JOptionPane.showMessageDialog(null, "Type Deleted", "Delete Type", 1);
                          
                          // clear text fields after the delete
                          jTextField_Id.setText("");
                          jTextField_Name.setText("");
                          jTextArea_Description.setText("");
                          
                      }else{
                          JOptionPane.showMessageDialog(null, "Operation Failed", "Delete Type", 2);
                      }  
                  }

                }
                else{
                    JOptionPane.showMessageDialog(null, "Enter The Type Id", "Empty Id", 2);
                }
            
        }catch(Exception ex)
        {
            JOptionPane.showMessageDialog(null, "Please enter an existing Property Type ID", "Invalid Id", 0);
        }
        
    }//GEN-LAST:event_jButton_DeleteActionPerformed

    private void jButton_AddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_AddActionPerformed
        // TODO add your handling code here:
        
        // add a new type
        String name = jTextField_Name.getText();
        String description = jTextArea_Description.getText();
        
        Prop_Type type = new Prop_Type (0,name,description);
        
        if(!name.trim().equals(""))// if the type name is not empty
        {
            
          if(type.execTypeQuery("add", type))
          {
              JOptionPane.showMessageDialog(null, "New Type Added", "Add Type", 1);
          }else{
              JOptionPane.showMessageDialog(null, "Operation Failed", "Add Type", 2);
          }    
        }
        else{
            JOptionPane.showMessageDialog(null, "Please select property type", "Empty Name", 2);
        }
        
       
    }//GEN-LAST:event_jButton_AddActionPerformed

    private void jButton_UpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_UpdateActionPerformed
        
        try{
            // edit the selected type
            Integer id = Integer.valueOf(jTextField_Id.getText());
            String name = jTextField_Name.getText();
            String description = jTextArea_Description.getText();

            Prop_Type type = new Prop_Type (id,name,description);

            if(!name.trim().equals(""))// if the type name is not empty
            {
              if(type.execTypeQuery("edit", type))
              {
                  JOptionPane.showMessageDialog(null, "Type Updated", "Edit Type", 1);
              }else{
                  JOptionPane.showMessageDialog(null, "Operation Failed", "Edit Type", 2);
              }    
            }
            else{
                JOptionPane.showMessageDialog(null, "Enter The Type Name", "Empty Name", 2);
            }
        }catch(Exception ex)
        {
            JOptionPane.showMessageDialog(null, " Please enter an existing Property Type ID", "Invalid Id", 0);
        }
        
    }//GEN-LAST:event_jButton_UpdateActionPerformed

    private void jList1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jList1MouseClicked
        
        // display the selected type from list to the text fields
        // getting the id using the hashmap
        Prop_Type type = new Prop_Type();
        HashMap<String, Integer> map = type.getTypesMap();
        Integer typeId = map.get(jList1.getSelectedValue());
        type = type.getTypeById(typeId);
        jTextField_Id.setText(type.getId().toString());
        jTextField_Name.setText(type.getName());
        jTextArea_Description.setText(type.getDescription());
        
    }//GEN-LAST:event_jList1MouseClicked

    private void jButton_ClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_ClearActionPerformed
        // TODO add your handling code here:
        jTextField_Id.setText(null);
        jTextField_Name.setText(null);
        jTextArea_Description.setText(null);


    }//GEN-LAST:event_jButton_ClearActionPerformed

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
            java.util.logging.Logger.getLogger(Property_Type.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Property_Type.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Property_Type.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Property_Type.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Property_Type().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_Add;
    private javax.swing.JButton jButton_Clear;
    private javax.swing.JButton jButton_Delete;
    private javax.swing.JButton jButton_Refresh;
    private javax.swing.JButton jButton_Update;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JList<String> jList1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel_Title;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextArea jTextArea_Description;
    private javax.swing.JTextField jTextField_Id;
    private javax.swing.JTextField jTextField_Name;
    // End of variables declaration//GEN-END:variables
}
