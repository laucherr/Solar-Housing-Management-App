
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
public class Prop_Client {
    
    private int id;
    private String firstName;
    private String lastName;
    private String phone;
    private String email;
    private String address;
    
    public int getId()
    {
        return this.id;
    }
    
    public void setId(int ID)
    {
        this.id = ID;
    }
    
    public String getFname()
    {
        return this.firstName;
    }
    
    public void setFname(String FNAME)
    {
       this.firstName = FNAME; 
    }
    
    public String getLname()
    {
        return this.lastName;
    }
    
    public void setLname(String LNAME)
    {
       this.lastName = LNAME; 
    }
    
    public String getPhone()
    {
        return this.phone;
    }
    
    public void setPhone(String PHONE)
    {
       this.phone = PHONE; 
    }
    
    public String getEmail()
    {
        return this.email;
    }
    
    public void setEmail(String EMAIL)
    {
       this.email = EMAIL; 
    }
    
    public String getAddress()
    {
        return this.address;
    }
    
    public void setAddress(String ADDRESS)
    {
       this.address = ADDRESS; 
    }
    
    
    public Prop_Client(){}
    
    public Prop_Client(int ID, String FNAME, String LNAME, String PHONE, String EMAIL, String ADDRESS)
    {
        this.id = ID;
        this.firstName = FNAME;
        this.lastName = LNAME;
        this.phone = PHONE;
        this.email = EMAIL;
        this.address = ADDRESS;
    }
    
    
    // create a function to add a new client
    // first create the client in the database
    public boolean addNewClient(Prop_Client client)
    {
        PreparedStatement ps;
        
        String addQuery = "INSERT INTO `clients`(`fname`, `lname`, `phone`, `email`, `address`) VALUES (?,?,?,?,?)";
        
        try {
            ps = Connection.getConnection().prepareStatement(addQuery);
            ps.setString(1, client.getFname());
            ps.setString(2, client.getLname());
            ps.setString(3, client.getPhone());
            ps.setString(4, client.getEmail());
            ps.setString(5, client.getAddress());
            
            return (ps.executeUpdate() > 0);
            
        } catch (SQLException ex) {
            Logger.getLogger(Prop_Client.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
        
    }
    
    
    // create a function to edit the selected client data
    public boolean editClientData(Prop_Client client)
    {
        PreparedStatement ps;
        
        String editQuery = "UPDATE `clients` SET `fname`=?,`lname`=?,`phone`=?,`email`=?,`address`=? WHERE `id`=?";
        
        try {
            ps = Connection.getConnection().prepareStatement(editQuery);
            ps.setString(1, client.getFname());
            ps.setString(2, client.getLname());
            ps.setString(3, client.getPhone());
            ps.setString(4, client.getEmail());
            ps.setString(5, client.getAddress());
            ps.setInt(6, client.getId());
            
            return (ps.executeUpdate() > 0);
            
        } catch (SQLException ex) {
            Logger.getLogger(Prop_Client.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }
    
    
    // create a function to delete the selected client
    public boolean deleteClient(int clientId)
    {
        PreparedStatement ps;
        
        String deleteQuery = "DELETE FROM `clients` WHERE `id`=?";
        
        try {
            ps = Connection.getConnection().prepareStatement(deleteQuery);
            
            ps.setInt(1, clientId);
            
            return (ps.executeUpdate() > 0);
            
        } catch (SQLException ex) {
            Logger.getLogger(Prop_Client.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        } 
    }
    
    
    // create a unction to return an arraylist of clients
    public ArrayList<Prop_Client> clientsList()
    {
        ArrayList<Prop_Client> list = new ArrayList<>();
        
        Statement st;
        ResultSet rs;
        
        String selectQuery = "SELECT * FROM `clients`";
        
        try {
            
            st = Connection.getConnection().createStatement();
            rs = st.executeQuery(selectQuery);
            
            Prop_Client client;
            
            while (rs.next()) {
                
                client = new Prop_Client(rs.getInt(1),
                                    rs.getString(2), 
                                    rs.getString(3),
                                    rs.getString(4), 
                                    rs.getString(5), 
                                    rs.getString(6));
                
                list.add(client);
                
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(Prop_Client.class.getName()).log(Level.SEVERE, null, ex);
        }

        return list;
    }
}
