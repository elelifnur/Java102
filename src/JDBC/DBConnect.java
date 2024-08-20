package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnect {
    public static void main(String[] args){
        Connection connect = null;
        String url = "jdbc:mysql://localhost/universty?user=root";
        try{
            connect = DriverManager.getConnection(url);
        }catch(SQLException e){
            System.out.println(e.getMessage());
        }
    }
}
