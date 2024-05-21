package com.aluraone.literalura.principal;

import com.aluraone.literalura.service.ConsumoAPI;

public class Principal {
    public void consultaEjemplo(){
        ConsumoAPI consulta = new ConsumoAPI();
        var json = consulta.obtenerDatos("https://gutendex.com/books/");
        System.out.println(json);
    }


}
