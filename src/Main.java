import Models.*;
import java.util.List;
import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
        List<Aeropuerto> aeropuerto = new ArrayList<>();
        List<Hangar> hangar=new ArrayList<>();
        List<TipoAviones> tipo = new ArrayList<>();

        List<String> listaServicio = new ArrayList<>();
        listaServicio.add("Comida");
        listaServicio.add("Cine");
        listaServicio.add("Ropa");

        List<String>listaProducto = new ArrayList<>();
        listaProducto.add("Carne");
        listaProducto.add("verdura");
        listaProducto.add("higiene");

        Aeropuerto a =new Aeropuerto("MDP",122,"LEJOS",50,"Todos",50);


        Hangar comercialHangar= new Hangar(20,"Comercial");
        Hangar privadoHangar= new Hangar(20,"Privado");
        Hangar militarHangar= new Hangar(20,"Militar");
        Hangar cargaHangar= new Hangar(20,"Carga");


        Comercial c = new Comercial("ComercialPro","fx133",2000,"2.0 full",60,5,listaServicio);
        Privado p = new Privado("PrivadoFIU","priva123",1200,"fullPro1.245",30,true,"privado");
        Militar m = new Militar("MilitarPro","militarJ123N",5000,"micxl123",100,"aire-aire",10000);
        Carga car = new Carga("CargaPro","Cargaxx245",1500,"fcg334",200,4000,listaProducto);

        aeropuerto.add(a);
        hangar.add(comercialHangar);
        hangar.add(privadoHangar);
        hangar.add(militarHangar);
        hangar.add(cargaHangar);

        tipo.add(c);
        tipo.add(p);
        tipo.add(m);
        tipo.add(car);

        for (Aeropuerto ae:aeropuerto) {
            System.out.println(ae.toString());
        }
        System.out.println();
        for (Hangar han:hangar) {
            System.out.println(han.toString());
        }
        System.out.println();
        for (TipoAviones ti:tipo) {
            System.out.println(ti.toString());
        }

        System.out.println();
        for (TipoAviones tipoAviones:tipo) {
            switch (tipoAviones.getClass().getSimpleName()){
                case "Comercial":
                    System.out.println(c.toString());
                    System.out.println(comercialHangar.toString());
                    tipoAviones.despegar();
                    c.darMantas();
                    c.servirComida();
                    tipoAviones.volar();
                    tipoAviones.aterrizar();
                    System.out.println();
                    break;
                case "Privado":
                    System.out.println(p.toString());
                    System.out.println(privadoHangar);
                    tipoAviones.despegar();
                    tipoAviones.volar();
                    c.darMantas();
                    c.servirComida();
                    tipoAviones.aterrizar();
                    System.out.println();
                    break;
                case "Militar":
                    System.out.println(m.toString());
                    System.out.println(militarHangar);
                    m.ingresar();
                    tipoAviones.despegar();
                    tipoAviones.volar();
                    tipoAviones.aterrizar();
                    System.out.println();
                    break;
                case "Carga":
                    System.out.println(car.toString());
                    System.out.println(cargaHangar);
                    car.ingresar();
                    tipoAviones.despegar();
                    tipoAviones.volar();
                    tipoAviones.aterrizar();
                    car.descargaContenido();
                    break;
            }
        }

    }

}