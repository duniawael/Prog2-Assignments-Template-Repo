// dunia wael  id:20216205
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int A = input.nextInt();
        int B = input.nextInt();
        int C = input.nextInt();
        int D = input.nextInt();
        
        long X= (long)A * B - (long)C * D;
        System.out.println("Difference = " + X)
    }
}