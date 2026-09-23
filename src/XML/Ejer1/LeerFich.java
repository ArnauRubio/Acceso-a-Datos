package XML.Ejer1;

import java.io.*;

public class LeerFich {
    public static void main(String[] args) throws IOException {

        FileInputStream fiAutos = new FileInputStream("Deposito.dat");
        ObjectInputStream oiAutos = new ObjectInputStream(fiAutos);

        try {
            Automovil automovil = (Automovil) oiAutos.readObject();

            while (automovil != null) {

                automovil.mostrar();

                automovil = (Automovil) oiAutos.readObject();
            }

        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

        oiAutos.close();
    }
}