package XML.Ejer2;

import XML.Ejer1.Automovil;

import java.io.*;

public class SortInfoFich {
    public static void main() throws IOException {
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        FileInputStream fiAutos = new FileInputStream("Deposito.dat");
        ObjectInputStream oiAutos = new ObjectInputStream(fiAutos);

        System.out.println("rango de busqueda: ");
        int b = Integer.parseInt(br.readLine());

        try {
            while (oiAutos.available() > 0) {

                Automovil automovil = (Automovil) oiAutos.readObject();
                System.out.println(automovil);
            }
        } catch (EOFException | ClassNotFoundException eo) {
            throw new RuntimeException(eo);
        }
        oiAutos.close();  //cerrar stream
    }

}
