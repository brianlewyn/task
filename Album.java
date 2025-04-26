public class Album extends ListaDeReproducion {
    private Banda tieneUnaBanda;

    // public Album() {}

    public Album(String nombre, String fecha, Banda banda) {
        super(nombre, fecha);
        this.tieneUnaBanda = banda;
    }

    public Banda getBanda() {
        return this.tieneUnaBanda;
    }

    public void setBanda(Banda banda) {
        this.tieneUnaBanda = banda;
    }
}
