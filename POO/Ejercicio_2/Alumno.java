package POO.Ejercicio_2;

public class Alumno {
    
    protected String nombre;
    protected int edad;

    // El constructor de la clase "padre"
    public Alumno(String nombre, int edad){

        this.nombre = nombre;
        setEdad(edad);
    }

    
    public String getNombre(){
        
        return this.nombre;
    }

    public void setNombre(String nombre){
        
        this.nombre = nombre;
    }

    public int getEdad(){

        return this.edad;
    }


    public static boolean isEdadValida(int edad){

        return (edad > 0 && edad <= 100);
    }


    // Esto es un antojo, el validar la edad del cacorro.
    public void setEdad(int edad){
        
        if(isEdadValida(edad)){
            this.edad = edad;
        }else{
            System.out.println("Edad no valida. ");
        
        }
        
    }

    // aquí el metodo de la clase "padre" para mostrar en el terminal.
    public void mostrarrInformacion(){
        System.out.println("Nombre: " + this.nombre + "\nEdad : " + this.edad);
    }

}// Terminamos la clase "padre" ;)


