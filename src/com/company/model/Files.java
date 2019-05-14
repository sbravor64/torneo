package com.company.model;

import java.io.File;

 public class Files {
    public String SEPARATOR;
    public String nombre;

    public void crearFicheros(String ruta){
        File file = new File(ruta);
    }
}
