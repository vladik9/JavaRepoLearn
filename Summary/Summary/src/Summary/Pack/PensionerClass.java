package Summary.Pack;

import java.util.ArrayList;
import java.util.ListIterator;
import java.util.Scanner;

public class PensionerClass<T extends Human> {
    private ArrayList<T> pensionerList;

    public PensionerClass() {
        this.pensionerList = new ArrayList<>();
    }

    public ArrayList<T> getPensionerList() {
        return pensionerList;
    }

    public boolean addOnePensionerToList(T newOld) {
        if (pensionerList.contains(newOld)) return false;
        pensionerList.add(newOld);
        return true;
    }

    public void printAllPensioners() {
        int index = 0;
        System.out.println("Children are: ");
        for (T old : pensionerList) {
            System.out.println(index + 1 + " is " + old.getHumanName());
        }
        System.out.println("#######END########");
        Scanner scanner= new Scanner(System.in);
        scanner.nextLine();
    }

    public boolean removeOneMatureFromList(String old) {
        ListIterator<T> it = pensionerList.listIterator();

        while (it.hasNext()) {
            String name = it.next().getHumanName();
            if (name.equals(old)) {
                pensionerList.remove(it.previous());
                return true;

            }
        }
        return false;

    }
}
