package XML.Ejer4;

import java.io.*;

public class SelecMarcayPotencia {

    public static void main(String[] args) throws Exception {
        System.out.print("Introducir la marca que deseas seleccionar: ");
        String marcaSeleccionada = Utilidades.leerCadena();
        int potenciaMinima = 0;
        do {
            System.out.print("Introducir la potencia mínima del coche: ");
            potenciaMinima = Utilidades.leerEntero();
        } while (potenciaMinima <= 0);

        FileInputStream fiAutomoviles = new FileInputStream(".ficheros/Deposito.DAT");

        ObjectInputStream oiAutomoviles = new ObjectInputStream(fiAutomoviles);

        Automovil coche = (Automovil) oiAutomoviles.readObject();

        while (coche != null) {
            if (coche.getMarca().equals(marcaSeleccionada)
                    && coche.getPotencia() > potenciaMinima) {
                coche.mostrar();
            }
            coche = (Automovil) oiAutomoviles.readObject();
        }
        oiAutomoviles.close();
    }
}