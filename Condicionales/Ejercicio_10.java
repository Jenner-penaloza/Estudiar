//MENÚ DE OPCIONES CON (DO-WHILE)

import java.util.Scanner;

public class Ejercicio_10 {

   public static void main(String[] args){
    
    Scanner entrada = new Scanner(System.in);
    int n = 1;
    

    do {
        System.out.println("MENÚ PRINCIPAL\n");
        System.out.println("1. SALUDAR ");
        System.out.println("2. MENSAJE MOTIVACIONAL ");
        System.out.println("3. SALIR \n");

        System.out.print("Ingresa un numero del 1 al 3: ");
        int numero = entrada.nextInt();

        if (numero == 1){
            System.out.println("HOLA JENNER :)\n");
        }
        else if (numero == 2){
            System.out.println("SIGUE ADELANTE JENNER, TU PUEDES TODO LO QUE TE PROPONGAS \n");
        }
        else if (numero == 3){
            System.out.println("A DIOS :)\n");
            break;
        }
        else{
            System.out.println("OPCIÓN NO VALIDA \n");
            
        }
    } while (n < 2); // si quieres usa el true y elimina el n = 1 ;)


    entrada.close();
   }
}
