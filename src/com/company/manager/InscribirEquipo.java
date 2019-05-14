package com.company.manager;

import com.company.model.Files;

import javax.security.sasl.SaslClient;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

public class InscribirEquipo {
    Files file = new Files();
    Scanner teclado = new Scanner(System.in);

    public void inscribir() {
        String nombre=teclado.nextLine();
        String ciudad=teclado.nextLine();
        String  siglas=teclado.nextLine();

        BufferedWriter ficherosalida = new BufferedWriter(("equipo", true));

        ficherosalida.write(nombre + file.SEPARATOR + ciudad + file.SEPARATOR + siglas);
        ficherosalida.close();

    }



}
