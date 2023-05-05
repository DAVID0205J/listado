import java.util.Scanner;

public class ContadorPuntos {
    public static void ejecutar() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese un texto: ");
        String cadena = scanner.nextLine();

        int contadorPuntos = 0;
        for (int i = 0; i < cadena.length(); i++) {
            char c = cadena.charAt(i);
            if (c == '.') {
                contadorPuntos++;
            }
        }

        System.out.println("El texto tiene " + contadorPuntos + " puntos.");
    }
}
