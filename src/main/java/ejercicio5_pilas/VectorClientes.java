package ejercicio5_pilas;

public class VectorClientes {
    protected int max = 50; 
    protected Cliente v[] = new Cliente [max];         
}

class PilaClientes extends VectorClientes{
    private int tope; 
    
    public PilaClientes(){
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
    
    public void adi(Cliente n){
        if (!esLlena()){
        tope++; 
        v[tope] = n; }
        else System.out.println("PilaClientes Llena");
    }
    
    public Cliente eli(){        
        if (!esVacia()){
            Cliente x = v[tope]; 
            tope--; 
            return x;        
        }
        else{ System.out.println("PilaClientes Vacia");
        return null; 
        }
    }
    
    public int nroElem(){
        return ++tope; 
    }
    
    public void vaciar(PilaClientes p){
        while (!p.esVacia()){
           this.adi(p.eli());             
        }    
    }
    
    public void mostar(){
        if(!esVacia()){
        PilaClientes aux = new PilaClientes(); 
        while(!this.esVacia()){
            Cliente x = this.eli(); 
            x.mostrar();
            aux.adi(x);
        }
        this.vaciar(aux);        
        }
        else System.out.println("Pila vacia");
    }
    
}
