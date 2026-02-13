package com.examen.examen2rico.models;

import com.examen.examen2rico.enums.Contrato;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "vida_laboral")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class VidaLaboral {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;
  @ManyToOne
  @JoinColumn(name = "persona_id", nullable = false)
  private Persona persona;
  @ManyToOne
  @JoinColumn(name = "trabajo_id", nullable = false)
  private Trabajo trabajo;
  @Column(name = "anho_fiscal", nullable = false)
  private Integer anhoFiscal;
  @Column(name = "tipo_contrato", nullable = false)
  @Enumerated(EnumType.STRING)
  private Contrato tipoContrato;
  @Column(name = "salario_bruto_anual", nullable = false)
  private Double salarioBrutoAnual;

}
