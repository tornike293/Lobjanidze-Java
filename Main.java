import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    // Task 1.1: number greater than 7 -> "Hello"
    static void checkNumber(double number) {
        if (number > 7) {
            System.out.println("Hello");
        } else {
            System.out.println("(number is not greater than 7, nothing to print)");
        }
    }

    // Task 1.2: name equals "John" -> "Hello, John", otherwise "There is no such name"
    static void checkName(String name) {
        if ("John".equals(name)) {
            System.out.println("Hello, John");
        } else {
            System.out.println("There is no such name");
        }
    }

    // Task 1.3: elements of the array that are multiples of 3
    static List<Integer> multiplesOfThree(int[] array) {
        List<Integer> result = new ArrayList<>();
        for (int value : array) {
            if (value % 3 == 0) {
                result.add(value);
            }
        }
        return result;
    }

    // Task 2: bracket sequence validation (stack based)
    static boolean isValidBrackets(String s) {
        java.util.Deque<Character> stack = new java.util.ArrayDeque<>();
        for (char c : s.toCharArray()) {
            if (c == '(' || c == '[' || c == '{') {
                stack.push(c);
            } else if (c == ')' || c == ']' || c == '}') {
                if (stack.isEmpty()) return false;
                char open = stack.pop();
                if ((c == ')' && open != '(') || (c == ']' && open != '[') || (c == '}' && open != '{')) {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        checkNumber(Double.parseDouble(scanner.nextLine().trim()));

        System.out.print("Enter a name: ");
        checkName(scanner.nextLine().trim());

        System.out.print("Enter array numbers separated by spaces: ");
        String line = scanner.nextLine().trim();
        if (line.isEmpty()) {
            System.out.println("Array is empty");
        } else {
            String[] parts = line.split("\\s+");
            int[] array = new int[parts.length];
            for (int i = 0; i < parts.length; i++) {
                array[i] = Integer.parseInt(parts[i]);
            }
            System.out.println("Multiples of 3: " + multiplesOfThree(array));
        }

        String given = "[((())()(())]]";
        String fixed = "[((())()(()))]";
        System.out.println("Bracket sequence " + given + " valid? " + isValidBrackets(given));
        System.out.println("Fixed sequence " + fixed + " valid? " + isValidBrackets(fixed));
    }
}