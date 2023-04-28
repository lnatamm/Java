package CalculadoraDePizza;

import java.math.*;
import java.text.*;
import java.util.*;

public class Calculadora {

    private ArrayList<Pessoa> pessoas;

    private ArrayList<Pizza> pizzasSalgadas;

    private int pedacosSalgadas;

    private int qtdPizzasSalgadas;

    private ArrayList<Pizza> prioridadesSalgadas;

    private ArrayList<Pizza> relacaoDePizzasSalgadas;

    private ArrayList<Pizza> pizzasDoces;

    private int pedacosDoces;

    private int qtdPizzasDoces;

    private ArrayList<Pizza> prioridadesDoces;

    private ArrayList<Pizza> relacaoDePizzasDoces;

    private double precoTotal;

    private double precoDividido;

    private double cota;

    public Calculadora(ArrayList<Pessoa> pessoas){

        this.pessoas = pessoas;

        pizzasSalgadas = new ArrayList<Pizza>(Arrays.asList(
                //Inserir aqui as pizzas e os seus respectivos preços da seguinte forma: "new Pizza("Sabor", Preço)"
                new Pizza("Fala Baixo", 79.9),
                new Pizza("Siciliana", 80.9),
                new Pizza("Fala Mag", 81.9),
                new Pizza("Frango Catupiry", 67.9),
                new Pizza("Portuguesa", 71.9),
                new Pizza("Calabresa", 67.9),
                new Pizza("Californication", 67.9),
                new Pizza("Marguerita", 67.9),
                new Pizza("Mussarela", 67.9),
                new Pizza("Mango Chutney", 67.9),
                new Pizza("Frango Barbecue", 67.9),
                new Pizza("Calabresa Cheddar", 78.9),
                new Pizza("Fala Baixo Cheddar", 79.9),
                new Pizza("Queijos", 86.9),
                new Pizza("Cala Catu", 79.9)
        )
        );

        pizzasDoces = new ArrayList<Pizza>(Arrays.asList(
                new Pizza("Bisladen", 81.9),
                new Pizza("Chocobrothers", 78.9),
                new Pizza("Tworros", 71.9)
        )
        );

        definePedacosSalgadasTemp();

        defineQtdPizzasSalgadas();

        definePedacosSalgadasDef();

        incrementaPizzasSalgadas();

        definePrioridadesSalgadas();

        defineRelacaoSalgadas();

        definePedacosDocesTemp();

        defineQtdPizzasDoces();

        definePedacosDocesDef();

        incrementaPizzasDoces();

        definePrioridadesDoces();

        defineRelacaoDoces();

        definePrecoTotal();

        definePrecoTotal();

        definePrecoDividido();

        defineCota();

        defineCotaPessoa();

    }

