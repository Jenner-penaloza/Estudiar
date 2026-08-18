// EJERCICIO CON SWITH
import java.util.Scanner;

public class Ejercicio_11 {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);

        System.out.println("--Calculadora-- ");
        System.out.println("1. Sumar ");
        System.out.println("2. Restar ");
        System.out.println("3. Multiplicar ");
        System.out.println("4. Dividir ");
        System.out.println("5. Factorial ");

        System.out.print("Ingrese un numero: ");
        int numero = entrada.nextInt();

        System.out.print("Ingrese un numero::: ");
        int numero_1 = entrada.nextInt();

        System.out.print("Ingrese un numero::: ");
        int numero_2 = entrada.nextInt();

        switch (numero){
            case 1: 
                System.out.println("Sumar");
                System.out.println(numero_1 + " + " + numero_2 + " = " + (numero_1 + numero_2));
                break;
            case 2:
                System.out.println("Restar");
                System.out.println(numero_1 + " - " + numero_2 + " = " + (numero_1 - numero_2));
                break;
            case 3:
                System.out.println("Multiplicar");
                System.out.println(numero_1 + " * " + numero_2 + " = " + (numero_1 * numero_2));
                break;
            case 4:
                System.out.println("Dividir");
                System.out.println(numero_1 + " / " + numero_2 + " = " + (numero_1 / numero_2));
                break;
            case 5:
                
                int a = 1;
                for (int i = 1; i <= numero_1; i++){
                    a = a * i;
                    System.out.println(a + "   " + i);
                }



        }

    }
}
