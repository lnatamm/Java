package NotasEMoedas;

import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

public class Main {

    
    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);

        while(true){

            Scanner sc = new Scanner(System.in);
            int notas100, notas50, notas20, notas10, notas5, notas2;
            int moedas1, moedas50, moedas25, moedas10, moedas5, moedas01;

            double[] valores = new double[]{100, 50, 20, 10, 5, 2, 100, 50, 25, 10, 5, 1};

            int resposta;

            double valor = Double.parseDouble(sc.nextLine());
            
            String tipo = "nota(s)";

            int controle = 1;

            System.out.println("NOTAS:");

            for(int i = 0; i < valores.length; i++){

                if(i == valores.length / 2){
                    System.out.println("MOEDAS:");
                    tipo = "moeda(s)";
                    controle = 100;
                    valor *= 100;
                }
                
                resposta = (int)(valor / valores[i]);
                System.out.printf("%d %s de R$ %.2f\n", resposta, tipo, valores[i]/controle);
                valor = valor % valores[i];

            }
            /* 
            notas100 = (int)valor / 100;
            resto = valor % 100;
            notas50 =  (int)resto / 50;
            resto = resto % 50;
            notas20 = (int)resto / 20;
            resto = resto % 20;
            notas10 = (int)resto / 10;
            resto = resto % 10;
            notas5 = (int)resto / 5;
            resto = resto % 5;
            notas2 = (int)resto / 2;
            resto = resto % 2;
            
            System.out.println("NOTAS:");
            System.out.println(notas100);
            System.out.println(notas50);
            System.out.println(notas20);
            System.out.println(notas10);
            System.out.println(notas5);
            System.out.println(notas2);
            
            moedas1 = (int)resto;
            resto = resto % 1;
            moedas50 = (int)(resto / 0.5);
            resto = resto % 0.5;
            moedas25 = (int)(resto / 0.25);
            resto = resto % 0.25;
            moedas10 = (int)(resto / 0.1);
            resto = resto % 0.1;
            moedas5 = (int)(resto / 0.05);
            resto = resto % 0.05;
            moedas01 = (int)(resto / 0.01);

            System.out.println("MOEDAS:");
            System.out.println(moedas1);
            System.out.println(moedas50);
            System.out.println(moedas25);
            System.out.println(moedas10);
            System.out.println(moedas5);
            System.out.println(moedas01);
            System.out.println(0.03 / 0.01);
            */

        }
        
    }
    
}
