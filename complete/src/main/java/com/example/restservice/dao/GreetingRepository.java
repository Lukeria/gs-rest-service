package com.example.restservice.dao;

import com.example.restservice.Greeting;
import org.springframework.stereotype.Repository;

import java.util.concurrent.atomic.AtomicLong;
//import org.springframework.data.jpa.repository.JpaRepository;

//public interface GreetingRepository extends JpaRepository<Greeting, Long> {
//}
@Repository
public class GreetingRepository {

    private final AtomicLong counter = new AtomicLong();

    public Greeting save(Greeting greeting) {
        Greeting newGreeting = new Greeting(greeting.getContent());
        newGreeting.setId(counter.incrementAndGet());
        return newGreeting;
    }
}
