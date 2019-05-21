package com.company.manager;

import com.company.model.Files;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Introducir {
    public void introducirResultado(String idjugador1, String puntosj1, String idjugador2, String puntosj2) throws IOException {
        Files files = new Files();

        files.ruta="Resultado";

        BufferedWriter bw = new BufferedWriter(new FileWriter(files.ruta, true));
        bw.write(idjugador1 + files.SEPARATOR + puntosj1 + files.SEPARATOR + idjugador2 + files.SEPARATOR + puntosj2 + "\n");
        bw.close();
    }
}
