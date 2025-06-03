package com.example.restservice.dao;

import com.example.restservice.Greeting;
import org.springframework.stereotype.Repository;
//import org.springframework.data.jpa.repository.JpaRepository;

//public interface GreetingRepository extends JpaRepository<Greeting, Long> {
//}
@Repository
public class GreetingRepository {
    public Greeting save(Greeting greeting) {
        return greeting;
    }
}
