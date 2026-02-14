package org.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
// Егер Spring басқа пакеттерді көрмей жатса, мына жолды қосуға болады:
// @ComponentScan(basePackages = {"org.example", "Cache"})
public class Main {
    public static void main(String[] args) {
        SpringApplication.run(Main.class, args);
    }
}