package dev.fsantana.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Curso {

  private String titulo;
  private String descricao;
  private Integer cargaHoraria;

}
