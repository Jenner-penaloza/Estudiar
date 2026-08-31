public class Ejercicio_3 {
    public static void main(String[] args) {
        int numeros [] = {5,2,8,1,3};

        for (int i = 0; i< numeros.length -1; i++){
            //System.out.println(numeros[i]);
            for (int j = 0; j < numeros.length -1 -i; j++ ){
                //System.out.println("Ciclo: " + i + " Interación: " + j);
                int a = 0;
                int b = 0;

                if (numeros[j] > numeros[j+1]){
                    a = numeros[j];
                    b = numeros[j+1];

                    numeros[j] = b;
                    numeros[j+1] = a;
                }
            }
            
        }

        for (int i: numeros){
            System.out.println(i);
        }
    }
}
