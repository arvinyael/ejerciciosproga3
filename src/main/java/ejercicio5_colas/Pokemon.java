package ejercicio5_colas;

public class Pokemon {
    private int id; 
    private String nombre; 
    private String tipo; 
    private int nivel; 

    public Pokemon(int id, String nombre, String tipo, int nivel) {
        this.id = id;
        this.nombre = nombre;
        this.tipo = tipo;
        this.nivel = nivel;
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public int getNivel() {
        return nivel;
    }
    
    public void mostrar() {
        System.out.println("Pokemon{" + "id=" + id + ", nombre=" + nombre + ", tipo=" + tipo + ", nivel=" + nivel + '}');
    }
    
    
    
    
}
