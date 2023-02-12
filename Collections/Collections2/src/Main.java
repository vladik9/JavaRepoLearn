import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;


public class Main {

    public static void main(String[] args) {
        Theatre theatre = new Theatre("Olympian", 8, 12);
//        theatre.getSeats();


        ArrayList<Integer> firstList= new ArrayList<>();
        for(int i=0; i<10; i++){
            int random_int = (int)Math.floor(Math.random() * (10 - 1) + 1);
            firstList.add(random_int);
        }
        System.out.println("Initial List");
        System.out.println(firstList.toString());

        System.out.println("Copy");
        ArrayList<Integer> secondList= new ArrayList<>(firstList);
        Collections.reverse(secondList);
        System.out.println("Second List");
        System.out.println(secondList.toString());
        System.out.println("Again initial list");
        System.out.println(firstList.toString());
        Collections.sort();

    }



}
