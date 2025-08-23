
import java.time.LocalDateTime;

public class Mentoria extends Conteudo{

    private LocalDateTime data;


    public LocalDateTime getData() {
        return data;
    }

    public void setData(LocalDateTime data) {
        this.data = data;
    }

    @Override
    public double calcularXp() { //método herdado de forma obrigatória
        return XP_PADRAO; //acessando a variável "protected"
    }


}