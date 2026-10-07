import java.util.Scanner;

public class TestBanco {
    
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Ingrese el Titular de su cuenta: ");
        String titular = entrada.nextLine();

        System.out.print("Ingrese su Saldo: ");
        double saldo = entrada.nextDouble();

        while (saldo < 0){
            System.out.println("Error, debe ingresar un saldo positivo cacorro. ");
            System.out.print("Ingrese su Saldo: ");
            saldo = entrada.nextDouble();
        }

        CuentaBancaria usuario = new CuentaBancaria(titular, saldo);

        usuario.mostrarInformacion();

        System.out.print("Cuanto desea Depositar: ");
        double monto = entrada.nextDouble();

        usuario.depositar(monto);

        System.out.print("Cuanto desea Retirar: ");
        double x = entrada.nextDouble();

        usuario.retirar(x);

        entrada.close();
    }
}