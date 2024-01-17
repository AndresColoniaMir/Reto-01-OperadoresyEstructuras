import java.util.ArrayList;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        // Operadores aritmeticos
        int a = 20, b = 6;
        int suma = a + b;
        int resta = a - b;
        int multiplicacion = a * b;
        int division = a / b;
        int modulo = a % b;

        System.out.println("Operadores Aritmeticos");
        System.out.println("Asignacion: a = " + a + " y b = " + b);
        System.out.println("Suma: a + b = " + suma);
        System.out.println("Resta: a - b = " + resta);
        System.out.println("Multiplicacion: a * b = " + multiplicacion);
        System.out.println("Division: a / b = " + division);
        System.out.println("Modulo: a % b = " + modulo);

        //  Operadores de Comparacion
        boolean esIgual = ( a == b );
        boolean noEsIgual = ( a != b );
        boolean esMayor = ( a > b);
        boolean esMenor = ( a < b);

        System.out.println("\nOperadores de Comparación:");
        System.out.println("Igual: == " + esIgual);
        System.out.println("No Igual: != " + noEsIgual);
        System.out.println("Mayor: > " + esMayor);
        System.out.println("Menor: < " + esMenor);

        // Operadores Logicos
        boolean isTrue = true;
        boolean isFalse = false;
        boolean logicalAND = isTrue && isFalse;
        boolean logicalOR = isTrue || isFalse;
        boolean logicalNOT = !isTrue;

        System.out.println("\nOperadores Lógicos:");
        System.out.println("AND: " + logicalAND);
        System.out.println("OR: " + logicalOR);
        System.out.println("NOT: " + logicalNOT);

        // Estructuras de Control Condicional
        int opcion = 7;

        System.out.println("\nEstructuras de Control Condicionales:");
        // if
        System.out.println("Estructura de Control if");
        if (opcion > 5) {
            System.out.println("El número es mayor que 5.");
        } else if (opcion == 5) {
            System.out.println("El número es igual a 5.");
        } else {
            System.out.println("El número es menor que 5.");
        }

        // switch
        System.out.println("Estructura de Control Switch:");
        int opcion2 = 7;
        switch (opcion2) {
            case 1:
                System.out.println("Seleccionaste la opción 1.");
                break;
            case 2:
                System.out.println("Seleccionaste la opción 2.");
                break;
            case 3:
                System.out.println("Seleccionaste la opción 3.");
                break;
            default:
                System.out.println("Opción no válida.");
        }

        // Estructuras de Control iterativas
        System.out.println("\nEstructuras de Control Iterativas:");

        // for
        System.out.println("\nEstructuras de Control for:");
        for (int i = 1; i <= 5; i++) {
            System.out.println("Iteración " + i);
        }

        // Bucle foreach (para recorrer colecciones)
        System.out.println("\nBucle foreach:");
        List<String> listaNombres = new ArrayList<>();
        listaNombres.add("Juan");
        listaNombres.add("María");
        listaNombres.add("Carlos");

        for (String nombre : listaNombres) {
            System.out.println("Nombre: " + nombre);
        }

        // while
        System.out.println("\nEstructura de Control While:");
        int contador = 0;
        while (contador < 3) {
            System.out.println("Iteración " + contador);
            contador++;
        }

        // do-while
        System.out.println("\nEstructura de Control Do-While:");
        int otroContador = 0;
        do {
            System.out.println("Iteración " + otroContador);
            otroContador++;
        } while (otroContador < 3);

        // Manejo de Excepciones con try, catch, y finally
        System.out.println("\nManejo de Excepciones con try, catch, y finally:");
        try {
            int resultadoDivisionCero = a / 0; // Esto lanzará una ArithmeticException
            System.out.println("Este mensaje nunca se imprimirá.");
        } catch (ArithmeticException e) {
            System.out.println("Error: División por cero no permitida.");
        } finally {
            System.out.println("Este bloque se ejecutará siempre, independientemente de si hay una excepción o no.");
        }
    }
}