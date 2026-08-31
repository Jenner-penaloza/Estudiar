import java.util.Scanner;

public class Ejercicio_1 {

    // public static int [] crearArr(int fin){
    //     int arr [] = new int [fin];

    //     for (int i = 0; i<arr.length;i++){
    //         arr[i]=i+1;
    //     }
    //     return arr;
    // }

    
    

    // public static void main(String[] args){

    //     Scanner entrada = new Scanner(System.in);

    //     System.out.print("Ingrese la cantidad de numeros: ");
    //     int numero = entrada.nextInt();

    //     int arr[] = new int [numero];

    //     entrada.nextLine();

    //     for (int i = 0; i<arr.length; i++){

    //         arr[i] = i +1;
    //     }

    //     int sumador = 0;

    //     for (int i = 0; i<arr.length; i++){
    //         sumador += arr[i];
    //     }

    //     System.out.println(sumador);
    // }

    public static void cambiarValor(int x){
        x = 7;
    }
    
    public static void main(String[] args){
        int x = 8;
        cambiarValor(x);
        System.out.println();
    }

    


}
