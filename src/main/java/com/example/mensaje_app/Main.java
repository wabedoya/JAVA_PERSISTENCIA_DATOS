package com.example.mensaje_app;

import java.sql.Connection;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int opc=0;
        Scanner scanner = new Scanner(System.in);
        Conexion conexion=new Conexion();
        do {
            System.out.println("---------------------");
            System.out.println("MENU");
            System.out.println("------------------------");
            System.out.println("1. CREAR MENSAJE");
            System.out.println("2. lISTAR MENSAJES");
            System.out.println("3. EDITAR MENSAJE");
            System.out.println("4. ELIMINAR MENSAJE");
            System.out.println("5. SALIR");
            opc = scanner.nextInt();
            switch (opc){
                case 1:
                    MensajeService.crearMensaje();
                    break;
                case 2:
                    MensajeService.listarMensaje();
                    break;
                case 3:
                    MensajeService.editarMensaje();
                    break;
                case 4:
                    MensajeService.borrarMensaje();
                    break;
                default:
                    break;
            }

        }while (opc !=5);





    }
}
