
package ejercicio1_multicola;

public class Trabajo {
    private int id_trabajo; 
    private int ru_estudiante; 
    private int nro_paginas; 

    public Trabajo(int id_trabajo, int ru_estudiante, int nro_paginas) {
        this.id_trabajo = id_trabajo;
        this.ru_estudiante = ru_estudiante;
        this.nro_paginas = nro_paginas;
    }

    public int getId_trabajo() {
        return id_trabajo;
    }

    public int getRu_estudiante() {
        return ru_estudiante;
    }

    public int getNro_paginas() {
        return nro_paginas;
    }
    
    public void mostrar() {
        System.out.println("Trabajo{" + "id_trabajo=" + id_trabajo + ", ru_estudiante=" + ru_estudiante + ", nro_paginas=" + nro_paginas + '}');
    }        
}