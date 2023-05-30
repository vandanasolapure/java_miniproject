/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pg_flat;
import java.sql.*;

/**
 *
 * @author rasika mate
 */

public class connectionprovider {
    public static Connection getCon()
    {
        try
        {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/project","root","root");
            return con;
        }
        catch(Exception e)
        {
          return null;  
        }
    }
}
