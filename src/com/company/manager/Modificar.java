package com.company.manager;

import com.company.model.Files;

import java.io.*;
import java.util.Scanner;



public class Modificar {
    Files files = new Files();
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

        System.out.println("Dime el ID del equipo que quieres modificar");
        String idModificar=teclado.nextLine();
        while((line = inputStream.readLine()) != null){
            String[] values = line.split(files.SEPARATOR);

            if(Integer.valueOf(values[0]) == testData.id){
                outputStream.write(testData.id + SEPARATOR + testData.value + SEPARATOR + testData.value2 + "\n");
            } else {
                outputStream.write(line + "\n");
            }
        }

        outputStream.close();
        inputStream.close();

        tmpFile.renameTo(file);

    }
}
