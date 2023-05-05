import java.util.Scanner;

public class ContadorLetras {
    public static void ejecutar() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese un texto: ");
        String cadena = scanner.nextLine();

        int contadorLetras = 0;
        for (int i = 0; i < cadena.length(); i++) {
            char c = cadena.charAt(i);
            if (Character.isLetter(c)) {
                contadorLetras++;
            }
        }

        System.out.println("El texto tiene " + contadorLetras + " letras.");
    }
}
