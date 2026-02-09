import java.util.Scanner;

public class greater_of_two {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first integer: ");
        int x = sc.nextInt();

        System.out.print("Enter second integer: ");
        int y = sc.nextInt();
        
        // Compute the larger value using arithmetic operators
        int larger = (x + y + Math.abs(x - y)) / 2;

        System.out.println("Larger value: " + larger);

        sc.close();

    }
}