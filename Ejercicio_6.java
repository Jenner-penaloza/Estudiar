// SUMAR LOS NUMEROS DEL 1 AL 100 CON "FOR"

public class Ejercicio_6 {
    
    public static void main(String[] args) {
        
        int numero = 0;
        
        for (int i = 1; i <= 100; i++){
            //System.out.println(numero += i);
            numero += i;
        }
        System.out.println("La suma es: " + numero);
    }
}