package Ej16;

public class Persona {
    private String nombre;
    private int edad;
    private int DNI;
    private static String sexo = "H";
    private double peso;
    private double altura;

    public Persona() {
        this.nombre = "";
        this.edad = 0;
        this.sexo = sexo;
        this.DNI = generaDNI();
        this.peso = 0;
        this.altura = 0;
    }

    public Persona(String nombre, int edad, String sexo) {
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = comprobarSexo(sexo);
        this.DNI = generaDNI();
        this.peso = 0;
        this.altura = 0;
    }

    public Persona(String nombre, int edad, String sexo, double peso, double altura) {
        this.nombre = nombre;
        this.edad = edad;
        this.DNI = generaDNI();
        this.sexo = comprobarSexo(sexo);
        this.peso = peso;
        this.altura = altura;
    }

    public double getPeso() {
        return peso;
    }

    public double getAltura() {
        return altura;
    }

    public int getEdad() {
        return edad;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setSexo(String sexo) {
        Persona.sexo = comprobarSexo(sexo);
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public int calcularIMC(double peso, double altura) {
        double imc = peso / (altura * altura);
        if (imc < 20){
            System.out.println("Se encuentra por debajo de su peso ideal");
            return -1;
        }
        else if (imc > 25){
            System.out.println("Se encuentra por encima de su peso ideal");
            return 1;
        }
        else {
            System.out.println("Se encuentra en su peso ideal");
            return 0;
        }
    }

    public boolean esMayorDeEdad(int edad) {
        return edad > 18;
    }

    public void mensajeEdad(boolean x){
        if(x) System.out.println("Es mayor de edad");
        else System.out.println("Es menor de edad");
    }

    private String comprobarSexo(String sexo) {
        if (sexo.equals("H") || sexo.equals("M")) return sexo;
        else return this.sexo;
    }

    public void toString(Persona p) {
        System.out.println("Nombre: " + nombre + ", Edad: " + edad +", DNI: "+DNI+", Sexo: " + sexo + ", Peso: " + peso + "kg, Altura: " + altura + "m");
    }

    int generaDNI() {
        return (int) (10000000 + Math.random() * 99999999);
    }
}