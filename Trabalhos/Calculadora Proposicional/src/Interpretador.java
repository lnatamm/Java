import java.util.HashSet;

public class Interpretador {

    private String formula;

    //Construtores
    public Interpretador(){

        this.formula = "";

    }

    public Interpretador(String formula){

        this.formula = formula;

    }

    //Getters
    public String getFormula(){

        return this.formula;

    }

    //Setters
    public void setFormula(String formula){

        this.formula = formula;

    }

    //Métodos
    public boolean isFBF(){ //Checa se a fórmula é bem formulada(FBF) ou não

        int cnt = 0; //Contador de parenteses

        HashSet<String> operadores = new HashSet<String>();
        operadores.add("~");
        operadores.add("^");
        operadores.add("v");
        operadores.add("→");
        operadores.add("↔");

        HashSet<String> naoProposicoes = new HashSet<String>();

        for(String i : operadores){

            naoProposicoes.add(i);

        }

        naoProposicoes.add("(");
        naoProposicoes.add(")");

        String[] caracteres = this.formula.split("");

        try { //Tratamento de excessão para as futuras checagens que podem acatar em IndexOutOfBounds

            for (int i = 0; i < caracteres.length; i++) {

                if (cnt < 0) { //Caso a diferença de parênteses seja negativa é evidente que a fórmula não é uma FBF

                    return false;

                }

                if (cnt <= 1) {

                    if(operadores.contains(caracteres[i])){

                        if(operadores.contains(caracteres[i + 1])){ //Caso haja 2 operadores em sequência é evidente que a fórmula não é uma FBF

                            return false;

                        }

                    }

                    if(!(naoProposicoes.contains(caracteres[i]))){

                        if(!(naoProposicoes.contains(caracteres[i + 1]))){ /*Caso haja 2 proposições em sequência sem nenhum operador entre elas
                                                                             é evidente que a fórmula não é uma FBF*/
                            return false;

                        }

                    }

                    if (caracteres[i].equals("(")) { //Caso um parêntese seja aberto é somado 1 ao contador de parênteses

                        cnt++;

                        if(naoProposicoes.contains(caracteres[i + 1])){

                            return false;

                        }

                    }

                    if (caracteres[i].equals(")")) { //Caso um parêntese seja fechado é subtraido 1 ao contador de parêntes

                        cnt--;

                        if(naoProposicoes.contains(caracteres[i - 1])){

                            return false;

                        }

                    }

                }

            }

        }

        catch (IndexOutOfBoundsException e){ //Em qualquer caso em que caia no "catch" é evidente que a fórmula não é uma FBF

            return false;

        }

        if(cnt == 0){ /*Caso não haja nenhum erro nas checagens anteriores e a diferença de parêntes seja igual a 0, é evidente que a fórmula
                        é evidente que a fórmula é uma FBF*/
            return true;

        }

        else{ //Caso o contrário é evidente que a fórmula não é uma FBF

            return false;

        }

    }

}
