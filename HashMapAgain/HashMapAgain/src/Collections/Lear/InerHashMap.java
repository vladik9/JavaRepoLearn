package Collections.Lear;

import java.util.HashMap;
import java.util.Map;

public class InerHashMap {
    private final String dictionaryName;
    private Map<String, String> logoDictionary;

    public InerHashMap(String dictionaryName) {
        this.dictionaryName = dictionaryName;
        logoDictionary = new HashMap<>();
    }

    public String getDictionaryName() {
        return dictionaryName;
    }

    public boolean addToDictionary(String logo, String description) {
        logoDictionary.put(logo, description);
        return true;
    }

    public Map<String, String> getLogoDictionary() {
        return new HashMap<>(logoDictionary);
    }

    public void printDictionary() {
        for (String i : logoDictionary.keySet()) {
            System.out.println(i);
            System.out.println(logoDictionary.get(i));
        }
    }
}
