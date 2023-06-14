package OHallDosAssassinos;

public class Person {
    private String name;
    private int killCount;

    public Person(String name){
        this.name = name;
        killCount = 1;
    }

    public String getName() {
        return name;
    }

    public int getKillCount() {
        return killCount;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setKillCount(int killCount) {
        this.killCount = killCount;
    }

    public void incKillCount(){
        killCount++;
    }

}
