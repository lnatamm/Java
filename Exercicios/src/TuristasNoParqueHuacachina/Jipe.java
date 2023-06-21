package TuristasNoParqueHuacachina;


public class Jipe {

    private String estado;

    private int passageiros;

    private int turistas;

    private int jipes;

    public Jipe() {
        estado = "";
        passageiros = 0;
        turistas = 0;
        jipes = 0;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public void setPassageiros(int passageiros) {
        this.passageiros = passageiros;
        if (estado.equals("SALIDA")) {
            jipes++;
            turistas += passageiros;
        }
        if (this.estado.equals("VUELTA")) {
            jipes--;
            turistas -= passageiros;
        }
    }

    public String getEstado() {
        return estado;
    }

    public void exibir() {
        System.out.println(turistas);
        System.out.println(jipes);
    }

}
