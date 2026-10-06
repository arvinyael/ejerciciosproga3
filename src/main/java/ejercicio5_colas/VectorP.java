package ejercicio5_colas;

public class VectorP {
    protected int max = 50; 
    protected Pokemon v[] = new Pokemon [max]; 
}

class Cola extends VectorP{
    public int fr; 
    public int fi; 

    public Cola() {
        this.fr = -1;
        this.fi = -1;
    }            
}

class CCPokemon extends Cola{

    public CCPokemon() {
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

    public void adi(Pokemon r){
        if(esLlena()){
            System.out.println("La cola está llena");
        } else {
            fi = (fi + 1) % max;
            v[fi] = r;
        }
    }

    public Pokemon eli(){
        Pokemon elem = null;
        if(esVacia()){
            System.out.println("La cola está vacía");
        } else {
            fr = (fr + 1) % max;
            elem = v[fr];
        }
        return elem;
    }

    public void vaciar(CCPokemon otro){
        while(! otro.esVacia()){
            adi(otro.eli());
        }
    }

    public void mostrar(){
        CCPokemon aux = new CCPokemon();
        while(! esVacia()){
            Pokemon elem = eli();
            elem.mostrar();
            aux.adi(elem);
        }
        vaciar(aux);
    }    
}
