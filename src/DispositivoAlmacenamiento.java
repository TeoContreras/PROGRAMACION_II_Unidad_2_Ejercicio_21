public abstract class DispositivoAlmacenamiento {
    protected String datos = "";
    protected int capacidadMaxima;
    public DispositivoAlmacenamiento(int capacidadMaxima) { this.capacidadMaxima = capacidadMaxima; }
    public abstract void escribirDatos(String datos);
    public abstract String leerDatos();
}
