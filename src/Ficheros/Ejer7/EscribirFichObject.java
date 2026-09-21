package Ficheros.Ejer7;

import java.io.*;

//Ficheros.Ejer7
public class EscribirFichObject {
    public static void main(String[] args) throws IOException {
        File fichero = new File("persona.dat");
        FileOutputStream fileout = new FileOutputStream(fichero);
        DataOutputStream dataOS = new DataOutputStream(fileout);

        String nombre = "Arnau";
        String apellidos = "Rubio Artiga";
        int edad = 24;
        Persona persona = new Persona(nombre, apellidos, edad);

            dataOS.writeUTF(persona.getNombre()); //inserta nombre
            dataOS.writeUTF(persona.getApellidos()); //inserta apellidos
            dataOS.writeInt(persona.getEdad()); //inserta edad

        dataOS.close(); //cerrar stream
    }
}


