package Inheritance.Learn;

public class Dog extends Animal {
    public Dog(int brain, int body, int size, int weight, String name) {
        super(brain, body, size, weight, name);
    }

    public Dog(int weight, String name, int eyes, int legs, int tail, int teeth, String coat) {
        super(1, 1, 1, weight, name);
        this.eyes = eyes;
        this.legs = legs;
        this.tail = tail;
        this.teeth = teeth;
        this.coat = coat;
    }

    private int eyes;
    private int legs;
    private int tail;
    private int teeth;
    private String coat;

    public int getEyes() {
        return eyes;
    }

    public int getLegs() {
        return legs;
    }

    public int getTail() {
        return tail;
    }

    public int getTeeth() {
        return teeth;
    }

    public String getCoat() {
        return coat;
    }

    @Override
    public void eat() {
        System.out.println("Dog is eating.");
    }
}
