import java.util.*;
public class TicTacToeGrid {
    public static void main(String[] args) {
        String combPattern = "+--+--+--+\n|  |  |  |\n";
        String bottomLine = "+--+--+--+";

        for (int i = 0; i < 3; i++) {
            System.out.print(combPattern);
        }
        System.out.println(bottomLine);
    }
}
