package OopPackage.Opp1;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //this is a test program for BankAccount
//        Scanner scanner = new Scanner(System.in);
//        BankAccount VladAccount = new BankAccount(31234124, 500, "Vlad Cornici", " v.cornici@gmail.com", "0 771 563 568");
//
//
//        BankAccount CorinaAccount = new BankAccount("Miscoi Corina", "corina.miscoi04@gmail.com", "00000000");
//        while (true) {
//            System.out.println("1. View balance!");
//            System.out.println("2. Deposit an amount");
//            System.out.println("3. Withdraw an amount");
//            System.out.println("0 Quit program");
//
//            int userChoice = scanner.nextInt();
//            if (userChoice == 0) {
//                System.out.println("User with name: " + VladAccount.getCustomerName() + " is now logged of!");
//                break;
//            } else if (userChoice == 1) {
//                System.out.println("On current user account with name: " + VladAccount.getCustomerName() + " are " + VladAccount.getBalance() + "$");
//            } else if (userChoice == 2) {
//                System.out.println("Enter amount of money to deposit: ");
//                double amount = scanner.nextDouble();
//                if (VladAccount.depositFounds(amount)) {
//                    System.out.println("You have successfully  added " + amount + "$");
//                    System.out.println("Your current amount is: " + VladAccount.getBalance() + "$");
//                }
//            } else if (userChoice == 3) {
//                System.out.println("Enter amount of money to withdraw: ");
//                double amount = scanner.nextDouble();
//                if (VladAccount.withdrawFounds(amount)) {
//                    System.out.println("You just withdraw from your account: " + amount + " your balance after this process is " + VladAccount.getBalance() + "$");
//                } else {
//                    System.out.println("You can't withdraw this amount: " + amount + " you have only " + VladAccount.getBalance() + "$");
//                }
//            }
//        }
//        scanner.close();

        //This is for testing VIP person.
        System.out.println("VIP here");
        VipBankAccount VladVipAccount = new VipBankAccount();
        VipBankAccount CorinaVipAccount = new VipBankAccount("Corina", 100, "corina.miscoi04@gmail.com");
        VipBankAccount JonVipAccount = new VipBankAccount("Jon", 20);
        System.out.println(VladVipAccount.getCreditLimit());
        System.out.println(CorinaVipAccount.getCreditLimit());
        System.out.println(JonVipAccount.getCreditLimit());


    }


}