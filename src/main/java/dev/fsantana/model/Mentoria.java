package dev.fsantana.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.time.LocalDate;

@Getter
@Setter
@ToString
public class Mentoria {
  private String titulo;
  private String descricao;
  private LocalDate data;
}
