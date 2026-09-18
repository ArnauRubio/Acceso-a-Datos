package Ejer3;

import java.io.FileReader;
import java.io.IOException;
import java.io.File;

//Ejer 3
public class MostrarFich {
    public static void main(String[] args) throws IOException {
       /* File fichero = new File(".//LeerFichTexto.java");
        FileReader fic = new FileReader(fichero); //crear el flujo de entrada
        int i;
        while ((i = fic.read()) != -1) //se va leyendo un carácter
            System.out.println((char) i);
*/
        File fis = new File(".//LeerFichTexto.java");
        FileReader isr = new FileReader(fis);
        char[] cbuf = new char[20];
// lee los datos en el buffer
        int j;
        while ((j = isr.read()) != -1) {
            int i = isr.read(cbuf, 0, 20);
            for (char c : cbuf) {
// caracteres vacios
                if (((int) c) == 0)
                    c = '-';
                System.out.println(c);
            }
        }
        // fic.close(); //cerrar flujo de entrada

    }
}
