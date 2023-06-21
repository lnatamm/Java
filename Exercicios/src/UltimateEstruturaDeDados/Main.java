package UltimateEstruturaDeDados;
import java.sql.Time;
import java.time.LocalDateTime;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        double start = System.currentTimeMillis();
        Multilist<Integer> teste = new Multilist<>();
        for(int i = 0; i < 40000; ++i){
            teste.add(i);
        }
        System.out.println(teste.search(2684));
        System.out.println(teste.pop());
        System.out.println(teste.dequeue());
        System.out.println(teste);
        teste.sort();
        System.out.println(teste);
        System.out.println(teste);
        System.out.println(System.currentTimeMillis() - start);
    }
}