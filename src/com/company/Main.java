package com.company;

import com.company.model.Equipo;

import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {

        Files file = new Files();
        Equipo equipo = new Equipo();

        file.ruta="equipo";
        file.SEPARATOR=";";

        File Equipo = new File(file.ruta);
        FileWriter writeFile = new FileWriter(file.ruta, true);


        equipo.
        writeFile.write();
        writeFile.close();

        BufferedWriter ficherosalida = new BufferedWriter(escribir);

        //

        file.ruta="equipo";
        file.SEPARATOR=";";

    }
}
