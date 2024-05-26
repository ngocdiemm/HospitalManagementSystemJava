/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package database;

import java.sql.Connection;

/**
 *
 * @author ngocd
 */
public class TestJDBCUtil {
    public static void main(String[] args) {
        Connection connection  = JDBCUtil.getConnection();
        System.out.println(connection);
        JDBCUtil.closeConnection(connection);
        
    }
    
}
