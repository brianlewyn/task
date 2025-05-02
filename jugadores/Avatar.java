public abstract class Avatar {
    protected String nombre;
    protected int salud;
    protected int experiencia;
    protected int nivel;

    public Avatar(String nombre) {
        this.nombre = nombre;
        this.salud = 100;
        this.experiencia = 0;
        this.nivel = 1;
    }

    public void dañar(int cantidad) {
        salud -= cantidad;
        if (salud < 0) salud = 0;
        System.out.println(nombre + " recibió " + cantidad + " de daño. Salud actual: " + salud);
    }

    public void curar(int cantidad) {
        salud += cantidad;
        if (salud > 100) salud = 100;
        System.out.println(nombre + " se curó " + cantidad + ". Salud actual: " + salud);
    }

    public void ganarExperiencia(int cantidad) {
        experiencia += cantidad;
        System.out.println(nombre + " ganó " + cantidad + " de experiencia.");
        if (experiencia >= 100) {
            subirNivel();
            experiencia -= 100;
        }
    }

    private void subirNivel() {
        nivel++;
        System.out.println("¡" + nombre + " ha subido al nivel " + nivel + "!");
    }

    public void mostrarEstado() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Salud: " + salud);
        System.out.println("Experiencia: " + experiencia);
        System.out.println("Nivel: " + nivel);
    }

    // Método abstracto que cada subclase debe implementar
    public abstract void usarPoderEspecial();
}
