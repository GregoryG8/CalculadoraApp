import java.util.Scanner;

public class CalculadoraApp {
    public static void main(String[] args) {

        Scanner consola = new Scanner(System.in);
        while (true) {
            System.out.println("*** Aplicacion Calculadora ***");
            mostrarMenu();
            try {
                var operacion = Integer.parseInt(consola.nextLine());
                //Revisar si esta dentro de las opciones
                if (operacion >= 1 && operacion <= 4) {
                    ejecutarOperacion(operacion, consola);
                } else if (operacion == 5) {
                    System.out.println("Hasta luego...");
                    break;
                } else {
                    System.out.println("Opcion erronea " + operacion);
                }
                System.out.println();
            } catch (Exception e) {
                System.out.println("Ocurrio un error: " + e.getMessage());
            }
        }
    }

    private static void mostrarMenu() {
        //Menu
        System.out.println("""
                1.Suma
                2.Resta
                3.Multiplica
                4.Division
                5.Salir
                """);
        System.out.println("Operacion: ");
    }

    private static void ejecutarOperacion(int operacion, Scanner consola) {
        System.out.println("Primer valor: ");
        var operando1 = Double.parseDouble(consola.nextLine());
        System.out.println("Segundo valor: ");
        var operando2 = Double.parseDouble(consola.nextLine());
        double resultado;
        switch (operacion) {
            case 1:
                resultado = operando1 + operando2;
                System.out.println("Resultado: " + resultado);
                break;
            case 2:
                resultado = operando1 - operando2;
                System.out.println("Resultado: " + resultado);
                break;
            case 3:
                resultado = operando1 * operando2;
                System.out.println("Resultado: " + resultado);
                break;
            case 4:
                resultado = operando1 / operando2;
                System.out.println("Resultado: " + resultado);
                break;
            default:
                System.out.println("Opcion erronea " + operacion);
        }

    }
}
