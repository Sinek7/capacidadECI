package com.sinek.capacidadECI;


import com.sinek.capacidadECI.model.Data;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.data.mongo.MongoDataAutoConfiguration;
import org.springframework.boot.autoconfigure.mongo.MongoAutoConfiguration;

@SpringBootApplication(exclude = {MongoAutoConfiguration.class, MongoDataAutoConfiguration.class})
public class CapacidadEciApplication {

	public static void main(String[] args) {
                Data.setUpPrograms("ISIS", "Ingeniería de Sistemas");                
                Data.setUpPrograms("IIND", "Ingeniería Industrial");
                Data.setUpPrograms("IETRI", "Ingeniería Eléctrica");
                Data.setUpPrograms("IETRO", "Ingeniería Electrónica");
                Data.setUpPrograms("IMEC", "Ingeniería Mecánica");
                Data.setUpPrograms("IBIO", "Ingeniería Biomédica");
                Data.setUpPrograms("CIVIL", "Ingeniería Civil");
                Data.setUpPrograms("ECON", "Economía");
                Data.setUpPrograms("MATE", "Matemáticas");
                Data.setUpPrograms("ADMI", "Administración de empresas");
		SpringApplication.run(CapacidadEciApplication.class, args);
	}
}