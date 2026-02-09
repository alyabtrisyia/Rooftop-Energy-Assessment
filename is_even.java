import java.util.Scanner;

public class is_even {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // User enter input 
        System.out.print("Enter an integer: ");
        int n = sc.nextInt();
        
        // Check a condition and print the result
        if (isEven(n)) {
            System.out.println(n + " is even");
        } else {
            System.out.println(n + " is odd");
        }

        sc.close();
    }

    // Function to check if an integer is even
    public static boolean isEven(int n) {
        return n % 2 == 0;  // Return true if it's even, false otherwise
    }
}
