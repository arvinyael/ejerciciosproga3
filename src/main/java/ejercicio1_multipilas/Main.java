package ejercicio1_multipilas;
public class Main {
    public static void main(String[] args) {
        Mp_correos mp = new Mp_correos(3);        
                        
        mp.adi(1, new Correo(101, "juan@gmail.com", "Reunion de trabajo", "Normal"));
        mp.adi(1, new Correo(102, "Desconocido", "Gana dinero facil", "Spam"));
        mp.adi(1, new Correo(103, "soporte@banco.com", "Actualiza tus datos", "Phishing"));
        
        mp.adi(2, new Correo(201, "Desconocido", "Alerta de seguridad", "Phishing"));
        mp.adi(2, new Correo(202, "maria@hotmail.com", "Fotos del viaje", "Normal"));
        mp.adi(2, new Correo(203, "robert@hotmail.com", "seguridad", "Spam"));

        mp.mostrar();
        
        System.out.println("inciso b");
        eliDesc(mp);
        mp.mostrar();
      
        //inciso c 
        mostrarBandejasVacias(mp);
        //inciso d                
        mostrarPhishing(mp);
        //eliminarSpam
        eliminarSpam(mp);
        
    }
//inciso b
    private static void eliDesc(Mp_correos mp) {
        PilaCorreo aux = new PilaCorreo(); 
        for(int i=0; i<mp.getN(); i++){
            while(!mp.esVacia(i)){
                Correo c = mp.eli(i); 
                if(!c.getRemitente().equals("Desconocido")){
                    aux.adi(c);
                }                
            }
            mp.vaciar(i, aux);
        }
    }
    
//inciso c
    public static void mostrarBandejasVacias(Mp_correos mp) {
        System.out.println("Bandejas vacias:");
        boolean sw = false;
        for (int i = 0; i < mp.getN(); i++) {
            if (mp.esVacia(i)) {
                System.out.println("Bandeja Numero: " + i);
                sw = true; 
            }
        }
        if(!sw){
            System.out.println("NO HAY BANDEJAS VACIAS");
        }
    }

    private static void mostrarPhishing(Mp_correos mp) {
        System.out.println("etiquetas Phishing");
        
        PilaCorreo aux = new PilaCorreo(); 
        for (int i=0; i<mp.getN(); i++){
            while(!mp.esVacia(i)){
                Correo c = mp.eli(i); 
                if(!c.getEtiqueta().equals("Phishing")){
                    c.mostrar();
                }
                aux.adi(c);
            }
            mp.vaciar(i, aux);
        }
    }

    private static void eliminarSpam(Mp_correos mp) {
        System.out.println("eliminando Spam");        
        PilaCorreo aux = new PilaCorreo(); 
        for (int i=0; i<mp.getN(); i++){
            while(!mp.esVacia(i)){
                Correo c = mp.eli(i); 
                if(!c.getEtiqueta().equals("Spam")){
                    c.mostrar();
                }
                aux.adi(c);
            }
            mp.vaciar(i, aux);
        }
    }
}
