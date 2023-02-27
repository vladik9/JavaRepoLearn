import java.util.HashMap;
import java.util.Map;

public class Main2HashMap {

    public static void main(String[] args) {
        Map<String, String> myCollection = new HashMap<>();


        myCollection.put("New York", "USA");
        myCollection.put("Brazil", "Brazil");
        myCollection.put("Chisinau", "Moldova");


        System.out.println(myCollection.keySet());

        for (String item : myCollection.keySet()) {
            System.out.println("Items is: " + item);
        }
        for (String item : myCollection.keySet()) {
            System.out.println("Values is: " + myCollection.get(item));
        }

    }


}
