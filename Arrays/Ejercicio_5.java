public class Ejercicio_5 {
    public static void main(String[] args){

        int[][] numeros = {
            {1, 2, 3,99},
            {4, 5, 6},
            {7, 8, 9}
        };
        
        for (int i = 0; i < numeros.length; i++){
            System.out.println("Fila: " + i);
            
            for (int j = 0; j< numeros[i].length; j++){
                System.out.println("N:" + numeros[i][j]);
            }
            
        }

        System.out.println("Recorrer solamente la primera columna de todas las filas ");

        for (int i = 0; i < numeros.length; i++){
            System.out.println("N: " + numeros[0][i]);
        }
    }
}