    public Calculadora(){

        pessoas = new ArrayList<Pessoa>(Arrays.asList(
                //Inserir aqui as pessoas e os seus votos da seguinte forma: "new Pessoa("Nome", Quantidade de Pedaços, new ArrayList<String>(Arrays.asList("Voto1", "Voto2")))"
                new Pessoa("", 0, new ArrayList<String>(Arrays.asList("")), 0, new ArrayList<String>(Arrays.asList(""))),
                new Pessoa("", 0, new ArrayList<String>(Arrays.asList("")), 0, new ArrayList<String>(Arrays.asList(""))),
                new Pessoa("", 0, new ArrayList<String>(Arrays.asList("")), 0, new ArrayList<String>(Arrays.asList(""))),
                new Pessoa("", 0, new ArrayList<String>(Arrays.asList("")), 0, new ArrayList<String>(Arrays.asList(""))),
                new Pessoa("", 0, new ArrayList<String>(Arrays.asList("")), 0, new ArrayList<String>(Arrays.asList(""))),
                new Pessoa("", 0, new ArrayList<String>(Arrays.asList("")), 0, new ArrayList<String>(Arrays.asList(""))),
                new Pessoa("", 0, new ArrayList<String>(Arrays.asList("")), 0, new ArrayList<String>(Arrays.asList(""))),
                new Pessoa("", 0, new ArrayList<String>(Arrays.asList("")), 0, new ArrayList<String>(Arrays.asList(""))),
                new Pessoa("", 0, new ArrayList<String>(Arrays.asList("")), 0, new ArrayList<String>(Arrays.asList(""))),
                new Pessoa("", 0, new ArrayList<String>(Arrays.asList("")), 0, new ArrayList<String>(Arrays.asList(""))),
                new Pessoa("", 0, new ArrayList<String>(Arrays.asList("")), 0, new ArrayList<String>(Arrays.asList(""))),
                new Pessoa("", 0, new ArrayList<String>(Arrays.asList("")), 0, new ArrayList<String>(Arrays.asList(""))),
                new Pessoa("", 0, new ArrayList<String>(Arrays.asList("")), 0, new ArrayList<String>(Arrays.asList(""))),
                new Pessoa("", 0, new ArrayList<String>(Arrays.asList("")), 0, new ArrayList<String>(Arrays.asList(""))),
                new Pessoa("", 0, new ArrayList<String>(Arrays.asList("")), 0, new ArrayList<String>(Arrays.asList(""))),
                new Pessoa("", 0, new ArrayList<String>(Arrays.asList("")), 0, new ArrayList<String>(Arrays.asList(""))),
                new Pessoa("", 0, new ArrayList<String>(Arrays.asList("")), 0, new ArrayList<String>(Arrays.asList(""))),
                new Pessoa("", 0, new ArrayList<String>(Arrays.asList("")), 0, new ArrayList<String>(Arrays.asList(""))),
                new Pessoa("", 0, new ArrayList<String>(Arrays.asList("")), 0, new ArrayList<String>(Arrays.asList(""))),
                new Pessoa("", 0, new ArrayList<String>(Arrays.asList("")), 0, new ArrayList<String>(Arrays.asList(""))),
                new Pessoa("", 0, new ArrayList<String>(Arrays.asList("")), 0, new ArrayList<String>(Arrays.asList(""))),
                new Pessoa("", 0, new ArrayList<String>(Arrays.asList("")), 0, new ArrayList<String>(Arrays.asList("")))
        )
        );

        pizzasSalgadas = new ArrayList<Pizza>(Arrays.asList(
                //Inserir aqui as pizzas e os seus respectivos preços da seguinte forma: "new Pizza("Sabor", Preço)"
                new Pizza("Fala Baixo", 79.9),
                new Pizza("Siciliana", 80.9),
                new Pizza("Fala Mag", 81.9),
                new Pizza("Frango Catupiry", 67.9),
                new Pizza("Portuguesa", 71.9),
                new Pizza("Calabresa", 67.9),
                new Pizza("Californication", 67.9),
                new Pizza("Marguerita", 67.9),
                new Pizza("Mussarela", 67.9),
                new Pizza("Mango Chutney", 67.9),
                new Pizza("Frango Barbecue", 67.9),
                new Pizza("Calabresa Cheddar", 78.9),
                new Pizza("Fala Baixo Cheddar", 79.9),
                new Pizza("Queijos", 86.9),
                new Pizza("Cala Catu", 79.9)
        )
        );

        pizzasDoces = new ArrayList<Pizza>(Arrays.asList(
                new Pizza("Bisladen", 81.9),
                new Pizza("Chocobrothers", 78.9),
                new Pizza("Tworros", 71.9)
        )
        );

        definePedacosSalgadasTemp();

        defineQtdPizzasSalgadas();

        definePedacosSalgadasDef();

        incrementaPizzasSalgadas();

        definePrioridadesSalgadas();

        defineRelacaoSalgadas();

        definePedacosDocesTemp();

        defineQtdPizzasDoces();

        definePedacosDocesDef();

        incrementaPizzasDoces();

        definePrioridadesDoces();

        defineRelacaoDoces();

        definePrecoTotal();

        definePrecoTotal();

        definePrecoDividido();

        defineCota();

        defineCotaPessoa();

    }

