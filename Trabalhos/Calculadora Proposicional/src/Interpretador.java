public class Interpretador {

    private String proposicao;

    public Interpretador(){

        this.proposicao = "";

    }

    public Interpretador(String proposicao){

        this.proposicao = proposicao;

    }

    public String getProposicao(){

        return this.proposicao;

    }

    public void setProposicao(String proposicao){

        this.proposicao = proposicao;

    }

    private boolean isFBF(){return false;}

}
