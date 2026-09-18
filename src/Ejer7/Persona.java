package Ejer7;

import java.io.Serializable;

//Ejer7
public class Persona implements Serializable {
    private String nombre;
    private String apellidos;
    private int edad;

    //Constructores
    public Persona(String nombre, String apellidos, int edad) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.edad = edad;
    }

    public Persona() {  //constructor vacío
        this.nombre = null;
    }

    //métodos para guardar el nombre o devolverlo
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNombre() {
        return this.nombre;
    } //devuelve el nombre

    public String getApellidos() {
        return this.apellidos;
    } //devuelve el apellido

    public int getEdad() {
        return this.edad;
    } //devuelve la edad
}

