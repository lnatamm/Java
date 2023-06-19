package Camisetas;

public class Camisa {

    private String cor;

    private String tamanho;

    public Camisa(String cor, String tamanho){
        this.cor = cor;
        this.tamanho = tamanho;
    }

    public String getCor(){
        return cor;
    }

    public String getTamanho(){
        return tamanho;
    }

    public void setCor(String cor){
        this.cor = cor;
    }

    public void setTamanho(String tamanho){
        this.tamanho = tamanho;
    }

}
