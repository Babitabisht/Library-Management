/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package library_management;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Babita
 */
public class Connection_database {
 
      Connection conn=null;
    public static Connection getConnect(){
    try{
        Class.forName("oracle.jdbc.driver.OracleDriver");
    Connection conn=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","Project","Library_Management");
    return conn;
    }
    catch(ClassNotFoundException | SQLException e){
        JOptionPane.showMessageDialog(null,e);
        return null;

}
    }
}
