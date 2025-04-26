public class Main {
    public static void main(String[] args) {
        Banda threeDaysGrace = new Banda("Three Days Grace");

        // Album: One-X

        Album oneX = new Album("One-X", "2015", threeDaysGrace);
        threeDaysGrace.agregarAlbum(oneX);

        Cancion pain = new Cancion("Pain", "3:22", oneX);
        oneX.agregarCancion(pain);

        Cancion animalIHaveBecome = new Cancion("Animal I Have Become", "3:51", oneX);
        oneX.agregarCancion(animalIHaveBecome);

        Cancion neverTooLate = new Cancion("Never Too Late", "3:29", oneX);
        oneX.agregarCancion(neverTooLate);

        // Album: Human

        Album human = new Album("Human", "2015", threeDaysGrace);
        threeDaysGrace.agregarAlbum(human);

        Cancion humanRace = new Cancion("Human Race", "4:09", human);
        human.agregarCancion(humanRace);

        Cancion tellMeWhy = new Cancion("Tell Me Why", "3:30", human);
        human.agregarCancion(tellMeWhy);

        Cancion soWhat = new Cancion("So What", "2:57", human);
        human.agregarCancion(soWhat);

        // ListaDeReproducion: canciones que me gustan

        ListaDeReproducion cancionesQueMeGustan = new ListaDeReproducion("Canciones que me gustan", "2020");

        cancionesQueMeGustan.agregarCancion(pain);
        cancionesQueMeGustan.agregarCancion(animalIHaveBecome);
        cancionesQueMeGustan.agregarCancion(neverTooLate);

        cancionesQueMeGustan.agregarCancion(humanRace);
        cancionesQueMeGustan.agregarCancion(tellMeWhy);
        cancionesQueMeGustan.agregarCancion(soWhat);

        // ReproductorDeMusica...

        ReproductorDeMusica reproductorDeMusica = new ReproductorDeMusica(cancionesQueMeGustan, 0);

        reproductorDeMusica.repetirCancion(); // cancion: pain
        
        reproductorDeMusica.siguienteCancion(); // cancion: animalIHaveBecome
        
        reproductorDeMusica.cancionAleatoria(3); // cancion: humanRace

        reproductorDeMusica.anteriorCancion(); // cancion: neverTooLate
    }
}
