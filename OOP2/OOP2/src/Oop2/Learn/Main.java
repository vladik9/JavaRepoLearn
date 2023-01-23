package Oop2.Learn;

import Oop2.Learn.Composition.*;
//import Oop2.Learn.Inheritance.Car;

public class Main {
    public static void main(String[] args) {
        //this is for Inheritance
//        Car Volkswagen = new Car(4, 2300, "Volkswagen");
//        System.out.println(Volkswagen.getVehicleName());

        //This is for composition
//        PC asusPc = new PC(new Case("Box model", "Asus", "12V", new Dimensions(240, 300, 250)), new MatherBoard("JapanMatherBoard", "China INC", 4, 2, "Asus Native"), new Monitor("Asus monitor", "Asus Monitor Inc", 500, new Resolution(1880, 2550)));
        // this is the same as above but more clearly to see
        Case theCase = new Case("Box model", "Asus", "12V", new Dimensions(240, 300, 250));
        MatherBoard theMatherBoard = new MatherBoard("JapanMatherBoard", "China INC", 4, 2, "Asus Native");
        Monitor theMonitor = new Monitor("Asus monitor", "Asus Monitor Inc", 500, new Resolution(1880, 2550));
        // the final object
        PC myPC = new PC(theCase, theMatherBoard, theMonitor);
        myPC.powerUPButton();

    }
}