
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
public class Prop_Owners {
    
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
    
    
    public Prop_Owners(){}
    
    public Prop_Owners(int ID, String FNAME, String LNAME, String PHONE, String EMAIL, String ADDRESS)
    {
        this.id = ID;
        this.firstName = FNAME;
        this.lastName = LNAME;
        this.phone = PHONE;
        this.email = EMAIL;
        this.address = ADDRESS;
    }
    
    
    // create a function to add a new owner
    // first create the owner in the database
    public boolean addNewOwner(Prop_Owners owner)
    {
        PreparedStatement ps;
        
        String addQuery = "INSERT INTO `home_owners`(`fname`, `lname`, `phone`, `email`, `address`) VALUES (?,?,?,?,?)";
        
        try {
            ps = Connection.getConnection().prepareStatement(addQuery);
            ps.setString(1, owner.getFname());
            ps.setString(2, owner.getLname());
            ps.setString(3, owner.getPhone());
            ps.setString(4, owner.getEmail());
            ps.setString(5, owner.getAddress());
            
            return (ps.executeUpdate() > 0);
            
        } catch (SQLException ex) {
            Logger.getLogger(Prop_Owners.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
        
    }
    
    
    // create a function to edit the selected owner data
    public boolean editOwnerData(Prop_Owners owner)
    {
        PreparedStatement ps;
        
        String editQuery = "UPDATE `home_owners` SET `fname`=?,`lname`=?,`phone`=?,`email`=?,`address`=? WHERE `id`=?";
        
        try {
            ps = Connection.getConnection().prepareStatement(editQuery);
            ps.setString(1, owner.getFname());
            ps.setString(2, owner.getLname());
            ps.setString(3, owner.getPhone());
            ps.setString(4, owner.getEmail());
            ps.setString(5, owner.getAddress());
            ps.setInt(6, owner.getId());
            
            return (ps.executeUpdate() > 0);
            
        } catch (SQLException ex) {
            Logger.getLogger(Prop_Owners.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }
    
    
    // create a function to delete the selected owner
    public boolean deleteOwner(int ownerId)
    {
        PreparedStatement ps;
        
        String deleteQuery = "DELETE FROM `home_owners` WHERE `id`=?";
        
        try {
            ps = Connection.getConnection().prepareStatement(deleteQuery);
            
            ps.setInt(1, ownerId);
            
            return (ps.executeUpdate() > 0);
            
        } catch (SQLException ex) {
            Logger.getLogger(Prop_Owners.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        } 
    }
    
    
    // create a unction to return an arraylist of owners
    public ArrayList<Prop_Owners> ownersList()
    {
        ArrayList<Prop_Owners> list = new ArrayList<>();
        
        Statement st;
        ResultSet rs;
        
        String selectQuery = "SELECT * FROM `home_owners`";
        
        try {
            
            st = Connection.getConnection().createStatement();
            rs = st.executeQuery(selectQuery);
            
            Prop_Owners owner;
            
            while (rs.next()) {
                
                owner = new Prop_Owners(rs.getInt(1),
                                    rs.getString(2), 
                                    rs.getString(3),
                                    rs.getString(4), 
                                    rs.getString(5), 
                                    rs.getString(6));
                
                list.add(owner);
                
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(Prop_Owners.class.getName()).log(Level.SEVERE, null, ex);
        }

        return list;
    }
}
