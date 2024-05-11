import java.util.*;
public class RemoveCommaInAString{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Please enter an integer between 1,000 and 999,999: ");
        String number = in.nextLine();
      /*  int lengthh = number.length();
        int x = lengthh /2 ;
        String numberWithoutComma = number.substring(0,x);
        System.out.print(numberWithoutComma);
        String numberWithoutComma1 = number.substring(x);
        System.out.print(numberWithoutComma1);
        */
        String numberWithoutComma = number.replace(",", "");
        System.out.println(numberWithoutComma);

    }
}