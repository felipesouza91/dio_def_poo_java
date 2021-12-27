package dev.fsantana;
import dev.fsantana.model.*;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.stream.Collectors;

public class Main {

  public static void main(String[] args) {
    Dev dev = new Dev();
    dev.setNome("Felipe Souza");

    Curso curso = new Curso();
    curso.setTitulo("Curso Java");
    curso.setDescricao("descricao curso java");
    curso.setCargaHoraria(8);

    Mentoria mentoria = new Mentoria();
    mentoria.setTitulo("Mentoria java");
    mentoria.setDescricao("Descricao mentoria java");
    mentoria.setData(LocalDate.now());

    Bootcamp bootcamp = new Bootcamp();
    bootcamp.setNome("BootCamp JAVA");
    bootcamp.setDescricao("Bootcamp de Java na DIO");
    bootcamp.setConteudos(new HashSet<>(Arrays.asList(curso, mentoria)));
    bootcamp.setDevsIncritos(new HashSet<>(Arrays.asList(dev)));

    dev.increverBootcamp(bootcamp);
    dev.getConteudoInscritos().forEach((conteudo -> System.out.println(conteudo.toString())));
    System.out.println("----------------------------");
    dev.progredir();
    dev.getConteudoConcluidos().forEach((conteudo -> System.out.println(conteudo.toString())));
    System.out.println("----------------------------");
    dev.getConteudoInscritos().forEach((conteudo -> System.out.println(conteudo.toString())));
    System.out.println(dev.calcularXP());
  }
}
