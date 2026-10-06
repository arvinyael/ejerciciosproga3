package ejercicio3_multipilas;

public class VectorR {
    protected int max = 50; 
    protected Registro v[] = new Registro[max];     
}

class PilaR extends VectorR{
    private int tope=-1; 

    public PilaR() {
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
    
    public void adi(Registro n){
        if (!esLlena()){
        tope++; 
        v[tope] = n; }
        else System.out.println("PilaRRegistro Llena");
    }
    
    public Registro eli(){
        Registro x = null; 
        if (!esVacia()){
            x = v[tope]; 
            tope--; 
        }
        else System.out.println("PilaRRegistro Vacia");
        return x;        
    }
    
    public int nroElem(){
        return ++tope; 
    }
    
    public void vaciar(PilaR p){
        while (!p.esVacia()){
           this.adi(p.eli());             
        }    
    }
    
    public void mostar(){
        PilaR aux = new PilaR(); 
        while(!this.esVacia()){
            Registro x = this.eli(); 
            x.mostrar();
            aux.adi(x);
        }
        this.vaciar(aux);        
    }
} 
