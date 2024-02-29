package com.bridgelabz.greetings.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bridgelabz.greetings.entity.Greetings;

@Repository
public interface GreetingsRepository extends JpaRepository<Greetings, Long> {

}
