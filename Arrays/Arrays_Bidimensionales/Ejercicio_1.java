import java.util.Scanner;

public class Ejercicio_1 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        int arra [] [] = {
            {1,2,3,},
            {4,5,6,},
            {7,8,9,}
        };

    
        for (int i = 0; i < arra.length; i++){

            int a = 0;

            for (int j = 0; j < arra[i].length; j++){
                
                a += arra[i][j];
                
            }
            System.out.println("sumatoria de la fila " + (i+1) + "Es: " + a);
        }
        for(int []n: arra){
            for (int fila: n){
                System.out.println(fila);
            }
            System.out.println();
        }

       
    }
}
