package XML.Ejer4;

import java.io.*;

public class SelecPrecio {

    public static void main(String[] args) throws Exception {
        int precioMaximo = 0;
        do {
            System.out.print("Introducir el precio máximo a pagar: ");
            precioMaximo = Utilidades.leerEntero();
        } while (precioMaximo <= 0);

        FileInputStream fiAutomoviles = new FileInputStream("./ficheros/Deposito.DAT");
        ObjectInputStream oiAutomoviles = new ObjectInputStream(fiAutomoviles);

        Automovil coche = (Automovil) oiAutomoviles.readObject();

        while (coche != null) {
            if (coche.getPrecio() <= precioMaximo) {
                coche.mostrar();
            }
            coche = (Automovil) oiAutomoviles.readObject();
        }
        oiAutomoviles.close();
    }
}