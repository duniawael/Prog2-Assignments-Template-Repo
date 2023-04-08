
// dunia wael  id:20216205
import java.util.Scanner;

public class DataTypes {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int X = input.nextInt();
        char digitChar = Integer.toString(X).charAt(0);
        int digit = Character.getNumericValue(digitChar);
        if (digit % 2 == 0) {
            System.out.println("EVEN");
        } else {
            System.out.println("ODD");
        }

    }
}
