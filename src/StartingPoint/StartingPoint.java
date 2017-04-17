/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package StartingPoint;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import quiz.system.util.DBConnection;
import quiz.system.views.OpenPage;

/**
 *
 * @author Nandhu
 */
public class StartingPoint {

    /**
     * @param args the command line arguments
     */
    
    

    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        DBConnection usersConnection = DBConnection.getInstance();
        try {

            Connection connect = usersConnection.connectUsers();
            /*if (connect.isClosed()) {
            } else {
                System.out.println("Connected successfully!\nThe following testadmins exist. Test admins can create tests;");
                String query = "select * from testadmins";
                Statement st = connect.createStatement();
                ResultSet rs = st.executeQuery(query);
                int i = 1;
                while (rs.next()) {
                    String admin = rs.getString("username");
                    System.out.print(i);
                    System.out.println(" " + admin);

                    i++;
                }
            }*/
        

            //System.err.println(connect);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(DBConnection.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(DBConnection.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(DBConnection.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        OpenPage start = new OpenPage();
        start.setVisible(true);
        
        

    }
}
