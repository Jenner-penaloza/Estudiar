// Validador de Paridad

import java.util.Scanner;

public class Ejercicio_4 {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);

        System.out.println("Ingrese un numero: ");
        int numero = entrada.nextInt();

        boolean resultado = espar(numero);

        System.out.println(resultado);
        

        entrada.close();
    }
    public static boolean espar(int a){
        boolean x;
        if (a % 2 == 0){
            x = true;
            //System.out.println(x);
        }else{

            x = false;
            //System.out.println(x);
        }

        return x;
    }


}
