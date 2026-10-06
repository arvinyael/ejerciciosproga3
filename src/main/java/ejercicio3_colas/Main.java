package ejercicio3_colas;

public class Main {
    public static void main(String[] args) {
        ColaCircular cc = new ColaCircular(); 
        cc.adi(4);
        cc.adi(7);
        cc.adi(9);
        cc.adi(2);
        cc.adi(3);
        cc.adi(6);
        
        cc.mostrar();
        
        reordenar(cc); 
        System.out.println("despues de el ordenamiento");
        cc.mostrar(); 
    }

    private static void reordenar(ColaCircular cc) {
        ColaCircular pares = new ColaCircular();
        ColaCircular impares = new ColaCircular();       
        while (!cc.esVacia()) {
            int x = cc.eli();
            if (x % 2 == 0) {
                pares.adi(x);
            } else {
                impares.adi(x);
            }
        }        
        cc.vaciar(impares);    
        cc.vaciar(pares);
    }
}
