package Summary.Pack;

import java.util.ArrayList;

public class ChildrenClass<T extends Child> {
    private ArrayList<Child> childrenArrayList;

    public ChildrenClass() {
        childrenArrayList = new ArrayList<>();
    }

    public ArrayList<Child> getChildArrayList() {
        return childrenArrayList;
    }

    public boolean addOneChildToList(Child newChild) {
        childrenArrayList.add(newChild);
        return true;
    }

//    public Child returnChild(Child childToSearch) {
//        return ;
//    }

    public void printAllChildren() {
        int index = 0;
        System.out.println("Children are: ");
        for (Child child : childrenArrayList) {
            System.out.println(index + 1 + " is " + child.getHumanName());
        }
        System.out.println("#######END########");
    }
}
