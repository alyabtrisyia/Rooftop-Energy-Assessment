import java.util.*;

public class first_uniq_char {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String s = sc.nextLine();

        System.out.print(firstNonRepeating(s));

        sc.close();
    }

    // Function to find first non-repeating character in a string
    public static Character firstNonRepeating(String s) {
        if (s == null || s.length() == 0) return null;

        Map<Character, Integer> freq = new HashMap<>();

        // Count frequency 
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            Integer count = freq.get(c);
            if (count == null) {
                freq.put(c, 1);
            } else {
                freq.put(c, count + 1);
            }
        }

        // Find first character with count == 1
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (freq.get(c) == 1) return c;
        }

        return null;
    }
}
