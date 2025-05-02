public class Elfo extends Jugador {
    public Elfo(String nombre) {
        super(nombre);
    }

    @Override
    public void usarPoderEspecial() {
        System.out.println(nombre + " usa 'Flecha Mágica' y ataca desde lejos con precisión.");
    }
}
