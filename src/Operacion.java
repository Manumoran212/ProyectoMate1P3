import java.util.Scanner;

public class Operacion {
    public static void main(String[] args) {
        double a, b, c, a2, b2, c2, r;
        String ang;
        Scanner leer = new Scanner(System.in);

        System.out.println("Inserte su ángulo");
        ang = leer.nextLine();

        System.out.println("Inserte el lado a");
        a = leer.nextDouble();
        a2 = a;

        System.out.println("Inserte el lado b");
        b = leer.nextDouble();
        b2 = b;

        System.out.println("Inserte el lado c");
        c = leer.nextDouble();
        c2 = c;

        a2 = Math.pow(a2, 2);
        b2 = Math.pow(b2, 2);
        c2 = Math.pow(c2, 2);

        if (ang.equals("A")) {
            r = ((b2 + c2) - a2) / (2 * b * c);
        } else if (ang.equals("B")) {
            r = ((a2 + c2) - b2) / (2 * a * c);
        } else {
            r = ((a2 + b2) - c2) / (2 * a * b);
        }

        System.out.println("El ángulo es: " + Math.toDegrees(Math.acos(r)) + "°");
    }
}
 