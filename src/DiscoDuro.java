public class DiscoDuro extends DispositivoAlmacenamiento {
    private int velocidad;
    public DiscoDuro(int capacidad, int velocidad) { super(capacidad); this.velocidad = velocidad; }
    public void escribirDatos(String datos) {
        if (datos.length() <= capacidadMaxima) { this.datos = datos; System.out.println("Disco duro: datos guardados."); }
        else System.out.println("Disco duro: capacidad excedida.");
    }
    public String leerDatos() { return datos; }
}
