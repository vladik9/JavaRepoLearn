package TestingProgramPackage;

class sayHello {
    public void sayHelloMethod() {
        System.out.println("Say hello");
    }
}

public class Main {
    public static void main(String[] args) {
        System.out.println("Main method:");

        AbstractClass test = new ChildOfAbstractClass();
        test.printMyName();
        System.out.println(test.getMyAge());
        sayHello hii = new sayHello();
        hii.sayHelloMethod();

    }


}