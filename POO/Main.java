import POO.Tienda.*;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingrese el nombre del producto: ");
        String nombre = entrada.nextLine();

        

        System.out.print("Ingrese el precio del producto: ");
        double precio = entrada.nextDouble();

        System.out.print("Ingrese la cantidad de productos disponibles: ");
        int stock = entrada.nextInt();

        entrada.nextLine();

        System.out.print("Ingerse el codigo del producto: ");
        String codigo = entrada.nextLine();

        Producto p1 = new Producto(nombre, precio, stock, codigo);

        p1.mostrarInformación();

        entrada.close();
    }
}