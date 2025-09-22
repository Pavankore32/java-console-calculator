import java.util.Scanner;

public class Calculator {

    public static int add(int a, int b) { return a + b; }
    public static int subtract(int a, int b) { return a - b; }
    public static int multiply(int a, int b) { return a * b; }
    public static double divide(int a, int b) {
        if (b == 0) {
            System.out.println("Error: Cannot divide by zero!");
            return 0;
        }
        return (double) a / b;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean running = true;

        while (running) {
            System.out.println("\n--- Calculator Menu ---");
            System.out.println("1. Add");
            System.out.println("2. Subtract");
            System.out.println("3. Multiply");
            System.out.println("4. Divide");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");
            int choice = sc.nextInt();

            if (choice == 5) {
                running = false;
                System.out.println("Exiting... Thank you!");
                break;
            }

            System.out.print("Enter first number: ");
            int num1 = sc.nextInt();
            System.out.print("Enter second number: ");
            int num2 = sc.nextInt();

            switch (choice) {
                case 1 -> System.out.println("Result: " + add(num1, num2));
                case 2 -> System.out.println("Result: " + subtract(num1, num2));
                case 3 -> System.out.println("Result: " + multiply(num1, num2));
                case 4 -> System.out.println("Result: " + divide(num1, num2));
                default -> System.out.println("Invalid choice!");
            }
        }
        sc.close();
    }
}
