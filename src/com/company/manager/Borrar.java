package com.company.manager;

import com.company.model.Files;

import java.io.*;
import java.util.Scanner;

public class Borrar {
    Files files = new Files();
    Scanner teclado = new Scanner(System.in);

    public void borrarEquipo(int idBorrar) throws IOException {

        files.ruta="Equipos";
        File file = new File(files.ruta);
        File tmpFile = new File(files.ruta + "tmp");

        BufferedReader inputStream = new BufferedReader(new FileReader(file));
        BufferedWriter outputStream = new BufferedWriter(new FileWriter(tmpFile));

        String line;
        while((line = inputStream.readLine()) != null){
            String[] values = line.split(files.SEPARATOR);

            if(Integer.valueOf(values[0]) != idBorrar){
                outputStream.write(line + "\n");
            }
        }

        outputStream.close();
        inputStream.close();

        tmpFile.renameTo(file);
    }

    public void borrarParticipantes(int idBorrar) throws IOException {
        files.ruta="Participantes";
        File file = new File(files.ruta);
        File tmpFile = new File(files.ruta + "tmp");

        BufferedReader inputStream = new BufferedReader(new FileReader(file));
        BufferedWriter outputStream = new BufferedWriter(new FileWriter(tmpFile));

        String line;
        while((line = inputStream.readLine()) != null){
            String[] values = line.split(files.SEPARATOR);

            if(Integer.valueOf(values[0]) != idBorrar){
                outputStream.write(line + "\n");
                System.out.print("El participante ha sido borrado");
            }
        }

        outputStream.close();
        inputStream.close();

        tmpFile.renameTo(file);
    }
}
