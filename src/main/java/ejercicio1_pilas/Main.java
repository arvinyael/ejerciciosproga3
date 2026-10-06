
package ejercicio1_pilas;

public class Main {
    public static void main(String[] args) {
        Pila p = new Pila(); 
        p.adi(8);
        p.adi(1);
        p.adi(6);
        p.adi(3);
        p.adi(2);
        
        p.mostar();
        
        eliminarPosImpar(p);
        p.mostar();
}

    private static void eliminarPosImpar(Pila p) {
        Pila aux =  new Pila(); 
        int sw = 0; 
        while(!p.esVacia()){
            if (sw == 1){
                aux.adi(p.eli());
                sw=0;
            }
            else{
                sw++;
                p.eli();}            
        }
        p.vaciar(aux);
        
    }
}
