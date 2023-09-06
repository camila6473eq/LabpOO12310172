import java.util.Scanner;

public class AumentoSalarioEmpleado {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Pedir el salario anual actual del empleado
        System.out.print("Ingrese el salario anual actual del empleado: ");
        double salarioActual = sc.nextDouble();

        // Pedir la calificación de desempeño del empleado (1=excelente, 2=bueno, 3=malo)
        System.out.print("Ingrese la calificación de desempeño (1=excelente, 2=bueno, 3=malo): ");
        int calificacion = sc.nextInt();

        double aumento = 0.0; // Variable para almacenar el aumento

        // Calcular el aumento según la calificación
        if (calificacion == 1) {
            aumento = salarioActual * 0.06;
        } else if (calificacion == 2) {
            aumento = salarioActual * 0.04;
        } else if (calificacion == 3) {
            aumento = salarioActual * 0.015;
        } else {
            System.out.println("Calificación no válida. Debe ser 1, 2 o 3.");
            sc.close();
            return;
        }

        // Calcular el nuevo salario
        double nuevoSalario = salarioActual + aumento;

        // Mostrar el aumento y el nuevo salario
        System.out.println("Aumento: $" + aumento);
        System.out.println("Nuevo salario: $" + nuevoSalario);

        sc.close();
    }
}