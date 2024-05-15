package EjerciciosPares;

import java.util.Scanner;

public class Ejercicio1Java {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        double ganados, empatados, perdidos;
        double totalpuntos;

        System.out.println("Ingrese el numero de partidos ganados: ");
        ganados = entrada.nextDouble();
        System.out.println("Ingrese el nuero de partidos perdidos: ");
        perdidos = entrada.nextDouble();
        System.out.println("Ingrese el total de partidos empatados: ");
        empatados = entrada.nextDouble();

        totalpuntos = (ganados * 3) + (empatados * 1);

        System.out.println("El total de puntos obtenidos es de: " + totalpuntos);
         }

    }