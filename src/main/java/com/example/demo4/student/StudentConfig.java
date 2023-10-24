package com.example.demo4.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

import static java.time.Month.JANUARY;

@Configuration
public class StudentConfig {
    @Bean
    CommandLineRunner runner(StudentRepository repository){
        return args -> {
            Student sinclair = new Student(
                    "toto",
                    "Arafat.fsf@df.vkj",
                    LocalDate.of(2990, JANUARY, 5),
                    46
            );Student fata = new Student(
                    "toto",
                    "Arafat.fsf@df.vkj",
                    LocalDate.of(2990, JANUARY, 5),
                    46
            );
            repository.saveAll(List.of(sinclair,fata));
        };
    }
}
