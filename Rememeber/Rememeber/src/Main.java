import Planet.PlanetSpecification.Planets.*;
import Planet.PlanetSpecification.Planet;
import Planet.PlanetSpecification.SolarSystem;

public class Main {
    public static void main(String[] args) {

        int num = 1;
        for (char row = 'A'; row <= 'X'; row++) {


            System.out.println(row + String.format("%02d", num));
            num++;
        }

        Planet mercury = new Mercury("Mercury", 1, 3285);
        Planet venus = new Venus("Venus", 2, 45646);
        Planet earth = new Earth("Earth", 3, 435363);
        Planet mars = new Mars("Mars", 4, 3456363);

        Planet jupiter = new Jupiter("Jupiter", 5, 345643678);
        Planet saturn = new Saturn("Saturn", 6, 343636);
        Planet uranus = new Uranus("Uranus", 7, 6457457);
        Planet pluto = new Pluto("Pluto", 8, 252352);

        SolarSystem<Planet> solarSystem = new SolarSystem<>();
        solarSystem.addPlanetToSolarSystem(mercury);
        solarSystem.addPlanetToSolarSystem(venus);
        solarSystem.addPlanetToSolarSystem(earth);
        solarSystem.addPlanetToSolarSystem(mars);
        solarSystem.addPlanetToSolarSystem(jupiter);
        solarSystem.addPlanetToSolarSystem(saturn);
        solarSystem.addPlanetToSolarSystem(uranus);
        solarSystem.addPlanetToSolarSystem(pluto);
        solarSystem.printSolarSystem();

        Planet JetelBase = new Planet("JetelBase", 0, 346346346) {
            @Override
            public String getPlanetName() {
                return super.getPlanetName();
            }

            @Override
            public int getPlanetPosition() {
                return super.getPlanetPosition();
            }

            @Override
            public int getPlanetSize() {
                return super.getPlanetSize();
            }

            @Override
            public void printPlanetName() {
                super.printPlanetName();
            }

            @Override
            public void printPlanetSize() {
                super.printPlanetSize();
            }

            @Override
            public void printPlaceInSolarSystem() {
                super.printPlaceInSolarSystem();
            }
        };
        solarSystem.addPlanetToSolarSystem(JetelBase);
        solarSystem.printSolarSystem();
    }


    static void printPlanetInfo(Planet planet) {
        System.out.println("My name is: " + planet.getPlanetName() + " and i am "
                + planet.getPlanetPosition() + " with the mass " + planet.getPlanetSize() + " kg");

    }
}