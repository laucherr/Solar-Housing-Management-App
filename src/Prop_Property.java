
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
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
public class Prop_Property {
    
    private int id;
    private int type;
    private int size;
    private int ownerId;
    private String price;
    private String address;
    private int bedrooms;
    private int bathrooms;
    private int panels;
    private int batteries;
    private boolean security_cameras;
    private boolean electric_fence;
    private boolean compound;
    private boolean hot_showers;
    private String comment;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getOwnerId() {
        return ownerId;
    }

    public void setOwnerId(int ownerId) {
        this.ownerId = ownerId;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getBedrooms() {
        return bedrooms;
    }

    public void setBedrooms(int bedrooms) {
        this.bedrooms = bedrooms;
    }

    public int getBathrooms() {
        return bathrooms;
    }

    public void setBathrooms(int bathrooms) {
        this.bathrooms = bathrooms;
    }

    public int getPanels() {
        return panels;
    }

    public void setPanels(int panels) {
        this.panels = panels;
    }
    public int getBatteries() {
        return batteries;
    }

    public void setBatteries(int batteries) {
        this.batteries = batteries;
    }

    public boolean isSecurityCameras() {
        return security_cameras;
    }

    public void setCameras(boolean security_cameras) {
        this.security_cameras = security_cameras;
    }

    public boolean isElectricFence() {
        return electric_fence;
    }

    public void setFence(boolean fence) {
        this.electric_fence = electric_fence;
    }

    public boolean isCompound() {
        return compound;
    }

    public void setCompound(boolean compound) {
        this.compound = compound;
    }

    public boolean isHotShowers() {
        return hot_showers;
    }

    public void setShowers(boolean showers) {
        this.hot_showers = hot_showers;
    }

    public String getComment() {
        return comment;
    }

    public void setcomment(String comment) {
        this.comment = comment;
    }
    
    
    public Prop_Property(){}
    
    public Prop_Property(int ID, int TYPE, int SIZE, int OWNER_ID, String PRICE, 
                      String ADRESS, int BEDROOMS, int BATHROOMS, int PANELS, int BATTERIES,
                      boolean CAMERAS, boolean FENCE, boolean COMPOUND, boolean SHOWERS, String COMMENT)
    {
        this.id = ID;
        this.type = TYPE;
        this.size = SIZE;
        this.ownerId = OWNER_ID;
        this.price = PRICE;
        this.address = ADRESS;
        this.panels = PANELS;
        this.batteries = BATTERIES;
        this.bathrooms = BATHROOMS;
        this.bedrooms = BEDROOMS;
        this.comment = COMMENT;
        this.security_cameras = CAMERAS;
        this.compound = COMPOUND;
        this.hot_showers = SHOWERS;
        this.electric_fence = FENCE;
    }
    
    // create a function to add a new property
    public boolean addNewProperty(Prop_Property property)
    {
        PreparedStatement ps;
        
        String addQuery = "INSERT INTO `property`(`type`, `square_feet`, `ownerId`, `price`, `address`, `bedrooms`, `bathrooms`, `panels`, `batteries`, `security_cameras`, `electric_fence`, `compound`, `hot_showers`, `comment`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
        
        try {
            
            ps = Connection.getConnection().prepareStatement(addQuery);
            ps.setInt(1, property.getType());
            ps.setInt(2, property.getSize());
            ps.setInt(3, property.getOwnerId());
            ps.setString(4, property.getPrice());
            ps.setString(5, property.getAddress());
            ps.setInt(6, property.getBedrooms());
            ps.setInt(7, property.getBathrooms());
            ps.setInt(8, property.getPanels());
            ps.setInt(9, property.getBatteries());
            ps.setBoolean(10, property.isSecurityCameras());
            ps.setBoolean(11, property.isElectricFence());
            ps.setBoolean(12, property.isCompound());
            ps.setBoolean(13, property.isHotShowers());
            ps.setString(14, property.getComment());
            
            return (ps.executeUpdate() > 0);
            
        } catch (SQLException ex) {
            Logger.getLogger(Prop_Property.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
        
    }
    
    
    // create a function to edit a selected property
    public boolean editProperty(Prop_Property property)
    {
        PreparedStatement ps;
        
        String editQuery = "UPDATE `property` SET `type`=?,`square_feet`=?,`ownerId`=?,`price`=?,`address`=?,`bedrooms`=?,`bathrooms`=?,`panels`=?, `batteries`=?, `security_cameras`=?,`electric_fence`=?,`compound`=?,`hot_showers`=?,`comment`=? WHERE `id`=?";
        
        try {
            
            ps = Connection.getConnection().prepareStatement(editQuery);
            ps.setInt(1, property.getType());
            ps.setInt(2, property.getSize());
            ps.setInt(3, property.getOwnerId());
            ps.setString(4, property.getPrice());
            ps.setString(5, property.getAddress());
            ps.setInt(6, property.getBedrooms());
            ps.setInt(7, property.getBathrooms());
            ps.setInt(8, property.getPanels());
            ps.setInt(9, property.getBatteries());
            ps.setBoolean(10, property.isSecurityCameras());
            ps.setBoolean(11, property.isElectricFence());
            ps.setBoolean(12, property.isCompound());
            ps.setBoolean(13, property.isHotShowers());
            ps.setString(14, property.getComment());
            ps.setInt(15, property.getId());
            
            return (ps.executeUpdate() > 0);
            
        } catch (SQLException ex) {
            Logger.getLogger(Prop_Property.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
        
    }
    
    
    // create a function to delete a selected property
    public boolean removeProperty(int propertyId)
    {
        PreparedStatement ps;
        
        String deleteQuery = "DELETE FROM `property` WHERE `id`=?";
        
        try {
            ps = Connection.getConnection().prepareStatement(deleteQuery);
            
            ps.setInt(1, propertyId);
            
            return (ps.executeUpdate() > 0);
            
        } catch (SQLException ex) {
            Logger.getLogger(Prop_Property.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        } 
    }
    
    // create a function to search for a property by id
    public Prop_Property findProperty(int propertyId)
    {
        PreparedStatement ps;
        ResultSet rs;
        Prop_Property property = null;
        
        String searchQuery = "SELECT * FROM `property` WHERE `id` = ?";
        
        try {
            
            ps = Connection.getConnection().prepareStatement(searchQuery);
            ps.setInt(1, propertyId);
            
            rs = ps.executeQuery();
            
            if(rs.next())
            {               
                property = new Prop_Property(rs.getInt("id"),
                                          rs.getInt("type"), 
                                          rs.getInt("square_feet"), 
                                          rs.getInt("ownerId"),  
                                          rs.getString("price"), 
                                          rs.getString("address"), 
                                          rs.getInt("bedrooms"), 
                                          rs.getInt("bathrooms"), 
                                          rs.getInt("panels"), 
                                          rs.getInt("batteries"),
                                          rs.getBoolean("security_cameras"), 
                                          rs.getBoolean("electric_fence"),  
                                          rs.getBoolean("compound"),  
                                          rs.getBoolean("hot_showers"), 
                                          rs.getString("comment"));
            }
            
            return property;
            
        } catch (SQLException ex) {
            Logger.getLogger(Prop_Property.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        return property;
    }
    
    
    // create a function to return an arraylist of properties
    public ArrayList<Prop_Property> propertiesList()
    {
        ArrayList<Prop_Property> list = new ArrayList<>();
        Statement st;
        ResultSet rs;
        
        String selectQuery = "SELECT * FROM `property`";
        
        try {
            
            st = Connection.getConnection().createStatement();
            rs = st.executeQuery(selectQuery);
            
            Prop_Property property;
            
            while (rs.next()) {
                
                property = new Prop_Property(rs.getInt("id"),
                                          rs.getInt("type"), 
                                          rs.getInt("square_feet"), 
                                          rs.getInt("ownerId"),  
                                          rs.getString("price"), 
                                          rs.getString("address"), 
                                          rs.getInt("bedrooms"), 
                                          rs.getInt("bathrooms"), 
                                          rs.getInt("panels"), 
                                          rs.getInt("batteries"),
                                          rs.getBoolean("security_cameras"), 
                                          rs.getBoolean("electric_fence"),  
                                          rs.getBoolean("compound"),  
                                          rs.getBoolean("hot_showers"), 
                                          rs.getString("comment"));
                
                list.add(property);
                
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(Prop_Property.class.getName()).log(Level.SEVERE, null, ex);
        }

        return list;
    }
    
    
    // create a function to return a list of property depending on the selected type
    // create a function to return an arraylist of properties
    public ArrayList<Prop_Property> propertiesListByType(int typeId)
    {
        ArrayList<Prop_Property> list = new ArrayList<>();
        PreparedStatement ps;
        ResultSet rs;
        
        String selectQuery = "SELECT * FROM `property` WHERE `type`=?";
        
        try {
            
            ps = Connection.getConnection().prepareStatement(selectQuery);
            ps.setInt(1, typeId);
            rs = ps.executeQuery();
            
            Prop_Property property;
            
            while (rs.next()) {
                
                property = new Prop_Property(rs.getInt("id"),
                                          rs.getInt("type"), 
                                          rs.getInt("square_feet"), 
                                          rs.getInt("ownerId"),  
                                          rs.getString("price"), 
                                          rs.getString("address"), 
                                          rs.getInt("bedrooms"), 
                                          rs.getInt("bathrooms"), 
                                          rs.getInt("panels"), 
                                          rs.getInt("batteries"),
                                          rs.getBoolean("security_cameras"), 
                                          rs.getBoolean("electric_fence"),  
                                          rs.getBoolean("compound"),  
                                          rs.getBoolean("hot_showers"), 
                                          rs.getString("comment"));
                
                list.add(property);
                
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(Prop_Property.class.getName()).log(Level.SEVERE, null, ex);
        }

        return list;
    }
    
    
    
    // create a function to return an arraylist of owner properties
    public ArrayList<Prop_Property> propertiesListByOwner(int ownerId)
    {
        ArrayList<Prop_Property> list = new ArrayList<>();
        PreparedStatement ps;
        ResultSet rs;
        
        String selectQuery = "SELECT * FROM `property` WHERE `ownerId`=?";
        
        try {
            
            ps = Connection.getConnection().prepareStatement(selectQuery);
            ps.setInt(1, ownerId);
            rs = ps.executeQuery();
            
            Prop_Property property;
            
            while (rs.next()) {
                
                property = new Prop_Property(rs.getInt("id"),
                                          rs.getInt("type"), 
                                          rs.getInt("square_feet"), 
                                          rs.getInt("ownerId"),  
                                          rs.getString("price"), 
                                          rs.getString("address"), 
                                          rs.getInt("bedrooms"), 
                                          rs.getInt("bathrooms"), 
                                          rs.getInt("panels"), 
                                          rs.getInt("batteries"),
                                          rs.getBoolean("security_cameras"), 
                                          rs.getBoolean("electric_fence"),  
                                          rs.getBoolean("compound"),  
                                          rs.getBoolean("hot_showers"), 
                                          rs.getString("comment"));
                
                list.add(property);
                
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(Prop_Property.class.getName()).log(Level.SEVERE, null, ex);
        }

        return list;
    }
    
    
    
    
    
    
    // create a function to add Image to the property
    public boolean addImage(int propertyId, String image_path)
    {
        PreparedStatement ps;
        
        String addQuery = "INSERT INTO `images_for_property`(`property_id`, `image`) VALUES (?,?)";
        
        try {
            
            try {
                
                FileInputStream propertyImage = new FileInputStream(new File(image_path));
                ps = Connection.getConnection().prepareStatement(addQuery);
                ps.setInt(1, propertyId);
                ps.setBinaryStream(2, propertyImage);
                
                return (ps.executeUpdate() > 0);   
                 
            } catch (FileNotFoundException ex) {
                //Logger.getLogger(P_PROPERTY.class.getName()).log(Level.SEVERE, null, ex);
               JOptionPane.showMessageDialog(null, ex.getMessage() + " Invalid File", "Image ERROR", 2);
               return false;
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(Prop_Property.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        } 
    }
    
   
    // create a function to get the selected property images list
     public HashMap<byte[], Integer> propertyImagesList(int propertyId)
    {
        HashMap<byte[], Integer> list = new HashMap<>();
        PreparedStatement ps;
        ResultSet rs;
        
        String selectQuery = "SELECT * FROM `images_for_property` WHERE `property_id`=?";
        
        try {
            
            ps = Connection.getConnection().prepareStatement(selectQuery);
            ps.setInt(1, propertyId);
            rs = ps.executeQuery();

            while (rs.next()) {

                list.put(rs.getBytes("image"), rs.getInt("id"));
                
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(Prop_Property.class.getName()).log(Level.SEVERE, null, ex);
        }

        return list;
    }
   
     
     // create a function to get image by id
     public byte[] getImageById(int imageId)
    {
        PreparedStatement ps;
        ResultSet rs;
        
        String selectQuery = "SELECT `image` FROM `images_for_property` WHERE `id`=?";
        
        try {
            
            ps = Connection.getConnection().prepareStatement(selectQuery);
            ps.setInt(1, imageId);
            rs = ps.executeQuery();

            if (rs.next()) {

                return rs.getBytes("image");

            }else{
                return null;
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(Prop_Property.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }

    }
   
     
    
     // create a function to remove image by id
     public boolean removePropertyImage(int imageId)
    {
        PreparedStatement ps;
        ResultSet rs;
        
        String deleteQuery = "DELETE FROM `images_for_property` WHERE `id`=?";
        
        try {
            
            ps = Connection.getConnection().prepareStatement(deleteQuery);
            ps.setInt(1, imageId);

            return (ps.executeUpdate() > 0);
            
        } catch (SQLException ex) {
            Logger.getLogger(Prop_Property.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }

    }
}
