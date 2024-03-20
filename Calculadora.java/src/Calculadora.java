import java.util.Scanner;

public class Calculadora {                              //la clase

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("Calculadora");              //menú general
            System.out.println("1. Suma");
            System.out.println("2. Resta");
            System.out.println("3. Multiplicación");
            System.out.println("4. División");
            System.out.println("5. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:

                    realizarSuma();
                    break;
                case 2:

                    realizarResta();
                    break;
                case 3:

                    realizarMultiplicacion();
                    break;
                case 4:

                    realizarDivision();
                    break;
                case 5:

                    System.out.println("¡Saliendo del sistema!");
                    break;
                default:

                    System.out.println("Opción incorrecta.");
            }


        } while (opcion != 5);
        scanner.close();
    }

    public static void realizarSuma() {                         //declaración para cada operación
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el primer número: ");
        double num1 = scanner.nextDouble();
        System.out.print("Ingrese el segundo número: ");
        double num2 = scanner.nextDouble();
        double resultado = num1 + num2;
        System.out.println("El resultado de la suma es: " + resultado);
    }

    public static void realizarResta() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el primer número: ");
        double num1 = scanner.nextDouble();
        System.out.print("Ingrese el segundo número: ");
        double num2 = scanner.nextDouble();
        double resultado = num1 - num2;
        System.out.println("El resultado de la resta es: " + resultado);
    }

    public static void realizarMultiplicacion() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el primer número: ");
        double num1 = scanner.nextDouble();
        System.out.print("Ingrese el segundo número: ");
        double num2 = scanner.nextDouble();
        double resultado = num1 * num2;
        System.out.println("El resultado de la multiplicación es: " + resultado);
    }

    public static void realizarDivision() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el dividendo: ");
        double dividendo = scanner.nextDouble();
        System.out.print("Ingrese el divisor: ");
        double divisor = scanner.nextDouble();
        if (divisor != 0) {
            double resultado = dividendo / divisor;
            System.out.println("El resultado de la división es: " + resultado);
        } else {
            System.out.println("No se puede dividir por cero.");
        }
    }
}