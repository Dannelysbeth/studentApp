package com.dannelysbeth.mongorestfullapi;

import com.dannelysbeth.mongorestfullapi.model.Address;
import com.dannelysbeth.mongorestfullapi.model.Student;
import com.dannelysbeth.mongorestfullapi.model.enums.Gender;
import com.dannelysbeth.mongorestfullapi.repository.StudentRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.mongodb.core.query.Query;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

@SpringBootApplication
public class MongoResTfullApiApplication {

    public static void main(String[] args) {
        SpringApplication.run(MongoResTfullApiApplication.class, args);
    }


//    @Bean
//    CommandLineRunner runner(StudentRepository repo) {
//        return args -> {
//            Address address = Address.builder()
//                    .city("Chicago")
//                    .country("USA")
//                    .zipCode("CHI65")
//                    .build();
//            Student student = Student.builder()
//                    .firstName("Alana")
//                    .lastName("Signh")
//                    .email("alana.singh@gmail.com")
//                    .gender(Gender.FEMALE)
//                    .favSubjects(List.of("CP"))
//                    .address(address)
//                    .totalSpentBooks(BigDecimal.TEN)
//                    .created(LocalDateTime.now())
//                    .build();
//
//            //QUERY
////            Query query  = new Query(
//            repo.insert(student);
//        };
//    }
}