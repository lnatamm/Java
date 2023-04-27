package CalculadoraDePizza;

public class Main {

    public static void main(String[] args) {

        Calculadora calculadora = new Calculadora();
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
