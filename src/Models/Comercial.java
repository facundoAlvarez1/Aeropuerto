package Models;

import java.util.ArrayList;
import java.util.List;

public class Comercial extends TipoAviones{
    private int cantAzafatas;
    private List<String> servicio;

    public Comercial() {
    }

    public Comercial(int cantAzafatas, List<String> servicio) {
        this.cantAzafatas = cantAzafatas;
        this.servicio = servicio;
    }

    public Comercial(String nombreModelo, String marca, int capacidadCombustible, String tipoMotor, int asiento, int cantAzafatas, List<String> servicio) {
        super(nombreModelo, marca, capacidadCombustible, tipoMotor, asiento);
        this.cantAzafatas = cantAzafatas;
        this.servicio = servicio;
    }

    public int getCantAzafatas() {
        return cantAzafatas;
    }

    public void setCantAzafatas(int cantAzafatas) {
        this.cantAzafatas = cantAzafatas;
    }

    public List<String> getServicio() {
        return servicio;
    }

    public void setServicio(List<String> servicio) {
        this.servicio = servicio;
    }

    public void servirComida() {
        System.out.println("Sirviendo comida en el avion");
    }

    public void darMantas(){
        System.out.println("Ofreciendo Mantas en el avion");
    }
      @Override
    public String toString() {
        return "Comercial{" +
                "cantAzafatas=" + cantAzafatas +
                ", servicio=" + servicio +
                '}' +  super.toString();
    }
}
