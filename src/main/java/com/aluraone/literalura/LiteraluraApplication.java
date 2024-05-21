package com.aluraone.literalura;

import com.aluraone.literalura.principal.Principal;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

//implementa comandLineRunner para usar el metodo run
//excluimos data source para evitar que use la base de datos que aun no hems configurado
@SpringBootApplication//(exclude = {DataSourceAutoConfiguration.class })
public class LiteraluraApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(LiteraluraApplication.class, args);
	}

	@Override
	public void run(String... args){
		Principal principal = new Principal();
		principal.consultaEjemplo();
	}
}
