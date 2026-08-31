//Nombre más largo

import java.util.Scanner;

public class Ejercicio_10 {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);

        String[] nombres = {"Carlos", "Ana", "Sebastian", "Luis", "Maria"};

        String nombre_largo = "";
        int primer = 0;

        for (int i = 0; i < nombres.length; i++){

            System.out.println(nombres[i]);
            String a = nombres[i];


            if (a.length()>primer){
                primer = a.length();
                nombre_largo = a;
            }
        }

        System.out.println("el nombre mas largo es: " + nombre_largo + " Y su longitud es: " + primer);
        entrada.close();
    }
}
