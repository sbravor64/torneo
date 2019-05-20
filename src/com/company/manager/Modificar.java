package com.company.manager;

import com.company.model.Equipo;
import com.company.model.Files;

import java.io.*;
import java.util.Scanner;



public class Modificar {
    Files files = new Files();
    Equipo equipo = new Equipo();
    Scanner teclado = new Scanner(System.in);

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

    public void modificarEquipo() throws IOException {
        files.ruta="Equipos";

        BufferedWriter outputStream = new BufferedWriter(new FileWriter(files.ruta));
        BufferedReader inputStream = new BufferedReader(new FileReader(files.ruta));

        System.out.println("Dime el ID del equipo que quieres modificar");
        int idModificar=teclado.nextInt();

        String line;
        while((line = inputStream.readLine()) != null){
            String[] values = line.split(files.SEPARATOR);

            if(Integer.valueOf(values[0]) == idModificar){
                outputStream.write(equipo.id + files.SEPARATOR + equipo.nombre + files.SEPARATOR + equipo.cognoms + "\n");
                outputStream.close();
            } else {
                outputStream.write(line + "\n");
            }
        }

        outputStream.close();
        inputStream.close();

    }

    public void modificarParticipantes() {
    }
}
