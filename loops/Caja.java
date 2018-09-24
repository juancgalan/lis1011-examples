public class Caja {
    public static void main(String... args) {
        int contador;
        int contador2;
        contador = 0;
        while (contador < 80) {
            System.out.print("*");
            contador++;
        }
        System.out.println();
        contador = 0;
        while (contador < 23) {
            System.out.print("*");
            contador2 = 0;
            while (contador2 < 78) {
                System.out.print(" ");
                contador2++;
            }
            System.out.println("*");
            contador++;
        }
        contador = 0;
        while (contador < 80) {
            System.out.print("*");
            contador++;
        }
    }
}