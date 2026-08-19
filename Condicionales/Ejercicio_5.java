//DÍAS DE LA SEMANAS CON "SWITCH"

import java.util.Scanner;

public class Ejercicio_5 {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingrese un numero del 1 al 7: ");
        int dia = entrada.nextInt();

        switch (dia){

            case 1:
                System.out.println("Es Lunes, Dia Laboral");
                break;
            case 2:
                System.out.println("Es Martes, Dia Laboral");
                break;
            case 3:
                System.out.println("Es Miercoles, Dia Laboral");
                break;
            case 4:
                System.out.println("Es Jueves, Dia Laboral");
                break;
            case 5:
                System.out.println("Es Viernes, Dia Laboral");
                break;
            case 6:
                System.out.println("Es Sabado, Fin de Semana");
                break;
            case 7:
                System.out.println("Es Domingo, Fin de Semana");
                break;
            default:
                System.out.println("Dia no Valido");
                break;
        }

        entrada.close();
    }
}
