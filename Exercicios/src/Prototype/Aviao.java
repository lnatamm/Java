package Prototype;

public class Aviao {

    private String modelo;

    private int nPassageiros;

    public Aviao(){
        modelo = "boing";
        nPassageiros = 0;
    }

    public boolean voar(){
        return true;
    }

    public boolean pousar(){
        return true;
    }

    public String getModelo() {
        return modelo;
    }

    public int getnPassageiros() {
        return nPassageiros;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setnPassageiros(int nPassageiros) {
        this.nPassageiros = nPassageiros;
    }

    public Aviao clone(){
        Aviao clone = new Aviao();
        clone.setModelo(modelo);
        clone.setnPassageiros(nPassageiros);
        return clone;
    }

}
