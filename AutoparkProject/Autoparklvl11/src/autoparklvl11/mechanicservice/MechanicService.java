package autoparklvl11.mechanicservice;

import autoparklvl11.vehicle.Vehicle;
import autoparklvl11.workwithfiles.FileWorker;
import autoparklvl11.workwithfiles.FileWorkerImpl;
import java.util.*;

public class MechanicService implements Fixer{

    private FileWorker fileWorker = new FileWorkerImpl("C:\\UltimateIdeaProjects\\Autoparklvl5\\Autoparklvl9\\orders.csv");
    private static String[] details = {"Фильтр","Втулка","Вал","Ось","Свеча","Масло","ГРМ","ШРУС"};

    @Override
    public Map<String, Integer> detectBreaking(Vehicle vehicle) {
        Map<String,Integer> detectedMap = new HashMap<>();
        int indexOfDetail = (int) (Math.random() * (8-0))+0;
        int countOfDetails = (int) (Math.random() * (4 - 1))+1;
        detectedMap.put(details[indexOfDetail],countOfDetails);
        if(fileWorker.writeMapInFile(detectedMap, vehicle.getId())){
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
        List <String> breakings = fileWorker.readFromFile();
        String[] temp;
        for (int i=0; i<breakings.size(); i++){
            temp = breakings.get(i).split(",");
            if(Integer.parseInt(temp[0])==id){//поменя 0 на 1
                breakings.remove(i);
            }
        }
        if(fileWorker.writeListInFile(breakings)){
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
        List <String> breakings = fileWorker.readFromFile();
        for (String str: breakings){
            String[] temp = str.split(",");
            if(Integer.parseInt(temp[0])==id){
                isBroken = true;
            }
        }
        return isBroken;
    }


}
