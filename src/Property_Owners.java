
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author laury
 */
public class Property_Owners extends javax.swing.JFrame {

    /**
     * Creates new form Property_Owners
     */
    
    // the owner id
    static int ownerId;
    
    public Property_Owners(int oId) {
        initComponents();
        
        this.ownerId = oId;
        
        fillJtableWithPropertiesData(ownerId);
    }

    // create a function to populate the jtable with the selected owner properties
    public void fillJtableWithPropertiesData(int id)
    {
        Prop_Property property = new Prop_Property();
        ArrayList<Prop_Property> propertyList = property.propertiesListByOwner(id);
         
        // the jtable columns 0      1      2            3       4        5           6          7          8              9                 10              11              12              13         
        String[] colNames = {"ID","Type","square_feet","Owner","Price","Address","Bedrooms","Bathrooms","Panels","Security Cameras","Electric Fence","Compound Lighting","Hot Showers","Description"};
        
        // the jtable row
        // ownersList.size() = the size of the arraylist
        // 6 = the number of columns
        Object[][] rows = new Object[propertyList.size()][14];
        
        // add data form the list to the rows
        for(int i = 0; i < propertyList.size(); i++)
        {
            rows[i][0] = propertyList.get(i).getId();
            rows[i][1] = propertyList.get(i).getType();
            rows[i][2] = propertyList.get(i).getSize();
            rows[i][3] = propertyList.get(i).getOwnerId();
            rows[i][4] = propertyList.get(i).getPrice();
            rows[i][5] = propertyList.get(i).getAddress();
            rows[i][6] = propertyList.get(i).getBedrooms();
            rows[i][7] = propertyList.get(i).getBathrooms();
            rows[i][8] = propertyList.get(i).getPanels();
            
            if(propertyList.get(i).isSecurityCameras()) rows[i][9] = "YES" ;
            else{rows[i][9] = "NO" ;}
            
            if(propertyList.get(i).isElectricFence()) rows[i][10] = "YES" ;
            else{rows[i][10] = "NO" ;}
            
            if(propertyList.get(i).isCompound()) rows[i][11] = "YES" ;
            else{rows[i][11] = "NO" ;}
            
            if(propertyList.get(i).isHotShowers()) rows[i][12] = "YES" ;
            else{rows[i][12] = "NO" ;}
            
            rows[i][13] = propertyList.get(i).getComment();
        }
        
        DefaultTableModel model = new DefaultTableModel(rows, colNames);
        jTable1.setModel(model);
        
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
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(153, 153, 0));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1405, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 550, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(Property_Owners.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Property_Owners.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Property_Owners.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Property_Owners.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Property_Owners(ownerId).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}