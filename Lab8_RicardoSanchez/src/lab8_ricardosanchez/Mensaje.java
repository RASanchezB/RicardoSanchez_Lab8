package lab8_ricardosanchez;

import java.util.Date;

public class Mensaje {
   private String Emisor;
   private String receptor;
   private Date fecha;
   private String mensaje;

    public Mensaje(String Emisor, String receptor,String mensaje, Date fecha) {
        this.Emisor = Emisor;
        this.receptor = receptor;
        this.fecha = fecha;
        this.mensaje = mensaje;
    }

    public String getEmisor() {
        return Emisor;
    }

    public void setEmisor(String Emisor) {
        this.Emisor = Emisor;
    }

    public String getReceptor() {
        return receptor;
    }

    public void setReceptor(String receptor) {
        this.receptor = receptor;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }
    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }
    @Override
    public String toString() {
        return Emisor + ", " + receptor + ", " + mensaje + ", " + fecha;
    }

    
   
}
