package com.bridgelabz.greetings.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bridgelabz.greetings.entity.Greetings;

@Repository
public interface GreetingsDao extends JpaRepository<Greetings, Long> {

}
