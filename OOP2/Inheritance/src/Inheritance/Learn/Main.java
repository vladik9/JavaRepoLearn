package Inheritance.Learn;

public class Main {
    public static void main(String[] args) {
        Dog Jonny = new Dog(1, 1, 2, 3, "Jonny");
        Animal animal = new Animal(1, 1, 23, 43, "Animal");

        System.out.println(animal.getName());
        System.out.println(Jonny.getName());
        Jonny.eat();
    }
}
