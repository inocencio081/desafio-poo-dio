package src.br.com.dio.desafio_poo.dominio;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {


        Curso curso = new Curso();

        curso.setTitulo("Java");
        curso.setCargaHoraria(10);
        curso.setDescricao("POO");

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("novo");
        mentoria.setDescricao("Nova mentoria");
        mentoria.setData(LocalDate.now());

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Java Developer");
        bootcamp.setDescricao("Nova Descrição Java Developer");
        bootcamp.getConteudos().add(curso);
        bootcamp.getConteudos().add(mentoria);
        //bootcamp.getConteudos().add();

        Dev dev = new Dev();
        dev.setNome("Inocêncio Carlos");
        dev.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos inscritos Inocencio"  + dev.getConteudosInscritos());
        dev.progredir();
        System.out.println("Depois de Progredir"  + dev.getConteudosInscritos());
        System.out.println("Conteudos Concluidos Inocencio" + dev.getConteudosConcluidos());

        System.out.println("----------------------");

        Dev dev2 = new Dev();
        dev.setNome("Alana");
        dev2.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos inscritos Alana"  + dev2.getConteudosInscritos());
        dev2.progredir();
        System.out.println("Depois de Progredir"  + dev2.getConteudosInscritos());
        System.out.println("Conteudos Concluidos Alana" + dev2.getConteudosConcluidos());



    }
}
