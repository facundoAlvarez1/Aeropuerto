package Models;

public class Privado extends TipoAviones{
    private Boolean jacuzzi;
    private String wifi;

    public Privado() {
    }
    public Privado(Boolean jacuzzi, String wifi) {
        this.jacuzzi = jacuzzi;
        this.wifi = wifi;
    }

    public Privado(String nombreModelo, String marca, int capacidadCombustible, String tipoMotor, int asiento, Boolean jacuzzi, String wifi) {
        super(nombreModelo, marca, capacidadCombustible, tipoMotor, asiento);
        this.jacuzzi = jacuzzi;
        this.wifi = wifi;
    }

    public Boolean getJacuzzi() {
        return jacuzzi;
    }

    public void setJacuzzi(Boolean jacuzzi) {
        this.jacuzzi = jacuzzi;
    }

    public String getWifi() {
        return wifi;
    }

    public void setWifi(String wifi) {
        this.wifi = wifi;
    }

    public void servirComida() {
        System.out.println("Sirviendo comida en el avion");
    }

    public void darMantas(){
        System.out.println("Ofreciendo Mantas en el avion");
    }

    public void verMundial(boolean a){

    }

    @Override
    public String toString() {
        return "Privado{" +
                "jacuzzi=" + jacuzzi +
                ", wifi='" + wifi + '\'' +
                '}'+ super.toString();
    }
}
