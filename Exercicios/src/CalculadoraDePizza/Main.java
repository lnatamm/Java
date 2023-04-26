package CalculadoraDePizza;

public class Main {

    public static void main(String[] args) {

        Calculadora calculadora = new Calculadora();
        System.out.println("Total de Pedaços: " + calculadora.getPedacos());
        System.out.println("Quantidade de Pizzas: " + calculadora.getQtdPizzas());
        System.out.println("Pedaços por Sabores:");
        System.out.println("-----------------------\n");
        calculadora.showPizzas();
        System.out.println("Quantidade de Pizzas de cada Sabor");
        System.out.println("-----------------------\n");
        calculadora.showRelacao();
        System.out.println("Preço total: R$" + calculadora.getPrecoTotal());
        System.out.println("Preço dividido: R$" + calculadora.getPrecoDividido());
        System.out.println("Preço a pagar: R$" + (calculadora.getPrecoTotal() - calculadora.getPrecoDividido()));
        System.out.println("-----------------------\n");
        System.out.println("Pessoas:");
        System.out.println("-----------------------\n");
        calculadora.showPessoas();

    }

}
