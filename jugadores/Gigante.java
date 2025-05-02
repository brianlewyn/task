public class Gigante extends Jugador {
    public Gigante(String nombre) {
        super(nombre);
    }

    @Override
    public void usarPoderEspecial() {
        System.out.println(nombre + " usa 'Pisotón Gigante' y causa gran daño al enemigo.");
    }
}
