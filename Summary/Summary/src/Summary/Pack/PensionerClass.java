package Summary.Pack;

import java.util.ArrayList;

public class PensionerClass<T extends Old> {
    private ArrayList<Old> pensionerList;

    public PensionerClass() {
        this.pensionerList = new ArrayList<>();
    }

    public ArrayList<Old> getPensionerList() {
        return pensionerList;
    }

    public boolean addOnePensionerToList(Old newOld) {
        pensionerList.add(newOld);
        return true;
    }

    public void printAllPensioners() {
        int index = 0;
        System.out.println("Children are: ");
        for (Old old : pensionerList) {
            System.out.println(index + 1 + " is " + old.getHumanName());
        }
        System.out.println("#######END########");
    }
}
