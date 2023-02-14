public class Calculadora {

    private Interpretador interpretador;

    private String resposta;

    private String[] operadores;

    public Calculadora(){

        this.interpretador = new Interpretador();

        this.resposta = "";

        defineOperadores();

    }

    public Calculadora(Interpretador interpretador){

        this.interpretador = interpretador;

        this.resposta = "";

        defineOperadores();

    }

    public Calculadora(Interpretador interpretador, String[] operadores){

        this.interpretador = interpretador;

        this.operadores = operadores;

    }

    public Interpretador getInterpretador(){

        return this.interpretador;

    }

    public String getResposta(){

        return this.resposta;

    }

    public String[] getOperadores(){

        return this.operadores;

    }

    public void setInterpretador(Interpretador interpretador){

        this.interpretador = interpretador;

    }

    public void setResposta(String resposta){

        this.resposta = resposta;

    }

    public void setOperadores(String[] operadores){

        this.operadores = operadores;

    }

    private void defineOperadores(){

        this.operadores = new String[]{"~", "^", "v", "→", "↔"};

    }

    private void tableux(){}

    public String calcular(){return "";}

}
