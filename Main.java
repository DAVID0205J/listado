import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {

            System.out.println("         LISTADO DE PROGRAMAS          ");
            System.out.println("------------------------------------------");
            System.out.println("1. Calculadora");
            System.out.println("2. Contador de mayúsculas");
            System.out.println("3. Contador de letras");
            System.out.println("4. Contador de puntos");
            System.out.println("5. Convertidor de fracciones a decimales");
            System.out.println("6. Convertidor de decimales a fracciones");
            System.out.println("7. Convertidor de metros a centímetros");
            System.out.println("8. Convertidor de centímetros a metros");
            System.out.println("9. Convertidor de Celsius a Fahrenheit");
            System.out.println("10. Convertidor de Fahrenheit a Celsius");
            System.out.println("11. Salir");
            System.out.println("Elija una opción:");

            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    Calculadora calc = new Calculadora();
                    calc.ejecutar();
                    break;
                case 2:
                    ContadorMayusculas cm = new ContadorMayusculas();
                    cm.ejecutar();
                    break;
                case 3:
                    ContadorLetras cl = new ContadorLetras();
                    cl.ejecutar();
                    break;
                case 4:
                    ContadorPuntos cp = new ContadorPuntos();
                    cp.ejecutar();
                    break;
                case 5:
                    FraccionADecimal cfd = new   FraccionADecimal();
                    cfd.convertir();
                    break;
                case 6:
                    DecimalAFraccion cdf = new DecimalAFraccion();
                    cdf.convertir();
                    break;
                case 7:
                    MetrosACentimetros cmc = new MetrosACentimetros ();
                    cmc.convertir();
                    break;
                case 8:
                    CentimetrosAMetros ccm = new CentimetrosAMetros();
                    ccm.convertir();
                    break;
                case 9:
                    CelsiusAFahrenheit ccf = new CelsiusAFahrenheit();
                    ccf.convertir();
                    break;
                case 10:
                    FahrenheitACelsius fcc=new FahrenheitACelsius();
                    fcc.convertir();
                    break;
                case 11:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción inválida, intente nuevamente.");
                    break;
            }
        } while (opcion != 0);

        scanner.close();
    }
}
