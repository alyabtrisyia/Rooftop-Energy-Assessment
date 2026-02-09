import java.util.Scanner;

public class count_digit {
    public static void main(String[] args) {
        Scanner sc = new java.util.Scanner(System.in);
        
        System.out.print("Enter positive integer: ");
        int n = sc.nextInt();
        
        System.out.println("Number of digit 3: " + countDigit(n));
        
        sc.close();
    }

    // Function to count digit 3 in a number
    public static int countDigit(int n) {
        int count = 0;

        while (n > 0) {
            int digit = n % 10;  // Extract the last digit
            if (digit == 3) {
                count++;
            }
            n /= 10;  // Remove the last digit
        }

        return count;
    }
}
