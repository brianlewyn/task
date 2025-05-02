public class ReproductorDeMusica {
    private ListaDeReproducion listaDeMusica;
    private int indice = 0;

    // public ReproductorDeMusica() {}

    public ReproductorDeMusica(ListaDeReproducion listaDeMusica, int indice) {
        this.listaDeMusica = listaDeMusica;
        this.indice = indice;
    }

    public ListaDeReproducion getListaDeMusica() {
        return this.listaDeMusica;
    }

    public void setListDeMusica(ListaDeReproducion listaDeMusica) {
        this.listaDeMusica = listaDeMusica;
    }
    
    public void siguienteCancion() {
        System.out.printf("Siguiente canción: \n\t%s\n\n", listaDeMusica.getCancionSeleccionada(++indice));
    }

    public void anteriorCancion() {
        System.out.printf("Anterior canción: \n\t%s\n\n", listaDeMusica.getCancionSeleccionada(--indice));
    }

    public void cancionAleatoria(int indiceRandom) {
        System.out.printf("Canción aleatoria: \n\t%s\n\n", listaDeMusica.getCancionSeleccionada(indiceRandom));
        indice = indiceRandom;
    }

    public void repetirCancion() {
        System.out.printf("Repetir canción: \n\t%s\n\n", listaDeMusica.getCancionSeleccionada(indice));
    }
}