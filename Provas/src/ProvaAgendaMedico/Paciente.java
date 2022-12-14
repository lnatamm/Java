package ProvaAgendaMedico;

public class Paciente {

    private String Nome;
    private String Sobrenome;
    private String CPF;
    private String Telefone;


    public Paciente(String nome,String sobrenome, String cpf, String telefone) {

        this.Nome = nome;
        this.Sobrenome = sobrenome;
        this.CPF = cpf;
        this.Telefone = telefone;

    }

    public Paciente(){

        this.Nome = "";
        this.Sobrenome = "";
        this.CPF = "";
        this.Telefone = "";

    }

    public String getNome() {

        return Nome;

    }

    public String getSobrenome() {

        return Sobrenome;

    }

    public String getCPF() {

        return CPF;

    }

    public String getTelefone() {

        return Telefone;

    }

    public void setNome(String nome) {

        this.Nome = nome;

    }

    public void setSobrenome(String sobrenome) {

        this.Sobrenome = sobrenome;

    }

    public void setCPF(String cpf) {

        this.CPF = cpf;

    }

    public void setTelefone(String telefone) {

        this.Telefone = telefone;

    }


    public void Mostrar() {
        System.out.println("Nome: " + Nome + " " + Sobrenome);
        System.out.println("CPF: " + CPF);
        System.out.println("Telefone: " + Telefone);

    }

}
