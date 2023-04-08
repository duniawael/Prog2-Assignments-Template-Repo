// dunia wael  id:20216205
import java.util.Scanner;

public class DataTypes {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int i = input.nextInt();
        long l = input.nextLong();
        char c = input.next().charAt(0);
        float f = input.nextFloat();
        double d = input.nextDouble();

        System.out.println(i);
        System.out.println(l);
        System.out.println(c);
        System.out.println(f);
        System.out.printf("%.1f", d);
    }
}
