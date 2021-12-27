package dev.fsantana.model;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public abstract class Conteudo {

  final protected static double XP_PADRAO = 10d;
  private String titulo;
  private String descricao;

  public abstract double calcularXP();
}
