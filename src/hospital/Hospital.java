/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hospital;

import database.JDBCUtil;
import java.sql.Connection;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;

/**
 *
 * @author dell
 */
public class Hospital {

    /**
     * @param args the command line arguments
     */
    static Connection conn;
    static PreparedStatement pst;
    public static void main(String[] args) {
        // TODO code application logic here
        conn = JDBCUtil.getConnection();
        
    }
    
}
