package Ej17;

public class Television extends Electrodomestico{
    double resolucion;
    boolean sintonizador;


    public Television() {
        super.precioBase = getPrecioBase();
        super.peso = getPeso();
        super.color = getColor();
        super.consEnergetico = getConsEnergetico();
        resolucion = 20;
        sintonizador = false;
    }

    public Television(double precioBase, double peso) {
        super.precioBase = precioBase;
        super.peso = peso;
        super.color = getColor();
        super.consEnergetico = getConsEnergetico();
        resolucion = 20;
        sintonizador = false;
    }

    public Television(double precioBase, String color, char consEnergetico, double peso, double resolucion, boolean sintonizador) {
        super.precioBase = precioBase;
        super.color = color;
        super.consEnergetico = consEnergetico;
        super.peso = peso;
        this.resolucion = resolucion;
        this.sintonizador = sintonizador;
    }

    public double getResolucion() {
        return resolucion;
    }

    public boolean isSintonizador() {
        return sintonizador;
    }

    @Override
    public double precioFinal(char cEnergetico, double tamanio) {
        precioBase = super.precioFinal(cEnergetico, tamanio);
        if (resolucion>40){
            precioBase += precioBase*0.3;
        }else if(sintonizador)
            precioBase+=50;
        return precioBase;
    }
}
