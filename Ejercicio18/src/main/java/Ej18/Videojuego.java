package Ej18;

public class Videojuego implements Entregable{
    String titulo;
    double hsEstimadas;
    boolean entregado;
    String genero;
    String compania;

    public Videojuego(){
        titulo = "Mario Bros";
        hsEstimadas = 10;
        entregado = false;
        genero = "Aventura";
        compania = "Nintendo";
    }

    public Videojuego(String titulo, double hsEstimadas) {
        this.titulo = titulo;
        this.hsEstimadas = hsEstimadas;
        entregado = false;
        genero = "Aventura";
        compania = "Nintendo";
    }

    public Videojuego(String titulo, double hsEstimadas, String genero, String compania) {
        this.titulo = titulo;
        this.hsEstimadas = hsEstimadas;
        entregado = false;
        this.genero = genero;
        this.compania = compania;
    }

    public String getTitulo() {
        return titulo;
    }

    public double getHsEstimadas() {
        return hsEstimadas;
    }

    public String getGenero() {
        return genero;
    }

    public String getCompania() {
        return compania;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setHsEstimadas(double hsEstimadas) {
        this.hsEstimadas = hsEstimadas;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public void setCompania(String compania) {
        this.compania = compania;
    }

    @Override
    public String toString(){
        return "Título: "+titulo+", Horas estimadas: "+hsEstimadas+", Genero: "+genero+", Compañia: "+compania;
    }

    @Override
    public boolean entregar() {
        return this.entregado = true;
    }

    @Override
    public boolean devolver() {
        return this.entregado = false;
    }

    @Override
    public boolean isEntregado() {
        return this.entregado;
    }

    @Override
    public void compareTo(Object[] a) {
        Videojuego[] cast = (Videojuego[]) a;
        double mayor = 0;
        Videojuego ganador = null;
        for (int i = 0; i < cast.length; i++) {
            if (cast[i].hsEstimadas>mayor){
                mayor=cast[i].hsEstimadas;
                ganador=cast[i];
            }
        }
        System.out.println("\nVideojuego con más horas estimadas");
        System.out.println(ganador.toString());
    }
}


