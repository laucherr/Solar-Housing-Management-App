
import com.mysql.jdbc.jdbc2.optional.MysqlDataSource;
import java.sql.SQLException;
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
public class Connection {
    
    private static String servername = "localhost";
    private static String dbname = "housing_db";
    private static String username = "root";
    private static Integer portnumber = 3307;
    private static String password = "";// no password
    
    
    // create a function to get the connection
    public static java.sql.Connection getConnection()
    {
       
        java.sql.Connection connection = null;
        
        MysqlDataSource datasource = new MysqlDataSource();
        
        datasource.setServerName(servername);
        datasource.setUser(username);
        datasource.setDatabaseName(dbname);
        datasource.setPortNumber(portnumber);
        datasource.setPassword(password);
        
        try {
            connection  = datasource.getConnection();
        } catch (SQLException ex) {
            Logger.getLogger(Connection.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return connection;
    }
    
}
