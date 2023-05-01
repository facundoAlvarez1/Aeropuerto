package Models;

public class Militar extends TipoAviones{
    private String sistemaArma;
    private int cantBalas;

    public Militar() {
    }

    public Militar(String sistemaArma, int cantBalas) {
        this.sistemaArma = sistemaArma;
        this.cantBalas = cantBalas;
    }

    public Militar(String nombreModelo, String marca, int capacidadCombustible, String tipoMotor, int asiento, String sistemaArma, int cantBalas) {
        super(nombreModelo, marca, capacidadCombustible, tipoMotor, asiento);
        this.sistemaArma = sistemaArma;
        this.cantBalas = cantBalas;
    }

    public String getSistemaArma() {
        return sistemaArma;
    }

    public void setSistemaArma(String sistemaArma) {
        this.sistemaArma = sistemaArma;
    }

    public int getCantBalas() {
        return cantBalas;
    }

    public void setCantBalas(int cantBalas) {
        this.cantBalas = cantBalas;
    }

    public void ingresar(){
        System.out.println("Ingresando con exito");
    }


    @Override
    public String toString() {
        return "Militar{" +
                "sistemaArma='" + sistemaArma + '\'' +
                ", cantBalas=" + cantBalas +
                '}'+super.toString();
    }
}
