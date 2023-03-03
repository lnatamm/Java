import java.util.*;

public class Interpretador {

    private String formula;

    private ArrayList<String> caracteres;

    //Construtores
    public Interpretador(){

        this.formula = "";

        defineCaracteres();

    }

    public Interpretador(String formula){

        this.formula = formula;

        defineCaracteres();

    }

    //Getters
    public String getFormula(){

        return this.formula;

    }

    public ArrayList<String> getCaracteres(){

        return this.caracteres;

    }

    //Setters
    public void setFormula(String formula){

        this.formula = formula;

    }

    public void setCaracteres(ArrayList<String> caracteres){

        this.caracteres = caracteres;

    }

    //Métodos

    private void defineCaracteres(){ //Define os caracteres

        String[] caracteres = this.formula.split("");

        this.caracteres = new ArrayList<String>();

        for(String i : caracteres){

            if(!i.equals(" ")) { //Ignora todos os espaços da fórmula

                this.caracteres.add(i);

            }

        }

    }

}
