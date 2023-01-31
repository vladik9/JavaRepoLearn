package LocalPacket.pack;

public class Main {
//    private static Scanner scanner = new Scanner(System.in);


    public static void main(String[] args) {
        OuterClass outerClassObject = new OuterClass(26, "Vlad", new OuterClass.innerInterface() {
            @Override
            public void printAText(String text) {
                System.out.println("This is my more data:  " + text);
            }
        });
        OuterClass.InnerClass subInnerClass = outerClassObject.new InnerClass("Programmer");

        outerClassObject.printMyMess("Some random data");
    }


}
