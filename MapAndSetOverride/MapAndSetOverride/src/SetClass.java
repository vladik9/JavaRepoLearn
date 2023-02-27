import java.util.*;

public class SetClass {
    public final String setName;
    public final Set<SetClass> setClassSet;

    public SetClass(String setName) {
        this.setName = setName;
        setClassSet = new HashSet<>();
    }

    public boolean addIntoSet(SetClass setItem) {
        setClassSet.add(setItem);
         
        return true;
    }

    public String getSetName() {
        return setName;
    }

    public void printSetItems() {
//        for (SetClass el : setClassSet) {
//            System.out.println(el.getSetName());
//        }
        Iterator<SetClass> it = setClassSet.iterator();
        while (it.hasNext()) {
            System.out.println((it.next().getSetName()));
        }

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        SetClass setClass = (SetClass) o;

        if (!Objects.equals(setName, setClass.setName)) return false;
        return Objects.equals(setClassSet, setClass.setClassSet);
    }

    @Override
    public int hashCode() {
        int result = setName != null ? setName.hashCode() : 0;
        result = 31 * result + (setClassSet != null ? setClassSet.hashCode() : 0);
        return result;
    }
}
