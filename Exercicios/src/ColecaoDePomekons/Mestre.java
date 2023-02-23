package ColecaoDePomekons;
public class Mestre {

    private ListaEstatica<Pomekon> listaPomekons = new ListaEstatica();

    public Mestre(ListaEstatica<Pomekon> colecao){

        this.listaPomekons = colecao;

    }

    public Mestre(){

        this.listaPomekons.clear();

    }

    public ListaEstatica<Pomekon> getListaPomekons(){

        return this.listaPomekons;

    }

    public void setColecao(ListaEstatica<Pomekon> colecao){

        this.listaPomekons = colecao;

    }

    public void addPomekon(Pomekon pomekon){

        this.listaPomekons.add(pomekon);

    }

    public ListaHash<String> getColecaoPomekons(){

        ListaHash<String> colecaoPomekons = new ListaHash();

        for(int i = 0; i < listaPomekons.size(); i++){

            colecaoPomekons.add(listaPomekons.get(i).getNome());

        }

        return colecaoPomekons;

    }

}

