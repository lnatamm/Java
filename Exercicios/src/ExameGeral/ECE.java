package ExameGeral;

import java.util.ArrayList;
import java.util.Collections;

public class ECE {

    private ArrayList<Cidadao> cidadaos;

    public ECE(ArrayList<Cidadao> cidadaos){
        this.cidadaos = cidadaos;
    }

    public ECE(){
        cidadaos = new ArrayList<>();
    }

    public ArrayList<Cidadao> getCidadaos(){
        return cidadaos;
    }

    public void setCidadaos(ArrayList<Cidadao> cidadaos){
        this.cidadaos = cidadaos;
    }

    public void add(Cidadao cidadao){
        cidadaos.add(cidadao);
    }

    public Cidadao get(int i){
        return cidadaos.get(i);
    }

    public void sort(){
        Collections.sort(cidadaos, new Ordenador());
    }

}
