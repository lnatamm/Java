import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Bem Vindo a Calculadora Proposicional! Aqui você poderá analisar fórmulas e descobrir se elas são Tautologias, Contigências ou Contradições");

        int controle = 1;

        while (controle == 1){

            boolean erro = true;

            while(erro) {

                try {

                    System.out.println("Digite a fórmula: (ou: ^ | e: v | se: → | se, somente se: ↔)");

                    String formula = sc.nextLine();

                    Interpretador interpretador = new Interpretador(formula);

                    Calculadora calculadora = new Calculadora(interpretador);

                    erro = false;

                    System.out.println("A fórmula " + formula + " é uma " + calculadora.getResposta());

                    System.out.println();

                    System.out.println("Deseja continuar? Sim(1) Não(!1)");

                    controle = Integer.parseInt(sc.nextLine());

                }

                catch (InputMismatchException e){

                    System.out.println(e.getMessage());

                }

            }

        }

    }

}
