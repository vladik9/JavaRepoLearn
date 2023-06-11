
import java.io.*;
import java.util.*;


public class Locations implements Map<Integer, Location> {
    private static Map<Integer, Location> locations = new HashMap<>();


    static {
        try (Scanner scanner = new Scanner(new FileReader("bigLocations.txt"))) {
//            scanner = new Scanner(new FileReader("locations.txt"));
//            scanner = new Scanner(new FileReader("bigLocations.txt"));
            scanner.useDelimiter(",");
            while (scanner.hasNextLine()) {
                int loc = scanner.nextInt();
                scanner.skip(scanner.delimiter());
                String description = scanner.nextLine();
//                System.out.println("Location imported " + loc + " : " + description);
                Map<String, Integer> tempExit = new HashMap<>();
                locations.put(loc, new Location(loc, description, tempExit));
            }

        } catch (IOException e) {
            e.printStackTrace();
        }


        try (Scanner scanner = new Scanner(new BufferedReader(new FileReader("bigDirections.txt")))) {
            scanner.useDelimiter(",");
            while (scanner.hasNextLine()) {

//                in case we want a string reader
                String input = scanner.nextLine();
                //getting a regular string here
                String[] data = input.split(",");
                int loc = Integer.parseInt(data[0]);
                String direction = data[1];
                int destination = Integer.parseInt(data[2]);

//                System.out.println(loc + " : " + direction + " : " + destination);
                Location location = locations.get(loc);
                location.addExit(direction, destination);
            }
        } catch (IOException e) {
            e.printStackTrace();


        }
    }


    @Override
    public int size() {
        return locations.size();
    }

    @Override
    public boolean isEmpty() {
        return locations.isEmpty();
    }

    @Override
    public boolean containsKey(Object key) {
        return locations.containsKey(key);
    }

    @Override
    public boolean containsValue(Object value) {
        return locations.containsValue(value);
    }

    @Override
    public Location get(Object key) {
        return locations.get(key);
    }

    @Override
    public Location put(Integer key, Location value) {
        return locations.put(key, value);
    }

    @Override
    public Location remove(Object key) {
        return locations.remove(key);
    }

    @Override
    public void putAll(Map<? extends Integer, ? extends Location> m) {

    }

    @Override
    public void clear() {
        locations.clear();

    }

    @Override
    public Set<Integer> keySet() {
        return locations.keySet();
    }

    @Override
    public Collection<Location> values() {
        return locations.values();
    }

    @Override
    public Set<Entry<Integer, Location>> entrySet() {
        return locations.entrySet();
    }
}