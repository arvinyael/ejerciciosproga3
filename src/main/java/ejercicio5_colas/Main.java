package ejercicio5_colas;
public class Main {
    public static void main(String[] args) {
        CCPokemon colaAsh = new CCPokemon();
        colaAsh.adi(new Pokemon(1, "Pikachu", "Eléctrico", 50));
        colaAsh.adi(new Pokemon(2, "Charizard", "Fuego/Volador", 65));
        colaAsh.adi(new Pokemon(3, "Sceptile", "Planta", 58));
        colaAsh.adi(new Pokemon(23, "Sceptile", "Planta", 34));
        
        CCPokemon colaMisty = new CCPokemon();
        colaMisty.adi(new Pokemon(4, "Starmie", "Agua/Psíquico", 45));
        colaMisty.adi(new Pokemon(5, "Psyduck", "Agua", 30));
        colaMisty.adi(new Pokemon(78, "Psyduck", "Agua", 30));

        CCPokemon colaBrock = new CCPokemon();
        colaBrock.adi(new Pokemon(6, "Onix", "Roca/Tierra", 40));
        colaBrock.adi(new Pokemon(7, "Geodude", "Roca/Tierra", 35));

        Entrenador e1 = new Entrenador("Ash Ketchum", "Pueblo Paleta", colaAsh);
        Entrenador e2 = new Entrenador("Misty", "Ciudad Celeste", colaMisty);
        Entrenador e3 = new Entrenador("Brock", "Ciudad Plateada", colaBrock);

        CEntrenador colaEntrenadores = new CEntrenador();
        colaEntrenadores.adi(e1);
        colaEntrenadores.adi(e2);
        colaEntrenadores.adi(e3);
        
        mostrarEntrenador(colaEntrenadores, "Ciudad Celeste");
        //c)
        System.out.println("primero el que tiene menos pokemons");
        moverEntrenador(colaEntrenadores);
        colaEntrenadores.mostrar();
        //d) 
        System.out.println("eliminar al mayor pokemon");
        eliMayor(colaEntrenadores); 
        colaEntrenadores.mostrar();  
        
        //e) 
        System.out.println("cantida de pokemones tipo agua: " + contAgua(colaEntrenadores, "Agua"));                
    }

    private static void mostrarEntrenador(CEntrenador c, String x) {
        CEntrenador aux = new CEntrenador();    
        System.out.println("Entrenadores de la región " + x + ":");
        while (!c.esVacia()) {
            Entrenador elem = c.eli();
            if (elem.getRegion().equalsIgnoreCase(x)) {
                System.out.println(elem.getNombre());
            }
            aux.adi(elem);
        }
        c.vaciar(aux);
    }
//inciso c
    private static void moverEntrenador(CEntrenador c) {
        CEntrenador aux1 = new CEntrenador(); 
        CEntrenador aux2 = new CEntrenador(); 
        int min = elMenos(c);
        while(!c.esVacia()){
            Entrenador e = c.eli(); 
            if(e.getCCPokemon().nroElem() == min){
                aux1.adi(e);
            }
            else{
                aux2.adi(e);
            }                        
        }
        c.vaciar(aux1);
        c.vaciar(aux2);
    }

    private static int elMenos(CEntrenador c) {
        CEntrenador aux = new CEntrenador(); 
        int min=999;        
        while(!c.esVacia()){
            Entrenador e = c.eli(); 
            if(e.getCCPokemon().nroElem() < min){
                min = e.getCCPokemon().nroElem(); 
            }
            aux.adi(e);
        }
        c.vaciar(aux);
        return min; 
    }
//fin inciso c
    //inciso d) 
    private static void eliMayor(CEntrenador c) {
        CEntrenador aux = new CEntrenador(); 
        int may = mayorP(c);
        while(!c.esVacia()){
            Entrenador e = c.eli(); 
            if(e.getCCPokemon().nroElem() != may){
                aux.adi(e);
            }
        }
        c.vaciar(aux);
    }

    private static int mayorP(CEntrenador c) {
        CEntrenador aux = new CEntrenador(); 
        int max=0;        
        while(!c.esVacia()){
            Entrenador e = c.eli(); 
            if(e.getCCPokemon().nroElem() > max){
                max = e.getCCPokemon().nroElem(); 
            }
            aux.adi(e);
        }
        c.vaciar(aux);
        return max;
    }
    //fin inciso d
    private static int contAgua(CEntrenador c, String x) {
        CEntrenador aux = new CEntrenador(); 
        int cont = 0; 
        while(!c.esVacia()){
            Entrenador e = c.eli(); 
            CCPokemon auxp = new CCPokemon();
            while(!e.getCCPokemon().esVacia()){
                Pokemon p = e.getCCPokemon().eli(); 
                if(p.getTipo().equals(x)){
                    cont++; 
                }
                auxp.adi(p);
            }
            e.getCCPokemon().vaciar(auxp);
            aux.adi(e);
        }
        c.vaciar(aux);
        return cont; 
    }           
    
}
