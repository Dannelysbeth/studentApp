package com.dannelysbeth.mongorestfullapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

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