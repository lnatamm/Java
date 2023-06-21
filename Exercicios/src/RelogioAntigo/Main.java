package RelogioAntigo;

import java.io.*;

public class Main {

    public static void main(String[] args) {
        InputStreamReader ir = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(ir);
        try{
            while(br.ready()) {
                String[] linha = br.readLine().split(" ");
                Relogio relogio = new Relogio(Integer.parseInt(linha[0]), Integer.parseInt(linha[1]));
                relogio.mostrar();
            }
        }
        catch (IOException exception){
            System.out.println(exception.getMessage());
        }
    }

}
