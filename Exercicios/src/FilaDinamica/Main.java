package FilaDinamica;

public class Main {

    public static void main(String[] args) {

        Fila<Integer> fila = new Fila<>();

        fila.add(1);
        fila.add(2);
        fila.add(3);
        fila.add(4);
        fila.add(5);
        System.out.println(fila);
        fila.poll();
        System.out.println(fila);
        fila.poll();
        System.out.println(fila);
        System.out.println(fila.peek());

    }

}
