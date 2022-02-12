package Ej18;

public class Serie implements Entregable{
    String titulo;
    int nroTemporada;
    boolean entregado;
    String genero;
    String creador;

    public Serie(){
        titulo = "GOT";
        nroTemporada = 3;
        entregado  =false;
        genero = "Fantasia";
        creador = "George R.R";
    }

    public Serie(String titulo, String creador) {
        this.titulo = titulo;
        this.creador = creador;
        titulo = "GOT";
        genero = "Fantasia";
        creador = "George R.R";
    }

    public Serie(String titulo, int nroTemporada, String genero, String creador) {
        this.titulo = titulo;
        this.nroTemporada = nroTemporada;
        this.genero = genero;
        this.creador = creador;
    }

    public String getTitulo() {
        return titulo;
    }

    public int getNroTemporada() {
        return nroTemporada;
    }

    public String getGenero() {
        return genero;
    }

    public String getCreador() {
        return creador;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setNroTemporada(int nroTemporada) {
        this.nroTemporada = nroTemporada;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public void setCreador(String creador) {
        this.creador = creador;
    }

    @Override
    public String toString(){
        return "Título: "+titulo+", Nro de Temporada: "+nroTemporada+", Genero: "+genero+", Creador: "+creador;
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
        Serie[] cast = (Serie[]) a;
        double mayor = 0;
        Serie ganador = null;
        for (int i = 0; i < cast.length; i++) {
            if (cast[i].nroTemporada>mayor){
                mayor=cast[i].nroTemporada;
                ganador=cast[i];
            }
        }
        System.out.println("\nSerie con más temporadas");
        System.out.println(ganador.toString());

    }
}
