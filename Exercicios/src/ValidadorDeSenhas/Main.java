package ValidadorDeSenhas;
import java.io.*;
public class Main {

    public static void main(String[] args) {
        InputStreamReader ir = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(ir);
        try {
            while (br.ready()) {
                String senha = br.readLine();
                Portal portal = new Portal(senha);
                if (portal.isSenhaValida()) {
                    System.out.println("Senha valida.");
                } else {
                    System.out.println("Senha invalida.");
                }
            }
        }
        catch (IOException exception){
            System.out.println(exception.getMessage());
        }
    }

}
