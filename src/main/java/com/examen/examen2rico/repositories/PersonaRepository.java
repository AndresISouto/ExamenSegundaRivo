package com.examen.examen2rico.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.examen.examen2rico.models.Persona;

@Repository
public interface PersonaRepository extends JpaRepository<Persona, Long> {

  Optional<Persona> findByDni(String dni);

  // @Query("SELECT SUM(p.vl.salarioBrutoAnual ) FROM Persona p LEFT JOIN FETCH
  // VidaLaborar vl GROUP BY p.id WHERE p.id=:id")

}
