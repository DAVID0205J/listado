import java.util.Scanner;

public class MetrosACentimetros {
    public static void convertir() {
        Scanner input = new Scanner(System.in);
        double metros, centimetros;

        System.out.print("Ingrese la cantidad de metros a convertir: ");
        metros = input.nextDouble();

        centimetros = metros * 100;

        System.out.println(metros + " metros equivalen a " + centimetros + " centímetros.");
    }
}
