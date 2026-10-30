import java.util.Scanner;

public class shapes {

    // 1. Right Triangle
    public static void rightTriangle(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    // 2. Inverted Right Triangle
    public static void invertedRightTriangle(int n) {
        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    // 3. Pyramid
    public static void pyramid(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    // 4. Inverted Pyramid
    public static void invertedPyramid(int n) {
        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    // 5. Number Triangle (1, 12, 123, ...)
    public static void numberTriangle(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size of the pattern (number of rows): ");
        int size = scanner.nextInt();

        if (size <= 0) {
            System.out.println("Error: size must be greater than 0");
            scanner.close();
            return;
        }

        System.out.println("Choose the pattern type:");
        System.out.println("1 - Right Triangle");
        System.out.println("2 - Inverted Right Triangle");
        System.out.println("3 - Pyramid");
        System.out.println("4 - Inverted Pyramid");
        System.out.println("5 - Number Triangle");
        System.out.print("Your choice: ");
        int choice = scanner.nextInt();

        System.out.println();

        switch (choice) {
            case 1:
                rightTriangle(size);
                break;
            case 2:
                invertedRightTriangle(size);
                break;
            case 3:
                pyramid(size);
                break;
            case 4:
                invertedPyramid(size);
                break;
            case 5:
                numberTriangle(size);
                break;
            default:
                System.out.println("Error: please choose a number from 1 to 5");
        }

        scanner.close();
    }
}