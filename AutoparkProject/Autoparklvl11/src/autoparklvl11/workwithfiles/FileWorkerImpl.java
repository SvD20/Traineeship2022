package autoparklvl11.workwithfiles;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class FileWorkerImpl implements FileWorker{

    private String PATH_TO_FILE_WITH_ORDERS;

    public FileWorkerImpl(String PATH_TO_FILE_WITH_ORDERS) {
        this.PATH_TO_FILE_WITH_ORDERS = PATH_TO_FILE_WITH_ORDERS;
    }

    public boolean writeMapInFile(Map<String,Integer> map, int id){
        File file = new File(this.PATH_TO_FILE_WITH_ORDERS);
        try(FileWriter fileWriter = new FileWriter(file,true)) {
            StringBuilder builder = new StringBuilder();
            for (Map.Entry<String, Integer> temp : map.entrySet()) {
                builder.append(id);
                builder.append(",");
                builder.append(temp.getKey());
                builder.append(",");
                builder.append(temp.getValue().toString());
                builder.append("\n");
            }
            String content = builder.toString();
            fileWriter.write(content);
            return true;
        } catch (IOException e) {
            e.printStackTrace();
            return false;
        }
    }

    public List<String> readFromFile(){
        List<String> breakings = new ArrayList<>();
        File file = new File(this.PATH_TO_FILE_WITH_ORDERS);
        try(
                FileInputStream fileInputStream = new FileInputStream(file);
                Scanner scanner = new Scanner(fileInputStream);
        ){
            while (scanner.hasNextLine()){
                String line = scanner.nextLine();
                breakings.add(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return breakings;
    }

    public boolean writeListInFile(List<String> list){
        File file = new File(this.PATH_TO_FILE_WITH_ORDERS);
        try(FileWriter fileWriter = new FileWriter(file)) {
            for(String str: list){
                fileWriter.write(str+"\n");
            }
            return true;
        } catch (IOException e) {
            e.printStackTrace();
            return false;
        }
    }
}
