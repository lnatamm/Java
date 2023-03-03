public class Proposicao {

    private Character nome;

    private Boolean valor;

    public Proposicao(){

        this.nome = '0';

        this.valor = false;

    }

    public Proposicao(Boolean valor){

        this.nome = '0';

        this.valor = valor;

    }

    public Proposicao(Character nome){

        this.nome = nome;

        this.valor = false;

    }

    public Proposicao(Character nome, Boolean valor){

        this.nome = nome;

        this.valor = valor;

    }

    public Character getNome() {

        return nome;

    }

    public Boolean getValor() {

        return valor;

    }

    public void setNome(Character nome) {

        this.nome = nome;

    }

    public void setValor(Boolean valor) {

        this.valor = valor;

    }

}