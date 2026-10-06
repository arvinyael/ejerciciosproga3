package ejercicio1_multipilas;

public class Correo {
    private int id_correo; 
    private String remitente ; 
    private String asunto; 
    private String etiqueta; 

    public Correo(int id_correo, String remitente, String asunto, String etiqueta) {
        this.id_correo = id_correo;
        this.remitente = remitente;
        this.asunto = asunto;
        this.etiqueta = etiqueta;
    }

    public int getId_correo() {
        return id_correo;
    }

    public String getRemitente() {
        return remitente;
    }

    public String getAsunto() {
        return asunto;
    }

    public String getEtiqueta() {
        return etiqueta;
    }
    
    public void mostrar() {
        System.out.println("Correo{" + "id_correo=" + id_correo + ", remitente=" + remitente + ", asunto=" + asunto + ", etiqueta=" + etiqueta + '}');
    }
    
    
}
