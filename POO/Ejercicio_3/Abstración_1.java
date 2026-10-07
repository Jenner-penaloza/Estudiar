package POO.Ejercicio_3;

abstract class Animal { 
    

    abstract void hacerSonido();

}

class perro extends Animal {
    @Override 

    void hacerSonido() {
        System.out.println("El perro ladra. ");
    }
}

class gato extends Animal {
    
    @Override 

    void hacerSonido() {
        System.out.println("El gato maulla. ");
    }
}

public class Abstración_1 {
    public static void main(String[] args) {
        
        Animal a1 = new perro();
        Animal a2 = new gato();

        a1.hacerSonido();
        a2.hacerSonido();
    }
}