package ProvaAgendaMedico;

import java.util.*;
public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int m = 1;

        while (m == 1) {

            System.out.print("Digite o nome do paciente:");

            String n1 = sc.next();

            System.out.print("Digite o sobrenome do paciente:");

            String s1 = sc.next();

            System.out.print("Digite o CPF do paciente:");

            String c1 = sc.next();

            System.out.print("Digite o Telefone do paciente:");

            String t1 = sc.next();

            Paciente p1 = new Paciente(n1, s1, c1, t1);

            p1.Mostrar();

            System.out.print("Digite o nome do paciente:");

            String n2 = sc.next();

            System.out.print("Digite o sobrenome do paciente:");

            String s2 = sc.next();

            System.out.print("Digite o CPF do paciente:");

            String c2 = sc.next();

            System.out.print("Digite o Telefone do paciente:");

            String t2 = sc.next();

            Paciente p2 = new Paciente(n2, s2, c2, t2);

            p2.Mostrar();

            System.out.print("Digite o nome do paciente:");

            String n3 = sc.next();

            System.out.print("Digite o sobrenome do paciente:");

            String s3 = sc.next();

            System.out.print("Digite o CPF do paciente:");

            String c3 = sc.next();

            System.out.print("Digite o Telefone do paciente:");

            String t3 = sc.next();

            Paciente p3 = new Paciente(n3, s3, c3, t3);

            p3.Mostrar();

            int n = 1;

            Agenda agenda = new Agenda();

            while (n == 1) {

                System.out.println("A qual paciente você deseja marcar uma consulta?");

                String nome = sc.next();

                if (p1.getNome().equals(nome) || p2.getNome().equals(nome) || p3.getNome().equals(nome)) {

                    System.out.println("Qual o dia da consulta?");

                    int dia = Integer.parseInt(sc.next());

                    System.out.println("Qual o mes da consulta?");

                    int mes = Integer.parseInt(sc.next());

                    System.out.println("Qual o ano da consulta?");

                    int ano = Integer.parseInt(sc.next());

                    System.out.println("Qual a hora da consulta?");

                    int hora = Integer.parseInt(sc.next());

                    Consulta consulta = new Consulta(dia, mes, ano, hora);

                    if (p1.getNome().equals(nome)) {

                        consulta.setPaciente(p1);

                    }

                    if (p2.getNome().equals(nome)) {

                        consulta.setPaciente(p2);

                    }

                    if (p3.getNome().equals(nome)) {

                        consulta.setPaciente(p3);

                    }

                    agenda.adicionar(consulta);

                } else {

                    System.out.println("Paciente não existe");

                }

                System.out.println("Deseja continuar?(1-sim !1-não)");

                n = Integer.parseInt(sc.next());

            }

            System.out.println("Qual o dia da consulta que deseja confirmar?");

            int diac = Integer.parseInt(sc.next());

            System.out.println("Qual o mes da consulta que deseja confirmar?");

            int mesc = Integer.parseInt(sc.next());

            System.out.println("Qual o ano da consulta que deseja confirmar?");

            int anoc = Integer.parseInt(sc.next());

            System.out.println("Qual a hora da consulta que deseja confirmar?");

            int horac = Integer.parseInt(sc.next());

            Consulta consultaConfirmar = new Consulta(diac, mesc, anoc, horac);

            agenda.confirmar(consultaConfirmar);

            System.out.println("Qual o dia da consulta que deseja realizar?");

            int diar = Integer.parseInt(sc.next());

            System.out.println("Qual o mes da consulta que deseja realizar?");

            int mesr = Integer.parseInt(sc.next());

            System.out.println("Qual o ano da consulta que deseja realizar?");

            int anor = Integer.parseInt(sc.next());

            System.out.println("Qual a hora da consulta que deseja realizar?");

            int horar = Integer.parseInt(sc.next());

            Consulta consultaRealizar = new Consulta(diar, mesr, anor, horar);

            agenda.realizar(consultaRealizar);

            System.out.println("Qual o dia da consulta que deseja cancelar?");

            int diacn = Integer.parseInt(sc.next());

            System.out.println("Qual o mes da consulta que deseja cancelar?");

            int mescn = Integer.parseInt(sc.next());

            System.out.println("Qual o ano da consulta que deseja cancelar?");

            int anocn = Integer.parseInt(sc.next());

            System.out.println("Qual a hora da consulta que deseja cancelar?");

            int horacn = Integer.parseInt(sc.next());

            Consulta consultaCancelar = new Consulta(diacn, mescn, anocn, horacn);

            agenda.cancelar(consultaCancelar);

            System.out.println("Qual o dia das consultas que deseja listar?");

            int dial = Integer.parseInt(sc.next());

            System.out.println("Qual o mes das consultas que deseja listar?");

            int mesl = Integer.parseInt(sc.next());

            System.out.println("Qual o ano das consultas que deseja listar?");

            int anol = Integer.parseInt(sc.next());

            agenda.listar(dial, mesl, anol);

            System.out.println("Qual o CPF do paciente que deseja procurar?");

            String cpf = sc.next();

            agenda.pesquisar(cpf);

            System.out.println("Deseja continuar? 1-Sim !1-Não");

        }

    }

}

