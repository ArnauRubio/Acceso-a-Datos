import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class EscribirFichTxt {
    public static void main(String[] args) throws IOException {
       /* //Ejer4
       File d = new File("NuevoDir");
        File f = new File(d, "FichTexto.txt");
        try {
            // 2. Intentar crear el archivo
            if (f.createNewFile()) {
                System.out.println("¡Archivo creado con éxito!");
            } else {
                System.out.println("El archivo ya existe.");
            }
        } catch (
                IOException e) {
            // 3. Capturar y controlar la excepción en caso de error
            System.out.println("No se pudo crear el archivo debido a un error de E/S.");
            e.printStackTrace();
        }

        String t = "inglés especialista en zoología, académico de la Universidad de Oxford— procede de un poema de Keats, quien creía que";

        try {
            FileWriter fw = new FileWriter("FichTexto.txt", true);

            // Convertimos el String en un array de caracteres
            char[] caracteres = t.toCharArray();

            // Escribimos los caracteres uno a uno
            for (char c : caracteres) {
                fw.write(c);
            }

            // Cerramos el fichero
            fw.close();

            System.out.println("Texto escrito correctamente.");

        } catch (IOException e) {
            System.out.println("Error al escribir en el fichero.");
        }*/

      /* //Ejer5
        try {
            FileWriter fw = new FileWriter("FichTexto.txt", true);

            String[] prov={"gipuzkoa","bizkaia","araba"};

            for (String c : prov) {
                fw.write(c);
            }

            fw.close();

            System.out.println("Texto escrito correctamente.");

        } catch (IOException e) {
            System.out.println("Error al escribir en el fichero.");
        }
    }*/
        // ejer5.1
        try {
            BufferedWriter f = new BufferedWriter(new FileWriter("FichTexto.txt"));

            for (int i = 0; i < 3; i++) {
                f.write("Fila número" + i);
                f.newLine();
            }

            f.close();

            System.out.println("Texto escrito correctamente.");

        } catch (IOException e) {
            System.out.println("Error al escribir en el fichero.");
        }
    }
}

