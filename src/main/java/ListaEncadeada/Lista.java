package ListaEncadeada;

public class Lista<T> {
    No<T>  primeiro= null;

    public Lista(No<T> primeiro) {
        this.primeiro = primeiro;
    }

    public boolean isEmpty(){
        if(primeiro == null){
            return true;
        } else  {
            return false;
        }
    }

    public int size(){
        int tamanhoLista = 0; // inicializa uma variavel com valor 0
        No<T> referencia= primeiro; // insere uma referencia no primeiro nó da lista
        while(true){
            if(referencia != null){ // se o primeiro não for nulo
                tamanhoLista++; // incrementa o tamanho da lista
                if (referencia.getProximoNo() != null){ // se o próximo dele não for nulo
                    referencia = referencia.getProximoNo(); // anda para o próximo
                } else  {
                    break;
                }
            } else  {
                break;
            }

        }
        return tamanhoLista;
    }

    public void add(T conteudo){ // metodo para adicionar um novo nó na lista
        No<T> novoNo= new No<>(conteudo); // criando um novoNo
        if(this.isEmpty()){ // verificando se a lista está vazia
            primeiro= novoNo; // o primeiro da fila recebe esse novo nó
            return;
        }

        No<T> auxiliar= primeiro; // setando um nó auxiliar na posicão do primeiro nó da lista
        for (int i=0; i<this.size()-1; i++) { // percorrendo a lista
            auxiliar= auxiliar.getProximoNo(); //correndo de nó em nó
        }
        auxiliar.setProximoNo(novoNo); // seta o proximo nó no final
    }
}
