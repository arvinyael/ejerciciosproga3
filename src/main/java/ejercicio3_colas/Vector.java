package ejercicio3_colas;

public class Vector {
    protected int max = 50; 
    protected int v[] = new int [max];             
}

class Cola extends Vector{
    public int fr; 
    public int fi; 

    public Cola() {
        this.fr = -1;
        this.fi = -1;
    }                
}

class ColaCircular extends Cola{
    public ColaCircular() {        
    }
    
    public int nroElem(){
        return (fi - fr + max) % max;
    }

    public boolean esVacia(){
        return nroElem() == 0;
    }

    public boolean esLlena(){ 
        return nroElem() == max -1;
    }

    public void adi(int r){
        if(esLlena()){
            System.out.println("La cola está llena");
        } else {
            fi = (fi + 1) % max;
            v[fi] = r;
        }
    }

    public int eli(){
        int elem = 0;
        if(esVacia()){
            System.out.println("La cola está vacía");
        } else {
            fr = (fr + 1) % max;
            elem = v[fr];
        }
        return elem;
    }

    public void vaciar(ColaCircular otro){
        while(! otro.esVacia()){
            adi(otro.eli());
        }
    }

    public void mostrar(){
        ColaCircular aux = new ColaCircular();
        while(! esVacia()){
            int elem = eli();
            System.out.println(elem);
            aux.adi(elem);
        }
        vaciar(aux);
    }    
}
