package ejercicio1_pilas;

public class Vector {
    protected int max = 50; 
    protected int v[] = new int [max];
}

class Pila extends Vector {
    public int tope; 

    public Pila() {        
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
    
    public void adi(int n){
        if (!esLlena()){
        tope++; 
        v[tope] = n; }
        else System.out.println("Pila Llena");
    }
    
    public int eli(){
        int x = 0; 
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
            int x = this.eli(); 
            System.out.println(x);
            aux.adi(x);
        }
        this.vaciar(aux);        
    }
    
    
    
}


