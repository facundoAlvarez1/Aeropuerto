package Models;

import java.util.List;
public class Aeropuerto {
    private String nombre;
    private int codigoInternacional;
    private String direccion;
    private int capacidadAviones;
     private String hangares;
     private int capacidadMaxima;
     private int cantidadActual;


    public Aeropuerto() {
    }

    public Aeropuerto(String nombre, int codigoInternacional, String direccion, int capacidadAviones, String hangares, int capacidadMaxima) {
        this.nombre = nombre;
        this.codigoInternacional = codigoInternacional;
        this.direccion = direccion;
        this.capacidadAviones = capacidadAviones;
        this.hangares = hangares;
        this.capacidadMaxima = capacidadMaxima;
        this.cantidadActual =0;
    }

     public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCodigoInternacional() {
        return codigoInternacional;
    }

    public void setCodigoInternacional(int codigoInternacional) {
        this.codigoInternacional = codigoInternacional;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getCapacidadAviones() {
        return capacidadAviones;
    }

    public void setCapacidadAviones(int capacidadAviones) {
        this.capacidadAviones = capacidadAviones;
    }

    public String getHangares() {
        return hangares;
    }

    public void setHangares(String hangares) {
        this.hangares = hangares;
    }

    public boolean agregarAvion(TipoAviones avion){
        if (cantidadActual < capacidadMaxima){
            cantidadActual++;
            System.out.println("Agregado correctamente");
            return true;
        }else{
            System.out.println("No es posible, limite maximo");
            return false;
        }
    }

    @Override
    public String toString() {
        return "Aeropuerto{" +
                "nombre='" + nombre + '\'' +
                ", codigoInternacional=" + codigoInternacional +
                ", direccion='" + direccion + '\'' +
                ", capacidadAviones=" + capacidadAviones +
                ", hangares=" + hangares +
                '}';
    }
}
