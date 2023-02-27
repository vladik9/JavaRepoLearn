package SomePackege.Remember;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class Hashes {

    private final String collectionName;
    private final Set<Hashes> hashSet;


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Hashes hashes = (Hashes) o;
        return Objects.equals(collectionName, hashes.collectionName) && Objects.equals(hashSet, hashes.hashSet);
    }

    @Override
    public int hashCode() {
        return Objects.hash(collectionName, hashSet);
    }

    public Hashes(String collectionName) {
        this.collectionName = collectionName;
        hashSet = new HashSet<>();
    }

    public String getCollectionName() {
        return collectionName;
    }

    public Set<Hashes> getHasSet() {
        return new HashSet<>(hashSet);
    }

    public boolean addIntoSet(Hashes hash) {
        if (!this.equals(hash)) {
            hashSet.add(hash);
            return true;
        } else return false;

    }


    public void printMyCollection() {

        for (Hashes has : hashSet) {
            System.out.println(has.getCollectionName());
        }
    }
}
