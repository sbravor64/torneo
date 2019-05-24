package com.company.manager;

import com.company.model.Equipo;
import com.company.model.Files;

import java.io.*;

public class Clasificar {
    Files files = new Files();
    Listar listar = new Listar();
    public void porEquipos() throws IOException {
        /* files.SEPARATOR=";";
        files.ruta="Equipos";
        File fileE = new File(files.ruta);
        BufferedReader rdE = new BufferedReader(new FileReader(fileE));
        BufferedWriter wrE = new BufferedWriter(new FileWriter(fileE));

        files.ruta="Participantes";
        File fileP = new File(files.ruta);
        BufferedReader rdP = new BufferedReader(new FileReader(fileP));

        files.ruta="Resultado";
        File fileR = new File(files.ruta);
        BufferedReader rdR = new BufferedReader(new FileReader(fileR));

        String line;
        while((line = rdE.readLine()) != null){
            String[] equipo = line.split(files.SEPARATOR);
            while((line = rdP.readLine()) != null) {
                String[] participante = line.split(files.SEPARATOR);
                while((line = rdR.readLine()) != null) {
                    String[] resultado = line.split(files.SEPARATOR);

                    if (Integer.valueOf(equipo[0]) == Integer.valueOf(participante[4])) {
                        if(Integer.valueOf(participante[0])==Integer.valueOf(resultado[0]) || Integer.valueOf(participante[0])==Integer.valueOf(resultado[3])){
                        }
                    }
                }
            }
        } */


        String[][] equipos = listar.listarEquipo();
        String[][] participantes = listar.listarParticipantes();

        for (int j = 0; j <equipos[0].length ; j++) {
            for (int k = 0; k <participantes[5].length ; k++) {
                if(Integer.valueOf(String.valueOf(equipos[0][j])) == Integer.valueOf(String.valueOf(participantes[5][k]))){

                }
            }
        }

    }

    public void porParticipantes() {
    }
}
