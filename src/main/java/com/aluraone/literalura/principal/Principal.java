package com.aluraone.literalura.principal;

import com.aluraone.literalura.model.Datos;
import com.aluraone.literalura.service.ConsumoAPI;
import com.aluraone.literalura.service.ConvierteDatos;

public class Principal {
    private ConvierteDatos conversor = new ConvierteDatos();
    private ConsumoAPI consulta = new ConsumoAPI();
    private static final String URL_BASE = "https://gutendex.com/books/";

    public void consultaEjemplo(){

        String busqueda = "?search="+"el+quijote";

        var json = consulta.obtenerDatos(URL_BASE + busqueda);
        System.out.println(json);
        var datos = conversor.obtenerDatos(json, Datos.class);
        System.out.println(datos);

    }


}
