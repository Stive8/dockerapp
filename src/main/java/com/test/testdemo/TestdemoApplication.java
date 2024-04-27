package com.test.testdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TestdemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(TestdemoApplication.class, args);
        System.out.println("Aplicacion Arriba");
        System.out.println("Conectado a la base de datos");
    }
}
