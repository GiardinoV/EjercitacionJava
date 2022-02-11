package Ej16;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese su nombre: ");
        String nomIng = scanner.nextLine();
        System.out.println("Ingrese su sexo (H Hombre, M Mujer): ");
        String sexoIng = scanner.nextLine();
        System.out.println("Ingrese su edad: ");
        int edadIng = scanner.nextInt();
        System.out.println("Ingrese su peso: ");
        double pesoIng = scanner.nextDouble();
        System.out.println("Ingrese su altura: ");
        double alturaIng = scanner.nextDouble();

        Persona p1 = new Persona(nomIng,edadIng,sexoIng,pesoIng,alturaIng);
        Persona p2 = new Persona(nomIng,edadIng,sexoIng);
        Persona p3 = new Persona();
        p3.setNombre("Vir");
        p3.setEdad(29);
        p3.generaDNI();
        p3.setSexo("M");
        p3.setPeso(54);
        p3.setAltura(1.65);

        System.out.println("\nPersona 1:");
        p1.toString(p1);
        p1.calcularIMC(pesoIng,alturaIng);
        p1.mensajeEdad(p1.esMayorDeEdad(p1.getEdad()));

        System.out.println("\nPersona 2:");
        p2.toString(p2);
        p2.calcularIMC(p2.getPeso(),p2.getAltura());
        p2.mensajeEdad(p2.esMayorDeEdad(p2.getEdad()));

        System.out.println("\nPersona 3:");
        p3.toString(p3);
        p3.calcularIMC(p3.getPeso(),p3.getAltura());
        p3.mensajeEdad(p3.esMayorDeEdad(p3.getEdad()));


}}
