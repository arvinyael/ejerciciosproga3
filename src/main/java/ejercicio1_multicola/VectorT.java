package ejercicio1_multicola;

public class VectorT {
    protected int max = 50; 
    protected Trabajo v[] = new Trabajo [max]; 
}

class ColaT extends VectorT{
    public int fr; 
    public int fi; 

    public ColaT() {
        this.fr = -1;
        this.fi = -1;
    }                
}

class CSTrabajo extends ColaT{

    public CSTrabajo() {
    }
    
    public int nroElem() {
        if(fr == -1 && fi == -1){
            return 0;
        }
        else{
            return fi - fr + 1;
        }
    }

    public boolean esVacia(){
        return fr == -1 && fi == -1;
    }

    public boolean esLlena(){
        return fi == max;
    }

    public void adi(Trabajo u){
        if(esLlena()){
            System.out.println("Cola llena");
        }
        else{
            fi++;
            v[fi] = u;
        }
    }

    public Trabajo eli(){
        Trabajo u = null;
        if(esVacia()){
            System.out.println("Cola vacia");
        }
        else{
            fr++;
            u = v[fr];
            if(fr == fi){
                fr = fi = -1;
            }
        }
        return u;
    }

    public void vaciar(CSTrabajo otra){
        while(!otra.esVacia()){
            this.adi(otra.eli());
        }
    }

    public void mostrar(){
        CSTrabajo aux = new CSTrabajo();
        while (!this.esVacia()) {
            Trabajo u = this.eli();
            System.out.println("\t"+u);
            aux.adi(u);
        }
        this.vaciar(aux);
    }
}
