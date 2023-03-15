package NotasEMoedas;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);

        while(true){

            Scanner sc = new Scanner(System.in);

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

        }
        
    }
    
}
