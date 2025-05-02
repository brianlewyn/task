public class Main {
    public static void main(String[] args) {
        Avatar[] avatares = new Avatar[] {
            new Angel("Ariel"),
            new Gigante("Goliat"),
            new Elfo("Luthien"),
            new Demonio("Azazel"),
            new Humano("Leónidas"),
        };

        for (Avatar Avatar : avatares) {
            Avatar.usarPoderEspecial();
        }
    }
}
