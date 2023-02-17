package com.example.persistenciadatos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import static java.sql.DriverManager.*;

public class Conexion {
    public Connection get_connection() {
        Connection connection = null;
        try{
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/mensaje_app","root","");
            if (connection!= null){
                System.out.println("Conexion exitosa");
            }

        }catch (SQLException e){
            System.out.println("Error conexion :(");
        }
        return connection;
    }
}
