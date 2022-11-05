package org.sid.costumerservice;

import org.sid.costumerservice.entities.Costumer;
import org.sid.costumerservice.repository.CustomerRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.sql.SQLOutput;

@SpringBootApplication
public class CostumerServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(CostumerServiceApplication.class, args);
    }
     @Bean
    CommandLineRunner start(CustomerRepository customerRepository){
        return args -> {
            customerRepository.save(new Costumer(null,"youssef","youssefrabi32@gmail.com"));
            customerRepository.save(new Costumer(null,"rabi","rabi@gmail.com"));
            customerRepository.save(new Costumer(null,"mohammed","youssfi@gmail.com"));
            customerRepository.findAll().forEach(c->{
                System.out.println(c.toString());
            });

        };
    }

}
