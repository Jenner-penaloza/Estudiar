import java.util.Scanner;

public class Ejercicio_4 {
    public static void main(String[] args){

        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingrese la cantidad de pares que quieras ingresar: ");
        int numero = entrada.nextInt();

        int [] arr = new int [numero];

        int contador = 0;
        

        for (int i = 1; contador < numero; i++){
            if (i % 2 == 0){
                arr[contador] = i;                    
                contador++;                
            }

        }

        for (int n: arr){
            System.out.println("N:" + n);
        }
        entrada.close();
    }
}