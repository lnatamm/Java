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

        this.anguloHoras = 0;

        this.anguloMinutos = 0;

        this.horas = 0;

        this.minutos = 0;

    }

    public int getAnguloHoras(){

        return this.anguloHoras;

    }

    public int getAnguloMinutos(){

        return this.anguloMinutos;

    }

    public double getHoras(){

        return this.horas;

    }

    public double getMinutos(){

        return this.minutos;

    }

    private void defineHoras(){

        this.horas = (this.anguloHoras / 30);

    }

    private void defineMinutos(){

        this.minutos = (this.anguloMinutos / 30.0) * 5;

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

