public class Test2 extends Test1 {
    public Test2() {
    }

    static String myName = "Joshua";

    public static void printMyName() {
        System.out.println("My name is: " + myName);
    }

    @Override
    void showMyName(String myName) {
        System.out.println(myName);
    }
    
}
