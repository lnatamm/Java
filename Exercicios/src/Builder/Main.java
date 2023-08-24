package Builder;

public class Main {

    public static void main(String[] args) {
        try {
            TremBuilder tremBuilder = new TremBuilder();
            tremBuilder.comNVagoes(4).comNPassageiros(60);
            Trem trem1 = tremBuilder.toTrem();
            System.out.println(trem1.getSerie());
            System.out.println(trem1.getnVagoes());
            System.out.println(trem1.getnPassageiros());
        }
        catch (Exception e){

        }
    }

}
