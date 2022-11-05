package autoparklvl7.utils;


import autoparklvl7.engines.DieselEngine;
import autoparklvl7.engines.ElectricalEngine;
import autoparklvl7.engines.GasolineEngine;
import autoparklvl7.vehicle.Color;

public class TechnicalSpecialist {

    public static final int LOWER_LIMIT_MANUFACTURE_YEAR = 1886;

    private TechnicalSpecialist() {
    }

    public static boolean validateManufactureYear(int year) {
        int sizeOfNumber = String.valueOf(year).toCharArray().length;
        return year >= LOWER_LIMIT_MANUFACTURE_YEAR && sizeOfNumber == 4;
    }

    public static boolean validateMileage(int mileage) {
        return mileage >= 0;
    }

    public static boolean validateWeight(int weight) {
        return weight > 0;
    }

    public static boolean validateColorString(String color) {
        for(Color str: Color.values()){
            if (str.name().equalsIgnoreCase(color)){
                return true;
            }
        }
        return false;
        //if (color.matches("[A-Za-z]"));
    }

    public static boolean validateVehicleType(String type) {
        String[] strings = type.split(",");
        if (!strings[0].isEmpty() && strings[0]!="null" && Double.parseDouble(strings[1])>0) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean validateRegistrationNumber(String number) {
        if (number != null) {
            return number.matches("\\d{4}\\s[A-Z]{2}-\\d");
        } else {
            return false;
        }
    }

    public static boolean validateModelName(String name) {
        return !name.isEmpty();
    }

    public static boolean validateElectricalEngine(ElectricalEngine electricalEngine) {
        return electricalEngine.getButterySize()>0 && electricalEngine.getElectricityConsumption()>0;
    }

    public static boolean validateGasolineEngine(GasolineEngine gasolineEngine) {
        return gasolineEngine.getEngineCapacity()>0 && gasolineEngine.getFuelTankCapacity()>0
                && gasolineEngine.getFuelConsumptionPer100()>0;
    }

    public static boolean validateDieselEngine(DieselEngine dieselEngine) {
        return dieselEngine.getEngineCapacity()>0 && dieselEngine.getFuelTankCapacity()>0
                && dieselEngine.getFuelConsumptionPer100()>0;
    }

}
