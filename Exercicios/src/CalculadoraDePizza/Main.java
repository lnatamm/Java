package CalculadoraDePizza;

import java.util.*;

public class Main {

    public static String inputString(String frase, Scanner sc){

        try{

            String s = sc.nextLine();

            try{

                Integer.parseInt(s);
                throw new InputMismatchException();

            }

            catch (NumberFormatException e) {

                return s;

            }

        }

        catch (InputMismatchException e){

            System.out.print(frase);
            return inputString(frase, sc);

        }

    }

    public static int inputInt(String frase, Scanner sc){

        try{

            int numero = Integer.parseInt(sc.nextLine());
            if(numero >= 0) {
                return numero;
            }
            else {
                throw new NumberFormatException();
            }

        }

        catch (NumberFormatException e){

            System.out.print(frase);
            return inputInt(frase, sc);

        }

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int controle = 1;

        ArrayList<Pessoa> pessoas = new ArrayList<>();

        while(controle == 1){

            System.out.print("Nome: ");

            String nome = inputString("Nome: ", sc);

            System.out.print("\nQuantidade de Pedaços(Pizza Salgada): ");

            int pedacosSalgadas = inputInt("\nQuantidade de Pedaços(Pizza Salgada): ", sc);

            ArrayList<String> votosSalgada;

            if(pedacosSalgadas > 0) {

                System.out.print("\nDigite seus Votos (Pizza Salgada): ");

                votosSalgada = new ArrayList<>();

                ArrayList<String> votosSalgadaTemp = new ArrayList<>(Arrays.asList(inputString("\nDigite seus Votos (Pizza Salgada): ", sc).split(", ")));

                for(String i: votosSalgadaTemp){

                    if(!votosSalgada.contains(i) && !i.equals("")){
                        votosSalgada.add(i);
                    }

                }

                while (votosSalgada.size() > 2){

                    votosSalgada.remove(2);

                }

                if(votosSalgada.size() == 0){

                    pedacosSalgadas = 0;

                }

            }

            else {

                votosSalgada = new ArrayList<>(Arrays.asList(""));

            }

            System.out.print("\nQuantidade de Pedaços(Pizza Doce): ");

            int pedacosDoces = inputInt("\nQuantidade de Pedaços(Pizza Doce): ", sc);

            ArrayList<String> votosDoce;

            if(pedacosDoces > 0) {

                System.out.print("\nDigite seus Votos (Pizza Doce): ");

                votosDoce = new ArrayList<>();

                ArrayList<String> votosDoceTemp = new ArrayList<>(Arrays.asList(inputString("\nDigite seus Votos (Pizza Doce): ", sc).split(", ")));

                for(String i : votosDoceTemp){

                    if(!votosDoce.contains(i) && !i.equals("")){
                        votosDoce.add(i);
                    }

                }

                while (votosDoce.size() > 2){

                    votosDoce.remove(2);

                }

                if(votosDoce.size() == 0){
                    pedacosDoces = 0;
                }

            }

            else {

                votosDoce = new ArrayList<>(Arrays.asList(""));

            }

            pessoas.add(new Pessoa(nome, pedacosSalgadas, votosSalgada, pedacosDoces, votosDoce));

            System.out.print("\nDeseja adicionar outra pessoa? (1: Sim | !1: Não): ");

            controle = inputInt("\nDeseja adicionar outra pessoa? (1: Sim | !1: Não): ", sc);

        }

        Calculadora calculadora = new Calculadora(pessoas);
        System.out.println("\nTotal de Pedaços Salgadas: " + calculadora.getPedacosSalgadas());
        System.out.println("Quantidade de Pizzas Salgadas: " + calculadora.getQtdPizzasSalgadas() + "\n");
        System.out.println("Total de Pedaços Doces: " + calculadora.getPedacosDoces());
        System.out.println("Quantidade de Pizzas Doces: " + calculadora.getQtdPizzasDoces() + "\n");
        System.out.println("Pedaços Salgados por Sabores:");
        System.out.println("-----------------------\n");
        calculadora.showPizzasSalgadas();
        System.out.println("Pedaços Doces por Sabores:");
        System.out.println("-----------------------\n");
        calculadora.showPizzasDoces();
        System.out.println("Quantidade de Pizzas Salgadas de cada Sabor");
        System.out.println("-----------------------\n");
        calculadora.showRelacaoSalgadas();
        System.out.println("Quantidade de Pizzas Doces de cada Sabor");
        System.out.println("-----------------------\n");
        calculadora.showRelacaoDoces();
        System.out.println("Preço total: R$" + calculadora.getPrecoTotal());
        System.out.println("Preço dividido: R$" + calculadora.getPrecoDividido());
        System.out.println("Preço a pagar: R$" + (calculadora.getPrecoTotal() - calculadora.getPrecoDividido()));
        System.out.println("-----------------------\n");
        System.out.println("Pessoas:");
        System.out.println("-----------------------\n");
        calculadora.showPessoas();

    }

}
