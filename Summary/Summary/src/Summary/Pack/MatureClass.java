package Summary.Pack;

import java.util.ArrayList;
import java.util.ListIterator;
import java.util.Scanner;

public class MatureClass<T extends Human> {

    private ArrayList<T> matureList = new ArrayList();


    public boolean addMatureToList(T worker) {
        if (matureList.contains(worker)) return false;
        matureList.add(worker);
        return true;
    }


    public boolean removeWorkerFromList(T worker) {
        int workerIndex = matureList.indexOf(worker);

        if (workerIndex != -1) {
            matureList.remove(workerIndex);
            return true;
        }
        return false;

    }

    public void printAllMature() {
        int index = 0;
        System.out.println("Mature are: ");
        for (T mature : matureList) {
            System.out.println(index + 1 + " is " + mature.getHumanName());
        }
        System.out.println("#######END########");
        Scanner scanner= new Scanner(System.in);
        scanner.nextLine();
    }

    public boolean removeOneChildFromList(String mature) {

        ListIterator<T> it = matureList.listIterator();

        while (it.hasNext()) {
            String name = it.next().getHumanName();
            if (name.equals(mature)) {
                matureList.remove(it.previous());
                return true;
            }
        }
        return false;
    }


}
