

import java.util.Scanner;
public class Ejercicio_2 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingrese la cantidad de filas: ");
        int filas = entrada.nextInt();

        System.out.print("Ingrese la cantidad de columnas: ");
        int columnas = entrada.nextInt(); 

        entrada.nextLine();

        int [][] arr = new int [filas] [columnas];
        int a = 1;
        for (int i = 0; i < arr.length; i++){
            for (int j = 0; j < arr[i].length; j++){
                //arr[i][j] = 0;
                arr[i][i] = i + 1;
                

            }
        }

        for(int [] n: arr){
            for(int m: n){
                System.out.print(m + " ");
            }
            System.out.println("");
        }

        entrada.close();
    }
}
