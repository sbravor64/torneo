package com.company.manager;

import com.company.model.Files;

import java.io.*;
import java.util.Scanner;

public class Borrar {
    Files files = new Files();
    Scanner teclado = new Scanner(System.in);

    public void borrarEquipo() throws IOException {
        files.ruta="equipo";

        int id = teclado.nextInt();


        BufferedWriter bw = new BufferedWriter(new FileWriter(files.ruta, true));
        PrintWriter pw = new PrintWriter(new FileWriter(files.ruta, true));
        String line = null;
        if (!line.trim().equals(id)) {



            pw.println(line);

            pw.flush();
        }        bw.close();
    }

    public void borrarParticipantes() {
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
