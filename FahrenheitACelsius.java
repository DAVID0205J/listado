import java.util.Scanner;

public class FahrenheitACelsius {
    public static void convertir() {
        Scanner input = new Scanner(System.in);
        double fahrenheit, celsius;

        System.out.print("Ingrese la temperatura en grados Fahrenheit: ");
        fahrenheit = input.nextDouble();

        celsius = (fahrenheit - 32) / 1.8;

        System.out.println(fahrenheit + " grados Fahrenheit equivalen a " + celsius + " grados Celsius.");


    }
}
