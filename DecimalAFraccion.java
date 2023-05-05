
import java.util.Scanner;

public class DecimalAFraccion {
    public static void convertir() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese un decimal: ");
        double decimal = scanner.nextDouble();

        int denominador = 1;
        while (Math.round(decimal * denominador) != decimal * denominador) {
            denominador++;
        }

        int numerador = (int) (decimal * denominador);

        int mcd = calcularMCD(numerador, denominador);
        numerador /= mcd;
        denominador /= mcd;

        System.out.println(decimal + " = " + numerador + "/" + denominador);
    }

    private static int calcularMCD(int a, int b) {
        if (b == 0) {
            return a;
        }
        return calcularMCD(b, a % b);
    }
}
