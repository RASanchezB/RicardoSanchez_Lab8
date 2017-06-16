package lab8_ricardosanchez;

import java.util.ArrayList;

public class Contactos {
   private String Nombre;  
   private int Edad;
   private String Numero;
   private String Correo;
   private String Direccion;
   private String Genero;
   private ArrayList<Mensaje> mensaje = new ArrayList();
    public Contactos() {
    }

    public Contactos(String Nombre, int Edad, String Numero, String Correo, String Direccion, String Genero) {
        this.Nombre = Nombre;
        this.Edad = Edad;
        this.Numero = Numero;
        this.Correo = Correo;
        this.Direccion = Direccion;
        this.Genero = Genero;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public int getEdad() {
        return Edad;
    }

    public void setEdad(int Edad) {
        this.Edad = Edad;
    }

    public String getNumero() {
        return Numero;
    }

    public void setNumero(String Numero) {
        this.Numero = Numero;
    }

    public String getCorreo() {
        return Correo;
    }

    public void setCorreo(String Correo) {
        this.Correo = Correo;
    }

    public String getDireccion() {
        return Direccion;
    }

    public void setDireccion(String Direccion) {
        this.Direccion = Direccion;
    }

    public String getGenero() {
        return Genero;
    }

    public void setGenero(String Genero) {
        this.Genero = Genero;
    }

    @Override
    public String toString() {
        return Nombre + ", " + Edad + ", " + Numero;
    }
   
    
}
