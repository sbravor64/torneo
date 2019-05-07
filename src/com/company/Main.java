package com.company;

import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        String SEPARATOR = ":";
        String ruta = "equipo";

        File file = new File("equipo");

        FileWriter escribir = new FileWriter(file, true);

        escribir.write("hola");

        escribir.close();

        BufferedWriter ficherosalida = new BufferedWriter(escribir);

    }
}
