package dev.fsantana.model;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

@Getter
@Setter
public class Bootcamp {
  private String nome;
  private String descricao;
  private final LocalDate dataInicio = LocalDate.now();
  private final LocalDate dataFinal = dataInicio.plusDays(45);
  private Set<Dev> devsIncritos = new HashSet<>();
  private Set<Conteudo> conteudos = new LinkedHashSet<>();

}
