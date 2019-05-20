package com.company.model;

import java.io.File;
import java.io.IOException;

public class Files {
    public String SEPARATOR = ";";
    public String ruta;

    public void crearEquipos(){
        File fichero = new File(ruta="Equipos");

        try {
            // A partir del objeto File creamos el fichero físicamente
            if (fichero.createNewFile())
                System.out.println("El fichero Equipos se ha creado correctamente");
            else
                System.out.println();
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
    }

    public void crearParticipantes(){
        File fichero = new File(ruta="Participantes");

        try {
            // A partir del objeto File creamos el fichero físicamente
            if (fichero.createNewFile())
                System.out.println("El fichero Participantes se ha creado correctamente");
            else
                System.out.println();
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
    }
}
