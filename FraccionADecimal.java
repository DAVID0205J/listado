import java.util.Scanner;

public class FraccionADecimal {
    public static void convertir() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el numerador: ");
        int numerador = scanner.nextInt();
        System.out.print("Ingrese el denominador: ");
        int denominador = scanner.nextInt();

        double resultado = (double) numerador / denominador;

        System.out.println(numerador + "/" + denominador + " = " + resultado);
    }
}
