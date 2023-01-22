package TestingProgramPackage;

import static TestingProgramPackage.NotMain.notInMain;


public class Main {


    public static void main(String[] args) {
        System.out.println("Main method:");

        int myInt = Integer.parseInt("12341");
        System.out.println(((Object) myInt).getClass().getSimpleName());

    }
}