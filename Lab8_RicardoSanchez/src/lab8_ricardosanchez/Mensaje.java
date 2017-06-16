package lab8_ricardosanchez;

import java.util.Date;

public class Mensaje {
   private String Emisor;
   private String receptor;
   private Date fecha;

    public Mensaje(String Emisor, String receptor, Date fecha) {
        this.Emisor = Emisor;
        this.receptor = receptor;
        this.fecha = fecha;
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

    @Override
    public String toString() {
        return Emisor + ", " + receptor + ", " + fecha;
    }
   
}
