import java.util.Scanner;

public class string_rev {
    public static void main(String[] args) {
        Scanner sc = new java.util.Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        System.out.println("Reversed string: " + reverseString(input));

        sc.close();
    }

    // Function to reverse a string
    public static String reverseString(String str) {
        StringBuilder reversed = new StringBuilder();

        for (int i = str.length() - 1; i >= 0; i--) {
            reversed.append(str.charAt(i));
        }

        return reversed.toString();
    }
}
