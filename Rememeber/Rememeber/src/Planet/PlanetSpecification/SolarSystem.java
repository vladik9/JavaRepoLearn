package Planet.PlanetSpecification;

import java.util.ArrayList;

import java.util.ListIterator;

public class SolarSystem<T extends Planet> {
    private final ArrayList<T> solarSystem;

    public SolarSystem() {
        this.solarSystem = new ArrayList<T>();
    }

    public ArrayList<T> getSolarSystem() {
        return solarSystem;
    }

    public boolean addPlanetToSolarSystem(T planet) {
        solarSystem.add(planet);
        return true;
    }

    public boolean addListOfPlanetToSolarSystem(ArrayList<T> planets) {
        solarSystem.addAll(planets);
        return true;
    }


    public boolean removeAPlanetFromSolarSystem(T planet) {
        int isPlanetInArray = solarSystem.indexOf(planet);
        if (isPlanetInArray == -1) {
            System.out.println("Planet is not in the list");
            return false;
        } else {
            System.out.println(planet.getPlanetName() + " was removed from the solar system.");
            solarSystem.remove(isPlanetInArray);
            return true;
        }
    }

    public void printSolarSystem() {
        ListIterator<T> iterator = solarSystem.listIterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next().getPlanetPosition());
            iterator.previous();
            System.out.println(" " + iterator.next().getPlanetName());
        }
    }
}
