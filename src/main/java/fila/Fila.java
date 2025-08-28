package fila;

public class Fila<T> {

    private No<T> entradaFila;

    public Fila() {
        this.entradaFila = null;
    }

    public boolean isEmpty() {
        if (entradaFila == null) {
            return true;
        } else {
            return false;
        }
    }

    public void enqueue(T obj) {
        No novoNo= new No(obj);
        novoNo.setProximo(entradaFila);
        entradaFila = novoNo;
    }

    public T first() {
        if (!this.isEmpty()) {
            No primeiroNo = entradaFila;
            while (true) {
                if (entradaFila.getProximo() != null) {
                    entradaFila = entradaFila.getProximo();
                } else {
                    break;
                }
            }
            return (T) primeiroNo.getConteudo();

        }
        return null;
    }

    public T dequeue() {
        if (!this.isEmpty()) {
            No primeiroNo = entradaFila;
            No noAuxiliar = entradaFila;
            while (true) {
                if (primeiroNo.getProximo() != null) {
                    noAuxiliar = primeiroNo;
                    primeiroNo = primeiroNo.getProximo();
                } else {
                    noAuxiliar.setProximo(null);
                    break;
                }
            }
            return (T) entradaFila.getConteudo();

        }
        return null;
    }

    public void last() {
        entradaFila = null;
    }

    @Override
    public String toString() {
        return "" + entradaFila;
    }
}