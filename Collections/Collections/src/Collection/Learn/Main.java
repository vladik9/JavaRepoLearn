package Collection.Learn;


import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {

        LinkedList<Integer> myList = new LinkedList<>();

        myList.add(3);
        myList.add(4);
        myList.add(5);
        myList.add(7);
        int value = Collections.binarySearch(myList, 4);
        System.out.println(Collections.addAll(myList, 3, 24, 32, 5, 23, 52));
        LinkedList<Integer> secondList = new LinkedList<>(myList);
        Collections.copy(secondList, myList);
        secondList.set(0, 0);
        System.out.println(value);
        System.out.println(myList.toString());
        System.out.println(secondList.toString());
        Collections.reverse(myList);
        System.out.println(myList.toString());
        Collections.reverse(secondList);
        System.out.println(secondList.toString());


    }
}
