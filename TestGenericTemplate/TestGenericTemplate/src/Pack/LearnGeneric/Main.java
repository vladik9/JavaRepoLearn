package Pack.LearnGeneric;

public class Main {
    public static void main(String[] args) {
        System.out.println("Start of program!");

        Cow cow1 = new Cow("Cow1");
        Cow cow2 = new Cow("cow2");
        Horse horse1 = new Horse("Horse1");
        Horse horse2 = new Horse("Horse2");

        HorseHerd<Horse> horseHold = new HorseHerd<>();
        horseHold.addHorseIntoList(horse1);
        horseHold.addHorseIntoList(horse2);
        horseHold.printHorseList();

        CowHerd<Cow> cowHerd = new CowHerd<>();
        cowHerd.addCowIntoList(cow1);
        cowHerd.addCowIntoList(cow2);

        cowHerd.printHorseList();
    }
}