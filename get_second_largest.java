import java.util.Arrays;
import java.util.OptionalInt;

public class get_second_largest {
    public static void main(String[] args) {
        
        int[] nums = {3, 1, 4, 1, 5, 9, 7};

        System.out.println(secondLargest(nums).orElseThrow()); 
    }

    // Function to check second largest number
    public static OptionalInt secondLargest(int[] arr) {
        if (arr == null || arr.length < 2) return OptionalInt.empty();

        int[] copy = Arrays.copyOf(arr, arr.length);
        Arrays.sort(copy); 

        int max = copy[copy.length - 1];

        for (int i = copy.length - 2; i >= 0; i--) {
            if (copy[i] != max) return OptionalInt.of(copy[i]);
        }
        return OptionalInt.empty(); 
    }
}
