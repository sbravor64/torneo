package com.company.manager;

import com.company.model.Files;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.Scanner;

public class BorrarEquipo {
    Files file = new Files();
    Scanner teclado = new Scanner(System.in);

    public void borrar() {
        String nombre=teclado.nextLine();
        String ciudad=teclado.nextLine();
        String  siglas=teclado.nextLine();

        BufferedWriter ficherosalida = new BufferedWriter(new FileWriter("equipo");

        ficherosalida.write(nombre + file.SEPARATOR + ciudad + file.SEPARATOR + siglas);
        ficherosalida.close();

    }
}
