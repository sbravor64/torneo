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

    public String[][] listarParticipantes() throws IOException {
        files.ruta="Participantes";
        File file = new File(files.ruta);

        int numParticipantes = getNumPartic();
        int numcolumnas = getNumColumn();
        String[][] participantes = new String[numParticipantes][numcolumnas];

        BufferedReader inputStream = new BufferedReader(new FileReader(file));

        String line;
        int i=0;
        while((line = inputStream.readLine()) != null){
            String[] values = line.split(files.SEPARATOR);

            participantes[i][0]=values[0];
            participantes[i][1]=values[1];
            participantes[i][2]=values[2];
            participantes[i][3]=values[3];

        }

        inputStream.close();

        return participantes;
    }


    int getNumPartic() throws IOException {
        int num=0;
        BufferedReader inputStream = new BufferedReader(new FileReader(files.ruta));
        String line;
        while((line = inputStream.readLine()) != null){
            String[] values = line.split(files.SEPARATOR);
            num++;
        }
        inputStream.close();
        return num;
    }

    int getNumColumn() throws IOException {
        int num=0;
        BufferedReader inputStream = new BufferedReader(new FileReader(files.ruta));
        String line;
        if((line = inputStream.readLine()) != null){
            String[] values = line.split(files.SEPARATOR);
            for (int i = 0; i <values.length ; i++) {
                num++;
            }
        }
        inputStream.close();
        return num;
    }
}
