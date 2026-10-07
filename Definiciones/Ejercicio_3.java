// Calculadora de IVA

import java.util.Scanner;

public class Ejercicio_3 {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingrese el precio del producto: ");
        double producto = entrada.nextDouble();

        double resultado = IVA(producto);

        System.out.println("Precio: " + producto + " Mas IVA: " + resultado );

        entrada.close();
    }

    public static double IVA(double a){
        
        double x = (a*0.21) + a;
        
        return x;
    }
}
