package XML.Ejer1;

import java.io.*;

public class CrearFich {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(
                new InputStreamReader(System.in)
        );

        File fichero = new File("Deposito.dat");

        FileOutputStream foAutos = new FileOutputStream(fichero);
        ObjectOutputStream ooAutomoviles = new ObjectOutputStream(foAutos);

        System.out.println("Marca:");
        String marca = br.readLine();

        System.out.println("Potencia:");
        int pot = Integer.parseInt(br.readLine());

        System.out.println("Precio:");
        int precio = Integer.parseInt(br.readLine());

        Automovil auto = new Automovil(marca, pot, precio);

        ooAutomoviles.writeObject(auto);

        // Indica el final de los objetos
        ooAutomoviles.writeObject(null);

        ooAutomoviles.close();
    }
}