package InfixaParaPosfixa;

import java.util.*;

public class Main {

    public static boolean temParentese(String s){

        for(int i = 0; i < s.length(); i++){

            if(s.charAt(i) == '(' || s.charAt(i) == ')'){
                return true;
            }

        }

        return false;

    }

    public static int operador(char c){

        if (c == '+' || c == '-') {
            return 0;
        }

        else if(c == '*' || c == '/') {
            return 1;
        }

        else if(c == '^'){
            return 2;
        }

        return -1;

    }

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.nextLine());
        for(int i = 0; i < n; i++){

            String infixa = sc.nextLine();

            String posfixa = "";

            Pilha<Character> operadores = new Pilha<>();

            Pilha<Character> aux = new Pilha<>();

            if(!temParentese(infixa)) {

                for (int j = 0; j < infixa.length(); j++) {

                    if(Character.isLetterOrDigit(infixa.charAt(j))){

                        posfixa+=infixa.charAt(j);

                    }

                    else {

                        while (!operadores.isEmpty() && operador(infixa.charAt(j)) <= operador(operadores.peek())){

                            posfixa+=operadores.pop();

                        }

                        operadores.push(infixa.charAt(j));

                    }

                }

                while (!operadores.isEmpty()){

                    posfixa+=operadores.pop();

                }

                System.out.println(posfixa);

            }

            else {

                for (int j = 0; j < infixa.length(); j++) {

                    if(Character.isLetterOrDigit(infixa.charAt(j))){

                        posfixa+=infixa.charAt(j);

                    }

                    else if(infixa.charAt(j) == '('){

                        operadores.push('(');

                    }

                    else if(infixa.charAt(j) == ')'){

                        while (!operadores.isEmpty() && operadores.peek() != '(') {

                            posfixa += operadores.pop();

                        }

                        operadores.pop();

                    }

                    else {

                        while (!operadores.isEmpty() && operador(infixa.charAt(j)) <= operador(operadores.peek())){

                            posfixa+=operadores.pop();

                        }

                        operadores.push(infixa.charAt(j));

                    }

                }

                while (!operadores.isEmpty()){

                    posfixa+=operadores.pop();

                }

                System.out.println(posfixa);

            }

        }

    }

}
