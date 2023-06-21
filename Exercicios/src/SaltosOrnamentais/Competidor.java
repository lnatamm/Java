package SaltosOrnamentais;

public class Competidor {

    private String nome;

    private Salto salto;

    private double nota;

    public Competidor(){
        nome = "";
        nota = 0;
    }

    public Competidor(String nome){
        this.nome = nome;
        nota = 0;
    }

    public String getNome(){
        return nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public Salto getSalto(){
        return salto;
    }

    public void setSalto(Salto salto){
        this.salto = salto;
    }

    public double getNota(){
        return nota;
    }

    public void setNota(double nota){
        this.nota = nota;
    }

}
