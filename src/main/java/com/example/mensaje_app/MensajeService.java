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

    }
    public static void borrarMensaje(){

    }
    public static void editarMensaje(){

    }
}
