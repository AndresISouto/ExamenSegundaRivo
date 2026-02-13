package com.examen.examen2rico.services;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.examen.examen2rico.dtos.PersonaRequest;
import com.examen.examen2rico.dtos.PersonaResponse;
import com.examen.examen2rico.mappers.PersonaMapper;
import com.examen.examen2rico.models.Persona;
import com.examen.examen2rico.models.VidaLaboral;
import com.examen.examen2rico.repositories.PersonaRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
@Transactional
public class PersonaServiceImpl {

  private final PersonaRepository personaRepository;
  private final PersonaMapper personaMapper;

  public List<PersonaResponse> getAll() {
    List<Persona> personas = personaRepository.findAll();
    List<PersonaResponse> response = personas.stream().map(persona -> personaMapper.toDto(persona))
        .collect(Collectors.toList());
    return response;
  }

  public PersonaResponse getById(Long id) {
    Persona persona = personaRepository.findById(id).orElseThrow(() -> new NoSuchElementException());
    PersonaResponse response = personaMapper.toDto(persona);
    return response;
  }

  public PersonaResponse create(PersonaRequest request) {
    Persona persona = personaMapper.toEntity(request);
    personaRepository.save(persona);
    return personaMapper.toDto(persona);
  }

  public PersonaResponse createByForm(Persona persona) {
    personaRepository.save(persona);
    return personaMapper.toDto(persona);
  }

  public PersonaResponse edit(PersonaRequest request, Long id) {
    Persona persona = personaMapper.toEntity(request);
    persona.setId(id);
    personaRepository.save(persona);
    return personaMapper.toDto(persona);

  }

  public void delete(Long id) {
    personaRepository.deleteById(id);
  }

  public Double retencionesById(Long id) {
    Persona persona = personaRepository.findById(id).orElseThrow(() -> new NoSuchElementException());

    Double salario = 0.0;
    for (VidaLaboral vl : persona.getVidaLaborar()) {
      salario += vl.getSalarioBrutoAnual();
    }

    Double retencion = salario * 19 / 100;

    return retencion;
  }

}
