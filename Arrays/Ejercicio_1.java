// ARRAYS

import java.util.Scanner;

public class Ejercicio_1 {
    public static void main(String[] args){
        
        Scanner entrada = new Scanner(System.in);

        int [] A = new int[10];

        for (int i = 0; i < 10;i++){
            A[i] = i;
        }

        for (int i = 0; i < 10; i++){
            System.out.println(A[i]);
        }

        entrada.close();
    }
}