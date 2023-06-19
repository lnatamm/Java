package BatalhaDePomekons;


public class Pomekon {

    private int ataque;

    private int defesa;

    private int bonus;

    private int level;

    private double valorGolpe;

    public Pomekon(int bonus, int ataque, int defesa, int level) {
        this.bonus = bonus;
        this.ataque = ataque;
        this.defesa = defesa;
        this.level = level;
        if(this.level % 2 != 0) {
            this.bonus = 0;
        }
        valorGolpe = ((this.ataque + this.defesa) / 2) + this.bonus;
    }

    public double getValorGolpe() {
        return valorGolpe;
    }

}