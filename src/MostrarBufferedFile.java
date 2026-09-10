import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class MostrarBufferedFile {
    public static void main(String[] args) throws IOException {
        try {
            FileReader fr = new FileReader("LeerFichTexto.java");
            BufferedReader br = new BufferedReader(fr);

            String linea;

            while((linea = br.readLine())!= null)
                System.out.println(linea);

            br.close();
        }
        catch (FileNotFoundException fn) {
            System.out.println("Error de lectura");
        }

        catch (IOException io){
            System.out.println("Error de E/S");
        }

    }
}
