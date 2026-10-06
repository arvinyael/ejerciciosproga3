package ejercicio2_pilas;

public class Vector {
    protected int max = 50; 
    protected String v[] = new String [max]; 
}

class Pila extends Vector{
    private int tope; 
    
    public Pila(){
        this.tope = -1; 
    }
    
    public boolean esLlena(){
        if (this.tope == this.max-1){
            return true; 
        }
        else return false; 
    }
    
    public boolean esVacia(){
        if (this.tope == -1)
            return true; 
        else return false;         
    }
    
    public void adi(String n){
        if (!esLlena()){
        tope++; 
        v[tope] = n; }
        else System.out.println("Pila Llena");
    }
    
    public String eli(){
        String x = ""; 
        if (!esVacia()){
            x = v[tope]; 
            tope--; 
        }
        else System.out.println("Pila Vacia");
        return x;        
    }
    
    public int nroElem(){
        return ++tope; 
    }
    
    public void vaciar(Pila p){
        while (!p.esVacia()){
           this.adi(p.eli());             
        }    
    }
    
    public void mostar(){
        Pila aux = new Pila(); 
        while(!this.esVacia()){
            String x = this.eli(); 
            System.out.println(x);
            aux.adi(x);
        }
        this.vaciar(aux);        
    }
}
