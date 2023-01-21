
public class Main {
     public static void ShowMessageMethod() {
          System.out.println("MainMethod Module");
     }

     public static void main(String[] arg) {
          System.out.println("Main method:");
          Integer myJavaInteger[] = { 234, 23, 4, 23, 523, 52 };
          for (Integer el : myJavaInteger) {
               System.out.println(el);
          }
     }
}