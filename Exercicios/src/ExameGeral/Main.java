package ExameGeral;

import java.io.*;

public class Main {

    public static void main(String[] args) {
        InputStreamReader ir = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(ir);
        try {
            while(br.ready()) {
                int n, q;
                String[] linha = br.readLine().split(" ");
                n = Integer.parseInt(linha[0]);
                q = Integer.parseInt(linha[1]);
                ECE ece = new ECE();
                for (int i = 0; i < n; i++) {
                    Cidadao cidadao = new Cidadao(Integer.parseInt(br.readLine()));
                    ece.add(cidadao);
                }
                ece.sort();
                for (int i = 0; i < q; i++) {
                    int pi = Integer.parseInt(br.readLine());
                    System.out.println(ece.get(pi - 1).getNota());
                }
            }
        }
        catch (IOException exception){
            System.out.println(exception.getMessage());
        }
    }
}
