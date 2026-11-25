public class UnidadSSD extends DispositivoAlmacenamiento {
    private int velocidad;
    public UnidadSSD(int capacidad, int velocidad) { super(capacidad); this.velocidad = velocidad; }
    public void escribirDatos(String datos) {
        if (datos.length() <= capacidadMaxima) { this.datos = datos; System.out.println("SSD: datos guardados."); }
        else System.out.println("SSD: capacidad excedida.");
    }
    public String leerDatos() { return datos; }
}
