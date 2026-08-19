// DETERMINAR SI UN NUMERO ES PERFECTO (USANDO WHILE)

import java.util.Scanner;

public class Ejercicio_8 {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingrese un numero: ");
        int numero = entrada.nextInt();

        int contador = 1;
        int sumador = 0;
        while (contador < numero){
            
            if (numero % contador == 0){
                sumador = sumador + contador;
                System.out.println(contador);
            }
            contador++;
            
        }

        if (sumador == numero){
            System.out.println("El Numero: " + numero + ", Es Perfecto ");
        }

        else{
            System.out.println("El Numero: " + numero + ", No  Es Perfecto");
        }
        
        entrada.close();
    }
}
