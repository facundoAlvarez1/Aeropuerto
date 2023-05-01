package Models;

import java.util.List;

public class Carga extends TipoAviones{
    private int capacidadKilo;
    private List<String>productos;

    public Carga() {
    }

    public Carga(int capacidadKilo, List<String> productos) {
        this.capacidadKilo = capacidadKilo;
        this.productos = productos;
    }

    public Carga(String nombreModelo, String marca, int capacidadCombustible, String tipoMotor, int asiento, int capacidadKilo, List<String> productos) {
        super(nombreModelo, marca, capacidadCombustible, tipoMotor, asiento);
        this.capacidadKilo = capacidadKilo;
        this.productos = productos;
    }

    public int getCapacidadKilo() {
        return capacidadKilo;
    }

    public void setCapacidadKilo(int capacidadKilo) {
        this.capacidadKilo = capacidadKilo;
    }

    public List<String> getProductos() {
        return productos;
    }

    public void setProductos(List<String> productos) {
        this.productos = productos;
    }

    public void ingresar(){
        System.out.println("Ingresando con exito");
    }
    public void descargaContenido(){
        System.out.println("Descargando todos los productos");
    }

    @Override
    public String toString() {
        return "Carga{" +
                "capacidadKilo=" + capacidadKilo +
                ", productos=" + productos +
                '}'+super.toString();
    }


}
