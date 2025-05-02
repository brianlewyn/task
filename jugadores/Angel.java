public class Angel extends Jugador {
    public Angel(String nombre) {
        super(nombre);
    }

    @Override
    public void usarPoderEspecial() {
        System.out.println(nombre + " usa 'Luz Divina' y se cura completamente.");
        salud = 100;
    }
}
