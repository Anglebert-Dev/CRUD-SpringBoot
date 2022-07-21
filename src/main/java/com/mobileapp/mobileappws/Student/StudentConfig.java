package com.mobileapp.mobileappws.Student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Component
public class StudentConfig {
    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository){
        return args -> {
            Student anglebert = new Student(
                    1L ,
                    "anglebert" ,
                    "anglebertsh@gmail.com" ,
                    LocalDate.of(2000  , Month.JANUARY,3)
            );
            Student Shima = new Student(
                    1L ,
                    "Shima" ,
                    "shima@gmail.com" ,
                    LocalDate.of(2011  , Month.JANUARY,5)
            );
           Student Hugue = new Student(
                    1L ,
                    "Hugue" ,
                    "hugue@gmail.com" ,
                    LocalDate.of(1889  , Month.JANUARY,2)
            );
//            repository.saveAll(
//                    List.of(anglebert,Hugue,Shima)
//            );
        };
    }
}
