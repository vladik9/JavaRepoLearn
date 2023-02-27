package Collections.Lear;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class InerHashSet {

    private final String hashSetName;
    Set<String> records;

    public InerHashSet(String hashSetName) {
        this.hashSetName = hashSetName;
        records = new HashSet<>();


    }

    public String getHashSetName() {
        return hashSetName;
    }

    public boolean addSets(String set) {
        records.add(set);
        return true;
    }

    public Set<String> getRecords() {
        return new HashSet<>(records);
    }

    public void printSet() {

        for (String el : records) {
            System.out.println(el);
        }
    }

}
