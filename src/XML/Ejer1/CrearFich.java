package XML.Ejer1;

import Ficheros.Ejer7.Persona;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class CrearFich {
    public static void main() throws IOException {
        BufferedReader br;
        br = new BufferedReader(new InputStreamReader(System.in));


        File fichero = new File("Deposito.dat");
        FileOutputStream foAutos = new FileOutputStream(fichero);
        ObjectOutputStream ooAutomoviles = new ObjectOutputStream(foAutos);

        System.out.println("Marca?, potencia?, precio?");
        String marca = br.readLine();
        int pot = Integer.parseInt(br.readLine());
        int precio = Integer.parseInt(br.readLine());

        Automovil auto = new Automovil(marca, pot, precio);

        ooAutomoviles.writeObject(auto);
        ooAutomoviles.writeObject(null);
        ooAutomoviles.close();



    }
}
