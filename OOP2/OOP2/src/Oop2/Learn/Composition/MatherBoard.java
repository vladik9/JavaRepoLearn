package Oop2.Learn.Composition;

public class MatherBoard {
    private String model;
    private String manufacturer;
    private int ramSlots;
    private int cardSlots;
    private String biosModel;

    public MatherBoard(String model, String manufacturer, int ramSlots, int cardSlots, String biosModel) {
        this.model = model;
        this.manufacturer = manufacturer;
        this.ramSlots = ramSlots;
        this.cardSlots = cardSlots;
        this.biosModel = biosModel;
    }

    public String getModel() {
        return model;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public int getRamSlots() {
        return ramSlots;
    }

    public int getCardSlots() {
        return cardSlots;
    }

    public String getBiosModel() {
        return biosModel;
    }

    public void loadProgram(String programName) {
        System.out.println("Program name is now loaded " + programName);
    }

    public void printLogo() {
        System.out.println(model + " is created " + manufacturer + " on bios " + biosModel);
    }

}
