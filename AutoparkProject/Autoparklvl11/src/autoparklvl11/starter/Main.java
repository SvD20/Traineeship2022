package autoparklvl11.starter;

import autoparklvl11.VehicleCollection.VehicleCollection;
import autoparklvl11.comparators.ComparatorByDefectCount;
import autoparklvl11.comparators.ComparatorById;
import autoparklvl11.comparators.ComparatorByManufactureYear;
import autoparklvl11.comparators.ComparatorByTaxPerMonth;
import autoparklvl11.exceptions.DetectedVehicleException;
import autoparklvl11.mechanicservice.MechanicService;
import autoparklvl11.vehicle.Vehicle;
import autoparklvl11.workwithfiles.FileWorker;
import autoparklvl11.workwithfiles.FileWorkerImpl;

import java.io.FileNotFoundException;
import java.util.List;
import java.util.stream.Collectors;


public class Main {

    final static String FILE_PATH_TO_VEHICLES = "C:\\UltimateIdeaProjects\\Autoparklvl5\\Autoparklvl6\\vehicles.csv";
    final static String FILE_PATH_TO_TYPES = "C:\\UltimateIdeaProjects\\Autoparklvl5\\Autoparklvl6\\types.csv";
    final static String FILE_PATH_TO_RENTS = "C:\\UltimateIdeaProjects\\Autoparklvl5\\Autoparklvl6\\rents.csv";
    private static FileWorker fileWorker = new FileWorkerImpl("C:\\UltimateIdeaProjects\\Autoparklvl5\\Autoparklvl9\\orders.csv");

    public static void main(String[] args) throws FileNotFoundException, DetectedVehicleException {

        VehicleCollection vehicleCollection = new VehicleCollection(FILE_PATH_TO_VEHICLES,FILE_PATH_TO_TYPES,
                FILE_PATH_TO_RENTS);
        MechanicService mechanicService = new MechanicService();
        List<Vehicle> vehicles = vehicleCollection.getVehicleList();//список всех машин
        List<Vehicle> brokenVehicles = vehicles.stream().filter(mechanicService::isBroken)
                .collect(Collectors.toList());//список поломанных машин
        List<String> breakings1 = fileWorker.readFromFile();//список поломок
        List<String> breakings2 = breakings1.stream().sorted(new ComparatorByDefectCount()).
                collect(Collectors.toList());//cписок поломок, отсортированный по количеству поломок(строка с самым большим количеством поломок в конце
        int id_of_the_most_breaking_car = Integer.parseInt(breakings2.get(breakings2.size()-1).substring(0,1));
        Vehicle the_most_breaking_car = vehicles.stream().
                filter(vehicle -> vehicle.getId()==id_of_the_most_breaking_car).findFirst().get();
        System.out.println("Самый поломанный автомобиль: " + the_most_breaking_car);//самый поломанный транспорт

        System.out.println("Автомобиль с максимальным дорожным налогом: " +
                vehicles.stream().max(new ComparatorByTaxPerMonth()).get());

        vehicles.stream().filter(vehicle -> vehicle.getModelName().contains("Volkswagen")).
                forEach(System.out::println);//вывод фольксвагенов

        System.out.println("Самый новый Volkswagen: " + vehicles.stream().filter(vehicle -> vehicle.getModelName().contains("Volkswagen")).
                max(new ComparatorByManufactureYear()).get());//вывод самого нового из фольксвагенов

        vehicles.forEach(vehicle -> System.out.println("Вымыта: " + vehicle));//имитация мойки(очередь)

        vehicles.stream().sorted(new ComparatorById()).
                forEach(vehicle -> System.out.println("Выезжает из гаража: " + vehicle));//имитация гаража(стек)

        vehicles.stream().forEach(mechanicService::repair);




    }



}


