package ExameGeral;

import java.util.Comparator;

public class Ordenador implements Comparator<Cidadao> {

    public int compare(Cidadao c1, Cidadao c2){

        return c2.getNota() - c1.getNota();

    }

}
