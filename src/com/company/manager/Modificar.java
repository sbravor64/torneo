package com.company.manager;

import com.company.model.Equipo;
import com.company.model.Files;
import com.company.model.Participante;

import java.io.*;
import java.sql.SQLOutput;
import java.util.Scanner;


public class Modificar {
    Files files = new Files();
    Equipo equipo = new Equipo();
    Participante participante = new Participante();
    Scanner teclado = new Scanner(System.in);

    public void modificarEquipo(int idModificar, String nombre, String año, String ciudad, String siglas) throws IOException {
        files.ruta="Equipos";

        File file = new File(files.ruta);
        File tmpFile = new File(files.ruta + "tmp");

        BufferedReader inputStream = new BufferedReader(new FileReader(file));
        BufferedWriter outputStream = new BufferedWriter(new FileWriter(tmpFile));

        String line;
        while((line = inputStream.readLine()) != null){
            String[] values = line.split(files.SEPARATOR);

            if(Integer.valueOf(values[0]) == idModificar){
                int id = Integer.valueOf(values[0]);

                outputStream.write(id + files.SEPARATOR + nombre + files.SEPARATOR + año + files.SEPARATOR + ciudad + files.SEPARATOR + siglas + "\n");
            } else {
                outputStream.write(line + "\n");
            }
        }

        outputStream.close();
        inputStream.close();

        tmpFile.renameTo(file);

    }

    public void modificarParticipantes(int idModificar, String nombre, String apellidos, String ciudad) throws IOException {
        files.ruta="Participantes";

        File file = new File(files.ruta);
        File tmpFile = new File(files.ruta + "tmp");

        BufferedReader inputStream = new BufferedReader(new FileReader(file));
        BufferedWriter outputStream = new BufferedWriter(new FileWriter(tmpFile));

        String line;
        while((line = inputStream.readLine()) != null){
            String[] values = line.split(files.SEPARATOR);

            if(Integer.valueOf(values[0]) == idModificar){
                int id = Integer.valueOf(values[0]);
                outputStream.write(id + files.SEPARATOR + nombre + files.SEPARATOR + apellidos + files.SEPARATOR + ciudad + "\n");
            } else {
                outputStream.write(line + "\n");
            }
        }

        outputStream.close();
        inputStream.close();

        tmpFile.renameTo(file);
    }
}
