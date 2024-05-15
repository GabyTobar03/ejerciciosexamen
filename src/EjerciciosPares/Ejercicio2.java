package EjerciciosPares;

import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        double sueldo, descuento;

        System.out.println("Ingrese su sueldo:");
        sueldo = entrada.nextDouble();

        if (sueldo < 500.00) {
            descuento = 0.0;
        } else if (sueldo >= 500.00 && sueldo < 750.00) {
            descuento = sueldo * 0.05;
        } else {
            descuento = sueldo * 0.10;
        }

        System.out.println("El total de descuento en concepto de renta es: $" + descuento);
    }
}



