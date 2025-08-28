package pilha;

public class Pilha { // Cria uma classe pilha

    private No topo; // cria um topo para a pilha

    public Pilha() {
        this.topo = null; // o topo da pilha é nulo
    }

    public void push(No novoNo) { // método para inserir um novo item na pilha
        No ponteiro = topo; // ponteiro apontando para o topo atual da pilha
        topo = novoNo; // o topo recebe um novo nó
        topo.setProximo(ponteiro); // o proximo do topo, aponta pra onde está o ponteiro, que é "abaixo dele" na pilha
    }

    public No pop() { // força o valor do topo atual a se retirar da pilha
        if(!this.isEmpty()){ // verifica se a pilha não está vazia
            No noPoped=  this.topo; // cria uma variavel "noPoped" e aponta a variavel para o topo
            this.topo = this.topo.getProximo(); // "desce" o topo, para o que estava abaixo dele
            return noPoped; // retorna o valor do topo que foi removido
        }
        return null; // se a pilha estiver vazia, retorna nulo
    }

    public No top(){ // método para retonar o valor que está no topo da pilha
        return this.topo;
    }

    public boolean isEmpty() { // método para verificar se a pilha está vazia
        if(this.topo == null) {
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return "topo=" + topo;
    }
}
