package com.example.restservice.dao;

import com.example.restservice.Greeting;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GreetingRepository extends JpaRepository<Greeting, Long> {
}