// CALCULAR EL PRECIO FINAL CON DESCUENTO
import java.util.Scanner;

public class Ejercicio_4 {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingrese el precio del producto: ");
        int precio = entrada.nextInt();

        if (precio < 500){
            System.out.println("Precio Original: " + precio + "\nEl Descuento Aplicado: " + 0 + "\nPrecio Final: " + precio);
        }

        else if (precio >= 500 && precio < 1000){
            double descuento = precio * 0.1;
            System.out.println("Precio Original: " + precio + "\nEl Descuento Aplicado: " + descuento + "\nPrecio Final: " + (precio - descuento));
        }  

        else{
            double descuento = precio * 0.2;
            System.out.println("Precio Original: " + precio + "\nEl Descuento Aplicado: " + descuento + "\nPrecio Final: " + (precio - descuento));
        }

        entrada.close();
    }
}
