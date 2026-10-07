public class CuentaBancaria {
    
    private String titular;
    private double saldo;

    public String getTitular(){
        return this.titular;
    }

    public void setTitular(String titular){
        this.titular = titular;
    }

    public double getSaldo(){
        return this.saldo;
    }

    public void setSaldo(double saldo){
        if (saldo >= 0){
            this.saldo = saldo;
        }else{
            System.out.println("Error el saldo no puede ser negativo. ");
        }
        
    }

    public CuentaBancaria(String titular, double saldo){

        this.titular = titular;
        setSaldo(saldo); // o this.setSaldo(saldo) :)
    }

    public void depositar(double monto){
        if(monto > 0){

            this.saldo += monto;
            System.out.println("Deposito Correcto. \nNuevo Saldo: " + this.saldo );

        }else{
            System.out.println("Error, debes depositar mas de 0 pesos. ");
        }
    }

    public void retirar(double monto){
        if(monto > 0 && monto <= this.saldo){

            this.saldo -= monto;
            System.out.println("Retiro Exitoso. \nNuevo Saldo: " + this.saldo );

        }else if (monto > this.saldo){
            System.out.println("Error, debe retirar menos del Saldo. ");

        }else{
            System.out.println("Error, debes retirar mas de 0 pesos");
        }
    }

    public void mostrarInformacion(){
        System.out.println("Titular: " + this.titular);
        System.out.println("Saldo: " + this.saldo);
    }
}