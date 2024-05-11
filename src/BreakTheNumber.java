import java.util.*;
public class BreakTheNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int  number  = in.nextInt();
        while (number > 0) {
            int digit = number % 10;
            System.out.print(digit + " ");
            number = number / 10;
        }
    }
}