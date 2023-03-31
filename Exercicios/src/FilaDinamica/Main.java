package FilaDinamica;

public class Main {

    public static void main(String[] args) {

        Fila<Integer> fila = new Fila<>();

        fila.enqueue(1);
        fila.enqueue(2);
        fila.enqueue(3);
        fila.enqueue(4);
        fila.enqueue(5);
        System.out.println(fila);
        fila.dequeue();
        System.out.println(fila);
        fila.dequeue();
        System.out.println(fila);
        System.out.println(fila.peek());
        System.out.println(fila.dequeue());
        System.out.println(fila.dequeue());
        System.out.println(fila.dequeue());
        System.out.println(fila);

    }

}
