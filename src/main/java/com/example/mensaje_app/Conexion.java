package com.example.mensaje_app;

import java.sql.*;

public class Conexion {
    public Connection get_connection(){
        Connection connection= null;
        try {
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/mensaje_app","root","");


        }catch (SQLException e) {
            System.out.println(e);

        }


        return connection;
    }
}
