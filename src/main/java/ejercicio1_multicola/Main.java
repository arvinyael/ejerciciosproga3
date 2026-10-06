package ejercicio1_multicola;

public class Main {

    public static void main(String[] args) {        
        Mc_trabajos mc = new Mc_trabajos(3);
        
        mc.adi(1, new Trabajo(102, 2222, 60)); 
        mc.adi(1, new Trabajo(103, 3333, 0));  
        mc.adi(0, new Trabajo(101, 1111, 20)); 
        mc.adi(2, new Trabajo(104, 4444, 15)); 
        
        CSTrabajo colaEntrante = new CSTrabajo();
        colaEntrante.adi(new Trabajo(201, 5555, 30));
        colaEntrante.adi(new Trabajo(202, 6666, 75)); 
        colaEntrante.adi(new Trabajo(203, 7777, 0));  
        
        mc.mostrar();

        //inciso b
        System.out.println("incsiso b) ");
        asignarTrabajos(colaEntrante, mc);
        mc.mostrar();

        //inciso c
        System.out.println("inciso c)");
        mostrarTrabajosMayores50(mc);

        //inciso d
        System.out.println("inciso d)");
        mostrarEstudianteTrabajoMasPesado(mc);

        //inciso e
        System.out.println("inciso e)");
        eliminarTrabajosCancelados(mc);
        
        mc.mostrar();
    }

    
    public static void asignarTrabajos(CSTrabajo colaEntrante, Mc_trabajos mc) {
        while (!colaEntrante.esVacia()) {
            Trabajo t = colaEntrante.eli();            
            int iMenor = 0;
            int minSumPaginas = obtenerSumaPaginas(mc, 0);           
            for (int i = 1; i < mc.getN(); i++) {
                int sumaActual = obtenerSumaPaginas(mc, i);
                if (sumaActual < minSumPaginas) {
                    minSumPaginas = sumaActual;
                    iMenor = i;
                }
            }           
            mc.adi(iMenor, t);
        }
    }
    
    private static int obtenerSumaPaginas(Mc_trabajos mc, int i) {
        CSTrabajo aux = new CSTrabajo();
        int suma = 0;
        
        while (!mc.esVacia(i)) {
            Trabajo t = mc.eli(i);
            suma += t.getNro_paginas();
            aux.adi(t);
        }
        mc.vaciar(i, aux);
        return suma;
    }

    public static void mostrarTrabajosMayores50(Mc_trabajos mc) {
        CSTrabajo aux = new CSTrabajo();
        
        for (int i = 0; i < mc.getN(); i++) {
            while (!mc.esVacia(i)) {
                Trabajo t = mc.eli(i);
                if (t.getNro_paginas() > 50) {
                    t.mostrar();
                }
                aux.adi(t);
            }
            mc.vaciar(i, aux);
        }
    }
    
    public static void mostrarEstudianteTrabajoMasPesado(Mc_trabajos mc) {
        CSTrabajo aux = new CSTrabajo();
        int maxPaginas = -1;
        int ruMasPesado = -1;

        for (int i = 0; i < mc.getN(); i++) {
            while (!mc.esVacia(i)) {
                Trabajo t = mc.eli(i);
                if (t.getNro_paginas() > maxPaginas) {
                    maxPaginas = t.getNro_paginas();
                    ruMasPesado = t.getRu_estudiante();
                }
                aux.adi(t);
            }
            mc.vaciar(i, aux);
        }

        if (ruMasPesado != -1) {
            System.out.println("El estudiante con el trabajo mas pesado es RU: " + ruMasPesado + " (" + maxPaginas + " paginas)");
        } else {
            System.out.println("No hay trabajos registrados.");
        }
    }
    
    public static void eliminarTrabajosCancelados(Mc_trabajos mc) {
        CSTrabajo aux = new CSTrabajo();
        
        for (int i = 0; i < mc.getN(); i++) {
            while (!mc.esVacia(i)) {
                Trabajo t = mc.eli(i);            
                if (t.getNro_paginas() != 0) {
                    aux.adi(t);
                }
            }
            mc.vaciar(i, aux);
        }
    }
}