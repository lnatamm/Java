package ProvaAgendaMedico;

public class Consulta {

    private Paciente paciente;
    private int Dia;
    private int Mes;
    private int Ano;
    private int Hora;
    private int Status;


    public Consulta(int dia, int mes, int ano, int hora, Paciente paciente) {

        this.Status = 0;
        this.Dia = dia;
        this.Mes = mes;
        this.Ano = ano;
        this.Hora = hora;
        this.paciente = paciente;

    }

    public Consulta(int dia, int mes, int ano, int hora){

        this.Status = 0;
        this.Dia = dia;
        this.Mes = mes;
        this.Ano = ano;
        this.Hora = hora;
        this.paciente = new Paciente();

    }

    public Consulta(){

        this.Status = 0;
        this.Dia = 0;
        this.Mes = 0;
        this.Ano = 0;
        this.Hora = 0;
        this.paciente = new Paciente();

    }

    public int getStatus() {
        return Status;
    }

    public int getDia() {
        return Dia;
    }

    public int getMes() {
        return Mes;
    }

    public int getAno() {
        return Ano;
    }

    public int getHora() {
        return Hora;

    }

    public Paciente getPaciente() {
        return paciente;
    }

    public void setStatus(int status) {
        this.Status = status;
    }

    public void setDia(int dia) {
        this.Dia = dia;
    }

    public void setCPF(int mes) {
        this.Mes = mes;
    }

    public void setAno(int ano) {
        this.Ano = ano;
    }

    public void setHora(int hora) {
        this.Hora = hora;
    }

    public void setPaciente( Paciente paciente) {
        this.paciente = paciente;
    }


    public void Mostrar() {

        System.out.println("Paciente: ");
        this.paciente.Mostrar();

        System.out.println("Consulta: ");
        System.out.println("Dia:" + Dia);
        System.out.println("Mês: " + Mes);
        System.out.println( "Ano: " + Ano);
        System.out.println("Hora: " + Hora);



    }
}
