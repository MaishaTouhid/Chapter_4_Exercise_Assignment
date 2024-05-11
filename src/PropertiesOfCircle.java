import java.util.*;
public class PropertiesOfCircle {
    public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    double radius = in.nextDouble();

        // Calculate the  properties of circle
        double circleArea = Constant.PI * radius * radius;
        double circleCircumference = 2 * Constant.PI * radius;

        // Calculate the properties of sphere
        double sphereVolume = (4.0 / 3.0) * Constant.PI * Math.pow(radius, 3);
        double sphereSurfaceArea = 4 * Constant.PI * Math.pow(radius, 2);

        // Print circle properties
        System.out.println("Circle Area: " + circleArea);
        System.out.println("Circle Circumference: " + circleCircumference);

        // Print sphere properties
        System.out.println("Sphere Volume: " + sphereVolume);
        System.out.println("Sphere Surface Area: " + sphereSurfaceArea);

    }
}
