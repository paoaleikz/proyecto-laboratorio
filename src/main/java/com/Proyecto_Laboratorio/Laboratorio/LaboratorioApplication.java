package com.Proyecto_Laboratorio.Laboratorio;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class LaboratorioApplication {

	public static void main(String[] args) {

		SpringApplication.run(LaboratorioApplication.class, args);
	}
	@GetMapping("/hello")
	public String hello(@RequestParam(value = "name", defaultValue = "Mundo") String name) {
		return String.format("HOLA %s!", name);
	}


}
