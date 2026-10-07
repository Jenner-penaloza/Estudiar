// 
// import java.util.Scanner;3

public class Ejercicio_5 {
    public static void main(String[] args) {
        // Scanner entrada = new Scanner(System.in);

        // System.out.print("ingrese un valor: ");
        // String valor = entrada.nextLine();
        String valor = "hola";

        String resultado = reverse(valor);
        System.out.println(resultado);
        // entrada.close();
    }
    public static String reverse(String txt){
        
        if (txt.length() == 1){
            return txt;
        }

        String letra = String.valueOf(txt.charAt(0));
        String resto = txt.substring(1, txt.length());

        System.out.println(letra + resto);

        return (reverse(txt.substring(1,txt.length())) + String.valueOf(txt.charAt(0)));
    }
}
