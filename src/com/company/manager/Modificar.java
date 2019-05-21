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

    public void modificarEquipo() throws IOException {
        files.ruta="Equipos";

        File file = new File(files.ruta);
        File tmpFile = new File(files.ruta + "tmp");

        BufferedReader inputStream = new BufferedReader(new FileReader(file));
        BufferedWriter outputStream = new BufferedWriter(new FileWriter(tmpFile));


        System.out.print("Dime el ID del equipo que quieres modificar: ");
        int idModificar=teclado.nextInt();

        String line;
        while((line = inputStream.readLine()) != null){
            String[] values = line.split(files.SEPARATOR);

            if(Integer.valueOf(values[0]) == idModificar){
                teclado.nextLine();
                System.out.print("NOMBRE: ");
                equipo.nombre=teclado.nextLine();
                System.out.print("AÑO DE FUNDACIÓN: ");
                equipo.año=teclado.nextLine();
                System.out.print("CIUDAD: ");
                equipo.ciudad=teclado.nextLine();
                System.out.print("SIGLAS: ");
                equipo.siglas=teclado.nextLine();
                equipo.id = Integer.valueOf(values[0]);

                outputStream.write(equipo.id + files.SEPARATOR + equipo.nombre + files.SEPARATOR + equipo.año + files.SEPARATOR + equipo.ciudad + files.SEPARATOR + equipo.siglas + "\n");
            } else {
                outputStream.write(line + "\n");
            }
        }

        outputStream.close();
        inputStream.close();

        tmpFile.renameTo(file);

    }

    public void modificarParticipantes() throws IOException {
        files.ruta="Participantes";

        File file = new File(files.ruta);
        File tmpFile = new File(files.ruta + "tmp");

        BufferedReader inputStream = new BufferedReader(new FileReader(file));
        BufferedWriter outputStream = new BufferedWriter(new FileWriter(tmpFile));


        System.out.print("Dime el ID del equipo que quieres modificar: ");
        int idModificar=teclado.nextInt();

        String line;
        while((line = inputStream.readLine()) != null){
            String[] values = line.split(files.SEPARATOR);

            if(Integer.valueOf(values[0]) == idModificar){
                teclado.nextLine();
                System.out.print("NOMBRE: ");
                participante.nombre=teclado.nextLine();
                System.out.print("APELLIDOS: ");
                participante.apellidos=teclado.nextLine();
                System.out.print("CIUDAD: ");
                participante.ciudad=teclado.nextLine();
                participante.id = Integer.valueOf(values[0]);

                outputStream.write(participante.id + files.SEPARATOR + participante.nombre + files.SEPARATOR + participante.apellidos + files.SEPARATOR + participante.ciudad + "\n");
            } else {
                outputStream.write(line + "\n");
            }
        }

        outputStream.close();
        inputStream.close();

        tmpFile.renameTo(file);
    }
}
