import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("Curso Java");
        curso1.setDescricao("Introdução de Java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso Javascript");
        curso2.setDescricao("Introdução de Javascript");
        curso2.setCargaHoraria(6);

        Curso curso3 = new Curso();
        curso3.setTitulo("Curso Python");
        curso3.setDescricao("Introdução de Python");
        curso3.setCargaHoraria(7);

        Mentoria mentoria1 = new Mentoria();
        mentoria1.setTitulo("Mentoria de Java");
        mentoria1.setDescricao("Introdução Java");
        mentoria1.setData(LocalDate.now());

        Mentoria mentoria2 = new Mentoria();
        mentoria2.setTitulo("Mentoria de Javascript");
        mentoria2.setDescricao("Introdução Javascript");
        mentoria2.setData(LocalDate.now());

        Mentoria mentoria3 = new Mentoria();
        mentoria3.setTitulo("Mentoria de Python");
        mentoria3.setDescricao("Introdução Python");
        mentoria3.setData(LocalDate.now());

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Back-end Java");
        bootcamp.setDescricao("Introdução SpringBoot");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(mentoria1);

        Dev devRosana = new Dev();
        devRosana.setNome("Rosana Borges");
        devRosana.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdo Inscrito de Rosana: " + devRosana.getConteudosInscritos());
        devRosana.progredir();
        System.out.println("Conteúdo Inscrito de Rosana: " + devRosana.getConteudosInscritos());
        System.out.println("Conteúdo Concluído de Rosana: " + devRosana.getConteudosConcluidos());
        System.out.println("Rosana seu XP é: " + devRosana.calcularTotalXp());

        System.out.println(" ");

        Dev devGohan = new Dev();
        devGohan.setNome("Nicholas Gohan");
        devGohan.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdo Inscrito de Gohan: " + devGohan.getConteudosInscritos());
        devGohan.progredir();
        devGohan.progredir();
        System.out.println("Conteúdo Inscrito de Gohan: " + devGohan.getConteudosInscritos());
        System.out.println("Conteúdo Concluído de Gohan: " + devGohan.getConteudosConcluidos());
        System.out.println("Gohan seu XP é: "+ devGohan.calcularTotalXp());

        System.out.println(" ");

        Dev devGoten = new Dev();
        devGoten.setNome("Ícaro Goten");
        devGoten.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdo Inscrito de Goten: " + devGoten.getConteudosInscritos());
        devGoten.progredir();
        devGoten.progredir();
        System.out.println("Conteúdo Inscrito de Goten: " + devGoten.getConteudosInscritos());
        System.out.println("Conteúdo Concluído de Goten: " + devGoten.getConteudosConcluidos());
        System.out.println("Goten seu XP é: " + devGoten.calcularTotalXp());



    }
}
