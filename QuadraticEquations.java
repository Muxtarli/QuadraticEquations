import java.util.Scanner;

public class QuadraticEquations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first num: ");
        int a = sc.nextInt();
        System.out.println("Enter second num: ");
        int b = sc.nextInt();
        System.out.println("Enter third num: ");
        int c = sc.nextInt();

        if (b * b - 4 * a * c > 0)
            System.out.println("Quadratic equation has 2 roots x1 = -2 | x2 = -3");
        else if (b * b - 4 * a * c == 0)
            System.out.println("Quadratic equation has 1 root");
        else
            System.out.println("Quadratic equation has no solution");

    }
}
