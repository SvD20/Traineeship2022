package autoparklvl11.workwithfiles;

import java.util.List;
import java.util.Map;

public interface FileWorker {
    boolean writeMapInFile(Map<String,Integer> map, int id);
    List<String> readFromFile();
    boolean writeListInFile(List<String> list);
}
