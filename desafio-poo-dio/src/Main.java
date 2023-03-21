import java.time.LocalDate;

import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("Curso Java");
        curso1.setDescricao("Descrição Curso Java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso JS");
        curso2.setDescricao("Descrição Curso JS");
        curso2.setCargaHoraria(4);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria Java");
        mentoria.setDescricao("Descrição Mentoria Java");
        mentoria.setData(LocalDate.now());

        // System.out.println(curso1);
        // System.out.println(curso2);
        // System.out.println(mentoria);

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devMarcelo = new Dev();
        devMarcelo.setNome("Marcelo");
        devMarcelo.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos inscritos Marcelo: " + devMarcelo.getConteudosInscritos());

        devMarcelo.progredir();
        devMarcelo.progredir();

        System.out.println("-");
        System.out.println("Conteudos inscritos Marcelo: " + devMarcelo.getConteudosInscritos());
        System.out.println("Conteudos concluidos Marcelo: " + devMarcelo.getConteudosConcluidos());
        System.out.println("XP: " + devMarcelo.calcularTotalXp());
        
        System.out.println("-------------------");

        Dev devJoao = new Dev();
        devJoao.setNome("Joao");
        devJoao.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos inscritos João: " + devMarcelo.getConteudosInscritos());

        devJoao.progredir();
        devJoao.progredir();
        devJoao.progredir();

        System.out.println("-");
        System.out.println("Conteudos inscritos João: " + devMarcelo.getConteudosInscritos());
        System.out.println("Conteudos concluidos João: " + devMarcelo.getConteudosConcluidos());
        System.out.println("XP: " + devJoao.calcularTotalXp());

    }
}
