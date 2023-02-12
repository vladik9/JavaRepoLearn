package Planet.PlanetSpecification;

public abstract class Planet implements IPlanet, ISolarSystem {
    private final String planetName;
    private final int planetPosition;
    private final int planetSize;

    public Planet(String planetName, int planetPosition, int planetSize) {
        this.planetName = planetName;
        this.planetPosition = planetPosition;
        this.planetSize = planetSize;
    }

    public String getPlanetName() {
        return planetName;
    }

    public int getPlanetPosition() {
        return planetPosition;
    }

    public int getPlanetSize() {
        return planetSize;
    }

    @Override
    public void printPlanetName() {

    }

    @Override
    public void printPlanetSize() {

    }

    @Override
    public void printPlaceInSolarSystem() {

    }
}
