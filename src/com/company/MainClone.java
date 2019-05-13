package com.company;

import com.company.model.Equipo;
import com.company.model.Participante;
import com.company.model.Files;


import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class MainClone {

    public static void main(String[] args) throws IOException {

        Files file = new Files();
        Equipo equipo = new Equipo();
        Participante participante = new Participante();


        file.ruta="equipo";
        file.SEPARATOR=";";

        File fileEquipo = new File(file.ruta);

        equipo.nombre = "Barcelona";
        equipo.siglas = "FCB";
        equipo.ciudad = "Catalunya";

        BufferedWriter ficherosalida = new BufferedWriter(new FileWriter(fileEquipo, true));

        ficherosalida.write(equipo.nombre + file.SEPARATOR + equipo.ciudad + file.SEPARATOR +equipo.siglas);
        ficherosalida.close();


        //
        equipo.nombre = "Real Madrid";
        equipo.siglas = "RMCF";
        equipo.ciudad = "Madrid";

        ficherosalida.write(equipo.nombre + file.SEPARATOR + equipo.ciudad + file.SEPARATOR +equipo.siglas);
        ficherosalida.close();

    }
}
