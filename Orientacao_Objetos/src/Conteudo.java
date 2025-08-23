



public abstract class Conteudo { //Conteúdos de classes abstratas não podem ser instanciados, apenas invocados por outras classes já pré estabelecidas
    private String titulo;
    private String descricao;
    
    protected static final double XP_PADRAO= 10.0; //Apenas os filhos têm/enxergam o acesso
    
    public abstract double calcularXp(); //Obriga a classes que herdem de conteudo, que usem esse método
    
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    

}
