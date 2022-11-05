package by.incubator;

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
        if(type==null) throw new NullPointerException("String " + type + " is empty");
        String[] strings = type.split(",");
        if (!strings[0].isEmpty() && !strings[0].equalsIgnoreCase("null") && Double.parseDouble(strings[1]) > 0) {
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
        return name.isEmpty();
    }


}
