package Summary.Pack;

import java.util.ArrayList;

public class WorkingClass<T extends Mature> {

    private ArrayList<T> WorkingClassList = new ArrayList();


    public boolean addWorkerToWorkingClass(T worker) {
        WorkingClassList.add(worker);
        return true;
    }


    public boolean removeWorkerFromList(T worker) {
        int workerIndex = WorkingClassList.indexOf(worker);

        if (workerIndex != -1) {
            WorkingClassList.remove(workerIndex);
            return true;
        }
        return false;

    }

    public void printAllMature() {
        int index = 0;
        System.out.println("Mature are: ");
        for (Mature mature : WorkingClassList) {
            System.out.println(index + 1 + " is " + mature.getHumanName());
        }
        System.out.println("#######END########");
    }


}
