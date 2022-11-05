package by.incubator;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter please count of flights");
        int sizeOfArray = Integer.parseInt(bufferedReader.readLine());
        Belavia[] flights = new Belavia[sizeOfArray];
        String flightDestination = null;
        int numberAircraft = 0;
        String type = null;
        for (int i = 0; i < flights.length; i++){
            System.out.println("Enter please flight");
            flightDestination = bufferedReader.readLine();
            numberAircraft = Integer.parseInt(bufferedReader.readLine());
            type = bufferedReader.readLine();
            flights[i]=new Belavia(flightDestination,numberAircraft,type);
        }
        Arrays.sort(flights);
        System.out.println("Enter please desired aircraft type");
        String desiredAircraftType = bufferedReader.readLine();
        int nodetected = 0;
        for(int i = 0; i < flights.length; i++){
            if(flights[i].getType().equals(desiredAircraftType)){
                System.out.print(flights[i].getFlightDestination() + " ");
                System.out.println(flights[i].getNumberAircraft());
            }
            else{
                nodetected++;
            }
        }
        if (nodetected == sizeOfArray){
            System.out.println("No flights detected");
        }

    }
}
