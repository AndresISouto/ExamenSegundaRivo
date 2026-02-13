package com.examen.examen2rico.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.examen.examen2rico.enums.Contrato;
import com.examen.examen2rico.models.VidaLaboral;

@Repository
public interface VidaLaboralRepository extends JpaRepository<VidaLaboral, Long> {

  List<VidaLaboral> findByTipoContrato(Contrato tipoContrato);

  // @Query("SELECT SUM(*) FROM VidaLaboral vl GROUB BY vl.persona_id WHERE
  // vl.persona_id = :id")
  // Long salario = findSalarioTotal(@Param("id")Long id);

}
