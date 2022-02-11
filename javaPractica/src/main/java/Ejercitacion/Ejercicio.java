package Ejercitacion;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Locale;
import java.util.Scanner;

public class Ejercicio {

    private static void comparar(int num1, int num2){
        if(num1==num2){
            System.out.println("Ambos números son iguales");
        }else if(num1>num2){
            System.out.println("El primer número '"+num1+"' es mayor al segundo número '"+num2+"'");
        }else{
            System.out.println("El segundo número '"+num2+"' es mayor al primer número '"+num1+"'");
        }
    }

    private static double areaCirculo(double radio){
        return Math.PI * Math.pow(radio, 2);
    }

    public static void main(String[] args) {
        //Ejercicio 1
       int num1 = 4;
        int num2 = 4;
        //comparar(num1,num2);

        //Ejercicio 2
        Scanner scanner = new Scanner(System.in);
   /*      System.out.println("Ingrese el primer número a comparar: ");
        int ingreso1 = scanner.nextInt();
        System.out.println("Ingrese el segundo número a comparar: ");
        int ingreso2 = scanner.nextInt();
        comparar(ingreso1,ingreso2);

        //Ejercicio 3
        System.out.println("Ingrese el radio del círculo: ");
        double radio = scanner.nextDouble();
        System.out.println("El área del círculo es de "+ Math.round(areaCirculo(radio)));

        //Ejercicio 4
        double iva = 0.21;
        System.out.println("Ingrese el precio del producto: ");
        double precioProducto = scanner.nextDouble();
        double precioConIva = precioProducto+(precioProducto*iva);
        System.out.println("El precio del producto con iva es de $"+ precioConIva);

        //Ejercicio 5
        int n=1;
        int j=0;
        int i = 0;
        int[] par = new int[50];
        int[] impar = new int[50];
        while (n<=100){
            if (n%2==0){
                par[i] = n;
                i++;
                n++;

            }else{
                impar[j] = n;
                j++;
                n++;
            }
        }

        System.out.println("Los números pares del 1 al 100 son:");
        System.out.println(Arrays.toString(par));
        System.out.println("Los números impares del 1 al 100 son:");
        System.out.println(Arrays.toString(impar));


        //Ejercicio 6
        int a = 0;
        int b = 0;
        int[] nPar = new int[50];
        int[] nImpar = new int[50];
        for (int k = 1; k <= 100 ; k++) {
            if(k%2==0){
                nPar[a]=k;
                a++;
            }else{
                nImpar[b]=k;
                b++;
            }
        }
        System.out.println("Los números pares del 1 al 100 son:");
        System.out.println(Arrays.toString(nPar));
        System.out.println("Los números impares del 1 al 100 son:");
        System.out.println(Arrays.toString(nImpar));


        //Ejercicio 7
        int numIngresado;
        do {
            System.out.println("Ingrese un número");
            numIngresado = scanner.nextInt();
        }while (numIngresado<0);
        System.out.println("Ingresaste el número "+ numIngresado);


        //Ejercicio 8
        System.out.println("Ingrese un día de la semana");
        String diaIngresado = scanner.nextLine().toLowerCase();
        switch (diaIngresado){
            case"lunes":
            case"martes":
            case"miercoles":
            case"jueves":
                case"viernes":
                    System.out.println("El "+diaIngresado+" es un día laboral");
                    break;
            case"sabado":
            case"domingo":
                System.out.println("El "+diaIngresado+" no es un día laboral");
                break;
            default:
                System.out.println("ERROR! Ingrese un día válido");

        }


        //Ejercicio 9
        String texto = "La sonrisa sera la mejor arma contra la tristeza";
        String textoE = texto.replace("a","e");
        System.out.println("Ingrese texto a concatenar");
        String textoIngresado = scanner.nextLine();
        System.out.println(textoE.concat(" ").concat(textoIngresado));


        //Ejercicio 10
        System.out.println("Ingrese una frase");
        String frase = scanner.nextLine();
        System.out.println(frase.replace(" ", ""));


        //Ejercicio 11
        System.out.println("Ingrese una frase: ");
        String fraseL = scanner.nextLine();
        System.out.println("La longitud de la frase ingresada es de "+fraseL.length());
        int a = 0;
        int e = 0;
        int i = 0;
        int o = 0;
        int u = 0;
        for (int x = 0; x < fraseL.length(); x++) {
            if (fraseL.charAt(x)=='a'){
                a++;
            }else if(fraseL.charAt(x)=='e'){
                e++;
            }else if(fraseL.charAt(x)=='i'){
                i++;
            }else if(fraseL.charAt(x)=='o'){
                o++;
            }else if(fraseL.charAt(x)=='u'){
                u++;
            }
        }System.out.println("La frase contiene "+a+" 'a' -- "+e+" 'e' -- "+i+" 'i' -- "+o+" 'o' -- "+u+" 'u'");


        //Ejercicio 12
        System.out.println("Ingrese la primer palabra a comparar: ");
        String palabra1 = scanner.nextLine();
        System.out.println("Ingrese la segunda palabra a comparar: ");
        String palabra2 = scanner.nextLine();
        if (palabra1.equals(palabra2)){
            System.out.println("¡Ambas palabras son iguales!");
        }else{
            String difPalabra1 = "";
            String difPalabra2 = "";
            for (int i = 0; i < palabra1.length(); i++) {
                if (palabra1.charAt(i)!=palabra2.charAt(i)){
                    difPalabra1+=palabra1.charAt(i);
                    difPalabra2+=palabra2.charAt(i);
                }
            }
            System.out.println("Diferencia primer palabra '"+difPalabra1+"'");
            System.out.println("Diferencia segunda palabra '"+difPalabra2+"'");
        }


        //Ejercicio 13
        DateTimeFormatter formateo = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
        System.out.println("Fecha y hora acutal: "+formateo.format(LocalDateTime.now()));


        //Ejercicio 14
        System.out.println("Ingrese un número: ");
        int numIng = scanner.nextInt();
        System.out.println("Numeros desde el "+numIng+"hasta el 1000");
        for (int i = numIng; i <= 1000 ; i+=2) {
            System.out.println(i);
        }


        //Ejercicio 15
        int opcIng = 1;
        while (opcIng != 8){
            System.out.println("****** GESTION CINEMATOGRAFICA ********\n" +
                    "1-NUEVO ACTOR\n" +
                    "2-BUSCAR ACTOR\n" +
                    "3-ELIMINAR ACTOR\n" +
                    "4-MODIFICAR ACTOR\n" +
                    "5-VER TODOS LOS ACTORES\n" +
                    "6- VER PELICULAS DE LOS ACTORES\n" +
                    "7-VER CATEGORIA DE LAS PELICULAS DE LOS ACTORES\n" +
                    "8-SALIR");
            System.out.println("\nIngrese una opción del menú: ");
            opcIng = scanner.nextInt();
            switch (opcIng){
                case(1):
                case(2):
                case(3):
                case(4):
                case(5):
                case(6):
                case(7):
                case(8):
                    break;
                default:
                    System.out.println("Opción Incorrecta");
            }
        }*/
    }
}
