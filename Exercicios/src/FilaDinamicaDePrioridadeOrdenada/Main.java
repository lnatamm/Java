package FilaDinamicaDePrioridadeOrdenada;

public class Main {

    public static void main(String[] args) {

        Fila<String> fila = new Fila<>();
        fila.enqueue("João", 2);
        fila.enqueue("Marcos", 2);
        fila.enqueue("Ana", 1);
        fila.enqueue("Sebastião", 0);
        fila.enqueue("David", 3);
        fila.enqueue("Luana", 2);
        System.out.println(fila);
        System.out.println(fila.dequeue());
        System.out.println(fila.dequeue());
        System.out.println(fila.dequeue());
        System.out.println(fila.dequeue());
        System.out.println(fila.dequeue());
        System.out.println(fila.dequeue());
        System.out.println(fila);

    }

}
