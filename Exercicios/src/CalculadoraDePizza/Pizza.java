package CalculadoraDePizza;
//Last Commit nesse repositório
public class Pizza implements Comparable<Pizza>{

    private String sabor;

    private double quantidade;

    private double preco;

    public Pizza(String sabor, double preco){

        this.sabor = sabor;
        quantidade = 0;
        this.preco = preco;

    }

    public Pizza(String sabor, double quantidade, double preco){

        this.sabor = sabor;
        this.quantidade = quantidade;
        this.preco = preco;

    }

    public String getSabor(){
        return sabor;
    }

    public double getQuantidade(){
        return quantidade;
    }

    public double getPreco(){
        return preco;
    }

    public void setSabor(String sabor){
        this.sabor = sabor;
    }

    public void setQuantidade(double quantidade){
        this.quantidade = quantidade;
    }

    public void setPreco(double preco){
        this.preco = preco;
    }

    public void incQuantidade(double quantidade){
        this.quantidade += quantidade;
    }

    @Override
    public int compareTo(Pizza pizza2) {

        return (int) pizza2.quantidade - (int) quantidade;

    }

}
