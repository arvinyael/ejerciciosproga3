package ejercicio3_multipilas;

public class Main {
    public static void main(String[] args) {
        Mp_servidores mp = new Mp_servidores(3);
        
        mp.adi(0, new Registro(1, "192.168.0.1", 80, "Bajo"));
        mp.adi(0, new Registro(2, "10.0.0.5", 22, "Critico"));
        mp.adi(0, new Registro(3, "192.168.1.15", 443, "Medio"));

        mp.adi(1, new Registro(4, "192.168.0.1", 22, "Critico"));
        mp.adi(1, new Registro(5, "172.16.0.2", 8080, "Bajo"));

        mp.adi(2, new Registro(6, "10.0.0.20", 22, "Critico"));
        mp.adi(2, new Registro(7, "192.168.0.100", 80, "Medio"));

        mp.mostrar();
        System.out.println("inciso b");
        eliminarIpOrigen(mp, "192.168.0.1");
        
        System.out.println("inciso c");
        mostrarCriticoPuerto22(mp);
        
        System.out.println("inciso d");
        PilaR pilaCriticos = obtenerPilaCriticos(mp);
        System.out.println("Pila de Registros Criticos");
        pilaCriticos.mostar();
        System.out.println("pila original");
        mp.mostrar();
        
        System.out.println("inciso e");
        eliminarRiesgoBajo(mp);
        mp.mostrar();
    }

    private static void eliminarIpOrigen(Mp_servidores mp, String x) {
        PilaR aux = new PilaR(); 
        for (int i=0; i<mp.getN(); i++){
            while(!mp.esVacia(i)){
                Registro r = mp.eli(i);
                if(!r.getIp_origen().equals(x)){
                    aux.adi(r);
                }
            }
            mp.vaciar(i, aux);
        }
    }

    private static void mostrarCriticoPuerto22(Mp_servidores mp) {
        PilaR aux = new PilaR(); 
        for (int i=0; i<mp.getN(); i++){
            while(!mp.esVacia(i)){
                Registro r = mp.eli(i);
                if (r.getNivel_riesgo().equals("Critico") && r.getPuerto_destino() == 22){
                    r.mostrar();
                }
                aux.adi(r);
            }
            mp.vaciar(i, aux);
        }
    }

    private static PilaR obtenerPilaCriticos(Mp_servidores mp) {
        PilaR aux = new PilaR();
        PilaR aux2 = new PilaR();
        for (int i = 0; i<mp.getN(); i++){
            while(!mp.esVacia(i)){
                Registro r = mp.eli(i); 
                if(r.getNivel_riesgo().equals("Critico")){
                    aux2.adi(r);
                }
                aux.adi(r);
            }
            mp.vaciar(i, aux);
        }
        return aux2;         
    }

    private static void eliminarRiesgoBajo(Mp_servidores mp) {
        PilaR aux = new PilaR(); 
        for (int i=0; i<mp.getN(); i++){
            while(!mp.esVacia(i)){
                Registro r = mp.eli(i);
                if(!r.getNivel_riesgo().equals("Bajo")){
                    aux.adi(r);
                }
            }
            mp.vaciar(i, aux);
        }
    }
    
    
    
    
    
    
    
    
}
