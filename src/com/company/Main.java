package com.company;

import com.company.model.Equipo;
import com.company.model.Participante;
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {

        Files file = new Files();
        Equipo equipo = new Equipo();
        Participante participante = new Participante();


        file.ruta="equipo";
        file.SEPARATOR=";";

        File fileEquipo = new File(file.ruta);
        FileWriter writeFile = new FileWriter(file.ruta, true);

        writeFile.write();
        writeFile.close();

        BufferedWriter ficherosalida = new BufferedWriter(writeFile);

        //

        file.ruta="equipo";
        file.SEPARATOR=";";

    }
}
