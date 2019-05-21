package com.company.manager;

import com.company.model.Equipo;
import com.company.model.Files;
import com.company.model.Participante;

import java.io.*;
import java.util.Scanner;

public class Listar {
    Files files = new Files();
    Equipo equipo = new Equipo();
    Participante participante = new Participante();
    Scanner teclado = new Scanner(System.in);

    public void listarEquipo() throws IOException {

        files.ruta="Equipos";

        File file = new File(files.ruta);

        BufferedReader inputStream = new BufferedReader(new FileReader(file));

        System.out.println("Dime el ID del equipo que quieres mostrar");
        int idMostrar=teclado.nextInt();

        String line;
        while((line = inputStream.readLine()) != null){
            String[] values = line.split(files.SEPARATOR);

            if(Integer.valueOf(values[0]) == idMostrar){
                equipo.id=Integer.valueOf(values[0]);
                equipo.nombre= values[1];
                equipo.año=values[2];
                equipo.ciudad=values[3];
                equipo.siglas=values[4];

                System.out.println("NOMBRE: " + equipo.nombre);
                System.out.println("AÑO DE FUNDACIÓN: " + equipo.año);
                System.out.println("CIUDAD: " + equipo.ciudad);
                System.out.println("SIGLAS: " + equipo.siglas);
            }
        }

        inputStream.close();

    }

    public void listarParticipantes() throws IOException {
        files.ruta="Participantes";

        File file = new File(files.ruta);

        BufferedReader inputStream = new BufferedReader(new FileReader(file));

        System.out.print("Dime el ID del equipo que quieres mostrar: ");
        int idMostrar=teclado.nextInt();

        String line;
        while((line = inputStream.readLine()) != null){
            String[] values = line.split(files.SEPARATOR);

            if(Integer.valueOf(values[0]) == idMostrar){
                participante.id=Integer.valueOf(values[0]);
                participante.nombre= values[1];
                participante.apellidos=values[2];
                participante.ciudad=values[3];

                System.out.println("NOMBRE: " + participante.nombre);
                System.out.println("APELLIDOS: " + participante.apellidos);
                System.out.println("CIUDAD: " + participante.ciudad);
            }
        }

        inputStream.close();
    }
}
