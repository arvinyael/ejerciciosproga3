package ejercicio1_multicola;

public class VectorI {
    protected int max = 50; 
    protected Impresora v[] = new Impresora[max];         
}

class ColaI extends VectorI{
    public int fr; 
    public int fi; 

    public ColaI() {
        this.fr = -1;
        this.fi = -1;
    }                
}

class CSImpresora extends ColaI{

    public CSImpresora() {
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

    public void adi(Impresora u){
        if(esLlena()){
            System.out.println("Cola llena");
        }
        else{
            fi++;
            v[fi] = u;
        }
    }

    public Impresora eli(){
        Impresora u = null;
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

    public void vaciar(CSImpresora otra){
        while(!otra.esVacia()){
            this.adi(otra.eli());
        }
    }

    public void mostrar(){
        CSImpresora aux = new CSImpresora();
        while (!this.esVacia()) {
            Impresora u = this.eli();
            System.out.println("\t"+u);
            aux.adi(u);
        }
        this.vaciar(aux);
    }
}
