package com.examen.examen2rico.models;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "trabajo")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Trabajo {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;
  @Column(name = "nombre_puesto", nullable = false)
  private String nombrePuesto;
  @Column(name = "sector", nullable = false)
  private String sector;
  @OneToMany(mappedBy = "trabajo", cascade = CascadeType.ALL, orphanRemoval = true)
  private List<VidaLaboral> vidaLaborar = new ArrayList<>();

}
