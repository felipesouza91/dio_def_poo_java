package dev.fsantana.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.time.LocalDate;

@Getter
@Setter
@ToString(callSuper = true)
public class Mentoria extends Conteudo{

  private LocalDate data;

  @Override
  public double calcularXP() {
    return  XP_PADRAO + 20d;
  }
}
