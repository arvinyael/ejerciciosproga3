package ejercicio5_colas;

public class VectorE {
    protected int max = 50; 
    protected Entrenador v[] = new Entrenador[max];        
}

class ColaE extends VectorE {
    public int fr; 
    public int fi; 

    public ColaE() {
        this.fr = -1;
        this.fi = -1;
    }           
}

class CEntrenador extends ColaE {

    public CEntrenador() {
        super();
    }
    
    public int nroElem() {
        if (fr == -1 && fi == -1) {
            return 0;
        } else {
            return fi - fr + 1;
        }
    }

    public boolean esVacia() {
        return fr == -1 && fi == -1;
    }

    public boolean esLlena() {
        return fi == max - 1;
    }

    public void adi(Entrenador u) {
        if (esLlena()) {
            System.out.println("Cola llena");
        } else {
            fi++;
            v[fi] = u;
        }
    }

    public Entrenador eli() {
        Entrenador u = null;
        if (esVacia()) {
            System.out.println("Cola vacia");
        } else {
            fr++;
            u = v[fr];
            if (fr == fi) {
                fr = fi = -1;
            }
        }
        return u;
    }

    public void vaciar(CEntrenador otra) {
        while (!otra.esVacia()) {
            this.adi(otra.eli());
        }
    }

    public void mostrar() {
        CEntrenador aux = new CEntrenador();
        while (!this.esVacia()) {
            Entrenador u = this.eli();
            u.mostrar();
            aux.adi(u);
        }
        this.vaciar(aux);
    }
}