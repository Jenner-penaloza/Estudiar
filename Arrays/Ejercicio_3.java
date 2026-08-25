

public class Ejercicio_3 {
    public static void main(String[] args){

        int size = 30;
        int [] primos = new int[size];
        int contador = 0;

        int numero = 2;

        
        while (contador < size){

            int divisor = 0;
            for (int i = 1; i <= numero; i++){
                

                if (numero % i == 0){
                    divisor ++;
                    //System.out.println("N:" + numero + " " + i);
                }
            }

            if (divisor == 2){
                primos[contador] = numero;
                contador ++;
            }

            numero ++;
            
        }

        for (int n: primos){
            System.out.println("N:" + n);
        }
        
    }   
}
