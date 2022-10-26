import java.util.Scanner;

public class Hypotenuse {
    public static void main(String[] args) {
        double x;
        double y;
        double z;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter side x: ");
        x = scanner.nextDouble();
        System.out.println("Enter side y: ");
        y = scanner.nextDouble();

        z = Math.round(Math.sqrt((Math.pow(x, 2) + Math.pow(y, 2))));
        System.out.println("Angle X is " + x);
        System.out.println("Angle Y is " + y);
        System.out.println("The hypotenuse of the triangle is " + z);
        scanner.close();
    }
}
