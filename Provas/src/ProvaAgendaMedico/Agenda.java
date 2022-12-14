package ProvaAgendaMedico;

import java.util.*;
import java.util.concurrent.ExecutionException;

public class Agenda {

    private ArrayList <Consulta> consultas;


    public Agenda(ArrayList <Consulta> consultas) {
        this.consultas = consultas;
    }

    public Agenda() {
        this.consultas = new ArrayList();
    }

    private boolean isHorarioLivre(Consulta consulta){

        if(this.consultas.size() > 0) {

            for (int i = 0; i < this.consultas.size(); i++) {

                if(this.consultas.get(i).getDia() == consulta.getDia() && this.consultas.get(i).getMes() == consulta.getMes() && this.consultas.get(i).getAno() == consulta.getAno() && this.consultas.get(i).getHora() == consulta.getHora()){

                    return false;

                }

            }

            return true;

        }

        else{

            return true;

        }

    }

    public void adicionar(Consulta consulta) {

        try {

            if (isHorarioLivre(consulta)) {

                this.consultas.add(consulta);

            }

            else {

                throw new Exception("Horário Ocupado");

            }

        }

        catch (Exception e) {

            System.out.println(e.getMessage());

        }

    }

    public void confirmar(Consulta consulta){

        try {

            boolean encontrou = false;

            for (int i = 0; i < this.consultas.size(); i++) {

                if (this.consultas.get(i).getDia() == consulta.getDia() && this.consultas.get(i).getMes() == consulta.getMes() && this.consultas.get(i).getAno() == consulta.getAno() && this.consultas.get(i).getHora() == consulta.getHora()) {

                    encontrou = true;

                    if (this.consultas.get(i).getStatus() == 0) {

                        this.consultas.get(i).setStatus(1);

                    }

                    else {

                        throw new Exception("Status Inválido");

                    }

                }

            }

            if(!encontrou) {

                throw new Exception("Consulta não encontrada");

            }

        }

        catch (Exception e){

            System.out.println(e.getMessage());

        }

    }

    public void realizar(Consulta consulta){

        try {

            boolean encontrou = false;

            for (int i = 0; i < this.consultas.size(); i++) {

                if (this.consultas.get(i).getDia() == consulta.getDia() && this.consultas.get(i).getMes() == consulta.getMes() && this.consultas.get(i).getAno() == consulta.getAno() && this.consultas.get(i).getHora() == consulta.getHora()) {

                    encontrou = true;

                    if (this.consultas.get(i).getStatus() == 1) {

                        this.consultas.get(i).setStatus(2);

                    }

                    else {

                        throw new Exception("Status Inválido");

                    }

                }

            }

            if(!encontrou) {

                throw new Exception("Consulta não encontrada");

            }

        }

        catch (Exception e){

            System.out.println(e.getMessage());

        }
    }

    public void cancelar(Consulta consulta){

        try {

            boolean encontrou = false;

            for (int i = 0; i < this.consultas.size(); i++) {

                if (this.consultas.get(i).getDia() == consulta.getDia() && this.consultas.get(i).getMes() == consulta.getMes() && this.consultas.get(i).getAno() == consulta.getAno() && this.consultas.get(i).getHora() == consulta.getHora()) {

                    encontrou = true;

                    if (this.consultas.get(i).getStatus() == 0 || this.consultas.get(i).getStatus() == 1) {

                        this.consultas.get(i).setStatus(3);

                    }

                    else {

                        throw new Exception("Status Inválido");

                    }

                }

            }

            if(!encontrou) {

                throw new Exception("Consulta não encontrada");

            }

        }

        catch (Exception e){

            System.out.println(e.getMessage());

        }

    }

    public void listar(int dia, int mes, int ano){

        for(int i = 0; i < this.consultas.size(); i++){

            if(this.consultas.get(i).getDia() == dia && this.consultas.get(i).getMes() == mes && this.consultas.get(i).getAno() == ano){

                this.consultas.get(i).Mostrar();

            }

        }

    }

    public void pesquisar(String cpf){

        boolean encontrou = false;

        for(int i = 0; i < this.consultas.size(); i++){

            if(this.consultas.get(i).getPaciente().getCPF().equals(cpf)){

                encontrou = true;

                this.consultas.get(i).Mostrar();

            }

        }

        if(!encontrou){

            System.out.println("consulta não encontrada para cpf informado");

        }

    }

}
