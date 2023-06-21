package PulaSapo;

import java.util.*;
public class Fase {

    private Sapo sapo = new Sapo();

    private ArrayList<Cano> canos;

    public Fase(Sapo sapo){
        this.sapo = sapo;
        canos = new ArrayList<>();
    }

    public Sapo getSapo(){
        return sapo;
    }

    public void setSapo(Sapo sapo) {
        this.sapo = sapo;
    }

    public Cano getCano(int i){
        return canos.get(i);
    }

    public void setCano(int i, Cano c){
        canos.set(i, c);
    }

    public void addCano(Cano c){
        canos.add(c);
    }

    public boolean testaSapo(){
        for(int i = 1; i < canos.size(); i++){
            if(sapo.getTamanhoPulo() < Math.abs(canos.get(i).getTamanhoCano() - canos.get(i - 1).getTamanhoCano())){
                return false;
            }
        }
        return true;
    }

    public void sapoGanha(){
        if(testaSapo()) System.out.println("YOU WIN");
        else System.out.println("GAME OVER");
    }

}
