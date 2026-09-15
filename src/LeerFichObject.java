import java.io.*;

//Ejer7
public class LeerFichObject {

    public static void main(String[] args) throws IOException {

        File fichero = new File(".//persona.dat"); //Fichero escrito con EscribirFichData.java
        FileInputStream filein = new FileInputStream(fichero);
        DataInputStream dataIS = new DataInputStream(filein);

        String n; //Variable que guardará un nombre (string)
        String a; //Variable que guardará un apellido (string)
        int e; //Variable que guardará un número, correspondiente a la edad (int)
        try {
            while (dataIS.available() > 0) {
                n = dataIS.readUTF(); //recupera el nombre
                a = dataIS.readUTF(); //recupera el apellido
                e = dataIS.readInt(); //recupera la edad
                System.out.println("Nombre: " + n + ", Apellidos: " + a + ", edad: " + e);
            }
        } catch (EOFException eo) {
        }

        dataIS.close();  //cerrar stream
    }

}
