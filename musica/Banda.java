public class Banda {
    private String nombre;

    private Album[] listaDeAlbums;
    private int indice;

    // public Banda() {}

    public Banda(String nombre) {
        this.nombre = nombre;

        this.listaDeAlbums = new Album[10];
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void agregarAlbum(Album album) {
        this.listaDeAlbums[indice++] = album;
    }
}
