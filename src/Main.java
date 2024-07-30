import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner consola = new Scanner(System.in);

        System.out.print("Escribe calculadora para acceder: ");
        String clave = consola.nextLine();

        if (clave.equals("calculadora")){

            System.out.print("Escribe tu nombre: ");
            String nombre = consola.nextLine();

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

                    System.out.print("Escribe el primer numero : ");
                    var numero1 = Double.parseDouble(consola.nextLine());

                    System.out.print("Escribe el segundo numero : ");
                    var numero2 = Double.parseDouble(consola.nextLine());

                    Double resultado = 0.0;


                    switch (opcion) {

                        case 1:

                            resultado = numero1 + numero2;
                            System.out.println(nombre + " El resultado de la suma es : " + resultado);
                            break;
                        case 2:

                            resultado = numero1 - numero2;
                            System.out.println(nombre + " El resultado de la resta es : " + resultado);
                            break;
                        case 3:

                            resultado = numero1 * numero2;
                            System.out.println(nombre +" El resultado de la multiplicacion es : " + resultado);
                            break;
                        case 4:

                            if (numero2 != 0) {
                                resultado = numero1 / numero2;
                                System.out.println(nombre + " El resultado de la division es : " + resultado);

                            } else {

                                System.out.println(nombre + " No se puede dividir por cero.");
                            }
                            break;
                        default:
                            System.out.println("Opción no válida.");
                            break;
                    }

                } else if (opcion == 5) {
                    System.out.println("Gracias " + nombre + " Estas saliendo de la aplicación...");
                    break;
                } else {
                    System.out.println(nombre + "Opción no válida.");
                }
                System.out.println();

            } catch (NumberFormatException e) {
                System.out.println("Por favor ingresa un número válido.");

            } catch (Exception e) {
                System.out.println(nombre + " Ocurrio un error: " + e.getMessage());
            }
        }

        } else {

            System.out.println("No tienes acceso a la aplicación Calculadora.");
        }
    }
}

