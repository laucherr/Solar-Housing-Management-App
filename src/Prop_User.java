
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
public class Prop_User {
    
    private int id;
    private String name;
    private String phone;
    private String username;
    //private String password;
    
    public int getId()
    {
        return this.id;
    }
    
    public void setId(int ID)
    {
        this.id = ID;
    }
    
    public String getName()
    {
        return this.name;
    }
    
    public void setName(String NAME)
    {
       this.name = NAME; 
    }
    
    public String getPhone()
    {
        return this.phone;
    }
    
    public void setPhone(String PHONE)
    {
       this.phone = PHONE; 
    }
    
    public String getUsername()
    {
        return this.username;
    }
    
    public void setUsername(String USERNAME)
    {
       this.username = USERNAME; 
    }
    /*
    public String getPassword()
    {
        return this.password;
    }
    
    public void setPassword(String PASSWORD)
    {
       this.password = PASSWORD; 
    }
    */
    
    public Prop_User(){}
    
    public Prop_User(int ID, String NAME, String PHONE, String USERNAME/*, String PASSWORD*/)
    {
        this.id = ID;
        this.name = NAME;
        this.phone = PHONE;
        this.username = USERNAME;
        //this.password = PASSWORD;
    }
    
    
    // create a function to add a new client
    // first create the client in the database
    public boolean addNewUser(Prop_User user)
    {
        PreparedStatement ps;
        
        String addQuery = "INSERT INTO `users`(`name`, `phone`, `username`) VALUES (?,?,?)";
        
        try {
            ps = Connection.getConnection().prepareStatement(addQuery);
            ps.setString(1, user.getName());
            ps.setString(2, user.getPhone());
            ps.setString(3, user.getUsername());
            //ps.setString(4, user.getPassword());
            
            return (ps.executeUpdate() > 0);
            
        } catch (SQLException ex) {
            Logger.getLogger(Prop_User.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
        
    }
    
    
    // create a function to edit the selected client data
    public boolean editUserData(Prop_User user)
    {
        PreparedStatement ps;
        
        String editQuery = "UPDATE `users` SET `name`=?, `phone`=?,`username`=? WHERE `id`=?";
        
        try {
            ps = Connection.getConnection().prepareStatement(editQuery);
            ps.setString(1, user.getName());
            ps.setString(2, user.getPhone());
            ps.setString(3, user.getUsername());
            //ps.setString(4, user.getPassword());
            ps.setInt(4, user.getId());
            
            return (ps.executeUpdate() > 0);
            
        } catch (SQLException ex) {
            Logger.getLogger(Prop_User.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }
    
    
    // create a function to delete the selected client
    public boolean deleteUser(int userId)
    {
        PreparedStatement ps;
        
        String deleteQuery = "DELETE FROM `users` WHERE `id`=?";
        
        try {
            ps = Connection.getConnection().prepareStatement(deleteQuery);
            
            ps.setInt(1, userId);
            
            return (ps.executeUpdate() > 0);
            
        } catch (SQLException ex) {
            Logger.getLogger(Prop_User.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        } 
    }
    
    
    // create a unction to return an arraylist of clients
    public ArrayList<Prop_User> usersList()
    {
        ArrayList<Prop_User> list = new ArrayList<>();
        
        Statement st;
        ResultSet rs;
        
        String selectQuery = "SELECT * FROM `users`";
        
        try {
            
            st = Connection.getConnection().createStatement();
            rs = st.executeQuery(selectQuery);
            
            Prop_User user;
            
            while (rs.next()) {
                
                user = new Prop_User(rs.getInt(1),
                                    rs.getString(2), 
                                    rs.getString(3),
                                    rs.getString(4));
                                    //rs.getString(5));
                
                list.add(user);
                
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(Prop_User.class.getName()).log(Level.SEVERE, null, ex);
        }

        return list;
    }
    
}
