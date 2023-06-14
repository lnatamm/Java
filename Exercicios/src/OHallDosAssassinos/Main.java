package OHallDosAssassinos;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List murderList = new List();
        List killedList = new List();
        while (sc.hasNext()){
            Person killer = new Person(sc.next());
            Person killed = new Person(sc.next());
            killedList.add(killed);
            if (!killedList.contains(killer)) {
                murderList.addAssassination(killer, killed);
            }
        }
        Tree murderTree = new Tree();
        while (!murderList.isEmpty()){
            murderTree.add(murderList.remove());
        }
        System.out.println("HALL OF MURDERERS");
        System.out.println(murderTree);
    }
}
