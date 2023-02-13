public class Calculadora {

    private Interpretador interpretador;

    private String[] operadores;

    private String resposta;

    public Calculadora(){

        this.interpretador = new Interpretador();

        defineOperadores();

        this.resposta = "";

    }

    public Calculadora(Interpretador interpretador){

        this.interpretador = interpretador;

        defineOperadores();

        this.resposta = "";

    }

    public Calculadora(Interpretador interpretador, String[] operadores, String resposta){

        this.interpretador = interpretador;

        this.operadores = operadores;

        this.resposta = resposta;

    }

    public Interpretador getInterpretador(){

        return this.interpretador;

    }

    public String[] getOperadores(){

        return this.operadores;

    }

    public String getResposta(){

        return this.resposta;

    }

    public void setInterpretador(Interpretador interpretador){

        this.interpretador = interpretador;

    }

    public void setOperadores(String[] operadores){

        this.operadores = operadores;

    }

    public void setResposta(String resposta){

        this.resposta = resposta;

    }

    private void defineOperadores(){

        this.operadores = new String[]{"~", "^", "v", "→", "↔"};

    }

    private void tableux(){}

    public String calcular(){return "";}

}
