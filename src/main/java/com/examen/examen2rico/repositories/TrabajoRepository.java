package com.examen.examen2rico.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.examen.examen2rico.models.Trabajo;

@Repository
public interface TrabajoRepository extends JpaRepository<Trabajo, Long> {

}
