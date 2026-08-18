import java.util.Scanner;

    public class Ejercicio_3 {
        public static void main(String[] args){

            Scanner Scanner = new Scanner(System.in);


            System.out.print("Ingrese su nombre: ");
            String nombre = Scanner.nextLine();

            System.out.print("Ingrese su edad: ");
            int edad = Scanner.nextInt();

            System.out.println("Su nombre es: " + nombre + " Y tiene " + edad + "años");
            /*System.out.print("Esto sirve para poder comentear sin necesidad de colocar tantas cosas.")
            jsjsjsjsjsjsjsjs
            
            */
           Scanner.close();
        }
    }
