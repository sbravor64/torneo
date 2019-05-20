package com.company.manager;

import com.company.model.Files;

import java.io.*;
import java.util.Scanner;

public class Inscribir {
    Files files = new Files();
    Scanner teclado = new Scanner(System.in);

    public void inscribirEquipo() throws IOException {
        files.ruta="Equipos";
        String nombre=teclado.nextLine();
        String ciudad=teclado.nextLine();
        int id = getLastId()+1;


        BufferedWriter bw = new BufferedWriter(new FileWriter(files.ruta, true));
        bw.write(id + files.SEPARATOR + nombre + files.SEPARATOR + ciudad + "\n");
        bw.close();

    }

    public void inscribirParticipantes() throws IOException {
        files.ruta="Participantes";
        String nombre=teclado.nextLine();
        String cognoms=teclado.nextLine();
        int id = getLastId()+1;

        BufferedWriter bw = new BufferedWriter(new FileWriter(files.ruta, true));
        bw.write(id + files.SEPARATOR + nombre + files.SEPARATOR + cognoms + "\n");
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
