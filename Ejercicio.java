// CONDICIONALES CON RANGOS DE VALORES

import java.util.Scanner;

public class Ejercicio {
    public static void main(String[] args){
        
        Scanner Entrada = new Scanner(System.in);

        System.out.print("Ingrese la cantidad de grados Celsius: ");
        int grados = Entrada.nextInt();

        System.out.println("Grados Celsius: " + grados);

        if (grados < 10){
            System.out.println("Hace demasiado Frio.");
        }

        else if (grados >= 10 && grados <= 25){
            System.out.println("Clima amigable");
        }

        else{
            System.out.println("Hace calor");
        }
        Entrada.close();
    }
}