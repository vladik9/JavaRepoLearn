package Interface.Learn;

public interface IPhone {
    boolean phoneState = false;

    void calling(int number);

    void answering();

    void dropOff();

    boolean powerButtonState();

    void turnOnPhone();

    void turnOfPhone();
}
