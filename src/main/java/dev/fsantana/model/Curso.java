package dev.fsantana.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString(callSuper = true)
public class Curso extends Conteudo{

  private Integer cargaHoraria;

  @Override
  public double calcularXP() {
    return cargaHoraria * XP_PADRAO;
  }
}
