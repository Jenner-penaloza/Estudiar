import java.util.Scanner;

public class Ejercicio_6 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("ingrese un numero ");
        int numero = entrada.nextInt();


        int resultado = factorial(numero);
        System.out.println(resultado);

        entrada.close();
    }
    public static int factorial (int n){
        if (n == 1){
            return n;
        }

        return n * factorial(n-1);
    }
}
