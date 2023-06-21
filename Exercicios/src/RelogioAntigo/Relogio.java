package RelogioAntigo;

public class Relogio {

    private int anguloHoras;

    private int anguloMinutos;

    private double horas;

    private double minutos;

    public Relogio(int anguloHoras, int anguloMinutos){
        this.anguloHoras = anguloHoras;
        this.anguloMinutos = anguloMinutos;
        defineHoras();
        defineMinutos();
    }

    public Relogio(){
        anguloHoras = 0;
        anguloMinutos = 0;
        horas = 0;
        minutos = 0;
    }

    public int getAnguloHoras(){
        return anguloHoras;
    }

    public int getAnguloMinutos(){
        return anguloMinutos;
    }

    public double getHoras(){
        return horas;
    }

    public double getMinutos(){
        return minutos;
    }

    private void defineHoras(){
        horas = (anguloHoras / 30);
    }

    private void defineMinutos(){
        minutos = (anguloMinutos / 30.0) * 5;
    }

    public void mostrar(){
        if(this.horas < 10){
            if(this.minutos < 10){
                System.out.printf("0%.0f:0%.0f\n", this.horas, this.minutos);
            }
            else {
                System.out.printf("0%.0f:%.0f\n", this.horas, this.minutos);
            }
        }
        else{
            if(this.minutos < 10){
                System.out.printf("%.0f:0%.0f\n", this.horas, this.minutos);
            }
            else {
                System.out.printf("%.0f:%.0f\n", this.horas, this.minutos);
            }
        }
    }

}

