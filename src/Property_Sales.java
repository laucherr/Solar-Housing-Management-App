
import java.awt.Color;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import static java.util.Date.parse;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
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
public class Property_Sales extends javax.swing.JFrame {

    /**
     * Creates new form Property_Sales
     */
    public Property_Sales() {
        initComponents();
        
        // populate the jtable properties with the property id, owner id, and price
        fillJtableProperties();
        
        // populate the jtable clients with the client id, first name and last name
        fillJtableClients();
        
        // populate the jtable sales
        fillJtableSales();
        
        // change the jtable row height
        jTable_Clients.setRowHeight(40);
        jTable_Properties.setRowHeight(40);
        jTable_Sales.setRowHeight(40);
        // change the jtable selection background
        jTable_Clients.setSelectionBackground(new Color(27,150,77));
        jTable_Properties.setSelectionBackground(new Color(20,120,10));
        jTable_Sales.setSelectionBackground(new Color(0,70,0));
    }
    
    // create a function to populate the jtable with properties data
    public void fillJtableProperties()
    {
        Prop_Property property = new Prop_Property();
        ArrayList<Prop_Property> propertyList = property.propertiesList();
        
        // the jtable columns 0      1    
        String[] colNames = {"ID","Tenant Id","Price"};
        
        // the jtable row
        // ownersList.size() = the size of the arraylist
        // 6 = the number of columns
        Object[][] rows = new Object[propertyList.size()][3];
        
        // add data form the list to the rows
        for(int i = 0; i < propertyList.size(); i++)
        {
            rows[i][0] = propertyList.get(i).getId();
            rows[i][1] = propertyList.get(i).getOwnerId();
            rows[i][2] = propertyList.get(i).getPrice();
        }
        
        DefaultTableModel model = new DefaultTableModel(rows, colNames);
        jTable_Properties.setModel(model);
        
    }
    
    // create a function to populate the jtable with clients data
    public void fillJtableClients()
    {
        Prop_Client client = new Prop_Client();
        ArrayList<Prop_Client> clientList = client.clientsList();
        
        // the jtable columns
        String[] colNames = {"ID","First Name","Last Name"};
        
        // the jtable row
        // ownersList.size() = the size of the arraylist
        // 6 = the number of columns
        Object[][] rows = new Object[clientList.size()][3];
        
        // add data form the list to the rows
        for(int i = 0; i < clientList.size(); i++)
        {
            rows[i][0] = clientList.get(i).getId();
            rows[i][1] = clientList.get(i).getFname();
            rows[i][2] = clientList.get(i).getLname();
        }
        
        DefaultTableModel model = new DefaultTableModel(rows, colNames);
        jTable_Clients.setModel(model);
        
        
    }
    
