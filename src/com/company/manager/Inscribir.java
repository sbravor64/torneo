package com.company.manager;

import com.company.model.Equipo;
import com.company.model.Files;
import com.company.model.Participante;

import java.io.*;
import java.util.Scanner;

public class Inscribir {
    Files files = new Files();
    Equipo equipo = new Equipo();
    Participante participante = new Participante();
    Scanner teclado = new Scanner(System.in);

    public void inscribirEquipo() throws IOException {
        files.ruta="Equipos";
        equipo.nombre =teclado.nextLine();
        equipo.cognoms=teclado.nextLine();
        equipo.ciudad=teclado.nextLine();
        equipo.siglas=teclado.nextLine();
        equipo.id = getLastId()+1;


        BufferedWriter bw = new BufferedWriter(new FileWriter(files.ruta, true));
        bw.write(equipo.id + files.SEPARATOR + equipo.nombre + files.SEPARATOR + equipo.cognoms + files.SEPARATOR + equipo.ciudad + files.SEPARATOR + equipo.siglas + "\n");
        bw.close();

    }

    public void inscribirParticipantes() throws IOException {
        files.ruta="Participantes";
        participante.nombre=teclado.nextLine();
        participante.apellidos=teclado.nextLine();
        participante.ciudad=teclado.nextLine();
        participante.id = getLastId()+1;

        BufferedWriter bw = new BufferedWriter(new FileWriter(files.ruta, true));
        bw.write(participante.id + files.SEPARATOR + participante.nombre + files.SEPARATOR + participante.apellidos + files.SEPARATOR + participante.ciudad + "\n");
        bw.close();

    }


    int getLastId() throws IOException {
        int id=0;
        BufferedReader inputStream = new BufferedReader(new FileReader(files.ruta));


        String line;
        while((line = inputStream.readLine()) != null){
            String[] values = line.split(files.SEPARATOR);
            id = Integer.valueOf(values[0]);
        }

        inputStream.close();

        return id;

    }



}
