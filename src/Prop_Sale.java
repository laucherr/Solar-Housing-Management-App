
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author laury
 */
public class Prop_Sale {
    
    private int id;
    private int propertyId;
    private int clientId;
    private String finalPrice;
    private String sellingDate;
    
    public Prop_Sale(){}
    
    public Prop_Sale (int ID, int PROPERTY_ID, int CLIENT_ID, String FINAL_PRICE, String SELLING_DATE)
    {
        this.id = ID;
        this.propertyId = PROPERTY_ID;
        this.clientId = CLIENT_ID;
        this.finalPrice = FINAL_PRICE;
        this.sellingDate = SELLING_DATE;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPropertyId() {
        return propertyId;
    }

    public void setPropertyId(int propertyId) {
        this.propertyId = propertyId;
    }

    public int getClientId() {
        return clientId;
    }

    public void setClientId(int clientId) {
        this.clientId = clientId;
    }

    public String getFinalPrice() {
        return finalPrice;
    }

    public void setFinalPrice(String finalPrice) {
        this.finalPrice = finalPrice;
    }

    public String getSellingDate() {
        return sellingDate;
    }

    public void setSellingDate(String sellingDate) {
        this.sellingDate = sellingDate;
    }
    
    
    // create a function to add a new sale
    public boolean addNewSale(Prop_Sale sale)
    {
        PreparedStatement ps;
       
        String addQuery = "INSERT INTO `property_sales`(`property_id`, `client_id`, `property_price`, `date_of_sale`) VALUES (?,?,?,?)";
       
        try {
            ps = Connection.getConnection().prepareStatement(addQuery);
            ps.setInt(1, sale.getPropertyId());
            ps.setInt(2, sale.getClientId());
            ps.setString(3, sale.getFinalPrice());
            ps.setString(4, sale.getSellingDate());
            
            return (ps.executeUpdate() > 0);
            
        } catch (SQLException ex) {
            Logger.getLogger(Prop_Sale.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
        
    }
    
    
    // create a function to edit the selected sale data
    public boolean editSale(Prop_Sale sale)
    {
        PreparedStatement ps;
        
        String editQuery = "UPDATE `property_sales` SET `property_id`=?,`client_id`=?,`property_price`=?,`date_of_sale`=? WHERE `id`=?";
        
        try {
            ps = Connection.getConnection().prepareStatement(editQuery);
            ps.setInt(1, sale.getPropertyId());
            ps.setInt(2, sale.getClientId());
            ps.setString(3, sale.getFinalPrice());
            ps.setString(4, sale.getSellingDate());
            ps.setInt(5, sale.getId());
            
            return (ps.executeUpdate() > 0);
            
        } catch (SQLException ex) {
            Logger.getLogger(Prop_Sale.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }
    
    
    // create a function to delete the selected sale
    public boolean deleteSale(int saleId)
    {
        PreparedStatement ps;
        
        String deleteQuery = "DELETE FROM `property_sales` WHERE `id`=?";
        
        try {
            ps = Connection.getConnection().prepareStatement(deleteQuery);
            
            ps.setInt(1, saleId);
            
            return (ps.executeUpdate() > 0);
            
        } catch (SQLException ex) {
            Logger.getLogger(Prop_Sale.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        } 
    }
    
 
    // create a unction to return an arraylist of sales
    public ArrayList<Prop_Sale> salesList()
    {
        ArrayList<Prop_Sale> list = new ArrayList<>();
        
        Statement st;
        ResultSet rs;
        
        String selectQuery = "SELECT * FROM `property_sales`";
        
        try {
            
            st = Connection.getConnection().createStatement();
            rs = st.executeQuery(selectQuery);
            
            Prop_Sale sale;
            
            while (rs.next()) {
                
                sale = new Prop_Sale(rs.getInt(1),
                                    rs.getInt(2), 
                                    rs.getInt(3),
                                    rs.getString(4), 
                                    rs.getString(5));
                
                list.add(sale);
                
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(Prop_Sale.class.getName()).log(Level.SEVERE, null, ex);
        }

        return list;
    }
}
