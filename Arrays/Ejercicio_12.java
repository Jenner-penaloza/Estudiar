// Ordenamiento por método burbuja

import java.util.Scanner;

public class Ejercicio_12 {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);

        // Declarar un arreglo de números enteros con al menos 6 valores desordenados

        int [] numero = new int [6];


        for(int i = 0; i < numero.length; i++){
            System.out.print("Ingrese un numero: ");
            int n = entrada.nextInt();

            numero[i] = n;
        }

        int a = 0;
        int b = 0;
        for(int i = 0; i < numero.length / 2; i++){
            a = numero[i];

            b = numero[numero.length -1  -i];

            

            numero[i] = b;
            numero[numero.length -1 -i] = a;
        }

        for(int i: numero){
            System.out.println(i);
        }

        entrada.close();
    }   
}
