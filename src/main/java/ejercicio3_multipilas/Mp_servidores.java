package ejercicio3_multipilas;

public class Mp_servidores {
    private int n; 
    private PilaR c[];

    public Mp_servidores(int n) {
        this.c = new PilaR[n];
        this.n = n; 
        for (int i=0; i<n; i++){
            c[i] = new PilaR(); 
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

    public void adi(int i, Registro est) {
        c[i].adi(est);
    }

    public Registro eli(int i) {
        return c[i].eli();
    }
    
    public void mostrar() {
        System.out.println("\nDatos de la multipila");
        for (int i = 0; i < this.n; i++) {
            c[i].mostar();
        }
    }

    public void mostrar(int i) {
        c[i].mostar();
    }

    public void vaciar(int i, PilaR z) {
        c[i].vaciar(z);
    }

    public void vaciar(int i, int j) {
        c[i].vaciar(c[j]);
    }

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }
    
}
