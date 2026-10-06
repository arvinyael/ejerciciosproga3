package ejercicio1_multicola;

public class Mc_trabajos {
    private int n; 
    private CSTrabajo c[]; 

    public Mc_trabajos(int n) {
        c = new CSTrabajo[n];
        this.n = n;         
        for (int i = 0; i < n; i++) {
            c[i] = new CSTrabajo();
        }
    }
    
    public int nroElem(int i) {
        return c[i].nroElem();
    }

    public boolean esVacia(int i) {
        return c[i].esVacia();
    }

    public boolean esLlena(int i) {
        return c[i].esLlena();
    }

    public void adi(int i, Trabajo est) {
        c[i].adi(est);
    }

    public Trabajo eli(int i) {
        return c[i].eli();
    }
    
    public void mostrar() {
        System.out.println("\n--- Datos de la Multicola de Impresoras ---");
        for (int i = 0; i < this.n; i++) {
            System.out.println("Impresora Nro " + (i + 1) + ":");
            c[i].mostrar();
        }
    }

    public void mostrar(int i) {
        c[i].mostrar();
    }

    public void vaciar(int i, CSTrabajo z) {
        c[i].vaciar(z);
    }

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }
}