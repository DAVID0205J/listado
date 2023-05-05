import java.util.Scanner;

public class ContadorMayusculas {

    public void ejecutar() {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Bienvenido al contador de mayúsculas.");
        System.out.print("Ingrese un texto: ");
        String cadena = scanner.nextLine();

        int contador = 0;

        for(int i = 0; i < cadena.length(); i++) {
            if(Character.isUpperCase(cadena.charAt(i))) {
                contador++;
            }
        }

        System.out.println("El texto " + cadena + " tiene " + contador + " mayúsculas.");



    }

}
