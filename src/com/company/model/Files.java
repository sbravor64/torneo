package com.company.model;

import java.io.File;
import java.io.IOException;

public class Files {
    public String SEPARATOR = ";";
    public String ruta;

    public void crear(){
        File fichero = new File(ruta);

        try {
            // A partir del objeto File creamos el fichero físicamente
            if (fichero.createNewFile())
                System.out.println("El fichero se ha creado correctamente");
            else
                System.out.println("El fichero ya ha sido creado");
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
    }
}
