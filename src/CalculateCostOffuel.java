import java.util.*;
public class CalculateCostOffuel {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double gallonsOfGas = in.nextDouble();
        double fuelEfficiency = in.nextDouble();
        double pricePerGallon = in.nextDouble();
        double costPer100Miles = (100.0 / fuelEfficiency) * pricePerGallon;
        double mile = gallonsOfGas * fuelEfficiency;

        System.out.println("Cost per 100 miles: " + costPer100Miles +" Taka");
        System.out.println("Distance the car can go with : " + mile + " miles");

    }
}
