package Ficheros.Ejer9;

import java.io.IOException;
import java.io.RandomAccessFile;

//Ficheros.Ejer9
public class EscribirFichAleatorio {
    public static void main(String[] args) throws IOException {

        // Arrays con los datos de los empleados (rellenados directamente en el código)
        String[] apellidos = {"Garcia", "Lopez", "Martinez", "Fernandez", "Rodriguez"};
        int[] departamentos = {10, 20, 10, 30, 20};
        double[] salarios = {1500.50, 1800.75, 2000.00, 1750.25, 1600.00};

        try (RandomAccessFile fichero = new RandomAccessFile("empleados.dat", "rw")) {

            for (int i = 0; i < apellidos.length; i++) {

                int id = i + 1; // el identificador coincide con el índice + 1

                fichero.writeInt(id);
                escribirApellido(fichero, apellidos[i]);
                fichero.writeInt(departamentos[i]);
                fichero.writeDouble(salarios[i]);
            }

            System.out.println("Se han insertado " + apellidos.length + " empleados en empleados.dat");

        } catch (IOException e) {
            System.out.println("Error al escribir en el fichero: " + e.getMessage());
        }
    }

    /**
     * Escribe el apellido ocupando siempre exactamente 10 caracteres (20 bytes),
     * truncando si es más largo o rellenando con espacios si es más corto,
     * para que cada registro tenga un tamaño fijo de 36 bytes.
     */
    private static void escribirApellido(RandomAccessFile fichero, String apellido) throws IOException {
        StringBuilder sb = new StringBuilder(apellido);

        if (sb.length() > 10) {
            sb.setLength(10);
        } else {
            while (sb.length() < 10) {
                sb.append(' ');
            }
        }

        fichero.writeChars(sb.toString()); // writeChars escribe 2 bytes por carácter
    }
}
