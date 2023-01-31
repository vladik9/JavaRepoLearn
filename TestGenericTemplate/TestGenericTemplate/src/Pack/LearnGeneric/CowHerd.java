package Pack.LearnGeneric;

import java.util.ArrayList;

public class CowHerd<T extends Cow> {
    private ArrayList<Cow> cowArrayList;

    public CowHerd() {
        this.cowArrayList = new ArrayList<>();
    }

    public void addCowIntoList(Cow cow) {
        cowArrayList.add(cow);

    }

    public void printHorseList() {
        System.out.println("List is: ");
        for (Cow cow : cowArrayList) {
            System.out.println(cow.getAnimalName());
        }
    }
}
