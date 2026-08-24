public class Ejercicio_2 {
    public static void main(String[] args){
        

        int [] arr = new int [10];

        for (int i = 0; i < arr.length; i++){
           
           //int val = arr.length ;
           System.out.println(arr[i] = i+1);
        }

        for (int n: arr){
            System.out.println("n:" + n);
        }

        // DE MAYOR A MENOR


        for (int i = arr.length-1; i >= 0; i--){
            System.out.println(arr[i]);
        }

        for (int n: arr){
            System.out.println("n:" + n);
        }

        
    }
}
