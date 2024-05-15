package EjerciciosPares;

import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
            Scanner entrada = new Scanner(System.in);

            int num;
            System.out.println("Ingrese un numero");
            num = entrada.nextInt();

            System.out.println(" el numero impar entre 0 y " + num + ": ");
            for (int i = 1; i <= num; i += 2) {
                System.out.println(i);
            }

        }


    }

