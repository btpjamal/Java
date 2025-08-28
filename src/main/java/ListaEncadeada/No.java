package ListaEncadeada;

public class No<T> {
    private T conteudo;
    public No proximoNo= null;

    public No(T conteudo) {
        this.conteudo = conteudo;
        this.proximoNo = proximoNo;
    }


    public T getConteudo() {
        return conteudo;
    }

    public void setConteudo(T conteudo) {
        this.conteudo = conteudo;
    }

    public No getProximoNo() {
        return proximoNo;
    }

    public void setProximoNo(No proximoNo) {
        this.proximoNo = proximoNo;
    }

    @Override
    public String toString() {
        return "No{" +
                "conteudo=" + conteudo +
                '}';
    }
}
