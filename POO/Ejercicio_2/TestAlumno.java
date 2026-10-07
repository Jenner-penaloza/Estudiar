
import java.util.Scanner;

public class TestAlumno {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingrese su Nombre: ");
        String nombre = entrada.nextLine();
        int edad;
        
        while (true){
            System.out.print("Ingrese su Edad: ");
            edad = entrada.nextInt();

            if (Alumno.isEdadValida(edad)){
                break;
            }else{
                System.err.println("Ingrese su edad cacorro. ");
            }
        }


        System.out.print("Ingrese su Nota Final: ");
        double nota = entrada.nextDouble();
        

        Estudiante e = new Estudiante(nombre, edad, nota);
    
        e.darInformacion(); 

        entrada.close();
    }
}
