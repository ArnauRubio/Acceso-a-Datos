package XML.Ejer3;

import XML.Ejer1.Automovil;

import java.io.*;
import java.util.Scanner;

public class InspeccionFSecuencial {
    public static void main(String[] args) throws Exception {

        Scanner teclado = new Scanner(System.in);

        System.out.print("Introduce la marca: ");
        String marcaBuscada = teclado.nextLine();

        System.out.print("Introduce la potencia mínima: ");
        int potenciaMinima = teclado.nextInt();

        FileInputStream foAutomoviles =
                new FileInputStream("DEPOSITO.DAT");

        ObjectInputStream ooAutomoviles =
                new ObjectInputStream(foAutomoviles);

        Automovil coche;

        coche = (Automovil) ooAutomoviles.readObject();

        while (coche != null) {

            if (coche.getMarca().equalsIgnoreCase(marcaBuscada)
                    && coche.getPotencia() > potenciaMinima) {

                coche.mostrar();
            }

            coche = (Automovil) ooAutomoviles.readObject();
        }

        ooAutomoviles.close();
        teclado.close();
    }
}

