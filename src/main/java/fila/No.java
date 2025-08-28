package fila;

public class No<T> {
    private T conteudo;
    private No<T> proximo= null;

    public No(T conteudo) {
        this.conteudo = conteudo;
    }

    public Object getConteudo() {
        return conteudo;
    }

    public void setConteudo(T conteudo) {
        this.conteudo = conteudo;
    }

    public No getProximo() {
        return proximo;
    }

    public void setProximo(No proximo) {
        this.proximo = proximo;
    }

    @Override
    public String toString() {
        return "" + conteudo +" -> "+ proximo;
    }
}
