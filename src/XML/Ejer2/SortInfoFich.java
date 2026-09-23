package XML.Ejer2;

import XML.Ejer1.Automovil;

import java.io.*;

public class SortInfoFich {
    public static void main() throws IOException, ClassNotFoundException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        FileInputStream fiAutos = new FileInputStream("Deposito.dat");
        ObjectInputStream oiAutos = new ObjectInputStream(fiAutos);

        System.out.println("rango de busqueda: ");
        int b = Integer.parseInt(br.readLine());
        Automovil automovil = (Automovil) oiAutos.readObject();

        while (automovil != null) {

            if (automovil.getPrecio() <= b) {
                automovil.mostrar();
            }

            automovil = (Automovil) oiAutos.readObject();
        }
    }
}
