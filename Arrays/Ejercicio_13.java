public class Ejercicio_13 {
    public static void main (String[] args){


        int numero [] = {6,3,9,7,1,2,8};
        for(int i = 0; i < numero.length - 1; i++){

            for(int j = 0; j < numero.length - 1 - i; j++){

                if(numero[j] > numero[j + 1]){

                    int temp = numero[j];

                    numero[j] = numero[j + 1];

                    numero[j + 1] = temp;
                }
            }
        }

        for(int i: numero){
            System.out.println(i);
        }
    }
}
