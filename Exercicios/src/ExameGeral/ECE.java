package ExameGeral;

import java.util.ArrayList;
import java.util.Collections;

public class ECE {

    private ArrayList<Cidadao> cidadaos;

    public ECE(ArrayList<Cidadao> cidadaos){

        this.cidadaos = cidadaos;

    }

    public ECE(){

        this.cidadaos = new ArrayList<>();

    }

    public ArrayList<Cidadao> getCidadaos(){

        return this.cidadaos;

    }

    public void setCidadaos(ArrayList<Cidadao> cidadaos){

        this.cidadaos = cidadaos;

    }

    public void add(Cidadao cidadao){

        this.cidadaos.add(cidadao);

    }

    public Cidadao get(int i){

        return this.cidadaos.get(i);

    }

    public void sort(){

        Collections.sort(this.cidadaos, new Ordenador());

    }

}
