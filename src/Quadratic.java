import java.util.Scanner;
public class Quadratic {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Kérem, adja meg az 'a' együtthatót (a ≠ 0): ");
        double a = scanner.nextDouble();
        System.out.print("Kérem, adja meg az 'b' együtthatót: ");
        double b = scanner.nextDouble();
        System.out.print("Kérem, adja meg az 'c' együtthatót: ");
        double c = scanner.nextDouble();

        solveQuadraticEquation(a, b, c);

        scanner.close();
    }

    public static void solveQuadraticEquation(double a, double b, double c) {

        double discriminant = b * b - 4 * a * c;

        if (discriminant > 0) {

            double root1 = (-b + Math.sqrt(discriminant)) / (2 * a);
            double root2 = (-b - Math.sqrt(discriminant)) / (2 * a);
            System.out.println("Két valós gyök van:");
            System.out.println("Gyök 1: " + root1);
            System.out.println("Gyök 2: " + root2);
        } else if (discriminant == 0) {

            double root = -b / (2 * a);
            System.out.println("Egy valós gyök van:");
            System.out.println("Gyök: " + root);
        } else {

            System.out.println("Nincs valós gyök.");
        }
    }
}