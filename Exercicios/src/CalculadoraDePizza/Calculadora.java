package CalculadoraDePizza;

import java.math.*;
import java.text.*;
import java.util.*;

public class Calculadora {

    private ArrayList<Pessoa> pessoas;

    private ArrayList<Pizza> pizzas;

    private int pedacos;

    private int qtdPizzas;

    private ArrayList<Pizza> prioridades;

    private ArrayList<Pizza> relacaoDePizzas;

    private double precoTotal;

    private double precoDividido;

    private double cota;

    public Calculadora(){

        pessoas = new ArrayList<Pessoa>(Arrays.asList(
                //Inserir aqui as pessoas e os seus votos da seguinte forma: "new Pessoa("Nome", Quantidade de Pedaços, new ArrayList<String>(Arrays.asList("Voto1", "Voto2")))"
                new Pessoa("Exemplo1", 5, new ArrayList<String>(Arrays.asList("Fala Baixo","Siciliana"))),
                new Pessoa("Exemplo2", 5, new ArrayList<String>(Arrays.asList("Fala Baixo", "Frango Catupiry"))),
                new Pessoa("Exemplo3", 4, new ArrayList<String>(Arrays.asList("Siciliana"))),
                new Pessoa("Exemplo4", 4, new ArrayList<String>(Arrays.asList("Fala Mag")))
        )
        );

        pizzas = new ArrayList<Pizza>(Arrays.asList(
                //Inserir aqui as pizzas e os seus respectivos preços da seguinte forma: "new Pizza("Sabor", Preço)"
                new Pizza("Fala Baixo", 79.9),
                new Pizza("Siciliana", 80.9),
                new Pizza("Fala Mag", 81.9),
                new Pizza("Frango Catupiry", 67.9)
        )
        );

        definePedacosTemp();

        defineQtdPizzas();

        definePedacosDef();

        incrementaPizzas();

        definePrioridades();

        defineRelacao();

        definePrecoTotal();

        definePrecoTotal();

        definePrecoDividido();

        defineCota();

        defineCotaPessoa();

    }

    private void defineQtdPizzas(){

        qtdPizzas = Math.ceilDiv(pedacos, 8);

    }

    private void definePedacosTemp(){

        for(int i = 0; i < pessoas.size(); i++){

            pedacos+=pessoas.get(i).getPedacos();

        }

    }

    private void definePedacosDef(){

        pedacos = qtdPizzas * 8;

    }

    private Pizza getPizza(String sabor){

        for(int i = 0; i < pizzas.size(); i++){

            if(sabor.equals(pizzas.get(i).getSabor())){
                return pizzas.get(i);
            }

        }

        return null;

    }

    private void incrementaPizzas(){

        ArrayList<Integer> qtdAux = new ArrayList<>();

        for(int i = 0; i < pessoas.size(); i++){

            qtdAux.add(pessoas.get(i).getPedacos());

        }

        for(int i = 0; i < pessoas.size(); i++){

            for(int j = 0; j < pessoas.get(i).getVotos().size(); j++){

                for(int k = 0; k < pizzas.size(); k++){

                    if(pessoas.get(i).getVotos().get(j).equals(pizzas.get(k).getSabor())){

                        double divisao = qtdAux.get(i) / (pessoas.get(i).getVotos().size() * 1.0);

                        BigDecimal bdValor = new BigDecimal(divisao);
                        if (bdValor.setScale(0, RoundingMode.DOWN).compareTo(bdValor) != 0) {
                            //tem decimal

                            if(pessoas.get(i).getVotos().size() > 1){

                                int divisaoInteira;

                                if(pizzas.get(k).getQuantidade() == getPizza(pessoas.get(i).getVotos().get(1)).getQuantidade()){

                                    pizzas.get(k).incQuantidade(divisao);
                                    getPizza(pessoas.get(i).getVotos().get(1)).incQuantidade(divisao);
                                    pessoas.get(i).getVotos().remove(1);
                                    break;

                                }

                                else if(pizzas.get(k).getQuantidade() > getPizza(pessoas.get(i).getVotos().get(1)).getQuantidade()){

                                    divisaoInteira = Math.ceilDiv(qtdAux.get(i), pessoas.get(i).getVotos().size());
                                    pizzas.get(k).incQuantidade(divisaoInteira);

                                }

                                else{

                                    divisaoInteira = Math.floorDiv(qtdAux.get(i), pessoas.get(i).getVotos().size());
                                    pizzas.get(k).incQuantidade(divisaoInteira);

                                }

                                pessoas.get(i).getVotos().remove(0);
                                qtdAux.set(i, qtdAux.get(i) - divisaoInteira);

                            }

                        } else {
                            //não tem decimal
                            pizzas.get(k).incQuantidade(qtdAux.get(i) / pessoas.get(i).getVotos().size());
                        }

                    }

                }

            }

        }

    }

    private void deRounding(){

        for(int i = 0; i < pizzas.size(); i++){

            pizzas.get(i).setQuantidade(Math.ceil(pizzas.get(i).getQuantidade()));

        }

    }

