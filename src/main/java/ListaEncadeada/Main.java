package ListaEncadeada;

public class Main {
    public static void main(String[] args) {
        Lista<String> lista= new Lista<>();

        lista.add("teste1");
        lista.add("teste2");
        lista.add("teste3");
        lista.add("teste4");

        System.out.println(lista);
        System.out.println(lista.remove(3));
        System.out.println(lista);

    }
}
