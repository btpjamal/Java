import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        
        Curso cursoJava= new Curso();
        cursoJava.setTitulo("Curso Java Básico");
        cursoJava.setDescricao("Aprenda os conceitos básicos sobre Java");
        cursoJava.setCargaHoraria(8);

        Curso cursoAngular= new Curso();
        cursoAngular.setTitulo("Curso Angular Básico");
        cursoAngular.setDescricao("Aprenda os conceitos básicos sobre Angular");
        cursoAngular.setCargaHoraria(8);

        Curso cursoJavaAvancado= new Curso();
        cursoJavaAvancado.setTitulo("Curso Java Básico");
        cursoJavaAvancado.setDescricao("Aprenda os conceitos avancados sobre Java");
        cursoJavaAvancado.setCargaHoraria(12);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Aprendendo Orientação a Objetos com Java");
        mentoria.setDescricao("Imersão sobre os pilares da Orientação a Objetos");
        mentoria.setData(LocalDateTime.now());

        List<Conteudo> conteudosBootcamp= new ArrayList<>();
        conteudosBootcamp.add(cursoJava);
        conteudosBootcamp.add(cursoJavaAvancado);
        conteudosBootcamp.add(mentoria);


        Bootcamp bootcamp= new Bootcamp("Intensivo Java", LocalDate.now(), LocalDate.now().plusDays(45),conteudosBootcamp); //Setando valores pelo método construtor

        Dev user01= new Dev();
        user01.setNome("Jamilton");
        user01.inscrever(cursoJava);
        user01.inscrever(bootcamp);
        user01.progredir();
        user01.progredir();


        Dev user02= new Dev();
        user02.setNome("Habib");
        user02.inscrever(bootcamp);
        user02.progredir();
        user02.progredir();
        user02.progredir();
        user02.progredir();
        
        System.out.println(String.format("XP Jamilton: %2f", user01.calcularTotalXp()));
        System.out.println(String.format("XP Habib: %2f", user02.calcularTotalXp()));

        List<Dev> ranking = Arrays.asList(user01, user02).stream()
    .sorted(Comparator.comparingDouble(Dev::calcularTotalXp).reversed()) // maior XP primeiro
    .collect(Collectors.toList());


    for (Dev dev : ranking){
        System.out.println(dev.getNome());
    }
    }
}
