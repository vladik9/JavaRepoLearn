package Pack.LearnGeneric;

import java.util.ArrayList;

public class HorseHerd<T extends Horse> {
    private ArrayList<Horse> horseList;

    public HorseHerd() {
        this.horseList = new ArrayList<>();
    }

    public void addHorseIntoList(Horse horse) {
        horseList.add(horse);

    }

    public void printHorseList() {
        System.out.println("List is: ");
        for (Horse horse : horseList) {
            System.out.println(horse.getAnimalName());
        }
    }
}
