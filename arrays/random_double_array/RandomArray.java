import java.util.*;

public class RandomArray {

    /**
     * Esta función pregunta al usuario por la cantidad de numeros aleatorios a 
     * generar. A continuación, crea un arreglo del tamaño designado y genera
     * los números usando el metodo Math.random()
     */
    public static void main(String... args) {
        // Variable para el tamaño del arreglo
        int sizeArray;

        // Preguntamos cuantos datos
        System.out.println("Cuantos numeros quieres?");
        sizeArray = scanner.nextInt();

        // Creamos el arreglo con la cantidad de datos solicitada
        double arreglo[] = new double[sizeArray];

        // Pedimos los datos, como podemos conocer la cantidad de datos en 
        // tiempo de ejecución, usamos for
        for (int i = 0; i < sizeArray; i++) {
            arreglo[i] = Math.random();
        }

        // Imprimimos el arreglo en pantalla
        imprimeArreglo(arreglo);

        // Cerramos la entrada de teclado
        scanner.close();
    }

    /**
     * Esta funcion imprime arreglos double en la pantalla.
     * 
     * @param arr[] Arreglo double a  imprimir
     */
    public static void imprimeArreglo(double arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println("[" + i + "] ->" + arr[i]);
        }
    }
}