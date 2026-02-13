package com.examen.examen2rico.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.examen.examen2rico.models.Persona;
import com.examen.examen2rico.services.PersonaServiceImpl;

import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;

@Controller
@RequestMapping("/personas")
@RequiredArgsConstructor
public class PersonaMvcController {

  private final PersonaServiceImpl personaServiceImpl;

  @GetMapping()
  public String getAll(Model model) {
    model.addAttribute("personas", personaServiceImpl.getAll());
    return "personas";
  }

  @GetMapping("/form")
  public String getForm(Model model) {
    model.addAttribute("persona", new Persona());
    return "form";
  }

  @PostMapping("/new")
  public String create(@Valid @ModelAttribute("persona") Persona persona,
      BindingResult br) {
    if (br.hasErrors()) {
      return "form";
    }
    return "redirect:/personas";
  }

}
