import java.util.Scanner;

/**
 * This program determines whether an integer is a multiple of 100.
 * It demonstrates a reusable method that can also be used in other programs.
 *
 * @author julian Sanchez Mesa
 */
public class MultipleOfOneHundred {

    /**
     * Checks whether a number is a multiple of 100.
     *
     * @param number The integer number to evaluate.
     * @return true if the number is a multiple of 100; otherwise, false.
     */
    public static boolean isMultipleOfOneHundred(int number) {
        return number % 100 == 0;
    }

    /**
     * Starts the program and reads an integer from the standard input.
     *
     * @param args Command line arguments.
     */
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an integer number: ");
        int number = scanner.nextInt();

        if (isMultipleOfOneHundred(number)) {
            System.out.println("multiple of 100");
        } else {
            System.out.println("not multiple of 100");
        }

        scanner.close();
    }
}
