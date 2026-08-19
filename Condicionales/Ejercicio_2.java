import java.util.Scanner;

    public class Ejercicio_2 {

        public static void main(String[] args) {
            Scanner Scanner = new Scanner(System.in);

            System.out.print("Cual es tu nombre: ");
            String a = Scanner.nextLine();

            System.out.print("Cual es tu edad: ");
            int numero = Scanner.nextInt();
            
            System.out.println("Hola " + a + ", tu edad es de: " + numero + " años.");
            Scanner.close();
        }
    }
