import java.io.File;
import java.io.IOException;
import java.nio.file.Path;

import static java.nio.file.Files.delete;

public class CrearDir {
    public static void main(String[] args) throws IOException {
        File d = new File("NuevoDir");
        d.mkdir(); //Crear directorio

        File f = new File(d, "fichero1.txt");
        try {
            // 2. Intentar crear el archivo
            if (f.createNewFile()) {
                System.out.println("¡Archivo creado con éxito!");
            } else {
                System.out.println("El archivo ya existe.");
            }
        } catch (IOException e) {
            // 3. Capturar y controlar la excepción en caso de error
            System.out.println("No se pudo crear el archivo debido a un error de E/S.");
            e.printStackTrace();
        }

        delete(Path.of("NuevoDir/fichero1.txt"));
        //delete(Path.of("NuevoDir/fichero2.txt"));
        //delete(Path.of("NuevoDir"));
    }

}

