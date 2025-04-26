public class ListaDeReproducion {
    private String nombre;
    private String fecha;

    private Cancion[] listaDeCanciones;
    private int indice;

    // public ListaDeReproducion() {}

    public ListaDeReproducion(String nombre, String fecha) {
        this.nombre = nombre;
        this.fecha = fecha;

        this.listaDeCanciones = new Cancion[10];
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getFecha() {
        return this.fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public void agregarCancion(Cancion cancion) {
        this.listaDeCanciones[indice++] = cancion;
    }

    public String getCancionSeleccionada(int indice) {
        return this.listaDeCanciones[indice].toString();
    }
}
