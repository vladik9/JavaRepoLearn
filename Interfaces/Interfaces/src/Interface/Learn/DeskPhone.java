package Interface.Learn;

public class DeskPhone implements IPhone {
    boolean phoneState;

    public DeskPhone(boolean phoneState) {
        this.phoneState = phoneState;
    }

    @Override
    public void calling(int number) {
        System.out.println("Calling the number " + number);
    }

    @Override
    public void answering() {
        System.out.println("Answering to call.");
    }

    @Override
    public void dropOff() {
        System.out.println("Dropping off");

    }

    @Override
    public boolean powerButtonState() {
        return this.phoneState;


    }

    @Override
    public void turnOnPhone() {
        this.phoneState = true;

    }

    @Override
    public void turnOfPhone() {
        this.phoneState = false;

    }
}
