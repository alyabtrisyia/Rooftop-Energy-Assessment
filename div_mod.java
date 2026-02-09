import java.util.Scanner;

public class div_mod {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first integer: ");
        int x = sc.nextInt();

        System.out.print("Enter second integer: ");
        int y = sc.nextInt();

        try {
            Result res = divModCalc(x, y);
            System.out.println("Quotient: " + res.quotient);
            System.out.println("Remainder: " + res.remainder);
        } 
        
        catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }

        sc.close();
    }

    // Function to calculate quotient and remainder of two integers
    public static Result divModCalc(int x, int y){
        // Check for division by zero
        if (y == 0) 
            throw new ArithmeticException("Cannot divide by zero");

        long a = x, b = y;

        // Sign of quotient
        boolean quot = (a < 0) ^ (b < 0);
        
        // Convert to positive values
        if (a < 0) 
            a = -a; 
        if (b < 0) 
            b = -b;

        long q = 0, r = a;
        
        // Calculate quotient and remainder using long arithmetic
        while (r >= b) {
            r -= b;
            q++;
        }
        
        if (quot)
            q = -q;
        
        if (x < 0) 
            r = -r;

        return new Result((int) q, (int) r);
    }

    // Class to store quotient and remainder
    static class Result {
        final int quotient;
        final int remainder;
        
        Result(int q, int r) { 
            this.quotient = q; 
            this.remainder = r; 
        }
    }
}
