package ejercicio2_pilas;

public class Main {
    public static void main(String[] args) {
        Pila p = new Pila(); 
        p.adi("U");
        p.adi("E");
        p.adi("C");
        p.adi("X");
        p.adi("A");
        eliVocal(p);   
        p.mostar();
    }

    private static void eliVocal(Pila p) {
        Pila aux = new Pila(); 
        while(!p.esVacia()){
            String x = p.eli(); 
            if(x != "A" && x != "E" && x!= "I" && x!="O" && x!= "U"){
                aux.adi(x);
            }
        }                
        p.vaciar(aux);
    }
}
