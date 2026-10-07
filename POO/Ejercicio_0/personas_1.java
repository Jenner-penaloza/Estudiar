import java.util.Scanner;
public class personas_1 {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingrese su nombre: ");
        String nombre = entrada.nextLine();

        System.out.print("Ingrese su Edad: ");
        int edad = entrada.nextInt();

        while (edad <= 0 | edad > 100){
            System.out.println("Eror, Vuelva a ingresar una edad verdadera cacorro: ");
            int a = entrada.nextInt();
            edad = a;
            
        }

        System.out.println("Ingrese su sexo (True / False) ");
        boolean max = entrada.nextBoolean();
        
        personas p = new personas(edad, nombre, max);

        p.respuesta();
        entrada.close();
    }
}
