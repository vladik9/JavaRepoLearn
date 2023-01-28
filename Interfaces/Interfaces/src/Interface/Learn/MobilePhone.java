package Interface.Learn;

public class MobilePhone implements IPhone, IPc {
    boolean phoneState;
    boolean isGamesOnDevice;

    public MobilePhone(boolean phoneState, boolean isGamesOnPhone) {
        this.phoneState = phoneState;
        this.isGamesOnDevice = isGamesOnPhone;
    }

    public boolean isGamesOnDevice() {
        return isGamesOnDevice;
    }

    public void setGamesOnDevice(boolean gamesOnDevice) {
        isGamesOnDevice = gamesOnDevice;
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