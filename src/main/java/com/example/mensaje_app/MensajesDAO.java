package com.example.mensaje_app;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class MensajesDAO {
    public static void crearMensajeDB(Mensajes mensaje){
        Conexion db_connect = new Conexion();
        try(Connection conexion= db_connect.get_connection()){
            PreparedStatement ps = null;
            try {
                String query = "INSERT INTO mensajes (mensaje, autor_mensaje) VALUES (?, ?)";
                ps = conexion.prepareStatement(query);
                ps.setString(1, mensaje.getMensaje());
                ps.setString(2,mensaje.getAutor_mensaje());
                ps.executeUpdate();
                System.out.println("Mensaje creado y guaradado en base de datos");
            }catch (SQLException e){
                System.out.println(e);
            }
        }catch (SQLException e){
            System.out.println(e);
        }
    }
    public static void leerMensajeDB(){
        Conexion db_connect = new Conexion();
        PreparedStatement ps = null;
        ResultSet rs = null;
        try(Connection conexion= db_connect.get_connection()){
            String query = "SELECT * FROM mensajes";
            ps = conexion.prepareStatement(query);
            rs= ps.executeQuery();
            while (rs.next()){
                System.out.println("ID: "+rs.getInt("id_mensaje"));
                System.out.println("Mensaje : "+rs.getString("mensaje"));
                System.out.println("Autor: "+ rs.getString("autor_mensaje"));
                System.out.println("Fecha: "+rs.getString("fecha"));
                System.out.println(" ");
            }
        }catch (SQLException e){
            System.out.println(e);
        }
    }
    public static void borrarMensajeDB(int id_mensaje){
        Conexion db_connect = new Conexion();
        try(Connection conexion= db_connect.get_connection()){
            PreparedStatement ps = null;
            try {
                String query = "DELETE FROM mensajes WHERE id_mensaje = ?";
                ps = conexion.prepareStatement(query);
                ps.setInt(1, id_mensaje);
                ps.executeUpdate();
                System.out.println("Mensaje Borrado");


            }catch(SQLException e){
                System.out.println(e);
                System.out.println("No se pudo borrar el mensaje ");
            }
        }catch (SQLException e){
            System.out.println(e);
        }
    }
    public static void actualizaerMensajeDB(Mensajes mensaje){
        Conexion db_connect = new Conexion();
        try(Connection conexion= db_connect.get_connection()){
            PreparedStatement ps = null;
            try {
                String query = "UPDATE mensajes SET mensaje=? WHERE id_mensaje = ?";
                ps = conexion.prepareStatement(query);
                ps.setString(1, mensaje.getMensaje());
                ps.setInt(2, mensaje.getId_mensajes());
                ps.executeUpdate();
                System.out.println("Mensaje Actualizado");
            }catch(SQLException e){
                System.out.println(e);
                System.out.println("No se pudo actualizar el mensaje ");
            }
        }catch (SQLException e){
            System.out.println(e);

        }



    }
}
