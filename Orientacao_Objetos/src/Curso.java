





public class Curso extends Conteudo{

    private int cargaHoraria;

 
    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    @Override
    public double calcularXp() {//Método herdado de forma obrigatória
        return XP_PADRAO * cargaHoraria; //acessando a variavel "protected"
    }


}
