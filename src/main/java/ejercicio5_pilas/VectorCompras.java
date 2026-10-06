package ejercicio5_pilas;

public class VectorCompras {
    protected int max = 50; 
    protected Compra v[] = new Compra[max]; 
}

class PilaCompras extends VectorCompras{
    private int tope; 

    public PilaCompras() {
        this.tope = -1;
    }
    
     public boolean esVacia(){
        if (tope == -1){
            return true; 
        }
        else return false; 
    }
    public boolean esLlena(){
        if (this.tope == this.max-1){
            return true; 
        }
        else return false; 
    }
    
    public void adi(Compra n){
        if (!esLlena()){
        tope++; 
        v[tope] = n; }
        else System.out.println("PilaCompras Llena");
    }
    
    public Compra eli(){        
        if (!esVacia()){
            Compra x = v[tope]; 
            tope--; 
            return x;        
        }
        else{ System.out.println("PilaCompras Vacia");
        return null; 
        }
    }
    
    public int nroElem(){
        return ++tope; 
    }
    
    public void vaciar(PilaCompras p){
        while (!p.esVacia()){
           this.adi(p.eli());             
        }    
    }
    
    public void mostar(){
        if(!esVacia()){
            PilaCompras aux = new PilaCompras(); 
            while(!this.esVacia()){
            Compra x = this.eli(); 
            x.mostrar();
            aux.adi(x);
        }
        this.vaciar(aux);       
        }
        else System.out.println("Pila Vacia");
         
    }
}
