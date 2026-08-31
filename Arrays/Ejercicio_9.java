//Contar números primos en un arreglo

import java.util.Scanner;

public class Ejercicio_9 {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);

    // Solicite al usuario el tamaño de un arreglo de números enteros.
        
        System.out.print("Ingrese el tamaño del Arrays: ");
        int tamaño = entrada.nextInt();

        int arr [] = new int [tamaño];

        entrada.nextLine();

    // Permita ingresar los valores del arreglo por teclado.
        for(int i = 0; i < arr.length; i++){

            System.out.print("N: ");
            int n = entrada.nextInt();

            arr[i] = n;
        }

        System.out.println("Arrays: ");

        for (int n: arr){
            System.out.println(n);
        }
        // Determine cuántos números primos hay dentro del arreglo.
        int cantidad = 0;

        for(int i = 0; i < arr.length; i++){

            
            int numero = arr[i];

            int contador = 0;

            for(int o = 1; o <= numero; o++){
                //System.out.println("Numero: " + numero + "D: " + o);
                if (numero % o == 0){
                    contador++;
                }

            }

            if (contador == 2){
                System.out.println("Primo: " + numero);
                cantidad++;
            }
        }System.out.println("Cantidad de Numeros Primos: " + cantidad);

        entrada.close();
    }
}
