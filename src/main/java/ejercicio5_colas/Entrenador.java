package ejercicio5_colas;

public class Entrenador {
    private String nombre; 
    private String region; 
    private CCPokemon CCPokemon; 

    public Entrenador(String nombre, String region, CCPokemon CCPokemon) {
        this.nombre = nombre;
        this.region = region;
        this.CCPokemon = CCPokemon;
    }

    public String getNombre() {
        return nombre;
    }

    public String getRegion() {
        return region;
    }

    public CCPokemon getCCPokemon() {
        return CCPokemon;
    }
    
    public void mostrar() {
        System.out.println("Entrenador{" + "nombre=" + nombre + ", region=" + region + ", CCPokemon=" + CCPokemon + '}');
    }
    
    
}
