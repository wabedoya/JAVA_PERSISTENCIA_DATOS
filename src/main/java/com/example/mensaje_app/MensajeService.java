package com.example.mensaje_app;

import java.util.Scanner;

public class MensajeService {

    public static void crearMensaje(){
        Scanner scanner= new Scanner(System.in);
        System.out.println("Por favor escribe tu mensaje");
        String mensaje = scanner.nextLine();
        System.out.println("Por favor tu nombre");
        String nombre = scanner.nextLine();
        Mensajes registro = new Mensajes();
        registro.setMensaje(mensaje);
        registro.setAutor_mensaje(nombre);
        MensajesDAO.crearMensajeDB(registro);

    }
    public static void listarMensaje(){
        MensajesDAO.leerMensajeDB();

    }
    public static void borrarMensaje(){
        Scanner scanner= new Scanner(System.in);
        System.out.println("Por favor ID mensaje a borrar");
        int id_mensaje = scanner.nextInt();
        MensajesDAO.borrarMensajeDB(id_mensaje);

    }
    public static void editarMensaje(){
        Scanner scanner= new Scanner(System.in);
        System.out.println("Escribir nuevo mensaje");
        String mensaje = scanner.nextLine();
        System.out.println("ID mensaje actualizar");
        int id_mensaje = scanner.nextInt();
        Mensajes actualizacion = new Mensajes();
        actualizacion.setMensaje(mensaje);
        MensajesDAO.actualizaerMensajeDB(actualizacion);

    }
}
