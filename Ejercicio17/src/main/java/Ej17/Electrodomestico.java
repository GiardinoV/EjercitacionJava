package Ej17;

import java.util.Locale;

public class Electrodomestico {
    double precioBase;
    String color;
    char consEnergetico;
    double peso;


    public Electrodomestico() {
        this.precioBase = 100.0;
        this.peso = 5;
        this.color = "Blanco";
        this.consEnergetico = 'F';
    }

    public Electrodomestico(double precioBase, double peso) {
        this.precioBase = precioBase;
        this.peso = peso;
        this.color = "Blanco";
        this.consEnergetico = 'F';
    }

    public Electrodomestico(double precioBase, String color, char consEnergetico, double peso) {
        this.precioBase = precioBase;
        this.color = comprobarColor(color);
        this.consEnergetico = comprobarConsumoEnergetico(consEnergetico);
        this.peso = peso;
    }

    public double getPrecioBase() {
        return precioBase;
    }

    public String getColor() {
        return color;
    }

    public char getConsEnergetico() {
        return consEnergetico;
    }

    public double getPeso() {
        return peso;
    }

    public char comprobarConsumoEnergetico(char letra) {
        if (letra == 'A' || letra == 'B' || letra == 'C' || letra=='D' || letra == 'E' || letra == 'F')return letra;
        else return this.consEnergetico;
    }

    public String comprobarColor(String color) {
        switch (color.toLowerCase()) {
            case "blanco":
            case "negro":
            case "rojo":
            case "azul":
            case "gris":
                return color;
            default:
                return this.color;
        }
    }

    public double precioFinal(char cEnergetico, double tamanio) {
        if (cEnergetico == 'A' || tamanio > 80) {
            precioBase += 100;
        }if (cEnergetico == 'B' || tamanio >= 50 && tamanio < 80) {
            precioBase += 80;
        }if (cEnergetico == 'C') {
            precioBase += 60;
        }if (cEnergetico == 'D' || (tamanio >= 20 && tamanio < 50)) {
            precioBase += 50;
        }if (cEnergetico == 'E') {
            precioBase += 30;
        }if (cEnergetico == 'F' || (tamanio >= 0 && tamanio < 20)){
            precioBase +=10;
        }
    return precioBase;
    }
}
