package Ej17;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Electrodomestico electrodomesticos[]=new Electrodomestico[10];
        electrodomesticos[0]=new Lavadora();
        electrodomesticos[1]=new Lavadora(60,100);
        electrodomesticos[2]=new Lavadora(50,"Rojo", 'B',35,40);
        electrodomesticos[3]=new Television();
        electrodomesticos[4]=new Television(40,55);
        electrodomesticos[5]=new Television(20,"Negro",'E',60,11,true);
        electrodomesticos[6]=new Electrodomestico();
        electrodomesticos[7]=new Electrodomestico(80,10);
        electrodomesticos[8]=new Electrodomestico(110,"Blanco",'G',44);
        electrodomesticos[9]=new Television(200,"Negro",'C',6,50,true);


        int contLavadora = 0;
        int contTelevision = 0;
        int contElectrodomestico = 0;
        for (int i = 0; i < electrodomesticos.length; i++) {
            double precio = electrodomesticos[i].precioFinal(electrodomesticos[i].getConsEnergetico(),electrodomesticos[i].getPeso());


            if (electrodomesticos[i]instanceof Lavadora){
                System.out.println("Precio final de la Lavadora $"+precio);
                contLavadora+=precio;
            }else if (electrodomesticos[i]instanceof Television){
                System.out.println("Precio final del televisor $"+precio);
                contTelevision+=precio;
            }else{
                System.out.println("Precio final del electrodoméstico $"+precio);
                contElectrodomestico+=precio;
            }
        }contElectrodomestico+=(contLavadora+contTelevision);
        System.out.println("\nTotal lavadoras $"+ contLavadora);
        System.out.println("Total Televisores $"+ contTelevision);
        System.out.println("Total Electrodomesticos $"+ contElectrodomestico);

    }
}
