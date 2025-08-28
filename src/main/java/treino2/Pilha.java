package treino2;

import org.w3c.dom.ls.LSOutput;

public class Pilha {
    private No topo;
    public Pilha() {
        this.topo = null;
    }
    public boolean isEmpty() {
        if(this.topo == null){
            return true;
        } else {
            return false;
        }
    }
    public void push(No dado) {
        No ponteiro= topo;
        topo= dado;
        topo.setProximo(ponteiro);
    }
    public No pop() {
        if (!isEmpty()) {
            No noPoped = topo;
            topo = topo.getProximo();
            return noPoped;
        } else {
            return null;
        }
    }
    public No peek() {
        return topo;
    }

    @Override
    public String toString() {
        return "topo= " + topo;
    }
}