    private void defineQtdPizzasSalgadas(){

        qtdPizzasSalgadas = Math.ceilDiv(pedacosSalgadas, 8);

    }

    private void definePedacosSalgadasTemp(){

        pedacosSalgadas = 0;

        for(int i = 0; i < pessoas.size(); i++){

            pedacosSalgadas += pessoas.get(i).getPedacosSalgadas();

        }

    }

    private void definePedacosSalgadasDef(){

        pedacosSalgadas = qtdPizzasSalgadas * 8;

    }

    private Pizza getPizzaSalgadas(String sabor){

        for(int i = 0; i < pizzasSalgadas.size(); i++){

            if(sabor.equals(pizzasSalgadas.get(i).getSabor())){
                return pizzasSalgadas.get(i);
            }

        }

        return null;

    }

    private void incrementaPizzasSalgadas(){

        ArrayList<Integer> qtdAux = new ArrayList<>();

        for(int i = 0; i < pessoas.size(); i++){

            qtdAux.add(pessoas.get(i).getPedacosSalgadas());

        }

        for(int i = 0; i < pessoas.size(); i++){

            for(int j = 0; j < pessoas.get(i).getVotosSalgadas().size(); j++){

                for(int k = 0; k < pizzasSalgadas.size(); k++){

                    if(pessoas.get(i).getVotosSalgadas().get(j).equals(pizzasSalgadas.get(k).getSabor())){

                        double divisao = qtdAux.get(i) / (pessoas.get(i).getVotosSalgadas().size() * 1.0);

                        BigDecimal bdValor = new BigDecimal(divisao);
                        if (bdValor.setScale(0, RoundingMode.DOWN).compareTo(bdValor) != 0) {
                            //tem decimal

                            if(pessoas.get(i).getVotosSalgadas().size() > 1){

                                int divisaoInteira;

                                if(pizzasSalgadas.get(k).getQuantidade() == getPizzaSalgadas(pessoas.get(i).getVotosSalgadas().get(1)).getQuantidade()){

                                    pizzasSalgadas.get(k).incQuantidade(divisao);
                                    getPizzaSalgadas(pessoas.get(i).getVotosSalgadas().get(1)).incQuantidade(divisao);
                                    pessoas.get(i).getVotosSalgadas().remove(1);
                                    break;

                                }

                                else if(pizzasSalgadas.get(k).getQuantidade() > getPizzaSalgadas(pessoas.get(i).getVotosSalgadas().get(1)).getQuantidade()){

                                    divisaoInteira = Math.ceilDiv(qtdAux.get(i), pessoas.get(i).getVotosSalgadas().size());
                                    pizzasSalgadas.get(k).incQuantidade(divisaoInteira);

                                }

                                else{

                                    divisaoInteira = Math.floorDiv(qtdAux.get(i), pessoas.get(i).getVotosSalgadas().size());
                                    pizzasSalgadas.get(k).incQuantidade(divisaoInteira);

                                }

                                pessoas.get(i).getVotosSalgadas().remove(0);
                                qtdAux.set(i, qtdAux.get(i) - divisaoInteira);

                            }

                        } else {
                            //não tem decimal
                            pizzasSalgadas.get(k).incQuantidade(qtdAux.get(i) / pessoas.get(i).getVotosSalgadas().size());
                        }

                    }

                }

            }

        }

    }

    private void deRoundingSalgadas(){

        for(int i = 0; i < pizzasSalgadas.size(); i++){

            pizzasSalgadas.get(i).setQuantidade(Math.ceil(pizzasSalgadas.get(i).getQuantidade()));

        }

    }

