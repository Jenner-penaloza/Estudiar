public class personas{
    
    private String nombre;
    private int edad;
    private boolean isMale;



    public personas(int edad, String nombre, boolean max){

        this.edad = edad;
        this.nombre = nombre;
        this.isMale = max;
    }

    public String getNombre(){
        return this.nombre;
    }

    public int getEdad(){
        return edad;
    }

    public boolean getIsmale(){
        return isMale;
    }
    
    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public void setEdad (int edad){
        this.edad = edad;
    }

    public void setBooleano (boolean correcto){
        this.isMale = correcto;
    }


    public void respuesta(){
        
        
        if (isMale){
            System.out.println("Señor " + this.nombre);
            
        }else{
            System.out.println("Señora " + this.nombre);

        }
        System.out.println("Edad " + this.edad);
    }

}




