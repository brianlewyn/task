public class Cancion {
    private String titulo;
    private String duracion;
    private Album tieneUnAlbum;

    // public Cancion() {}

    public Cancion(String titulo, String duracion, Album album) {
        this.titulo = titulo;
        this.duracion = duracion;
        this.tieneUnAlbum = album;
    }

    public String getTitulo() {
        return this.titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDuracion() {
        return this.duracion;
    }

    public void setDuracion(String duracion) {
        this.duracion = duracion;
    }

    public Album getAlbum() {
        return this.tieneUnAlbum;
    }

    public void setAlbum(Album album) {
        this.tieneUnAlbum = album;
    }

    public String toString() {
        return String.format("[TITULO: %s] [BANDA: %s] [ALBUM: %s] [DURACION: %s]", 
        titulo, tieneUnAlbum.getBanda().getNombre(), tieneUnAlbum.getNombre(), duracion);
    }
}
