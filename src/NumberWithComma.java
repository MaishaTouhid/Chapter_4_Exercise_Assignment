import java.util.*;
public class NumberWithComma {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Please enter an integer between 1000 and 999999: ");
        String number = in.nextLine();
        int lengthh = number.length();
        int x = lengthh /2 ;
        String numberWithComma = number.substring(0,x);
        System.out.print(numberWithComma);
        System.out.print(",");
        String numberWithComma1 = number.substring(x);
        System.out.print(numberWithComma1);

    }
}
