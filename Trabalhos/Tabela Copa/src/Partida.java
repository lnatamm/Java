public class Partida {

    private Time time1;
    private Time time2;
    private int gols1;
    private int gols2;
    private int pontos1;
    private int pontos2;

    public Partida(Time time1, Time time2){
        this.time1 = time1;
        this.time2 = time2;
        this.gols1 = 0;
        this.gols2 = 0;
        this.pontos1 = 0;
        this.pontos2 = 0;
    }

    public Time getTime1(){
        return this.time1;
    }

    public Time getTime2(){
        return this.time2;
    }

    public void definePontos(){
        if(gols1 > gols2){
            this.pontos1 = 3;
            this.pontos2 = 0;
        } else if (gols2 > gols1) {
            this.pontos2 = 3;
            this.pontos1 = 0;
        }else {
            this.pontos1 = 1;
            this.pontos2= 1;
        }
    }

    public int getSaldoGols1(){

        return this.gols1 - this.gols2;

    }

    public int getSaldoGols2(){

        return this.gols1 - this.gols2;

    }

    public void defineVDE(){
        if(gols1 > gols2){
            time1.addVitorias(1);
            time2.addDerrotas(1);
        } else if (gols2 > gols1) {
            time2.addVitorias(1);
            time1.addDerrotas(1);
        }else {
            time1.addEmpates(1);
            time2.addEmpates(1);
        }
    }

    public int getPontos1(){
        return this.pontos1;
    }

    public int getPontos2(){
        return this.pontos2;
    }

    public void setGols1(int gols1){
        this.gols1 = gols1;
    }

    public void setGols2(int gols2){
        this.gols2 = gols2;
    }

    public int getGols1(){
        return this.gols1;
    }

    public int getGols2(){
        return this.gols2;
    }

}
