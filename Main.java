import Repaso.Producto;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingrese el Nombre del Producto: ");
        String nombre = entrada.nextLine();

        System.out.print("Ingrese el precio del Producto: ");
        double precio = entrada.nextDouble();

        System.out.print("Ingrese la cantidad del Producto: ");
        int cantidad = entrada.nextInt();

        Producto p1 = new Producto(nombre, precio, cantidad);

        p1.calcularTotal();

        p1.mostrarInformación();


        entrada.close();

    }
}
