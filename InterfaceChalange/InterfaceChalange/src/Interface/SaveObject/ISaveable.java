package Interface.SaveObject;

import java.util.ArrayList;
import java.util.List;

public interface ISaveable {
    List<String> returnArrayList();

    boolean saveArrayList(List<String> s);

}
