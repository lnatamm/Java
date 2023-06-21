package Sequencia;

import java.text.DecimalFormat;

public class IJ4 { //Mudar para "Main"

    public static void main(String[] args) {
        DecimalFormat decimalFormat = new DecimalFormat("#.##");
        for (Double i = 0.0; i < 2; i += 0.2) {
            for (Double j = i + 1.0; j <= i + 3.0; j++) {
                String formattedI = decimalFormat.format(i);
                String formattedJ = decimalFormat.format(j);
                System.out.printf("I=%s J=%s\n", formattedI, formattedJ);
            }
        }
    }

}
