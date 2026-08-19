// DETERMINAR SI UN NUMERO ES PRIMO

import java.util.Scanner;

public class Ejercicio_7 {
    public static void main(String[] args){
        
        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingrese un numero: ");
        int numero = entrada.nextInt();

        int contador = 0;
        
        for (int i = 1; i <= numero; i++){

            if (numero % i == 0 ){

                System.out.println("Divisores: "+i);
                contador += 1;
            }
        }

        if (contador == 2){
            System.out.println("El numero: " + numero + " Es primo");
        }

        else{
            System.out.println("El numero: " + numero + " No es primo");
        }

        System.out.println(contador);


        entrada.close();
    }
}
