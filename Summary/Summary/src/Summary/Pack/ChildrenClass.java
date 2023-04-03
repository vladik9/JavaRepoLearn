package Summary.Pack;


import java.util.ArrayList;
import java.util.ListIterator;
import java.util.Scanner;

public class ChildrenClass<T extends Human> {
    private ArrayList<T> childrenList;

    public ChildrenClass() {
        childrenList = new ArrayList<>();
    }

    public ArrayList<T> getChildArrayList() {
        return childrenList;
    }

    public boolean addOneChildToList(T newChild) {
        if (childrenList.contains(newChild)) return false;
        childrenList.add(newChild);
        return true;
    }

    public boolean removeOneChildFromList(String childName) {

        ListIterator<T> it = childrenList.listIterator();

        while (it.hasNext()) {
            String name = it.next().getHumanName();
            if (name.equals(childName)) {
                childrenList.remove(it.previous());
                return true;

            }
        }
        return false;
    }


    public void printAllChildren() {
        int index = 0;
        System.out.println("Children are: ");
        for (T child : childrenList) {
            System.out.println(index + 1 + " is " + child.getHumanName());
        }
        System.out.println("#######END########");
        Scanner scanner= new Scanner(System.in);
        scanner.nextLine();
    }
}
