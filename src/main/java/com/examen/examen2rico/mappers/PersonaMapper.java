package com.examen.examen2rico.mappers;

import org.springframework.stereotype.Component;

import com.examen.examen2rico.dtos.PersonaRequest;
import com.examen.examen2rico.dtos.PersonaResponse;
import com.examen.examen2rico.models.Persona;

@Component
public class PersonaMapper {

  public Persona toEntity(PersonaRequest dto) {
    Persona persona = Persona.builder()
        .nombre(dto.nombre())
        .apellidos(dto.apellidos())
        .dni(dto.dni())
        .build();

    return persona;
  }

  public PersonaResponse toDto(Persona persona) {
    return new PersonaResponse(persona.getNombre(), persona.getApellidos(), persona.getDni());
  }

}
