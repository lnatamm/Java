package CalculadoraDePizza;

import java.util.ArrayList;

public class Pessoa {

    private String nome;

    private int pedacos;

    private double cota;

    private ArrayList<String> votos;

    public Pessoa(String nome, int pedacos, ArrayList<String> votos){

        this.nome = nome;
        this.pedacos = pedacos;
        cota = 0;
        this.votos = votos;

    }

    public void decPedacos(int pedacos){
        this.pedacos -= pedacos;
    }

    public String getNome(){
        return nome;
    }

    public int getPedacos(){
        return pedacos;
    }

    public double getCota(){
        return cota;
    }

    public ArrayList<String> getVotos(){
        return votos;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public void setPedacos(int pedacos){
        this.pedacos = pedacos;
    }

    public void setCota(double cota){
        this.cota = cota;
    }

    public void setVotos(ArrayList<String> votos){
        this.votos = votos;
    }

}
