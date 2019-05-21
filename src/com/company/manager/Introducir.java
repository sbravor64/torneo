package com.company.manager;

import com.company.model.*;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Introducir {
    public void introducirResultado() throws IOException {
        Files files = new Files();
        Scanner teclado = new Scanner(System.in);

        files.ruta="Resultado";

        System.out.print("IDJugador1: ");
        String idjugador1 = teclado.nextLine();
        System.out.print("PuntosJ1: ");
        String puntosj1=teclado.nextLine();
        System.out.print("IDJugador2: ");
        String idjugador2=teclado.nextLine();
        System.out.print("PuntosJ2: ");
        String puntosj2 = teclado.nextLine();


        BufferedWriter bw = new BufferedWriter(new FileWriter(files.ruta, true));
        bw.write(idjugador1 + files.SEPARATOR + puntosj1 + files.SEPARATOR + idjugador2 + files.SEPARATOR + puntosj2 + "\n");
        bw.close();
    }
}
