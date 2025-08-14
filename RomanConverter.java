import java.util.*;
 class RomanToInteger {
 private static final Map<Character, Integer> romanMap = new HashMap<>();
    static {
        romanMap.put('I', 1);
        romanMap.put('V', 5);
        romanMap.put('X', 10);
        romanMap.put('L', 50);
        romanMap.put('C', 100);
        romanMap.put('D', 500);
        romanMap.put('M', 1000);
    }

  
    public static int romanToInt(String s) {
        int sum = 0;
        for (int i = 0; i < s.length(); i++) {
            int current = romanMap.get(s.charAt(i));
            if (i + 1 < s.length()) {
                int next = romanMap.get(s.charAt(i + 1));
                if (current >= next) {
                    sum += current;
                } else {
                    sum += (next - current);
                    i++;
                }
            } else {
                sum += current;
            }
        }
        return sum;
    }

    public static boolean isValidRoman(String s) {
        return s.matches("[IVXLCDM]+");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Roman numeral (uppercase, e.g. MCMIV): ");
        String input = sc.nextLine().trim();

        if (!isValidRoman(input)) {
            System.out.println("Invalid input. Only characters I, V, X, L, C, D, M are allowed.");
        } else {
            try {
                int result = romanToInt(input);
                System.out.printf("Roman '%s' converts to integer: %d%n", input, result);
            } catch (Exception e) {
                System.out.println("Error converting input: " + e.getMessage());
            }
        }
        sc.close();
    }
}
