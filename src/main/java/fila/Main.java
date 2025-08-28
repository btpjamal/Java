package fila;

public class Main {
    public static void main(String[] args) {

        Fila<String> fila = new Fila<>();
        fila.enqueue("Primeiro");
        fila.enqueue("Segundo");
        fila.enqueue("Terceiro");
        fila.enqueue("Quarto");

        System.out.println(fila);



    }
}
