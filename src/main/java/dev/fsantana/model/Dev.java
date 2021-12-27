package dev.fsantana.model;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.LinkedHashSet;
import java.util.Optional;
import java.util.Set;

@Getter
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@ToString
public class Dev {

  @Setter
  @EqualsAndHashCode.Include
  private String nome;

  private Set<Conteudo> conteudoInscritos = new LinkedHashSet<>();
  private Set<Conteudo> conteudoConcluidos = new LinkedHashSet<>();

  public void increverBootcamp(Bootcamp bootcamp) {
    conteudoInscritos.addAll(bootcamp.getConteudos());
    bootcamp.getDevsIncritos().add(this);
  }

  public void progredir() {
    Optional<Conteudo> conteudo= this.conteudoInscritos.stream().findFirst();
    if(conteudo.isPresent()) {
      this.conteudoConcluidos.add(conteudo.get());
      this.conteudoInscritos.remove(conteudo.get());
    }
  }
   public  double calcularXP() {
      return this.conteudoConcluidos.stream().mapToDouble(Conteudo::calcularXP).sum();
   }
}
