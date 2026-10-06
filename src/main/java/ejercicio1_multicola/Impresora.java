package ejercicio1_multicola;

class Impresora {
    private int id_impresora; 
    private String estado; 

    public Impresora(int id_impresora, String estado) {
        this.id_impresora = id_impresora;
        this.estado = estado;
    }

    public int getId_impresora() {
        return id_impresora;
    }

    public String getEstado() {
        return estado;
    }
    
    public void mostrar() {
        System.out.println("Impresora{" + "id_impresora=" + id_impresora + ", estado=" + estado + '}');
    }
}
