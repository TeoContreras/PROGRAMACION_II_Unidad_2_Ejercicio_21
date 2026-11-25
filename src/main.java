import java.util.ArrayList;
public class main {
    public static void main(String[] args) {
        ArrayList<DispositivoAlmacenamiento> dispositivos = new ArrayList<DispositivoAlmacenamiento>();
        dispositivos.add(new DiscoDuro(100, 120));
        dispositivos.add(new UnidadSSD(100, 500));
        dispositivos.add(new MemoriaUSB(20));
        for (DispositivoAlmacenamiento d : dispositivos) {
            d.escribirDatos("Archivo de prueba");
            System.out.println("Lectura: " + d.leerDatos());
        }
    }
}
