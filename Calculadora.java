import java.util.Scanner;

public class Calculadora {

    public void ejecutar() {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Bienvenido a la calculadora.");
        System.out.print("Ingrese el primer número: ");
        double num1 = scanner.nextDouble();
        System.out.print("Ingrese el segundo número: ");
        double num2 = scanner.nextDouble();

        System.out.println("Seleccione una operación:");
        System.out.println("1. Suma");
        System.out.println("2. Resta");
        System.out.println("3. Multiplicación");
        System.out.println("4. División");
        int operacion = scanner.nextInt();

        double resultado = 0;

        switch(operacion) {
            case 1:
                resultado = num1 + num2;
                break;
            case 2:
                resultado = num1 - num2;
                break;
            case 3:
                resultado = num1 * num2;
                break;
            case 4:
                resultado = num1 / num2;
                break;
            default:
                System.out.println("Operación inválida.");
                break;
        }

        System.out.println("El resultado es: " + resultado);



    }

}
