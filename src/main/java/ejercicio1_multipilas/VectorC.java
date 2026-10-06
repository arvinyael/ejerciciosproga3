package ejercicio1_multipilas;

public class VectorC {
    protected int max = 50; 
    protected Correo v[]= new Correo [max]; 
}

class PilaCorreo extends VectorC{
    private int tope = -1; 

    public PilaCorreo() {
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
    
    public void adi(Correo n){
        if (!esLlena()){
        tope++; 
        v[tope] = n; }
        else System.out.println("PilaCorreo Llena");
    }
    
    public Correo eli(){
        Correo x = null; 
        if (!esVacia()){
            x = v[tope]; 
            tope--; 
        }
        else System.out.println("PilaCorreo Vacia");
        return x;        
    }
    
    public int nroElem(){
        return ++tope; 
    }
    
    public void vaciar(PilaCorreo p){
        while (!p.esVacia()){
           this.adi(p.eli());             
        }    
    }
    
    public void mostar(){
        PilaCorreo aux = new PilaCorreo(); 
        while(!this.esVacia()){
            Correo x = this.eli(); 
            x.mostrar();
            aux.adi(x);
        }
        this.vaciar(aux);        
    }
}
