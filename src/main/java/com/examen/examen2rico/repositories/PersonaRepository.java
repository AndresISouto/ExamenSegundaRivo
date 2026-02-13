package com.examen.examen2rico.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.examen.examen2rico.models.Persona;

@Repository
public interface PersonaRepository extends JpaRepository<Persona, Long> {

  Optional<Persona> findByDni(String dni);

}
