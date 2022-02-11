package Ej17;

public class Lavadora extends Electrodomestico{
    double carga;


    public Lavadora() {
        super.precioBase = getPrecioBase();
        super.peso = getPeso();
        super.color = getColor();
        super.consEnergetico = getConsEnergetico();
        this.carga = 5;
    }

    public Lavadora(double precioBase, double peso) {
        super.precioBase = precioBase;
        super.peso = peso;
        super.color = getColor();
        super.consEnergetico = getConsEnergetico();
        this.carga = 5;
    }

    public Lavadora(double precioBase, String color, char consEnergetico, double peso, double carga) {
        super.precioBase = precioBase;
        super.color = color;
        super.consEnergetico = consEnergetico;
        super.peso = peso;
        this.carga = carga;
    }

    public double getCarga() {
        return carga;
    }

    @Override
    public double precioFinal(char cEnergetico, double tamanio) {
        precioBase = super.precioFinal(cEnergetico, tamanio);
        if (this.carga>30){
            precioBase += 50;
        }
        return precioBase;
}
}
