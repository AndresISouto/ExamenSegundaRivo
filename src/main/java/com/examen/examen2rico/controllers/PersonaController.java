package com.examen.examen2rico.controllers;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.examen.examen2rico.dtos.PersonaRequest;
import com.examen.examen2rico.dtos.PersonaResponse;
import com.examen.examen2rico.services.PersonaServiceImpl;

import jakarta.validation.Path.ReturnValueNode;
import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/api/personas")
@RequiredArgsConstructor
public class PersonaController {

  private final PersonaServiceImpl personaServiceImpl;

  @GetMapping()
  public ResponseEntity<List<PersonaResponse>> getAll() {
    List<PersonaResponse> response = personaServiceImpl.getAll();
    return ResponseEntity.ok(response);
  }

  @GetMapping("/{id}")
  public ResponseEntity<PersonaResponse> getById(Long id) {
    PersonaResponse response = personaServiceImpl.getById(id);
    return ResponseEntity.ok(response);
  }

  @PostMapping()
  public ResponseEntity<PersonaResponse> create(@RequestBody PersonaRequest persona) {
    PersonaResponse response = personaServiceImpl.create(persona);
    return ResponseEntity.ok(response);
  }

  @PostMapping("/{id}")
  public ResponseEntity<PersonaResponse> edit(@RequestBody PersonaRequest persona, @PathVariable Long id) {
    PersonaResponse response = personaServiceImpl.edit(persona, id);
    return ResponseEntity.ok(response);
  }

  @DeleteMapping("/{id}")
  public ResponseEntity<String> delete(@PathVariable Long id) {
    personaServiceImpl.delete(id);
    return ResponseEntity.ok("elemento borrado");
  }

}
