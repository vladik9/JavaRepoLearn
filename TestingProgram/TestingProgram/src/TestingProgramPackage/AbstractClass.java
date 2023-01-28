package TestingProgramPackage;

public abstract class AbstractClass {
    private static void notInMain() {
        System.out.println("not in main class");
    }

    public void printMyName() {
        System.out.println("My name is Vlad");
    }

    public abstract void printMyName2();

    public int getMyAge() {
        return myAge;
    }

    public void setMyAge(int myAge) {
        this.myAge = myAge;
    }

    private int myAge = 26;

    public AbstractClass() {
        System.out.println("Constructor.");
    }


}
