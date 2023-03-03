import java.util.*;

public class Calculadora {

    private Interpretador interpretador;

    private String resposta;

    private ArrayList<String> operadores;

    private String negador;

    private ArrayList<Proposicao> proposicoes;

    //Construtores

    public Calculadora(){

        this.interpretador = new Interpretador();

        this.resposta = "";

        defineOperadores();

        this.negador = "~";

        this.proposicoes = new ArrayList<Proposicao>();

    }

    public Calculadora(Interpretador interpretador){

        this.interpretador = interpretador;

        defineOperadores();

        this.negador = "~";

        this.proposicoes = new ArrayList<Proposicao>();

        if(isFBF()){

            recolherProposicoes();

        }

    }

    public Calculadora(Interpretador interpretador, ArrayList<String> operadores, String negador){

        this.interpretador = interpretador;

        this.operadores = operadores;

        this.negador = negador;

        isTrue();

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

    public ArrayList<Proposicao> getProposicoes() {

        return proposicoes;

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

    public void setProposicoes(ArrayList<Proposicao> proposicoes) {

        this.proposicoes = proposicoes;

    }

    //Métodos

    private void defineOperadores(){ //Define os operadores

        this.operadores = new ArrayList<String>();
        this.operadores.add("∧");
        this.operadores.add("∨");
        this.operadores.add("→");
        this.operadores.add("↔");

    }

    public void calcula(){

        if(isFBF()){

            defineProposicoes();

            if(isTrue()){

                this.resposta = "Verdadeira";

            }

            else {

                this.resposta = "Falsa";

            }

        }

        else {

            throw new InputMismatchException("A fórmula não é uma FBF");

        }

    }

    private boolean isFBF(){ //Checa se a fórmula é bem formulada(FBF) ou não

        try {

            for (int i = 0; i < this.interpretador.getCaracteres().size(); i++) {

                if(Character.isDigit(this.interpretador.getCaracteres().get(i).charAt(0))){

                    throw new InputMismatchException();

                }

            }

        }

        catch (InputMismatchException e){

            return false;

        }

        int cnt = 0; //Contador de parenteses

        //Tratamento de excessão para as futuras checagens que podem acatar em IndexOutOfBounds

        for (int i = 0; i < this.interpretador.getCaracteres().size(); i++) {

            if (cnt < 0) { //Caso a diferença de parênteses seja negativa é evidente que a fórmula não é uma FBF

                return false;

            }

            if (cnt >= 0) {

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

                if(Character.isLetter(this.interpretador.getCaracteres().get(i).charAt(0))){

                    try {

                        if (Character.isLetter(this.interpretador.getCaracteres().get(i + 1).charAt(0)) || this.interpretador.getCaracteres().get(i + 1).equals(this.negador)) {
                                                                                                           /*Caso haja 2 proposições em sequência
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

                        if(!Character.isLetter(this.interpretador.getCaracteres().get(i + 1).charAt(0)) && !this.interpretador.getCaracteres().get(i + 1).equals("(")){ /*Caso haja uma não proposição seguida de
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

                        if (!Character.isLetter(this.interpretador.getCaracteres().get(i + 1).charAt(0)) && !this.interpretador.getCaracteres().get(i + 1).equals("(")) {

                            if(!this.interpretador.getCaracteres().get(i + 1).equals(this.negador)) {

                                return false;

                            }

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

                        if ((!Character.isLetter(this.interpretador.getCaracteres().get(i - 1).charAt(0)) && !this.interpretador.getCaracteres().get(i - 1).equals(")")) || Character.isLetter(this.interpretador.getCaracteres().get(i + 1).charAt(0))) {

                            return false;

                        }

                    }

                    catch (IndexOutOfBoundsException e){ //Tratamento de excessão IndexOutOfBounds, caso entre é evidente que não é uma FBF



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

    private void recolherProposicoes(){

        ArrayList<Character> letras = new ArrayList<Character>();

        for(int i = 0; i < this.interpretador.getCaracteres().size(); i++){

            if(Character.isLetter(this.interpretador.getCaracteres().get(i).charAt(0))){

                if(!letras.contains(this.interpretador.getCaracteres().get(i).charAt(0))) {

                    letras.add(this.interpretador.getCaracteres().get(i).charAt(0));

                }

            }

        }

        for(Character i : letras){

            Proposicao p = new Proposicao(i);

            this.proposicoes.add(p);

        }

    }

    private void defineProposicoes(){

        Scanner sc = new Scanner(System.in);

        try {

            for (Proposicao i : this.proposicoes) {

                System.out.print(i.getNome() + ": ");

                String valor = sc.nextLine();

                if(!(valor.equals("V") || valor.equals("v") || valor.equals("F") || valor.equals("f") || valor.equals("true") || valor.equals("false") || valor.equals("True") || valor.equals("False"))){

                    throw new InputMismatchException();

                }

                if(valor.equals("V") || valor.equals("v") || valor.equals("true") || valor.equals("True")){

                    i.setValor(true);

                }

                if(valor.equals("F") || valor.equals("f") || valor.equals("false") || valor.equals("False")){

                    i.setValor(false);

                }

                //i.setValor(Boolean.parseBoolean(valor));

            }

        }

        catch (InputMismatchException e){

            System.out.println("Insira apenas valores 'V' ou 'true' ou 'F' ou 'false'!");

            defineProposicoes();

        }

    }

    private boolean isTrue() { //Passa a fórmula pelo método de Tableux

        this.interpretador = new Interpretador(this.interpretador.getFormula());

        int ii = 0;

        while(ii < this.interpretador.getCaracteres().size()){

            if(this.getInterpretador().getCaracteres().get(ii).equals("(")){

                executaParenteses();

                ii = 0;

            }

            else {

                ii++;

            }

        }

        ArrayList<String> operadores = new ArrayList<String>();

        ArrayList<Proposicao> proposicoes = new ArrayList<Proposicao>();

        for(int i = 0; i < this.interpretador.getCaracteres().size(); i++){

            if(this.interpretador.getCaracteres().get(i).equals("~")){

                Proposicao n;

                if(this.interpretador.getCaracteres().get(i + 1).length() > 1){
                    n = new Proposicao(!Boolean.parseBoolean(this.interpretador.getCaracteres().get(i + 1)));
                }

                else {
                    n = new Proposicao(this.interpretador.getCaracteres().get(i + 1).charAt(0));
                    n.setValor(!getProposicao(this.interpretador.getCaracteres().get(i + 1).charAt(0)).getValor());
                }

                proposicoes.add(n);

                this.interpretador.getCaracteres().remove(i);

            }

            else if(Character.isLetter(this.interpretador.getCaracteres().get(i).charAt(0))){

                if(this.interpretador.getCaracteres().get(i).length() > 1) {

                    proposicoes.add(new Proposicao(this.interpretador.getCaracteres().get(i).charAt(0),Boolean.parseBoolean(this.interpretador.getCaracteres().get(i))));

                }

                else{

                    proposicoes.add(getProposicao(this.interpretador.getCaracteres().get(i).charAt(0)));

                }

            }

            else{

                operadores.add(this.interpretador.getCaracteres().get(i));

            }

        }

        boolean resultado;

        try {

            resultado = calcula(proposicoes.get(0).getValor(), operadores.get(0).charAt(0), proposicoes.get(1).getValor());

        }

        catch (IndexOutOfBoundsException e){

            resultado = proposicoes.get(0).getValor();

        }

        for (int i = 1; i < proposicoes.size() - 1; i++) {

            try {

                resultado = calcula(resultado, operadores.get(i).charAt(0), proposicoes.get(i + 1).getValor());

            } catch (IndexOutOfBoundsException e) {

            }

        }

        return resultado;

    }

    public void executaParenteses(){

        int comecoParentese = 0;
        int finalParentese = 0;

        ArrayList<String> parentese = new ArrayList<String>();

        ArrayList<Proposicao> propParentese = new ArrayList<Proposicao>();

        ArrayList<String> opParentese = new ArrayList<String>();

        int size = this.interpretador.getCaracteres().size();

        try {

            for(int i = 0; i < size; i++){

                if(this.interpretador.getCaracteres().get(i).equals("(")){

                    comecoParentese = i;

                }

            }

            finalParentese = comecoParentese;

            while (!this.interpretador.getCaracteres().get(finalParentese).equals(")")) {

                finalParentese++;

            }

            for (int i = comecoParentese; i < finalParentese - 1; i++) {

                parentese.add(this.interpretador.getCaracteres().get(i + 1));

            }

            int controleNegacao = 0;

            for(int i = 0; i < parentese.size(); i++){

                controleNegacao = i;

                if(parentese.get(i).equals("~")){

                    Proposicao n;

                    if(parentese.get(i + 1).length() > 1){
                        n = new Proposicao(!Boolean.parseBoolean(parentese.get(i + 1)));
                    }

                    else {

                        n = new Proposicao(parentese.get(i + 1).charAt(0));
                        n.setValor(!getProposicao(parentese.get(i + 1).charAt(0)).getValor());
                    }

                    propParentese.add(n);

                    parentese.remove(i);

                }

                else if(Character.isLetter(parentese.get(i).charAt(0))){

                    if(parentese.get(i).length() > 1) {

                        propParentese.add(new Proposicao(parentese.get(i).charAt(0),Boolean.parseBoolean(parentese.get(i))));

                    }

                    else{

                        propParentese.add(getProposicao(parentese.get(i).charAt(0)));

                    }

                }

                else{

                    opParentese.add(parentese.get(i));

                }

            }

            for (int i = comecoParentese; i <= finalParentese; i++) {

                this.interpretador.getCaracteres().remove(comecoParentese);

            }

            boolean resultado;

            try {

                resultado = calcula(propParentese.get(0).getValor(), opParentese.get(0).charAt(0), propParentese.get(1).getValor());

            }

            catch (IndexOutOfBoundsException e){

                resultado = propParentese.get(0).getValor();

            }

            for (int i = 1; i < parentese.size() - 1; i++) {

                try {

                    resultado = calcula(resultado, opParentese.get(i).charAt(0), propParentese.get(i + 1).getValor());

                } catch (IndexOutOfBoundsException e) {

                }

            }

            if (resultado) {

                this.interpretador.getCaracteres().add(comecoParentese, "true");

            } else {

                this.interpretador.getCaracteres().add(comecoParentese, "false");

            }

        }

        catch (IndexOutOfBoundsException e){

        }

    }

    private Proposicao getProposicao(Character nome){

        for(Proposicao i : this.proposicoes){

            if(i.getNome().equals(nome)){

                return i;

            }

        }

        return null;

    }

    private boolean calcula(Boolean a, Character op, Boolean b){

        if(op.equals(this.operadores.get(0).charAt(0))) {

            return Boolean.logicalAnd(a, b);

        }

        else if(op.equals(this.operadores.get(1).charAt(0))){

            return Boolean.logicalOr(a, b);

        }

        else if(op.equals(this.operadores.get(2).charAt(0))){

            if(a && !b){

                return false;

            }

            else {

                return true;

            }

        }

        else if(op.equals(this.operadores.get(3).charAt(0))){

            if(a != b){

                return false;

            }

            else {

                return true;

            }

        }

        return false;

    }

    public String tabelaVerdade(){

        try {

            double tamanho = Math.pow(2, this.proposicoes.size());

            double troca = tamanho / 2;

            boolean trocando = false;

            int k = 0;

            ArrayList<Boolean> valores;

            ArrayList<ArrayList<Boolean>> listaProp = new ArrayList<ArrayList<Boolean>>();

            for (int i = 0; i < this.proposicoes.size(); i++) {

                System.out.print(this.proposicoes.get(i).getNome() + " ");

            }

            System.out.print("Resultado");

            for (int i = 0; i < this.proposicoes.size(); i++) {

                valores = new ArrayList<Boolean>();

                for (int j = 0; j < tamanho; j++) {

                    if (k == troca) {

                        trocando = !trocando;

                        k = 0;

                    }

                    if (!trocando) {

                        valores.add(true);

                    } else {

                        valores.add(false);

                    }

                    k++;

                }

                k = 0;

                trocando = false;

                listaProp.add(valores);

                troca = troca / 2;

            }

            ArrayList<Boolean> relacao = new ArrayList<>();

            System.out.println();

            for (int i = 0; i < tamanho; i++) {

                for (int j = 0; j < listaProp.size(); j++) {

                    this.proposicoes.get(j).setValor(listaProp.get(j).get(i));

                    if (listaProp.get(j).get(i)) {

                        System.out.print("V ");

                    } else {

                        System.out.print("F ");

                    }


                }

                relacao.add(isTrue());

                if (relacao.get(i)) {

                    System.out.println("V ");

                } else {

                    System.out.println("F ");

                }

            }

            boolean hasFalse = false;

            boolean hasTrue = false;

            for (Boolean i : relacao) {

                if (i) {

                    hasTrue = true;

                } else {

                    hasFalse = true;

                }

            }

            System.out.println();

            if (hasTrue) {

                if (hasFalse) {

                    return "uma Contigência";

                } else {

                    return "uma Tautologia";

                }

            }

            return "uma Contradição";

        }

        catch (OutOfMemoryError e){

            System.out.println();

            System.out.println("Muitas proposições! Impossível gerar a tabela verdade");

            return "Impossível de definir";

        }

    }

}