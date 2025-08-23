import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Dev {

    private String nome;
    private List<Conteudo> conteudosInscritos = new ArrayList<>(); // Todo novo dev já cria uma lista nova de conteúdos inscritos
    private List<Conteudo> conteudosConcluidos = new ArrayList<>(); // Todo novo dev já cria uma lista nova de conteúdos Concluídos


    public void inscrever(Conteudo conteudo){ //Polimorfismo, Conteúdo vale tanto para curso, quanto para mentoria
        if (conteudosInscritos.contains(conteudo)) { // Verifica se a lista de conteúdos inscritos, já possui determinado conteúdo
            System.err.println("Conteúdo já inscrito."); // Caso houver, informa uma mensagem de erro
        } else { 
            conteudosInscritos.add(conteudo); // Caso contrário, adiciona o conteúdo na lista
            System.out.println("Inscrito com sucesso em: "+ conteudo);
        }
    }
    public void inscrever(Bootcamp bootcamp){
        for (Conteudo conteudo : bootcamp.getConteudos()) {
            if (conteudosInscritos.contains(conteudo)) { // Verifica se a lista de conteúdos inscritos, já possui determinado conteúdo
            System.err.println("Conteúdo já inscrito."); // Caso houver, informa uma mensagem de erro
            } else { 
                conteudosInscritos.add(conteudo); // Caso contrário, adiciona o conteúdo na lista
                System.out.println("Inscrito com sucesso em: "+ conteudo);
            }
            bootcamp.getDevs().add(this);

        }
    }

    public double calcularTotalXp(){
        return conteudosConcluidos.stream().mapToDouble(conteudo -> conteudo.calcularXp()).sum(); 
    
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Conteudo> getConteudosInscritos() {
        return conteudosInscritos;
    }

    public void setConteudosInscritos(List<Conteudo> conteudosInscritos) {
        this.conteudosInscritos = conteudosInscritos;
    }

    public List<Conteudo> getConteudosConcluidos() {
        return conteudosConcluidos;
    }

    public void setConteudosConcluidos(List<Conteudo> conteudosConcluidos) {
        this.conteudosConcluidos = conteudosConcluidos;
    }
    public void progredir() {
        Optional<Conteudo> conteudo = conteudosInscritos.stream().findFirst();
        if (conteudo.isPresent()) {
            conteudosConcluidos.add(conteudo.get());
            conteudosInscritos.remove(conteudo.get());

        } else {
            System.err.println("Sem conteúdos inscritos em andamento");
        }
    }

    

}
