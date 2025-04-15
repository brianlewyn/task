public class ReproductorDeMusica {
    private String[] listaDeMusica = new String[] {
        "I Hate Everything About You",
        "Just Like You",
        "Home",
        "Wake Up",
        "Animal I Have Become",
        "Pain",
        "Never Too Late",
        "Riot",
        "Break",
        "The Good Life",
    };
    private int indice = 1;
    
    public void siguienteCancion() {
        System.out.println("Siguiente canción: " + listaDeMusica[++indice]);
    }

    public void anteriorCancion() {
        System.out.println("Anterior canción: " + listaDeMusica[--indice]);
    }

    public void cancionAleatoria(int indiceRandom) {
        System.out.println("Canción aleatoria: " + listaDeMusica[indiceRandom]);
        indice = indiceRandom;
    }

    public void repetirCancion() {
        System.out.println("Repetir canción: " + listaDeMusica[indice]);
    }
}