package ListaEncadeada;

public class Lista<T> {
    No<T>  primeiro= null;

    public Lista() {
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
    private No<T> getNo(int indice){ // busca um nó através do indice passado como parâmetro
        validaIndice(indice); //valida se o indice existe / se é menor que o tamanho da lista

        No<T> auxiliar= primeiro; //aponta uma variavel para o primeiro nó da lista
        No<T> retorno= null; // aponta uma variavel com valor nulo

        for (int i=0; i<=indice; i++) {
            retorno= auxiliar;
            auxiliar= auxiliar.getProximoNo();
        }
        return retorno;

    }

    private void validaIndice(int indice){
        if(indice > size()){
            int ultimoIndice = size() - 1;
            throw new IndexOutOfBoundsException("Indice inexistente");
        }
    }

    public T get(int index){
        return getNo(index).getConteudo();
    }

    public T remove(int index){
        No<T> noPivo= this.getNo(index);
        if(index==0){
            primeiro = noPivo.getProximoNo();
            return noPivo.getConteudo();
        }
        No<T> noAnterior= getNo(index-1); // atribui a "noAnterior" o valor que ele receber do nó, -1, ou seja, o anterior a ele
        noAnterior.setProximoNo(noPivo.getProximoNo()); // e o proximo desse anterior, agora aponta para o proximo do nó que foi anteriormente setado, /1 -> esse não (2), ->/3
        return noPivo.getConteudo();

    }

    @Override
    public String toString() {
        String srtRetorno="";
        No<T> noAuxiliar= primeiro;
        for(int i=0; i< this.size(); i++) {
            srtRetorno+= "No{conteudo=" + noAuxiliar.getConteudo() + "}";
            noAuxiliar = noAuxiliar.getProximoNo();
        }
        srtRetorno += "null";
        return srtRetorno;
    }
}
