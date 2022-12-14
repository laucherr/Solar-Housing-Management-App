
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.HashMap;
import java.util.logging.Level;
import java.util.logging.Logger;
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
public class Prop_Type {
    
    private int id;
    private String name;
    private String description;
    
    
    // create the geters and seters
    public Integer getId()
    {
        return id;
    }
    
    public void setId(Integer ID)
    {
        this.id = ID;
    }
    
    public String getName()
    {
        return name;
    }
    
    public void setName(String NAME)
    {
        this.name = NAME;
    }
    
    public String getDescription()
    {
        return this.description;
    }
    
    public void setDescription(String DESCRIPTION)
    {
        this.description = DESCRIPTION;
    }
    
    
    // create the class constructors
    public Prop_Type(){}
    
    public Prop_Type (Integer ID,String NAME, String DESCRIPTION)
    {
        this.id = ID;
        this.name = NAME;
        this.description = DESCRIPTION;
    }
    
    
    // create a function to insert - edit - remove type
    public boolean execTypeQuery(String queryType, Prop_Type type)
    {
        
        PreparedStatement ps;
        
        // add a new type
        if(queryType.equals("add"))
        {
            try {
                //query -> INSERT INTO `property_type`(`name`, `description`) VALUES (?,?)
                ps = Connection.getConnection().prepareStatement("INSERT INTO `types_of_property`(`name`, `description`) VALUES (?,?)");
                ps.setString(1, type.getName());
                ps.setString(2, type.getDescription());
                
                return (ps.executeUpdate() > 0);
                
            } catch (SQLException ex) {
                Logger.getLogger(Prop_Type.class.getName()).log(Level.SEVERE, null, ex);
                return false;
            }
        }
        
        // add a new type
        else if(queryType.equals("edit"))
        {
            try {
                // query -> UPDATE `property_type` SET `name`=?,`description`=? WHERE `id` = ?
                ps = Connection.getConnection().prepareStatement("UPDATE `types_of_property` SET `name`=?,`description`=? WHERE `id` = ?");
                ps.setString(1, type.getName());
                ps.setString(2, type.getDescription());
                ps.setInt(3, type.getId());
                
                return (ps.executeUpdate() > 0);
                
            } catch (SQLException ex) {
                Logger.getLogger(Prop_Type.class.getName()).log(Level.SEVERE, null, ex);
                return false;
            }
        }
        
        // add a new type
        else if(queryType.equals("remove"))
        {
            try {
                // query -> DELETE FROM `property_type` WHERE `id`= ?
                ps = Connection.getConnection().prepareStatement("DELETE FROM `types_of_property` WHERE `id`= ?");
                ps.setInt(1, type.getId());
                
                return (ps.executeUpdate() > 0);
                
            } catch (SQLException ex) {
                Logger.getLogger(Prop_Type.class.getName()).log(Level.SEVERE, null, ex);
                return false;
            }
        }
 
        else{
            JOptionPane.showMessageDialog(null, "Enter The Correct Query( add,edit,remove )", "Invalid Operation", 2);
            return false;
        }
        
    }
    
    
    // create a function to return a list of all types in a HashMap
    // string is the key
    // integer is the value
    public HashMap<String,Integer> getTypesMap()
    {
        HashMap<String, Integer> map = new HashMap<>();
        
        Statement st;
        ResultSet rs;
        
        try {
            
            st = Connection.getConnection().createStatement();
            rs = st.executeQuery("SELECT * FROM `types_of_property`");
            
            Prop_Type type;
            
            while(rs.next())
            {
                type = new Prop_Type (rs.getInt(1), rs.getString(2), rs.getString(3));
                
                map.put(type.getName(), type.getId());
            }
                    
        } catch (SQLException ex) {
            Logger.getLogger(Prop_Type.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return map;
    }
    
    
    // create a function to get a type data by id
    // we can use getTypesMap() function to get the id and name
    // but we want the description to
    public Prop_Type getTypeById(Integer id)
    {
        PreparedStatement ps;
        ResultSet rs;
        
        Prop_Type type = new Prop_Type();
        
        try {
            
                ps = Connection.getConnection().prepareStatement("SELECT * FROM `types_of_property` WHERE `id`=?");
                ps.setInt(1, id);
                rs = ps.executeQuery();
                
                if(rs.next())
                {
                    type.setId(id);
                    type.setName(rs.getString(2));
                    type.setDescription(rs.getString(3));
                }
            
            } 
            catch (SQLException ex) {
            Logger.getLogger(Prop_Type.class.getName()).log(Level.SEVERE, null, ex);
        }
          return type;
    }
}
