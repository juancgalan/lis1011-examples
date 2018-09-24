import java.util.*;

public class RandomIntArray {

    /**
     * Esta función pregunta al usuario por la cantidad de numeros enteros a 
     * generar. A continuación, crea un arreglo del tamaño designado y genera
     * los números usando la siguiente fórmula:
     *   
     *   f() = (int) (I + Math.random() * D)
     * 
     * donde I es el número inicial del rango y D el número final del rango. Por
     * ejemplo, si queremos los números aleatorios entre 5 y 20 se utiliza asi:
     * 
     * + Como no empieza en cero, debemos calcular D como
     *   D = D' - I = 20 - 5 = 15
     * 
     * + Sustituímos:
     *  f() = (int) (5 + Math.random() * 15) 
     */
    public static void main(String... args) {
        // Nos preparamos para leer de teclado
        Scanner scanner = new Scanner(System.in);
        // Variable para el tamaño del arreglo
        int sizeArray;

        // Preguntamos cuantos datos
        System.out.println("Cuantos numeros quieres?");
        sizeArray = scanner.nextInt();

        // Creamos el arreglo con la cantidad de datos solicitada
        int arreglo[] = new int[sizeArray];

        // Pedimos los datos, como podemos conocer la cantidad de datos en 
        // tiempo de ejecución, usamos for
        for (int i = 0; i < sizeArray; i++) {
            arreglo[i] = (int) (Math.random() * 20);
        }

        // Imprimimos el arreglo
        imprimeArreglo(arreglo);
        // Cerramos la entrada de teclado
        scanner.close();
    }

    /**
     * Esta funcion imprime arreglos enteros en la pantalla.
     * 
     * @param arr[] Arreglo entero a  imprimir
     */
    public static void imprimeArreglo(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println("[" + i + "] ->" + arr[i]);
        }
    }
    
    
}