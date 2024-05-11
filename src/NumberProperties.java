import java.util.*;
public class NumberProperties{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double number = in.nextDouble();
        double  squar = (number * number);
        double cube = (number * number * number);
        double quard = Math.pow(number,4);
        System.out.println("The Square of the number is : " + squar);
        System.out.println("The cude of the number is : " + cube);
        System.out.println("The fourth power of the number is : " + quard);
    }
}