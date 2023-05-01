package Models;

public class TipoAviones {
    private String nombreModelo;
    private String marca;
    private int capacidadCombustible;
    private String tipoMotor;
    private int asiento=0;

    public TipoAviones() {
    }

    public TipoAviones(String nombreModelo, String marca, int capacidadCombustible, String tipoMotor, int asiento) {
        this.nombreModelo = nombreModelo;
        this.marca = marca;
        this.capacidadCombustible = capacidadCombustible;
        this.tipoMotor = tipoMotor;
        this.asiento = asiento;
    }

    public String getNombreModelo() {
        return nombreModelo;
    }

    public void setNombreModelo(String nombreModelo) {
        this.nombreModelo = nombreModelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getCapacidadCombustible() {
        return capacidadCombustible;
    }

    public void setCapacidadCombustible(int capacidadCombustible) {
        this.capacidadCombustible = capacidadCombustible;
    }

    public String getTipoMotor() {
        return tipoMotor;
    }

    public void setTipoMotor(String tipoMotor) {
        this.tipoMotor = tipoMotor;
    }

    public int getAsiento() {
        return asiento;
    }

    public void setAsiento(int asiento) {
        this.asiento = asiento;
    }

    public void despegar(){
        System.out.println("Avion Despegando con exitooooos");
    }
    public void aterrizar(){
        System.out.println("Avion aterrizando");
    }
    public void volar(){
        System.out.println("Avion volando");
    }

    @Override
    public String toString() {
        return "TipoAviones{" +
                "nombreModelo='" + nombreModelo + '\'' +
                ", marca='" + marca + '\'' +
                ", capacidadCombustible=" + capacidadCombustible +
                ", tipoMotor='" + tipoMotor + '\'' +
                ", asiento=" + asiento +
                '}';
    }
}
