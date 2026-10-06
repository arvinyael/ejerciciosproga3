package ejercicio5_pilas;

public class Main {
    public static void main(String[] args) {
        Cliente c1 = new Cliente(1, "harry", "Gryffindor"); 
        Cliente c2 = new Cliente(2, "Draco", "Ravenclaw"); 
        Cliente c3 = new Cliente(3, "Luna", "Ravenclaw"); 
        Compra co1 = new Compra (1, 450, "Acebo y pluma de fénix"); 
        Compra co2 = new Compra (1, 520, "Espino y fibra de corazón de dragón"); 
        Compra co3 = new Compra (2, 380, "Sauce y pelo de unicornio"); 
        
       PilaClientes pc = new PilaClientes(); 
       PilaCompras pco = new PilaCompras(); 
       pc.adi(c1);
       pc.adi(c2);
       pc.adi(c3);
       pco.adi(co1);
       pco.adi(co2);
       pco.adi(co3);
       
       //B)
       EstMost(pc, "Gryffindor");        
       //C) 
       estMen(pc, pco); 
       //D) 
       EstnoCompra(pc, pco); 
       pc.mostar();
       //e)
        System.out.println("total de RavenCLaw" + acumular(pc, pco)); 
       
       
    }

    private static void EstMost(PilaClientes pc, String gryffindor) {
        PilaClientes aux = new PilaClientes(); 
        while(!pc.esVacia()){
            Cliente x = pc.eli(); 
            if(x.getCasa().equalsIgnoreCase(gryffindor)){
                x.mostrar();
            }
            aux.adi(x);
        }
        pc.vaciar(aux);
    }

    private static void estMen(PilaClientes pc, PilaCompras pco) {
        System.out.println("inciso c");
        PilaClientes aux = new PilaClientes(); 
        PilaCompras auxco = new PilaCompras(); 
        while(!pc.esVacia()){
            Cliente x = pc.eli();
            while(!pco.esVacia()){
                Compra z = pco.eli();
                if(x.getId_cliente() == z.getId_cliente() && z.getMonto() < 500){
                    x.mostrar();
                }
                auxco.adi(z);
            }
            pco.vaciar(auxco);
            aux.adi(x);
        }
        pc.vaciar(aux);
    }

   private static void EstnoCompra(PilaClientes pc, PilaCompras pco) {
    System.out.println("inciso D");
    PilaClientes auxpc = new PilaClientes();
    PilaCompras auxco = new PilaCompras();    
    while(!pc.esVacia()){
        Cliente x = pc.eli();
        boolean tieneCompra = false;                
        while(!pco.esVacia()){
            Compra z = pco.eli();
            if(x.getId_cliente() == z.getId_cliente()){
                tieneCompra = true;
            }            
            auxco.adi(z); 
        }
        pco.vaciar(auxco);        
        if(tieneCompra){
            auxpc.adi(x);
        }
    }    
    PilaClientes auxInvertir = new PilaClientes();
    auxInvertir.vaciar(auxpc);
    pc.vaciar(auxInvertir);
}

    private static double acumular(PilaClientes pc, PilaCompras pco) {
        System.out.println("inciso E");
        PilaClientes aux = new PilaClientes(); 
        PilaCompras auxco = new PilaCompras(); 
        double total = 0; 
        while(!pco.esVacia()){
            Compra x = pco.eli(); 
            while(!pc.esVacia()){
                Cliente z = pc.eli(); 
                if(z.getCasa().equals("Ravenclaw") && z.getId_cliente() == x.getId_cliente()){
                    total = total + x.getMonto(); 
                }
                aux.adi(z);
            }
            pc.vaciar(aux);
            auxco.adi(x);
        }
        pco.vaciar(auxco);
        return total; 
        
    }
    
}
