import java.util.Scanner;

public class Ejercicio_2{

    public static void main(String[] args){

        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingrese un numero para hallar los grados: ");
        double celsius = entrada.nextDouble();

        //System.out.println(celsius);

        double resultado = grados(celsius);

        System.out.println("Los grados Celsius es: " + celsius + " convertido: " + resultado);

        entrada.close();
        
    }

    public static double grados(double a){

        double f = (a * 9 / 5) + 32;
        return f;
    }


}