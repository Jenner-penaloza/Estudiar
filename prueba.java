import java.util.Scanner;

public class prueba {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Ingrese su edad: ");
        int edad = entrada.nextInt();

        if (edad >= 18){
            System.out.println("Eres mayor de edad.");
            
        }
        
        else {
            System.out.println ("Eres menor de edad.");
        }
        
        if (edad >= 0 && edad < 12){
            System.out.println("Eres un niño.");
        }

        else if (edad < 18){
            System.out.println ("Eres un adolecente.");
        }

        else if (edad > 18 && edad <=40){
            System.out.println("Eres un adulto");
        }

        else{
            System.out.println ("Eres un adulto mayor.");
        }

        int numero = 1;

        while (numero <= 5){
            System.out.println(numero);
            numero+= 1;
        }

        System.out.println("--------------");

        int n = 1;

        while (n <= 20){
            if (n % 2 == 0){
                System.out.println(n);
            }
            n += 1;
        }
        System.out.println("---------");
        int a = 6;
        while (a<43){
            System.out.println(a);
            a += 5;
        }
        System.out.println("----");

        entrada.close();

    }   
}
