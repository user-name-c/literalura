package com.aluraone.literalura.principal;

import com.aluraone.literalura.model.Datos;
import com.aluraone.literalura.service.ConsumoAPI;
import com.aluraone.literalura.service.ConvierteDatos;

import java.util.Scanner;


public class Principal {
    private static final String URL_BASE = "https://gutendex.com/books/";
    private ConvierteDatos conversor = new ConvierteDatos();
    private ConsumoAPI consulta = new ConsumoAPI();
    private int opcionUsuario = -1;

    Scanner teclado = new Scanner(System.in);

    public void consultaEjemplo(){

        do{
            mostrarMenu();
            opcionUsuario = Integer.valueOf(teclado.nextLine());
            switch(opcionUsuario){
                case 1:
                    System.out.println("Ingrese el nombre del libro que desea buscar");
                    String libroUsuario = teclado.nextLine();
                    String busqueda = "?search=" + libroUsuario.replace(" ","+");
                    var json = consulta.obtenerDatos(URL_BASE + busqueda);
                    System.out.println(json);
                    var datos = conversor.obtenerDatos(json, Datos.class);
                    System.out.println(datos);
                    break;
                case 2:
                    System.out.println( "Opcion aun no implementada");
                    break;
                case 0:
                    System.out.println("Finalizando el programa");
                    break;
                default:
                    System.out.println("Opcion no valida");
            }
        } while  (opcionUsuario != 0);


    }

    public void mostrarMenu(){
        System.out.println("""
                Selecciones una opción             
                1- buscar libro por titulo
                2- Listar libros registrados
                
                0- Salir
                """);
    }


}
