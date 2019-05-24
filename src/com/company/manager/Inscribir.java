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

    public void inscribirEquipo(String nombre, String año, String ciudad, String siglas, int puntos) throws IOException {
        files.ruta="Equipos";

        int id=getLastId()+1;
        puntos=0;

        BufferedWriter bw = new BufferedWriter(new FileWriter(files.ruta, true));
        bw.write(id + files.SEPARATOR + nombre + files.SEPARATOR + año + files.SEPARATOR + ciudad + files.SEPARATOR + siglas + files.SEPARATOR + puntos + "\n");
        bw.close();
    }

    public void inscribirParticipantes(String nombre, String apellidos, String ciudad, int idEquipo) throws IOException {
        files.ruta="Participantes";

        int id = getLastId()+1;

        BufferedWriter bw = new BufferedWriter(new FileWriter(files.ruta, true));
        bw.write(id + files.SEPARATOR + nombre + files.SEPARATOR + apellidos + files.SEPARATOR + ciudad + files.SEPARATOR + idEquipo + "\n");
        bw.close();

    }


    public int getLastId() throws IOException {
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
