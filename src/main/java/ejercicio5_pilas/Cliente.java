package ejercicio5_pilas;

public class Cliente {
    private int id_cliente; 
    private String nombre; 
    private String casa; 

    public Cliente(int id_cliente, String nombre, String casa) {
        this.id_cliente = id_cliente;
        this.nombre = nombre;
        this.casa = casa;
    }
    
    public void mostrar() {
        System.out.println("Cliente{" + "id_cliente=" + id_cliente + ", nombre=" + nombre + ", casa=" + casa + '}');
    }

    public int getId_cliente() {
        return id_cliente;
    }

    public String getNombre() {
        return nombre;
    }

    public String getCasa() {
        return casa;
    }
    
    
    
}
