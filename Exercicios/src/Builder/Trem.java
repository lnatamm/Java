package Builder;

public class Trem {

    private String serie;
    private int nVagoes;
    private int nPassageiros;

    public Trem(){
        serie = "";
        nVagoes = 1;
        nPassageiros = 0;
    }

    public Trem(String serie, int nVagoes, int nPassageiros){
        this.serie = serie;
        this.nVagoes = nVagoes;
        this.nPassageiros = nPassageiros;
    }

    public String getSerie() {
        return serie;
    }

    public int getnVagoes() {
        return nVagoes;
    }

    public int getnPassageiros() {
        return nPassageiros;
    }

}
