import java.util.Scanner;

public class Ejercicio_6 {
    public static void main(String[] args){

        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingrese la cantidad de Filas: ");
        int filas = entrada.nextInt();

        System.out.print("Ingrese la cantidad de Columnas: ");
        int columnas = entrada.nextInt();


        int [][] matrix = new int [filas][columnas];

        int contador = 10;

        for(int i = 0; i < matrix.length; i++){
            //System.out.println("Fila: " + i);

            for(int j = 0; j < matrix[i].length; j++){

                System.out.print((matrix[i][j] = contador) + " ");
                contador+= 2;

            }
            System.out.println("");
        }
    }

}
