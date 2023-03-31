package JogoAniversario;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Lista lista = new Lista();

        for(int i = 1; i <= 31; i++){

            lista.add(i + " de janeiro");

        }

        for(int i = 1; i <= 30; i++){

            lista.add(i + " de fevereiro");

        }

        for(int i = 1; i <= 31; i++){

            lista.add(i + " de março");

        }

        for(int i = 1; i <= 30; i++){

            lista.add(i + " de abril");

        }


        for(int i = 1; i <= 31; i++){

            lista.add(i + " de maio");

        }

        for(int i = 1; i <= 30; i++){

            lista.add(i + " de junho");

        }

        for(int i = 1; i <= 31; i++){

            lista.add(i + " de julho");

        }


        for(int i = 1; i <= 31; i++){

            lista.add(i + " de agosto");

        }

        for(int i = 1; i <= 30; i++){

            lista.add(i + " de setembro");

        }

        for(int i = 1; i <= 31; i++){

            lista.add(i + " de outubro");

        }

        for(int i = 1; i <= 30; i++){

            lista.add(i + " de novembro");

        }

        for(int i = 1; i <= 31; i++){

            lista.add(i + " de dezembro");

        }

        Random random = new Random();

        int n = 1;

        while(n == 1){

            int x = Integer.parseInt(sc.next());

            for(int i = 0; i < x; i ++){

                lista.remove(random.nextInt(lista.size()));

            }

            System.out.println(lista);

            n = Integer.parseInt(sc.next());

        }

    }

}
