import java.util.Scanner;

public class CentimetrosAMetros {
    public static void convertir() {
        Scanner input = new Scanner(System.in);
        double centimetros, metros;

        System.out.print("Ingrese la cantidad de centímetros a convertir: ");
        centimetros = input.nextDouble();

        metros = centimetros / 100;

        System.out.println(centimetros + " centímetros equivalen a " + metros + " metros.");


    }
}
