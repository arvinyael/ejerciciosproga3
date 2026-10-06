package ejercicio1_colas;

public class Main {
    public static void main(String[] args) {
        ColaSimple c = new ColaSimple(); 
        c.adi("A");
        c.adi("B");
        c.adi("E");
        c.adi("E");
        c.adi("S");
        c.adi("B");
        c.adi("R");
        
        c.mostrar();
       ColaSimple x =  borrarRep(c); 
        System.out.println("procedimiento");
        x.mostrar();
    }

    private static ColaSimple borrarRep(ColaSimple c) {
    ColaSimple unicos = new ColaSimple();
    ColaSimple cp2 = new ColaSimple();
    ColaSimple aux = new ColaSimple();
    
    while(!c.esVacia()) {
        String x = c.eli();
        cp2.adi(x);     
        aux.adi(x);  
    }    
    c.vaciar(aux);

    while(!cp2.esVacia()) {
        String x = cp2.eli();       
        ColaSimple temporal = new ColaSimple();
        int repetido = 0;
        while (!unicos.esVacia()) {
            String u = unicos.eli();
            if (x.equalsIgnoreCase(u)) {
                repetido = 1;
            }
            temporal.adi(u);
        }
        unicos.vaciar(temporal);
        if (repetido == 0) {
            unicos.adi(x);
        }
    }
    return unicos; 

}
}
