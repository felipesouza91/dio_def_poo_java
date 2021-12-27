package dev.fsantana;
import dev.fsantana.model.Curso;
import dev.fsantana.model.Mentoria;
import java.time.LocalDate;

public class Main {

  public static void main(String[] args) {
    Curso curso = new Curso();
    curso.setTitulo("Curso Java");
    curso.setDescricao("descricao curso java");
    curso.setCargaHoraria(8);
    System.out.println(curso.toString());

    Mentoria mentoria = new Mentoria();
    mentoria.setTitulo("Mentoria java");
    mentoria.setDescricao("Descricao mentoria java");
    mentoria.setData(LocalDate.now());

    System.out.println(mentoria.toString());
  }
}
