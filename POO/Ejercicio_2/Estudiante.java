public class Estudiante extends Alumno{
    
    private double notaFinal;

    
    public Estudiante(String nombre, int edad, double notaFinal){

        super(nombre, edad);
        setNota(notaFinal); 

    }

    public double getNota(){

        return this.notaFinal;
    }

    public void setNota(double nota){

        if(nota >= 0 && nota <= 5){
            this.notaFinal = nota; 
        }else{
            System.out.println("Error, Nota no valida. ");
        }
        
    }


    public void darInformacion(){

        super.mostrarrInformacion(); 

        if(this.notaFinal >= 3){
            System.out.println("Nota Final: " + this.notaFinal + " Ganaste la Materia. ");
        }else{
            System.out.println("Nota Final: " + this.notaFinal + " Perdiste la Materia. ");
        }
        
    }
}// listo ;)

