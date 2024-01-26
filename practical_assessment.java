

public class practical_assessment {
    public static void multiples(int n) {
        int total = 0;
        for (int i = 0; i < n; i++) {
            if (i % 3 == 0 || i % 5 == 0) {
                total += i;
            }
        }
        System.out.println("The sum of multiples of 3 or 5 below " + n + " is: " + total);
    }

    public static void main(String[] args) {
        multiples(10); // Output should be 23
    }
     public static boolean hasThree(int num1, int num2) {
        boolean containsThree = false;
        
        // Check if either of the numbers is 3
        if (num1 == 3 || num2 == 3) {
            // Check if the sum contains a 3
            int sum = num1 + num2;
            while (sum > 0) {
                if (sum % 10 == 3) {
                    containsThree = true;
                    break;
                }
                sum /= 10;
            }
        }
        
        return containsThree;
    }

    public static void main(String[] args) {
        // Test cases
        System.out.println(hasThree(3, 8));   // Output: true
        System.out.println(hasThree(5, 13));  // Output: true
        System.out.println(hasThree(2, 4));   // Output: false
    }
}