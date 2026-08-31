//Conteo por inicial

import java.util.Scanner;

public class Ejercicio_11 {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);

        String [] caracter = new String [2];

        for(int i = 0; i < caracter.length; i++){
            System.out.print("Ingrese una palabra: ");
            String palabra = entrada.nextLine();

            caracter[i] = palabra.toLowerCase(); 
            // char indice = palabra.charAt(0);
            // System.out.println(palabra.charAt(0));
            
        }
        System.out.print("Que caracte quieres buscar: ");
        char letra = entrada.nextLine().toLowerCase().charAt(0);



        System.out.println(letra);
        
        

        for(int i = 0; i < caracter.length; i++){
            String buscar = caracter[i];
            char indice = buscar.charAt(0);
            

            if (letra == indice){
                System.out.println(buscar);
            }
        

        }
        entrada.close();
    }

}
