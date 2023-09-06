import java.util.Scanner;

public class TipoDatoAlmacenamiento {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese un número: ");
        long n = sc.nextLong();

        System.out.println(n + " puede ser almacenado en:");

        if (n >= Byte.MIN_VALUE && n <= Byte.MAX_VALUE) {
            System.out.println("(*) byte");
        }

        if (n >= Short.MIN_VALUE && n <= Short.MAX_VALUE) {
            System.out.println("(*) short");
        }

        if (n >= Integer.MIN_VALUE && n <= Integer.MAX_VALUE) {
            System.out.println("(*) int");
        }

        System.out.println("(*) long");

        if (n < Byte.MIN_VALUE || n > Long.MAX_VALUE) {
            System.out.println(n + " no se puede almacenar en ningún tipo de dato primitivo.");
        }

        sc.close();
    }
}