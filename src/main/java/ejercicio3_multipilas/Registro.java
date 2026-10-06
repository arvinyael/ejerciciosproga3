package ejercicio3_multipilas;

public class Registro {
    private int id_registro; 
    private String ip_origen; 
    private int puerto_destino; 
    private String nivel_riesgo; 

    public Registro(int id_registro, String ip_origen, int puerto_destino, String nivel_riesgo) {
        this.id_registro = id_registro;
        this.ip_origen = ip_origen;
        this.puerto_destino = puerto_destino;
        this.nivel_riesgo = nivel_riesgo;
    }

    public int getId_registro() {
        return id_registro;
    }

    public String getIp_origen() {
        return ip_origen;
    }

    public int getPuerto_destino() {
        return puerto_destino;
    }

    public String getNivel_riesgo() {
        return nivel_riesgo;
    }
    
    public void mostrar() {
        System.out.println("Registro{" + "id_registro=" + id_registro + ", ip_origen=" + ip_origen + ", puerto_destino=" + puerto_destino + ", nivel_riesgo=" + nivel_riesgo + '}');
    }
    
}
