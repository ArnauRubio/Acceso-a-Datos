package Ficheros.Ejer6;

import java.io.*;

//Ejer 6
public class LeerFichData {
    public static void main(String[] args) throws IOException {

        File fichero = new File(".//FichData.dat"); //Fichero escrito con Ficheros.Ejer6.EscribirFichData.java
        FileInputStream filein = new FileInputStream(fichero);
        DataInputStream dataIS = new DataInputStream(filein);

        String n; //Variable que guardará un nombre (string)
        int e; //Variable que guardará un número, correspondiente a la edad (int)
        try {
            while (dataIS.available() > 0) {
                n = dataIS.readUTF(); //recupera el nombre
                e = dataIS.readInt(); //recupera la edad
                System.out.println("Nombre: " + n + ", edad: " + e);
            }
        } catch (EOFException eo) {
        }

        dataIS.close();  //cerrar stream
    }

}
