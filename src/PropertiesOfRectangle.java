import java.util.*;
public class PropertiesOfRectangle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double length = in.nextDouble();
        double hight = in.nextDouble();

        // Calculate  the properties of  rectangle
        double area =0.5 * (length * hight);
        double perimeter = 2 * (length + hight);
        double diagonal = Math.sqrt(Math.pow(length, 2) + Math.pow(hight, 2));

        // Print  the properties of rectangle
        System.out.println("The Area of this Rectangle is : " + area);
        System.out.println("The perameter of this Rectangle is: " + perimeter);
        System.out.println("The diagonal length of this Rectangle is: " + diagonal);
    }
}
