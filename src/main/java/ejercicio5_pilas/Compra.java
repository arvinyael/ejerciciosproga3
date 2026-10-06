package ejercicio5_pilas;

public class Compra {
    private int id_cliente; 
    private double monto; 
    private String tipo; 

    public Compra(int id_cliente, double monto, String tipo) {
        this.id_cliente = id_cliente;
        this.monto = monto;
        this.tipo = tipo;
    }

    public int getId_cliente() {
        return id_cliente;
    }

    public double getMonto() {
        return monto;
    }

    public String getTipo() {
        return tipo;
    }
    
    public void mostrar() {
        System.out.println("Compra{" + "id_cliente=" + id_cliente + ", monto=" + monto + ", tipo=" + tipo + '}');
    }
    
}
