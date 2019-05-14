package com.company.manager;

import com.company.model.Files;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.Scanner;

public class InscribirParticipantes {
    Files file = new Files();
    Scanner teclado = new Scanner(System.in);

    public void inscribir() {
        String nombre=teclado.nextLine();
        String ciudad=teclado.nextLine();
        String  siglas=teclado.nextLine();

        BufferedWriter ficherosalida = new BufferedWriter(new FileWriter("equipo");

        ficherosalida.write(nombre + file.SEPARATOR + ciudad + file.SEPARATOR + siglas);
        ficherosalida.close();

    }
}
