package Repaso;

public class Producto {
    String nombre;
    double precio;
    int cantidad;

    public Producto(String nombre, double precio, int cantidad){
        this.nombre = nombre;
        this.precio = precio;
        this.cantidad = cantidad;
    }

    public double calcularTotal(){
        return precio * cantidad;
    }

    public void mostrarInformación(){
        System.out.println("Nombre: "+ this.nombre);
        System.out.println("Precio: " + this.precio);
        System.out.println("Cantidad: " + this.cantidad);
        System.out.println("Total: " + calcularTotal());
    }

}