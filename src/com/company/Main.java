package com.company;

import com.company.manager.InscribirEquipo;
import com.company.model.Equipo;
import com.company.model.Files;
import com.company.model.Participante;
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {

        Files file = new Files();
        InscribirEquipo equipo = new InscribirEquipo();

        file.ruta="equipo";
        file.SEPARATOR=";";

        File fileEquipo = new File(file.ruta);
        fileEquipo.delete();

        BufferedWriter ficherosalida = new BufferedWriter(new FileWriter(fileEquipo, true));

        ficherosalida.write(equipo.nombre + file.SEPARATOR + equipo.ciudad + file.SEPARATOR +equipo.siglas);
        ficherosalida.close();

    }
}
