public class Demonio extends Avatar {
    public Demonio(String nombre) {
        super(nombre);
    }

    @Override
    public void usarPoderEspecial() {
        System.out.println(nombre + " usa 'Llama Infernal' y quema a todos los enemigos cercanos.");
    }
}
