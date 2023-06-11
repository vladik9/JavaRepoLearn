import java.io.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("1 write\n2 read \n0 quit");
        System.out.println("Your option : # ");
        int chose = scanner.nextInt();
        switch (chose) {
            case 1:
                System.out.println("write");
                writeFile();
                break;
            case 2:
                System.out.println("read");
                readFile();
                break;
            case 0, default:
                System.out.println("quiting");
                break;
        }
    }

    public static void writeFile() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter element for multiplication: ");
        int element = scanner.nextInt();

        try (FileWriter writer = new FileWriter(new File("test.txt"))) {

            for (int i = 1; i <= 10; i++) {
                System.out.println("Writing  " + i + "x" + element + "=" + i * element);
                writer.write(i + "," + element + "," + i * element + "\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void readFile() {
        try (Scanner scanner = new Scanner(new BufferedReader(new FileReader("test.txt")))) {

            while (scanner.hasNextLine()) {
                String data = scanner.nextLine();
                String[] splitedData = data.split(",");
                System.out.println(splitedData[0] + " x " + splitedData[1] + " = " + splitedData[2]);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