    private void definePrioridadesSalgadas(){

        deRoundingSalgadas();

        prioridadesSalgadas = new ArrayList<>();

        for(int i = 0; i < pizzasSalgadas.size(); i++){

            if(pizzasSalgadas.get(i).getQuantidade() > 0) {
                prioridadesSalgadas.add(pizzasSalgadas.get(i));
            }

        }

        Collections.sort(prioridadesSalgadas);

    }

    private void defineRelacaoSalgadas(){

        relacaoDePizzasSalgadas = new ArrayList<>();

        double tempPizzas = (double)qtdPizzasSalgadas;

        int i = 0;

        while(tempPizzas > 0 && i < prioridadesSalgadas.size()){

            double divisao = prioridadesSalgadas.get(i).getQuantidade() / 8.0;

            if(prioridadesSalgadas.size() == 1){
                divisao = 1;
            }

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

            relacaoDePizzasSalgadas.add(new Pizza(prioridadesSalgadas.get(i).getSabor(), divisao, prioridadesSalgadas.get(i).getPreco()));

            tempPizzas -= divisao;

            i++;

        }

    }

    private void defineQtdPizzasDoces(){

        qtdPizzasDoces = Math.ceilDiv(pedacosDoces, 8);

    }

    private void definePedacosDocesTemp(){

        pedacosDoces = 0;

        for(int i = 0; i < pessoas.size(); i++){

            pedacosDoces += pessoas.get(i).getPedacosDoces();

        }

    }

    private void definePedacosDocesDef(){

        pedacosDoces = qtdPizzasDoces * 8;

    }

    private Pizza getPizzaDoces(String sabor){

        for(int i = 0; i < pizzasDoces.size(); i++){

            if(sabor.equals(pizzasDoces.get(i).getSabor())){
                return pizzasDoces.get(i);
            }

        }

        return null;

    }

    private void incrementaPizzasDoces(){

        ArrayList<Integer> qtdAux = new ArrayList<>();

        for(int i = 0; i < pessoas.size(); i++){

            qtdAux.add(pessoas.get(i).getPedacosDoces());

        }

        for(int i = 0; i < pessoas.size(); i++){

            for(int j = 0; j < pessoas.get(i).getVotosDoces().size(); j++){

                for(int k = 0; k < pizzasDoces.size(); k++){

                    if(pessoas.get(i).getVotosDoces().get(j).equals(pizzasDoces.get(k).getSabor())){

                        double divisao = qtdAux.get(i) / (pessoas.get(i).getVotosDoces().size() * 1.0);

                        BigDecimal bdValor = new BigDecimal(divisao);
                        if (bdValor.setScale(0, RoundingMode.DOWN).compareTo(bdValor) != 0) {
                            //tem decimal

                            if(pessoas.get(i).getVotosDoces().size() > 1){

                                int divisaoInteira;

                                if(pizzasDoces.get(k).getQuantidade() == getPizzaDoces(pessoas.get(i).getVotosDoces().get(1)).getQuantidade()){

                                    pizzasDoces.get(k).incQuantidade(divisao);
                                    getPizzaDoces(pessoas.get(i).getVotosDoces().get(1)).incQuantidade(divisao);
                                    pessoas.get(i).getVotosDoces().remove(1);
                                    break;

                                }

                                else if(pizzasDoces.get(k).getQuantidade() > getPizzaDoces(pessoas.get(i).getVotosDoces().get(1)).getQuantidade()){

                                    divisaoInteira = Math.ceilDiv(qtdAux.get(i), pessoas.get(i).getVotosDoces().size());
                                    pizzasDoces.get(k).incQuantidade(divisaoInteira);

                                }

                                else{

                                    divisaoInteira = Math.floorDiv(qtdAux.get(i), pessoas.get(i).getVotosDoces().size());
                                    pizzasDoces.get(k).incQuantidade(divisaoInteira);

                                }

                                pessoas.get(i).getVotosDoces().remove(0);
                                qtdAux.set(i, qtdAux.get(i) - divisaoInteira);

                            }

                        } else {
                            //não tem decimal
                            pizzasDoces.get(k).incQuantidade(qtdAux.get(i) / pessoas.get(i).getVotosDoces().size());
                        }

                    }

                }

            }

        }

    }

