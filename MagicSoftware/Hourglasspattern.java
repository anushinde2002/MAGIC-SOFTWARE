public class Hourglasspattern {
    public static void main(String[] args) {
        int n = 7; // Width of the hourglass at its widest point (must be an odd number)
        printHourglassPattern(n);
    }

    public static void printHourglassPattern(int n) {
        if (n % 2 == 0) {
            System.out.println("Please provide an odd number for the hourglass width.");
            return;
        }

        // Upper part of the hourglass
        for (int i = 0; i < n / 2 + 1; i++) {
            // Print leading spaces
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            // Print asterisks
            for (int j = 0; j < n - 2 * i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // Lower part of the hourglass
        for (int i = n / 2 - 1; i >= 0; i--) {
            // Print leading spaces
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            // Print asterisks
            for (int j = 0; j < n - 2 * i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

}




OUTPUT-
    *******
     *****
      ***
       *
      ***
     *****
    *******
