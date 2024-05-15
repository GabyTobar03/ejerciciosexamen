package EjerciciosPares;

import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String[] elementosquimicos =  new    String[8];

        System.out.println("vamos a almacenar 8 elementos quimicos");
        for (int i = 0; i <= 7; i++){
            System.out.println("Escriba el nombre de un elemento quimico [" + i+ "]");
            elementosquimicos[i] = entrada.next();
        }

        System.out.println();
        System.out.println("el contenido de la matriz es: ");
        for (int i =7; i>=0; i--){
            System.out.print("elemento[" + i + "]: " + elementosquimicos [i] + ", ");
        }

    }
    }