    private void deRoundingDoces(){

        for(int i = 0; i < pizzasDoces.size(); i++){

            pizzasDoces.get(i).setQuantidade(Math.ceil(pizzasDoces.get(i).getQuantidade()));

        }

    }

    private void definePrioridadesDoces(){

        deRoundingDoces();

        prioridadesDoces = new ArrayList<>();

        for(int i = 0; i < pizzasDoces.size(); i++){

            if(pizzasDoces.get(i).getQuantidade() > 0){
                prioridadesDoces.add(pizzasDoces.get(i));
            }

        }

        Collections.sort(prioridadesDoces);

    }

    private void defineRelacaoDoces(){

        relacaoDePizzasDoces = new ArrayList<>();

        double tempPizzas = (double)qtdPizzasDoces;

        int i = 0;

        while(tempPizzas > 0 && i < prioridadesDoces.size()){

            double divisao = prioridadesDoces.get(i).getQuantidade() / 8.0;

            if(prioridadesDoces.size() == 1){
                divisao = 1;
            }

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

            relacaoDePizzasDoces.add(new Pizza(prioridadesDoces.get(i).getSabor(), divisao, prioridadesDoces.get(i).getPreco()));

            tempPizzas -= divisao;

            i++;

        }

    }

    private void definePrecoTotal(){

        DecimalFormat df = new DecimalFormat("#.00");

        precoTotal = 0;

        for(int i = 0; i < relacaoDePizzasSalgadas.size(); i++){

            precoTotal+=relacaoDePizzasSalgadas.get(i).getPreco()*relacaoDePizzasSalgadas.get(i).getQuantidade();

        }

        for(int i = 0; i < relacaoDePizzasDoces.size(); i++){

            precoTotal+=relacaoDePizzasDoces.get(i).getPreco()*relacaoDePizzasDoces.get(i).getQuantidade();

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

        if(!(pedacosSalgadas == 0 && pedacosDoces == 0)) {
            cota = Double.parseDouble(df.format(precoDividido / (pedacosSalgadas + pedacosDoces)).replace(",", "."));
        }
        else {
            cota = 0;
        }

    }

    private void defineCotaPessoa(){

        DecimalFormat df = new DecimalFormat("#.00");

        for(int i = 0; i < pessoas.size(); i++){

            pessoas.get(i).setCota(Double.parseDouble(df.format(cota * (pessoas.get(i).getPedacosSalgadas() + pessoas.get(i).getPedacosDoces())).replace(",", ".")));

        }

    }

    public ArrayList<Pessoa> getPessoas() {
        return pessoas;
    }

    public ArrayList<Pizza> getPizzasSalgadas() {
        return pizzasSalgadas;
    }

    public int getPedacosSalgadas(){
        return pedacosSalgadas;
    }

    public int getQtdPizzasSalgadas(){
        return qtdPizzasSalgadas;
    }

    public ArrayList<Pizza> getPrioridadesSalgadas() {
        return prioridadesSalgadas;
    }

    public ArrayList<Pizza> getRelacaoDePizzasSalgadas() {
        return relacaoDePizzasSalgadas;
    }

    public ArrayList<Pizza> getPizzasDoces() {
        return pizzasDoces;
    }

    public int getPedacosDoces() {
        return pedacosDoces;
    }

    public int getQtdPizzasDoces() {
        return qtdPizzasDoces;
    }

    public ArrayList<Pizza> getPrioridadesDoces() {
        return prioridadesDoces;
    }

    public ArrayList<Pizza> getRelacaoDePizzasDoces() {
        return relacaoDePizzasDoces;
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

    public void setPizzasSalgadas(ArrayList<Pizza> pizzasSalgadas) {
        this.pizzasSalgadas = pizzasSalgadas;
    }

    public void setPedacosSalgadas(int pedacosSalgadas) {
        this.pedacosSalgadas = pedacosSalgadas;
    }

    public void setQtdPizzasSalgadas(int qtdPizzasSalgadas) {
        this.qtdPizzasSalgadas = qtdPizzasSalgadas;
    }

    public void setPrioridadesSalgadas(ArrayList<Pizza> prioridadesSalgadas) {
        this.prioridadesSalgadas = prioridadesSalgadas;
    }

    public void setRelacaoDePizzasSalgadas(ArrayList<Pizza> relacaoDePizzasSalgadas) {
        this.relacaoDePizzasSalgadas = relacaoDePizzasSalgadas;
    }

    public void setPizzasDoces(ArrayList<Pizza> pizzasDoces) {
        this.pizzasDoces = pizzasDoces;
    }

    public void setPedacosDoces(int pedacosDoces) {
        this.pedacosDoces = pedacosDoces;
    }

    public void setQtdPizzasDoces(int qtdPizzasDoces) {
        this.qtdPizzasDoces = qtdPizzasDoces;
    }

    public void setPrioridadesDoces(ArrayList<Pizza> prioridadesDoces) {
        this.prioridadesDoces = prioridadesDoces;
    }

    public void setRelacaoDePizzasDoces(ArrayList<Pizza> relacaoDePizzasDoces) {
        this.relacaoDePizzasDoces = relacaoDePizzasDoces;
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

    public void showPizzasSalgadas(){

        for(int i = 0; i < prioridadesSalgadas.size(); i++){

            if(prioridadesSalgadas.get(i).getQuantidade() > 0){

                System.out.println("Sabor: " + prioridadesSalgadas.get(i).getSabor());
                System.out.println("Pedaços: " + prioridadesSalgadas.get(i).getQuantidade() + "\n");

            }

        }

        System.out.println("-----------------------\n");

    }

    public void showRelacaoSalgadas(){

        for(int i = 0; i < relacaoDePizzasSalgadas.size(); i++){

            if(relacaoDePizzasSalgadas.get(i).getQuantidade() > 0){

                System.out.println("Sabor: " + relacaoDePizzasSalgadas.get(i).getSabor());
                System.out.println("Quantidade: " + relacaoDePizzasSalgadas.get(i).getQuantidade()+ "\n");

            }

        }

        System.out.println("-----------------------\n");

    }

    public void showPizzasDoces(){

        for(int i = 0; i < prioridadesDoces.size(); i++){

            if(prioridadesDoces.get(i).getQuantidade() > 0){

                System.out.println("Sabor: " + prioridadesDoces.get(i).getSabor());
                System.out.println("Pedaços: " + prioridadesDoces.get(i).getQuantidade() + "\n");

            }

        }

        System.out.println("-----------------------\n");

    }

    public void showRelacaoDoces(){

        for(int i = 0; i < relacaoDePizzasDoces.size(); i++){

            if(relacaoDePizzasDoces.get(i).getQuantidade() > 0){

                System.out.println("Sabor: " + relacaoDePizzasDoces.get(i).getSabor());
                System.out.println("Quantidade: " + relacaoDePizzasDoces.get(i).getQuantidade()+ "\n");

            }

        }

        System.out.println("-----------------------\n");

    }

    public void showPessoas(){

        for(int i = 0; i < pessoas.size(); i++){

            System.out.println("Nome: " + pessoas.get(i).getNome());
            System.out.println("Quantidade de Pedaços Salgados: " + pessoas.get(i).getPedacosSalgadas());
            System.out.println("Quantidade de Pedaços Doces:" + pessoas.get(i).getPedacosDoces());
            System.out.println("Cota: R$" + pessoas.get(i).getCota() + "\n");

        }

        System.out.println("-----------------------\n");

    }

}
