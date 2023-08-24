package Builder;

public class TremBuilder {
    private String serie;
    private int nVagoes;
    private int nPassageiros;

    public TremBuilder(){

    }

    public Trem toTrem() throws Exception{
        validarTrem();
        iniciliazarVariaveis();
        return new Trem(serie, nVagoes, nPassageiros);
    }

    private void validarTrem() throws Exception{
        if(serie == null || serie == ""){
            throw new Exception();
        }
    }

    private void iniciliazarVariaveis(){
        if(serie == null){
            serie = "";
        }
    }

    public TremBuilder comSerie(String serie) {
        this.serie = serie;
        return this;
    }

    public TremBuilder comNVagoes(int nVagoes) {
        this.nVagoes = nVagoes;
        return this;
    }

    public TremBuilder comNPassageiros(int nPassageiros) {
        this.nPassageiros = nPassageiros;
        return this;
    }

}
