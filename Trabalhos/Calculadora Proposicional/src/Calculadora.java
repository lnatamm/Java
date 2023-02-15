import java.util.ArrayList;
import java.util.InputMismatchException;

public class Calculadora {

    private Interpretador interpretador;

    private String resposta;

    private ArrayList<String> operadores;

    private String negador;

    //Construtores

    public Calculadora(){

        this.interpretador = new Interpretador();

        this.resposta = "";

        defineOperadores();

        this.negador = "~";

    }

    public Calculadora(Interpretador interpretador){

        this.interpretador = interpretador;

        defineOperadores();

        this.negador = "~";

        tableux();

    }

    public Calculadora(Interpretador interpretador, ArrayList<String> operadores, String negador){

        this.interpretador = interpretador;

        this.operadores = operadores;

        this.negador = negador;

        tableux();

    }

    //Getters

    public Interpretador getInterpretador(){

        return this.interpretador;

    }

    public String getResposta(){

        return this.resposta;

    }

    public ArrayList<String> getOperadores(){

        return this.operadores;

    }

    //Setters

    public void setInterpretador(Interpretador interpretador){

        this.interpretador = interpretador;

    }

    public void setResposta(String resposta){

        this.resposta = resposta;

    }

    public void setOperadores(ArrayList<String> operadores){

        this.operadores = operadores;

    }

    //Métodos

    private void defineOperadores(){ //Define os operadores

        this.operadores = new ArrayList<String>();
        this.operadores.add("^");
        this.operadores.add("v");
        this.operadores.add("→");
        this.operadores.add("↔");

    }

    private boolean isFBF(){ //Checa se a fórmula é bem formulada(FBF) ou não

        int cnt = 0; //Contador de parenteses

        ArrayList<String> naoProposicoes = new ArrayList<String>();

        for(String i : this.operadores){

            naoProposicoes.add(i);

        }

        naoProposicoes.add("(");
        naoProposicoes.add(")");

        //Tratamento de excessão para as futuras checagens que podem acatar em IndexOutOfBounds

        for (int i = 0; i < this.interpretador.getCaracteres().size(); i++) {

            if (cnt < 0) { //Caso a diferença de parênteses seja negativa é evidente que a fórmula não é uma FBF

                return false;

            }

            if (cnt <= 1) {

                if(this.operadores.contains(this.interpretador.getCaracteres().get(i))){
                    try {

                        if (this.operadores.contains(this.interpretador.getCaracteres().get(i + 1))) { /*Caso haja 2 operadores em sequência é
                                                                                                         evidente que a fórmula não é uma FBF*/

                            return false;

                        }

                    }

                    catch (IndexOutOfBoundsException e){ //Tratamento de excessão IndexOutOfBounds, caso entre é evidente que não é uma FBF

                        return false;

                    }

                }

                if(!(naoProposicoes.contains(this.interpretador.getCaracteres().get(i))) && !(this.interpretador.getCaracteres().get(i).equals(this.negador))){

                    try {

                        if (!(naoProposicoes.contains(this.interpretador.getCaracteres().get(i + 1)))) { /*Caso haja 2 proposições em sequência
                                                                                                           sem nenhum operador entre ela é
                                                                                                           evidente que a fórmula não é uma FBF*/
                            return false;

                        }

                    }

                    catch (IndexOutOfBoundsException e){ //Tratamento de excessão IndexOutOfBounds, caso entre é evidente que é uma FBF

                        return true;

                    }

                }

                if(this.interpretador.getCaracteres().get(i).equals(this.negador)){

                    try{

                        if(naoProposicoes.contains(this.interpretador.getCaracteres().get(i + 1))){ /*Caso haja uma não proposição seguida de
                                                                                                      uma negação é evidente que a fórmula
                                                                                                      não é uma FBF*/

                            return false;

                        }

                    }

                    catch (IndexOutOfBoundsException e){ //Tratamento de excessão IndexOutOfBounds, caso entre é evidente que é uma FBF

                        return false;

                    }

                }

                if (this.interpretador.getCaracteres().get(i).equals("(")) { /*Caso um parêntese seja aberto é somado 1 ao contador de
                                                                               parênteses*/

                    cnt++;

                    try {

                        if (naoProposicoes.contains(this.interpretador.getCaracteres().get(i + 1))) {

                            return false;

                        }

                    }

                    catch (IndexOutOfBoundsException e){ //Tratamento de excessão IndexOutOfBounds, caso entre é evidente que não é uma FBF

                        return false;

                    }

                }

                if (this.interpretador.getCaracteres().get(i).equals(")")) { /*Caso um parêntese seja fechado é subtraido 1 ao contador de
                                                                               parêntes*/

                    cnt--;


                    try {

                        if (naoProposicoes.contains(this.interpretador.getCaracteres().get(i - 1))) {

                            return false;

                        }

                    }

                    catch (IndexOutOfBoundsException e){ //Tratamento de excessão IndexOutOfBounds, caso entre é evidente que não é uma FBF

                        return false;

                    }

                }

            }

        }

        if(cnt == 0){ /*Caso não haja nenhum erro nas checagens anteriores e a diferença de parêntes seja igual a 0, é evidente que a fórmula
                        é evidente que a fórmula é uma FBF*/
            return true;

        }

        else{ //Caso o contrário é evidente que a fórmula não é uma FBF

            return false;

        }

    }

    private void tableux() throws InputMismatchException { //Passa a fórmula pelo método de Tableux

        if(isFBF()){ //Checa se a fórmula é ou não uma FBF antes de se iniciar as operações

            this.resposta = "Tautologia";

        }

        else {

            throw new InputMismatchException("A fórmula não é uma FBF(Fórmula Bem Formulada)");

        }

    }

    public void calcular(){

        tableux();

    }

}
