import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner consola = new Scanner(System.in);
        while (true) {
            System.out.println("----- Aplicacion Calculadora -----");
            System.out.println("1. Suma");
            System.out.println("2. Resta");
            System.out.println("3. Multiplicacion");
            System.out.println("4. Division");
            System.out.println("5. Salir");

            System.out.print("Escribe la opcion que deseas: ");
            try {
                int opcion = Integer.parseInt(consola.nextLine());
                if (opcion >= 1 && opcion <= 4) {
                    System.out.print("Escribe el numero 1: ");
                    var numero1 = Double.parseDouble(consola.nextLine());
                    System.out.print("Escribe el numero 2: ");
                    var numero2 = Double.parseDouble(consola.nextLine());
                    Double resultado = 0.0;

                    switch (opcion) {
                        case 1:
                            resultado = numero1 + numero2;
                            System.out.println("El resultado de la suma es : " + resultado);
                            break;
                        case 2:
                            resultado = numero1 - numero2;
                            System.out.println("El resultado de la resta es : " + resultado);
                            break;
                        case 3:
                            resultado = numero1 * numero2;
                            System.out.println("El resultado de la multiplicacion es : " + resultado);
                            break;
                        case 4:
                            if (numero2 != 0) {
                                resultado = numero1 / numero2;
                                System.out.println("El resultado de la division es : " + resultado);
                            } else {
                                System.out.println("No se puede dividir por cero.");
                            }
                            break;
                        default:
                            System.out.println("Opción no válida.");
                            break;
                    }
                } else if (opcion == 5) {
                    System.out.println("Saliendo de la aplicación...");
                    break;
                } else {
                    System.out.println("Opción no válida.");
                }
                System.out.println();
            } catch (Exception e) {
                System.out.println("Ocurrio un error: " + e.getMessage());
            }
        }

    }
}

