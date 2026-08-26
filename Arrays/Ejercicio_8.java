import java.util.Scanner;

public class Ejercicio_8 {
    public static void main(String[]args){
        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingrese la cantidad de nombres: ");
        int cantidad = entrada.nextInt();

        entrada.nextLine();

        String [] arr = new String[cantidad];

    
        for (int i = 0; i < cantidad; i++){
            System.out.print("Ingrese su nombre: ");
            String nombre = entrada.nextLine();

            arr[i] = nombre;
        }

        System.out.println("");

        System.out.print("Ingrese el nombre a buscar: ");
        String buscar = entrada.nextLine();

        int contador = 0;


        for (int i = 0; i<arr.length; i++){
            String a = arr[i];

            if (a.equals(buscar)){

                contador++;
            }
        }

        if (contador > 0){
            System.out.println("Nombre: " + buscar + " Se repite: " + contador + " Veces ");
        }else{
            System.out.println("Nombre no encontrado. ");
        }
        entrada.close();
        
    }
}