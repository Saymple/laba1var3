import java.util.Scanner;

public class Variant3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Введите a: ");
        double a = input.nextDouble();

        System.out.print("Введите b: ");
        double b = input.nextDouble();

        System.out.print("Введите c: ");
        double c = input.nextDouble();

        System.out.print("Введите x: ");
        double x = input.nextDouble();

        double Q = Math.log(3 + x) / (1 - Math.exp(5));

        double F = (2 * a * Math.exp(2 * x)
                - Math.sqrt(1 - 1.5 * Math.pow(Math.sin(x), 2)))
                / (0.3 * a * b - x);

        double Z = (a + Math.sqrt(Math.pow(c, 3))) * Math.sin(x)
                + Math.pow(c, 3)
                / ((Math.pow(a, 3) - Math.pow(c, 3)) * (a - 4));

        System.out.println("Q = " + Q);
        System.out.println("F = " + F);
        System.out.println("Z = " + Z);
    }
}