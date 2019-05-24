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

    public String[][] listarEquipo() throws IOException {

        files.ruta="Equipos";

        File file = new File(files.ruta);

        int numEquipos = getNumPartic();
        int numcolumnas = getNumColumn();
        String[][] equipos = new String[numEquipos][numcolumnas];

        BufferedReader inputStream = new BufferedReader(new FileReader(file));

        String line;
        int j=0;
        while((line = inputStream.readLine()) != null){
            String[] values = line.split(files.SEPARATOR);

            for (int k = 0; k <equipos[j].length ; k++) {
                equipos[j][k]=values[k];
            }
            j++;

        }

        inputStream.close();

        return equipos;

    }

    public String[][] listarParticipantes() throws IOException {
        files.ruta="Participantes";
        File file = new File(files.ruta);

        int numParticipantes = getNumPartic();
        int numcolumnas = getNumColumn();
        String[][] participantes = new String[numParticipantes][numcolumnas];

        BufferedReader inputStream = new BufferedReader(new FileReader(file));

        String line;
        int j=0;
        while((line = inputStream.readLine()) != null){
            String[] values = line.split(files.SEPARATOR);

            for (int k = 0; k <participantes[j].length ; k++) {
                participantes[j][k]=values[k];
            }
            j++;

        }

        inputStream.close();

        return participantes;
    }

    public int[] listarIdEquipo() throws IOException {

        files.ruta="Equipos";

        File file = new File(files.ruta);

        int numEquipos = getNumPartic();
        int[] id = new int[numEquipos];

        BufferedReader inputStream = new BufferedReader(new FileReader(file));

        int i=0;
        String line;
        while((line = inputStream.readLine()) != null){
            String[] values = line.split(files.SEPARATOR);

            id[i]=Integer.parseInt(values[0]);
            i++;
        }

        inputStream.close();

        return id;

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
