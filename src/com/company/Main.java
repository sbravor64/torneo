package com.company;

import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {

        Files equipo = new Files();

        equipo.ruta="equipo";
        equipo.SEPARATOR=";";

        File Equipo = new File(equipo.ruta);
        FileWriter escribir = new FileWriter(equipo.ruta, true);

        escribir.write("hola");
        escribir.close();

        BufferedWriter ficherosalida = new BufferedWriter(escribir);



        //
        Files participantes = new Files();

        participantes.ruta="equipo";
        participantes.SEPARATOR=";";

    }
}
