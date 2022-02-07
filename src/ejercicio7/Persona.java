package ejercicio7;

import java.util.Scanner;

/**
 *
 * @author dark_
 */
public class Persona {

    //////////////////////////Atributes////////////////////////////////////////
    private String nombre;
    private int edad;
    private char sexo;
    private double peso;
    private double altura;
    //////////////////////////Builders/////////////////////////////////////////

    public Persona(String nombre, int edad, char sexo, double peso, double altura) {
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
        this.peso = peso;
        this.altura = altura;
    }

    public Persona() {
    }
    /////////////////////////////Setters and Getters///////////////////////////

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    //////////////////////////////Methods//////////////////////////////////////
    public void crearPersona() {
        Scanner read = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Ingrese su Nombre: ");
        this.nombre = read.next();
        System.out.println("Ingrese su edad: ");
        this.edad = read.nextInt();
        System.out.println("Ingrese su sexo(H,M,O): ");
        do {
            this.sexo = read.next().toUpperCase().charAt(0);
        } while (this.sexo != 'O' && this.sexo != 'H' && this.sexo != 'M');
        System.out.println("Ingrese su altura(m): ");
        this.altura = read.nextDouble();
        System.out.println("Ingrese su peso(kg): ");
        this.peso = read.nextDouble();
    }

    public int calcularIMC() {
        double imc = this.peso / (Math.pow(this.altura, 2));
        if (imc < 20 ) {
            return -1;
        }else if (imc > 25) {
            return 1;
        }else{
            return 0;
        }

    }

    public boolean esMayorDeEdad() {
        return this.edad >= 18;

    }

}
