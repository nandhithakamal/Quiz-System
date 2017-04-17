/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package quiz.system.util;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Nandhu
 */
public class DBConnection {

    /**
     * @param args the command line arguments
     */
    
    
    private static DBConnection connect = new DBConnection();
    Connection con = null;
    
    private DBConnection(){}
    
    public static DBConnection getInstance(){
        return connect;
    }
    
    public Connection connectUsers() throws FileNotFoundException, IOException, ClassNotFoundException, SQLException{
        try{
            FileInputStream usersFile = new FileInputStream("usersDBConfig.properties");
            Properties usersProp = new Properties();
            usersProp.load(usersFile);
            
            String driver = usersProp.getProperty("driver");
            String username = usersProp.getProperty("username");
            String password = usersProp.getProperty("password");
            String db = usersProp.getProperty("db");
            Class.forName(driver);
            
            String url = "jdbc:mysql://localhost/"+db+"?user="+username+"&password="+password;
            con = DriverManager.getConnection(url);
            if(!con.isClosed()){
                /*System.out.println("Connected successfully!\nThe following testadmins exist. Test admins can create tests;");
                String query = "select * from testadmins";
                Statement st = con.createStatement();
                ResultSet rs = st.executeQuery(query);
                int i = 1;
                while(rs.next()){
                    String admin = rs.getString("username");
                    System.out.print(i);
                    System.out.println(" " + admin);
                    
                    i++;
                    
                }*/
                    
                
            }
        }catch (FileNotFoundException e){
        }
        
        return con;
    }
    
    
    /*public static void main(String[] args) throws IOException {
        try {
            // TODO code application logic here
            
            DBConnection usersConnection = DBConnection.getInstance();
            Connection connect = usersConnection.connectUsers();
            
            //System.err.println(connect);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(DBConnection.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(DBConnection.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(DBConnection.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }*/

    
}
