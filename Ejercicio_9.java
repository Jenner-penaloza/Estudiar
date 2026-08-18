// VALIDACIÓN DE CONTRASEÑA CON (WHILE)

import java.util.Scanner;

public class Ejercicio_9 {
    public static void main(String[] args){

        Scanner entrada = new Scanner(System.in);

        String validar = "admin";
        boolean n = false;

        while (n != true){
            System.out.println("Ingrese la contraseña correcta: ");
            String contraseña = entrada.next();            

            if (contraseña.equals(validar)){
                System.out.println("Contraseña correcta");
                n = true;
            }

            else{
                System.out.println("Contraseña Incorrecta sigue intentado");

            }
        }

        entrada.close();
    }
}