    private void definePrioridades(){

        deRounding();

        prioridades = new ArrayList<>();

        for(int i = 0; i < pizzas.size(); i++){

            prioridades.add(pizzas.get(i));

        }

        Collections.sort(prioridades);

    }

    private void defineRelacao(){

        relacaoDePizzas = new ArrayList<>();

        double tempPizzas = (double)qtdPizzas;

        int i = 0;

        while(tempPizzas > 0 && i < prioridades.size()){

            double divisao = prioridades.get(i).getQuantidade() / 8.0;

            int parteInteira = (int)Math.floor(divisao);

            double parteDecimal = Math.abs(divisao - parteInteira);

            if(parteDecimal < 0.25){

                if(parteInteira > 0){
                    divisao = Math.floor(divisao);
                }

                else{
                    divisao = parteInteira + 0.5;
                }

            }

            else{

                divisao = parteInteira + 0.5;

            }

            relacaoDePizzas.add(new Pizza(prioridades.get(i).getSabor(), divisao, prioridades.get(i).getPreco()));

            tempPizzas -= divisao;

            i++;

        }

    }

    private void definePrecoTotal(){

        DecimalFormat df = new DecimalFormat("#.00");

        precoTotal = 0;

        for(int i = 0; i < relacaoDePizzas.size(); i++){

            precoTotal+=relacaoDePizzas.get(i).getPreco()*relacaoDePizzas.get(i).getQuantidade();

        }

        precoTotal = Double.parseDouble(df.format(precoTotal).replace(",", "."));

    }

    private void definePrecoDividido(){

        DecimalFormat df = new DecimalFormat("#.00");

        precoDividido = precoTotal * 1/2; //Defina a fração de quanto do preço total será dividido entre os demais
        precoDividido = Double.parseDouble(df.format(precoDividido).replace(",", "."));

    }

    private void defineCota(){

        DecimalFormat df = new DecimalFormat("#.00");

        cota = Double.parseDouble(df.format(precoDividido / pedacos).replace(",", "."));

    }

    private void defineCotaPessoa(){

        DecimalFormat df = new DecimalFormat("#.00");

        for(int i = 0; i < pessoas.size(); i++){

            pessoas.get(i).setCota(Double.parseDouble(df.format(cota * pessoas.get(i).getPedacos()).replace(",", ".")));

        }

    }

    public ArrayList<Pessoa> getPessoas() {
        return pessoas;
    }

    public ArrayList<Pizza> getPizzas() {
        return pizzas;
    }

    public int getPedacos(){
        return pedacos;
    }

    public int getQtdPizzas(){
        return qtdPizzas;
    }

    public ArrayList<Pizza> getPrioridades() {
        return prioridades;
    }

    public ArrayList<Pizza> getRelacaoDePizzas() {
        return relacaoDePizzas;
    }

    public double getPrecoTotal(){
        return precoTotal;
    }

    public double getPrecoDividido(){
        return precoDividido;
    }

    public double getCota() {
        return cota;
    }

    public void setPessoas(ArrayList<Pessoa> pessoas) {
        this.pessoas = pessoas;
    }

    public void setPizzas(ArrayList<Pizza> pizzas) {
        this.pizzas = pizzas;
    }

    public void setPedacos(int pedacos) {
        this.pedacos = pedacos;
    }

    public void setQtdPizzas(int qtdPizzas) {
        this.qtdPizzas = qtdPizzas;
    }

    public void setPrioridades(ArrayList<Pizza> prioridades) {
        this.prioridades = prioridades;
    }

    public void setRelacaoDePizzas(ArrayList<Pizza> relacaoDePizzas) {
        this.relacaoDePizzas = relacaoDePizzas;
    }

    public void setPrecoTotal(double precoTotal) {
        this.precoTotal = precoTotal;
    }

    public void setPrecoDividido(double precoDividido) {
        this.precoDividido = precoDividido;
    }

    public void setCota(double cota) {
        this.cota = cota;
    }

    public void showPizzas(){

        for(int i = 0; i < prioridades.size(); i++){

            if(prioridades.get(i).getQuantidade() > 0){

                System.out.println("Sabor: " + prioridades.get(i).getSabor());
                System.out.println("Pedaços: " + prioridades.get(i).getQuantidade() + "\n");

            }

        }

        System.out.println("-----------------------\n");

    }

    public void showRelacao(){

        for(int i = 0; i < relacaoDePizzas.size(); i++){

            if(relacaoDePizzas.get(i).getQuantidade() > 0){

                System.out.println("Sabor: " + relacaoDePizzas.get(i).getSabor());
                System.out.println("Quantidade: " + relacaoDePizzas.get(i).getQuantidade()+ "\n");

            }

        }

        System.out.println("-----------------------\n");

    }

    public void showPessoas(){

        for(int i = 0; i < pessoas.size(); i++){

            System.out.println("Nome: " + pessoas.get(i).getNome());
            System.out.println("Quantidade de Pedaços: " + pessoas.get(i).getPedacos());
            System.out.println("Cota: R$" + pessoas.get(i).getCota() + "\n");

        }

        System.out.println("-----------------------\n");

    }

}
