package Models;

import java.util.List;

public class Hangar {
    private int capacidad;
    private String aviones;

    public Hangar(int capacidad, String aviones) {
        this.capacidad = capacidad;
        this.aviones = aviones;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public String getAviones() {
        return aviones;
    }

    public void setAviones(String aviones) {
        this.aviones = aviones;
    }

    @Override
    public String toString() {
        return "Hangar{" +
                "capacidad=" + capacidad +
                ", aviones=" + aviones +
                '}';
    }


}
