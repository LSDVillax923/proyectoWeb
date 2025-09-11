package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entities.Comida;

@Repository
public interface ComidaRepository extends JpaRepository<Comida, Long> {
}