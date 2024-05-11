import java.util.*;
public class OperationOfTwoNumber {
    public static void main(String[] args) {
        //input two number
        Scanner in = new Scanner(System.in);
        double number1 = in.nextDouble();
        double number2 = in.nextDouble();
        //operation
        double sum = number1 + number2;
        double difference = number1 - number2;
        double product = number1 * number2;
        double average = sum / 2;
        double distance = Math.abs(difference);
        double maximum = Math.max(number1, number2);
        double minimum = Math.min(number1, number2);
        //print output
        System.out.println("SUM : " +sum);
        System.out.println("DIFFERENCE : "+ difference);
        System.out.println("PRODUCT : "+ product);
        System.out.println("AVERAGE : "+ average);
        System.out.println("DISTANCE : "+ distance);
        System.out.println("MAXIMUM : "+ maximum);
        System.out.println("MINIMUM : "+ minimum);
    }
}
