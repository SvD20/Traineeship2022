package autoparklvl10.mechanicservice;

import autoparklvl10.vehicle.Vehicle;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

public class MechanicService implements Fixer{

    private static String[] details = {"Фильтр","Втулка","Вал","Ось","Свеча","Масло","ГРМ","ШРУС"};
    private final static String PATH_TO_FILE_WITH_ORDERS = "C:\\UltimateIdeaProjects\\Autoparklvl5\\Autoparklvl9\\orders.csv";

    @Override
    public Map<String, Integer> detectBreaking(Vehicle vehicle) {
        Map<String,Integer> detectedMap = new HashMap<>();
        int indexOfDetail = (int) (Math.random() * (8-0))+0;
        int countOfDetails = (int) (Math.random() * (4 - 1))+1;
        detectedMap.put(details[indexOfDetail],countOfDetails);
        if(writeMapInFile(detectedMap, vehicle.getId(), PATH_TO_FILE_WITH_ORDERS)){
            System.out.println("Запись в файл прошла успешно");
        }
        else {
            System.out.println("Запись в файл не прошла");
        }
        return detectedMap;
    }

    @Override
    public void repair(Vehicle vehicle) {
        int id = vehicle.getId();
        boolean isBroken = false;
        List <String> breakings = readFromFile(PATH_TO_FILE_WITH_ORDERS);
        String[] temp;
        for (int i=0; i<breakings.size(); i++){
            temp = breakings.get(i).split(",");
            if(Integer.parseInt(temp[0])==id){//поменя 0 на 1
                breakings.remove(i);
            }
        }
        if(writeListInFile(breakings,PATH_TO_FILE_WITH_ORDERS)){
            System.out.println("Поломки устранены");
        }
        else {
            System.out.println("Поломки не устранены, все плохо");
        }
    }

    @Override
    public boolean isBroken(Vehicle vehicle) {
        int id = vehicle.getId();
        boolean isBroken = false;
        List <String> breakings = readFromFile(PATH_TO_FILE_WITH_ORDERS);
        for (String str: breakings){
            String[] temp = str.split(",");
            if(Integer.parseInt(temp[0])==id){
                isBroken = true;
            }
        }
        return isBroken;
    }

    private boolean writeMapInFile(Map<String,Integer> map,int id,String filepath){
        File file = new File(filepath);
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
          //String text = id + ","  + map.toString() + "\n";
          fileWriter.write(content);
          return true;
        } catch (IOException e) {
            e.printStackTrace();
            return false;
        }
    }

    public List<String> readFromFile(String filepath){
        List<String> breakings = new ArrayList<>();
        File file = new File(filepath);
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

    private boolean writeListInFile(List<String> list, String filepath){
        File file = new File(filepath);
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
