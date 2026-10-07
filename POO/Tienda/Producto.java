package POO.Tienda;
public class Producto {
    
    private String nombre;
    private double precio;
    private int stock;
    private String codigo;


    public Producto(String nombre, double precio, int stock, String codigo){
        this.nombre = nombre;
        this.precio = precio;
        this.stock = stock;
        this.codigo = codigo;
    }

    public void setNombre(String nombre){

        this.nombre = nombre;
        
    }

    public String getNombre(){
        return nombre;
    }

    public void setPrecio(double precio){
        
        this.precio = precio;

    }

    public double getPrecio(){
        return precio;
    }

    public void setStock(int stock){

        this.stock = stock;

    }

    // public double getStock(){
    //     return stock;
    // }

    // public void setCodigo(String codigo){
    //     this.codigo = codigo;
    // }

    // public String getCodigo(){
    //     return codigo;
    // }

    public void mostrarInformación(){
        System.out.println("Nombre: " + this.nombre);
        System.out.println("Precio: " + this.precio);
        System.out.println("Stock: " + this.stock);
        System.out.println("Codigo: " + this.codigo);
    }
}


