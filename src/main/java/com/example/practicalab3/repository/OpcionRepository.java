package com.example.practicalab3.repository;

import com.example.practicalab3.entity.Opcion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.relational.core.sql.In;

public interface OpcionRepository extends JpaRepository<Opcion, Integer> {
}