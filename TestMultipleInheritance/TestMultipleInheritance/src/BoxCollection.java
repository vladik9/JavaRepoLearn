import java.util.HashSet;;
import java.util.Set;

public class BoxCollection {

    private final Set<Box> boxSet;

    public BoxCollection() {
        this.boxSet = new HashSet<>();
    }

    public Set<Box> getBoxSet() {
        return new HashSet<>(this.boxSet);
    }

    public boolean addIntoBoxSet(Box box) {
        if (boxSet.add(box)) return true;
        else return false;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        BoxCollection that = (BoxCollection) o;

        return getBoxSet().equals(that.getBoxSet());
    }

    @Override
    public int hashCode() {
        return getBoxSet().hashCode();
    }

    public void printCollection() {
        for (Box box : boxSet) {
            System.out.println(box.getBoxPurpose());

        }

    }
}
