
// dunia wael  id:20216205
import java.util.Scanner;

public class SortNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();

        // find the smallest number
        int smallest = Math.min(a, Math.min(b, c));

        // find the largest number
        int largest = Math.max(a, Math.max(b, c));

        // find the middle number
        int middle = (a + b + c) - smallest - largest;

        // print numbers in ascending order
        System.out.println(smallest);
        System.out.println(middle);
        System.out.println(largest);

        // print numbers in the sequence they were read
        System.out.println();
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }
}

