package Interface.SaveObject;

import java.util.ArrayList;
import java.util.List;

public class Cars implements ISaveable {
    private String carName;
    private int carNumberOfDoors;
    private String feulType;

    public Cars(String carName, int carNumberOfDoors, String feulType) {
        this.carName = carName;
        this.carNumberOfDoors = carNumberOfDoors;
        this.feulType = feulType;
    }


    @Override
    public List<String> returnArrayList() {
        List<String> carsList = new ArrayList<String>();
        carsList.add(carName);
        carsList.add("" + carNumberOfDoors);
        carsList.add(feulType);
        return carsList;
    }

    @Override
    public boolean saveArrayList(List<String> s) {
        return true;
    }

    @Override
    public String toString() {
        return "My car name is " +
                carName + " and has " + carNumberOfDoors +
                " and eats " + feulType;
    }

}
