package booktrackingapp;

/**
 *
 * @author Amber Grace Ebersole
 */
import java.sql.*;

import javax.swing.*;


public class DatabaseConn

{

    static Connection conn = null;

    public static Connection getConnection()

    {

     try

    {

         Class.forName("org.sqlite.JDBC");

        Connection conn = DriverManager.getConnection("jdbc:sqlite:C:\\Users\\Amber Grace Ebersole\\Documents\\NetBeansProjects\\BookTrackingApp\\src\\booktrackingapp\\BookTracker.sqlite");
         JOptionPane.showMessageDialog(null, "Database successfully connected.");
         return conn;
       
    }

    catch(Exception e)

    {

        JOptionPane.showMessageDialog(null, "Could not connect to Database");

        return null;

    }

    }


}

