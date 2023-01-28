import Interface.Learn.DeskPhone;
import Interface.Learn.IPc;
import Interface.Learn.IPhone;
import Interface.Learn.MobilePhone;

public class Main {
    public static void main(String[] args) {
        System.out.println("Main method here.");
        IPhone localPhone = new DeskPhone(true);
        if (localPhone.powerButtonState()) {
            localPhone.calling(142215151);
        } else {
            System.out.println("Phone is off you need to turn it on first");
        }

        MobilePhone mobilePhone = new MobilePhone(true, true);

        if (mobilePhone.powerButtonState() && mobilePhone.isGamesOnDevice()) {
            System.out.println("You can play games on this phone");
        } else {
            System.out.println("Don't have games installed yet.");
        }


    }
}