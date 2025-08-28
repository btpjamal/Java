package treino2;

public class Main {
    public static void main(String[] args) {
        Pilha pilha = new Pilha();
        pilha.push(new No(0));
        pilha.push(new No(1));
        pilha.push(new No(2));
        pilha.push(new No(3));

        System.out.println(pilha);
        System.out.println("-=-=-=-==-=-=-=-=--=");
        pilha.pop();
        System.out.println(pilha);
        System.out.println(pilha.isEmpty());



    }
}
