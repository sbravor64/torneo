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
        File tmpFile = new File(files.ruta + "tmp");

        BufferedReader inputStream = new BufferedReader(new FileReader(files.ruta));
        BufferedWriter outputStream = new BufferedWriter(new FileWriter(tmpFile));


        System.out.println("Dime el ID del equipo que quieres modificar");
        int idModificar=teclado.nextInt();

        String line;
        while((line = inputStream.readLine()) != null){
            String[] values = line.split(files.SEPARATOR);

            if(Integer.valueOf(values[0]) == idModificar){
                equipo.nombre=teclado.nextLine();
                equipo.cognoms=teclado.nextLine();
                equipo.ciudad=teclado.nextLine();
                equipo.siglas=teclado.nextLine();
                equipo.id = Integer.valueOf(values[0]);
                outputStream.write(equipo.id + files.SEPARATOR + equipo.nombre + files.SEPARATOR + equipo.cognoms + files.SEPARATOR + equipo.ciudad + files.SEPARATOR + equipo.siglas + "\n");
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
