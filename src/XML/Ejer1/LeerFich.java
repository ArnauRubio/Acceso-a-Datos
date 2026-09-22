package XML.Ejer1;

import java.io.*;

public class LeerFich {
    public static void main() throws IOException {
        FileInputStream fiAutos = new FileInputStream("Deposito.dat");
        ObjectInputStream oiAutos = new ObjectInputStream(fiAutos);


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
