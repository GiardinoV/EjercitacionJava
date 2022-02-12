package Ej18;

public class Main {
    public static void main(String[] args) {
        Serie serie[] = new Serie[5];
        Videojuego videojuego[] = new Videojuego[5];

        serie[0] = new Serie();
        serie[1] = new Serie("Breaking Bad", "Gilligan");
        serie[2] = new Serie("Ozark",4,"Supenso","John");
        serie[3] = new Serie("La casa de papel", "Pina");
        serie[4] = new Serie();

        videojuego[0] = new Videojuego();
        videojuego[1] = new Videojuego("Sims", 20);
        videojuego[2] = new Videojuego("GTA", 40);
        videojuego[3] = new Videojuego("LOL", 25, "Acción", "Riot");
        videojuego[4] = new Videojuego();

        serie[1].entregar();
        serie[3].entregar();
        videojuego[1].entregar();
        videojuego[4].entregar();

        int cantEntregados = 0;
        for (int i = 0; i < serie.length; i++) {
                if (serie[i].isEntregado()) {
                    cantEntregados++;
                    serie[i].devolver();
                }
                if (videojuego[i].isEntregado()) {
                    cantEntregados++;
                    videojuego[i].devolver();
                }
        }System.out.println("Cantidad de series y videojuegos entregados: "+cantEntregados);


        videojuego[0].compareTo(videojuego);
        serie[0].compareTo(serie);
    }
}
