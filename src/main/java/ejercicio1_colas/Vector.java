package ejercicio1_colas;

public class Vector {
    protected int max = 50; 
    protected String v[] = new String [max]; 
        
}

class Cola extends Vector{
    public int ini; 
    public int fin; 

    public Cola() {
        this.ini = -1; 
        this.fin = -1; 
    }
}
class ColaSimple extends Cola{

    public ColaSimple() {
        
    }
    
    public int nroElem() {
        if(ini == -1 && fin == -1){
            return 0;
        }
        else{
            return fin - ini + 1;
        }
    }

    public boolean esVacia(){
        return ini == -1 && fin == -1;
    }

    public boolean esLlena(){
        return fin == max;
    }

    public void adi(String u){
        if(esLlena()){
            System.out.println("Cola llena");
        }
        else{
            fin++;
            v[fin] = u;
        }
    }

    public String eli(){
        String u = "";
        if(esVacia()){
            System.out.println("Cola vacia");
        }
        else{
            ini++;
            u = v[ini];
            if(ini == fin){
                ini = fin = -1;
            }
        }
        return u;
    }

    public void vaciar(ColaSimple otra){
        while(!otra.esVacia()){
            this.adi(otra.eli());
        }
    }

    public void mostrar(){
        ColaSimple aux = new ColaSimple();
        while (!this.esVacia()) {
            String u = this.eli();
            System.out.println("\t"+u);
            aux.adi(u);
        }
        this.vaciar(aux);
    }
    }    
    

