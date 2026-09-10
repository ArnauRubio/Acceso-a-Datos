import java.io.*;

public class LeerFichData {
    public static void main(String[] args) throws IOException {

        File fichero = new File(".\\FichBytes.txt");
//crea flujo de salida hacia el fichero
        FileOutputStream fileout = new FileOutputStream("FichBytes.txt");
//crea flujo de entrada
        FileInputStream filein = new FileInputStream("FichBytes.txt");
        int i;
//Escribir los datos del fichero
        for (int j = 0; j < fichero.length(); j++) {

        } //escribe datos en el flujo de salida
        fileout.close(); //cerrar stream de salida
//visualizar los datos del fichero
        while ((i = filein.read()) != -1) //lee datos del flujo de entrada
            System.out.println(i);
        filein.close(); //cerrar stream de entrada
    }

}
