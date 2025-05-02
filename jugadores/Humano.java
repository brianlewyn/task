public class Humano extends Jugador {
    public Humano(String nombre) {
        super(nombre);
    }

    @Override
    public void usarPoderEspecial() {
        System.out.println(nombre + " usa 'Coraje' y gana experiencia extra.");
        ganarExperiencia(50);
    }
}
