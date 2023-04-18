package com.example.practicalab3.repository;

import com.example.practicalab3.entity.Responsable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.relational.core.sql.In;

public interface ResponsableRepository extends JpaRepository<Responsable, Integer> {
}