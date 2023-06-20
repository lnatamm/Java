package Lanche;

public class Pedido {

    private int codigo;

    private int quantidade;

    public Pedido(int codigo, int quantidade){
        this.codigo = codigo;
        this.quantidade = quantidade;
    }

    public void setCodigo(int codigo){
        this.codigo = codigo;
    }

    public void setQuantidade(int quantidade){
        this.quantidade = quantidade;
    }

    public int getCodigo(){
        return codigo;
    }

    public int getQuantidade(){
        return quantidade;
    }

    public double valorTotal(Cardapio c) {
        double total = 0;
        total = c.getLista(codigo).getPreco() * quantidade;
        return total;
    }

}
