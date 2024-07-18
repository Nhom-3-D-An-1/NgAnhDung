/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package JDBC;
import java.sql.*;
/**
 *
 * @author ADMIN
 */
public class DBConnect {
     private static Connection conn;

    public static Connection getConnection() {
        try {
            if (conn == null || conn.isClosed()) {
                String dbUser = "sa", dbPass = "dungnaph49581",
                        dbUrl = "jdbc:sqlserver://localhost:1433;databaseName=DUAN11;encrypt=true;trustServerCertificate=true;";

                conn = DriverManager.getConnection(dbUrl, dbUser, dbPass);
                System.out.println("Kết nối thành công");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return conn;
    }
}
