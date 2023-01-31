package Summary.Pack;


import java.util.ArrayList;
import java.util.ListIterator;

public class ChildrenClass<T extends Child> {
    private ArrayList<Child> childrenList;

    public ChildrenClass() {
        childrenList = new ArrayList<>();
    }

    public ArrayList<Child> getChildArrayList() {
        return childrenList;
    }

    public boolean addOneChildToList(Child newChild) {
        if (childrenList.contains(newChild)) return false;
        childrenList.add(newChild);
        return true;
    }

    public boolean removeOneChildFromList(String childName) {

        ListIterator<Child> it = childrenList.listIterator();

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
        for (Child child : childrenList) {
            System.out.println(index + 1 + " is " + child.getHumanName());
        }
        System.out.println("#######END########");
    }
}
