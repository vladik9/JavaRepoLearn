package TestingProgramPackage;

import static TestingProgramPackage.NotMain.notInMain;

public class Main {
//    static int decreseFromMyNumber(int number) {
//        System.out.println("Current number value is: " + number);
//        if (number == 0) return 0;
//
//        number--;
//
//        return (decreseFromMyNumber(number));
//    }

    public static void main(String[] args) {
        System.out.println("Main method:");

        notInMain();

    }
}