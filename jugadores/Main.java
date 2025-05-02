public class Main {
    public static void main(String[] args) {
        Jugador[] avatares = new Jugador[] {
            new Angel("Ariel"),
            new Gigante("Goliat"),
            new Elfo("Luthien"),
            new Demonio("Azazel"),
            new Humano("Leónidas"),
        };

        for (Jugador jugador : avatares) {
            jugador.usarPoderEspecial();
        }
    }
}