    // create a function to populate the jtable with sales data
    public void fillJtableSales()
    {
        Prop_Sale sale = new Prop_Sale();
        ArrayList<Prop_Sale> salesList = sale.salesList();
        
        // the jtable columns
        String[] colNames = {"ID","Property","Tenant","Price","Date"};
        
        // the jtable row
        // ownersList.size() = the size of the arraylist
        // 5 = the number of columns
        Object[][] rows = new Object[salesList.size()][5];
        
        // add data form the list to the rows
        for(int i = 0; i < salesList.size(); i++)
        {
            rows[i][0] = salesList.get(i).getId();
            rows[i][1] = salesList.get(i).getPropertyId();
            rows[i][2] = salesList.get(i).getClientId();
            rows[i][3] = salesList.get(i).getFinalPrice();
            rows[i][4] = salesList.get(i).getSellingDate();
        }
        
        DefaultTableModel model = new DefaultTableModel(rows, colNames);
        jTable_Sales.setModel(model);
        
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
        jTextField_Id = new javax.swing.JTextField();
        jTextField_PropertyID = new javax.swing.JTextField();
        jButton_Add_Sale = new javax.swing.JButton();
        jButton_Edit_Sale = new javax.swing.JButton();
        jButton_Remove_Sale = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jTextField_ClientID = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jTextField_FinalPrice = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable_Properties = new javax.swing.JTable();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable_Clients = new javax.swing.JTable();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTable_Sales = new javax.swing.JTable();
        jButton_Refresh_Sales_Table = new javax.swing.JButton();
        jButton_Refresh_Clients_Table = new javax.swing.JButton();
        jButton_Add_Client = new javax.swing.JButton();
        jButton_Refresh_Properties_Table = new javax.swing.JButton();
        jButton_Add_Property = new javax.swing.JButton();
        jDateChooser = new com.toedter.calendar.JDateChooser();
        jButton_Clear = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 204));

        jPanel_Title.setBackground(new java.awt.Color(153, 153, 0));

        jLabel1.setFont(new java.awt.Font("Bookman Old Style", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Solar Housing System Report ");

        javax.swing.GroupLayout jPanel_TitleLayout = new javax.swing.GroupLayout(jPanel_Title);
        jPanel_Title.setLayout(jPanel_TitleLayout);
        jPanel_TitleLayout.setHorizontalGroup(
            jPanel_TitleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_TitleLayout.createSequentialGroup()
                .addGap(424, 424, 424)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel_TitleLayout.setVerticalGroup(
            jPanel_TitleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel_TitleLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel2.setText("ID:");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel3.setText("Property ID:");

        jTextField_Id.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N

        jTextField_PropertyID.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N

        jButton_Add_Sale.setBackground(new java.awt.Color(0, 153, 51));
        jButton_Add_Sale.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton_Add_Sale.setForeground(new java.awt.Color(255, 255, 255));
        jButton_Add_Sale.setText("ADD");
        jButton_Add_Sale.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton_Add_Sale.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_Add_SaleActionPerformed(evt);
            }
        });

        jButton_Edit_Sale.setBackground(new java.awt.Color(255, 153, 0));
        jButton_Edit_Sale.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton_Edit_Sale.setForeground(new java.awt.Color(255, 255, 255));
        jButton_Edit_Sale.setText("UPDATE");
        jButton_Edit_Sale.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton_Edit_Sale.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_Edit_SaleActionPerformed(evt);
            }
        });

        jButton_Remove_Sale.setBackground(new java.awt.Color(255, 51, 51));
        jButton_Remove_Sale.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton_Remove_Sale.setForeground(new java.awt.Color(255, 255, 255));
        jButton_Remove_Sale.setText("DELETE");
        jButton_Remove_Sale.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton_Remove_Sale.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_Remove_SaleActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel5.setText("Tenant ID:");

        jTextField_ClientID.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel6.setText("Final Price:");

        jTextField_FinalPrice.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel7.setText("Date:");

        jTable_Properties.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jTable_Properties.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable_PropertiesMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTable_Properties);

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel8.setText("Solar Property List");

        jTable_Clients.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jTable_Clients.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable_ClientsMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(jTable_Clients);

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel9.setText("Tenant List");

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel10.setText("Property Sales List");

        jTable_Sales.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jTable_Sales.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable_SalesMouseClicked(evt);
            }
        });
        jScrollPane4.setViewportView(jTable_Sales);

        jButton_Refresh_Sales_Table.setBackground(new java.awt.Color(255, 204, 0));
        jButton_Refresh_Sales_Table.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton_Refresh_Sales_Table.setText("REFRESH PROPERTY SALES LIST");
        jButton_Refresh_Sales_Table.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton_Refresh_Sales_Table.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_Refresh_Sales_TableActionPerformed(evt);
            }
        });

        jButton_Refresh_Clients_Table.setBackground(new java.awt.Color(255, 204, 0));
        jButton_Refresh_Clients_Table.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton_Refresh_Clients_Table.setText("REFRESH TENANT");
        jButton_Refresh_Clients_Table.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton_Refresh_Clients_Table.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_Refresh_Clients_TableActionPerformed(evt);
            }
        });

        jButton_Add_Client.setBackground(new java.awt.Color(0, 153, 51));
        jButton_Add_Client.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton_Add_Client.setForeground(new java.awt.Color(255, 255, 255));
        jButton_Add_Client.setText("ADD NEW TENANT");
        jButton_Add_Client.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton_Add_Client.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_Add_ClientActionPerformed(evt);
            }
        });

        jButton_Refresh_Properties_Table.setBackground(new java.awt.Color(255, 204, 0));
        jButton_Refresh_Properties_Table.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton_Refresh_Properties_Table.setText("REFRESH SOLAR PROPERY LIST");
        jButton_Refresh_Properties_Table.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton_Refresh_Properties_Table.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_Refresh_Properties_TableActionPerformed(evt);
            }
        });

        jButton_Add_Property.setBackground(new java.awt.Color(0, 153, 51));
        jButton_Add_Property.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton_Add_Property.setForeground(new java.awt.Color(255, 255, 255));
        jButton_Add_Property.setText("ADD NEW SOLAR PROPERTY");
        jButton_Add_Property.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton_Add_Property.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_Add_PropertyActionPerformed(evt);
            }
        });

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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(25, 25, 25)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel7)
                                        .addGap(18, 18, 18)
                                        .addComponent(jDateChooser, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addComponent(jLabel6)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(13, 13, 13)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(jLabel2)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jTextField_Id, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                    .addComponent(jLabel3)
                                                    .addComponent(jLabel5))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                    .addComponent(jTextField_FinalPrice, javax.swing.GroupLayout.DEFAULT_SIZE, 102, Short.MAX_VALUE)
                                                    .addComponent(jTextField_ClientID)
                                                    .addComponent(jTextField_PropertyID)))))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addContainerGap()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jButton_Add_Sale, javax.swing.GroupLayout.DEFAULT_SIZE, 218, Short.MAX_VALUE)
                                            .addComponent(jButton_Remove_Sale, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jButton_Edit_Sale, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel10)
                            .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 468, Short.MAX_VALUE)
                            .addComponent(jButton_Refresh_Sales_Table, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButton_Clear, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton_Add_Client, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton_Refresh_Clients_Table, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 296, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jButton_Refresh_Properties_Table, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton_Add_Property, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 366, Short.MAX_VALUE))
                    .addComponent(jLabel8))
                .addGap(86, 86, 86))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel_Title, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField_Id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField_PropertyID))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField_ClientID))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField_FinalPrice))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jDateChooser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(67, 67, 67)
                        .addComponent(jButton_Add_Sale, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton_Edit_Sale, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton_Remove_Sale, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(41, 41, 41)
                                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 423, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(8, 8, 8))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 423, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 423, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton_Refresh_Sales_Table, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton_Refresh_Clients_Table, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton_Refresh_Properties_Table, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButton_Add_Client, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton_Add_Property, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jButton_Clear, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(16, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1405, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton_Add_SaleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_Add_SaleActionPerformed

        
        // add a new Sale
        //int id = Integer.valueOf(jTextField_Id.getText());
        
        try
        {
            int propertyId = Integer.valueOf(jTextField_PropertyID.getText());
            int clientId = Integer.valueOf(jTextField_ClientID.getText());
            String finalPrice = jTextField_FinalPrice.getText();
            SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
            String sellingdate = dateFormat.format(jDateChooser.getDate());

            Prop_Sale sale = new Prop_Sale(0, propertyId, clientId, finalPrice, sellingdate);

            if(new Prop_Sale().addNewSale(sale))
            {
                JOptionPane.showMessageDialog(null, "A New Sale Has Been Created and Added", "Add Sale", 1);
            }
            else{
                   JOptionPane.showMessageDialog(null, "Sale Not Created", "Add Sale", 2);
                }

        }catch(Exception ex)
        {
            JOptionPane.showMessageDialog(null, "Select The Property Id, Client Id and The Sale Date", "Add Sale Error", 2);
        }
       

    }//GEN-LAST:event_jButton_Add_SaleActionPerformed

    private void jButton_Edit_SaleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_Edit_SaleActionPerformed

        // edit the selected sale

        
       try
       {
             int id = Integer.valueOf(jTextField_Id.getText());
             int propertyId = Integer.valueOf(jTextField_PropertyID.getText());
             int clientId = Integer.valueOf(jTextField_ClientID.getText());
             String finalPrice = jTextField_FinalPrice.getText();
             SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
             String sellingate = dateFormat.format(jDateChooser.getDate());

             Prop_Sale sale = new Prop_Sale(id, propertyId, clientId, finalPrice, sellingate);

             if(new Prop_Sale().editSale(sale))
             {
                 JOptionPane.showMessageDialog(null, "Sale Data Has Been Updated", "Edit Sale", 1);
             }
             else{
                    JOptionPane.showMessageDialog(null, "Sale Data Not Updated", "Edit Sale", 2);
                 }
       }
       catch(Exception ex)
        {
            JOptionPane.showMessageDialog(null, "Select The Sale Id, Client Id and The Sale Date", "Edit Sale Error", 2);
        } 

        
    }//GEN-LAST:event_jButton_Edit_SaleActionPerformed

    private void jButton_Remove_SaleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_Remove_SaleActionPerformed

        // remove the selected sale
        
            try{
                int id = Integer.valueOf(jTextField_Id.getText());

                if(new Prop_Sale().deleteSale(id))
                {
                    JOptionPane.showMessageDialog(null, "Sale Data Has Been Deleted", "Delete Sale", 1);
                }
                else{
                       JOptionPane.showMessageDialog(null, "Sale Data Not Deleted", "Delete Sale", 2);
                    }
            }
            catch(Exception ex)
            {
                JOptionPane.showMessageDialog(null, "Select The Sale Id", "Delete Sale Error", 2);
            }
    
    }//GEN-LAST:event_jButton_Remove_SaleActionPerformed

    private void jTable_PropertiesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable_PropertiesMouseClicked

        

    }//GEN-LAST:event_jTable_PropertiesMouseClicked

    private void jTable_ClientsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable_ClientsMouseClicked

      

    }//GEN-LAST:event_jTable_ClientsMouseClicked

    private void jTable_SalesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable_SalesMouseClicked

        // display the property address and description in text fields
        int selectedRowIndex = jTable_Sales.getSelectedRow();
        
        jTextField_Id.setText(jTable_Sales.getValueAt(selectedRowIndex, 0).toString());
        jTextField_PropertyID.setText(jTable_Sales.getValueAt(selectedRowIndex, 1).toString());
        jTextField_ClientID.setText(jTable_Sales.getValueAt(selectedRowIndex, 2).toString());
        jTextField_FinalPrice.setText(jTable_Sales.getValueAt(selectedRowIndex, 3).toString());
        //jDateChooser.setDate((Date) jTable_Sales.getValueAt(selectedRowIndex, 4));
           
             
    }//GEN-LAST:event_jTable_SalesMouseClicked

    private void jButton_Refresh_Sales_TableActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_Refresh_Sales_TableActionPerformed

        // refresh the jtable sales
        fillJtableSales();

    }//GEN-LAST:event_jButton_Refresh_Sales_TableActionPerformed

    private void jButton_Refresh_Clients_TableActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_Refresh_Clients_TableActionPerformed

   

    }//GEN-LAST:event_jButton_Refresh_Clients_TableActionPerformed

    private void jButton_Add_ClientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_Add_ClientActionPerformed

        // open the client form
        Clients clientform = new Clients();
        clientform.setVisible(true);
        clientform.pack();
        clientform.setLocationRelativeTo(null);
        clientform.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

    }//GEN-LAST:event_jButton_Add_ClientActionPerformed

    private void jButton_Refresh_Properties_TableActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_Refresh_Properties_TableActionPerformed

        // refresh the jtable properties
        fillJtableProperties();


    }//GEN-LAST:event_jButton_Refresh_Properties_TableActionPerformed

    private void jButton_Add_PropertyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_Add_PropertyActionPerformed

        // open the property form
        Property propertyform = new Property();
        propertyform.setVisible(true);
        propertyform.pack();
        propertyform.setLocationRelativeTo(null);
        propertyform.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

    }//GEN-LAST:event_jButton_Add_PropertyActionPerformed

    private void jButton_ClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_ClearActionPerformed
        // TODO add your handling code here:
        jTextField_Id.setText(null);
        jTextField_PropertyID.setText(null);
        jTextField_ClientID.setText(null);
        jTextField_FinalPrice.setText(null);
        jDateChooser.setDate(null);

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
            java.util.logging.Logger.getLogger(Property_Sales.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Property_Sales.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Property_Sales.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Property_Sales.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Property_Sales().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_Add_Client;
    private javax.swing.JButton jButton_Add_Property;
    private javax.swing.JButton jButton_Add_Sale;
    private javax.swing.JButton jButton_Clear;
    private javax.swing.JButton jButton_Edit_Sale;
    private javax.swing.JButton jButton_Refresh_Clients_Table;
    private javax.swing.JButton jButton_Refresh_Properties_Table;
    private javax.swing.JButton jButton_Refresh_Sales_Table;
    private javax.swing.JButton jButton_Remove_Sale;
    private com.toedter.calendar.JDateChooser jDateChooser;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel_Title;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTable jTable_Clients;
    private javax.swing.JTable jTable_Properties;
    private javax.swing.JTable jTable_Sales;
    private javax.swing.JTextField jTextField_ClientID;
    private javax.swing.JTextField jTextField_FinalPrice;
    private javax.swing.JTextField jTextField_Id;
    private javax.swing.JTextField jTextField_PropertyID;
    // End of variables declaration//GEN-END:variables
}
