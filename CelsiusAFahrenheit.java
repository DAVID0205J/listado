import java.util.Scanner;

public class CelsiusAFahrenheit {
    public void convertir() {
        Scanner input = new Scanner(System.in);
        double celsius, fahrenheit;

        System.out.print("Ingrese la temperatura en grados Celsius: ");
        celsius = input.nextDouble();

        fahrenheit = celsius * 1.8 + 32;

        System.out.println(celsius + " grados Celsius equivalen a " + fahrenheit + " grados Fahrenheit.");


    }
}
