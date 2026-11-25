public class MemoriaUSB extends DispositivoAlmacenamiento {
    public MemoriaUSB(int capacidad) { super(capacidad); }
    public void escribirDatos(String datos) {
        if (datos.length() <= capacidadMaxima) { this.datos = datos; System.out.println("USB: datos guardados."); }
        else System.out.println("USB: capacidad excedida.");
    }
    public String leerDatos() { return datos; }
}
