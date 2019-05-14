package com.company.manager;

import com.company.model.Files;

import javax.security.sasl.SaslClient;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Inscribir {
    Files files = new Files();
    Scanner teclado = new Scanner(System.in);

    public void inscribir(String ruta) throws IOException {
        String nombre=teclado.nextLine();
        String ciudad=teclado.nextLine();
        String  siglas=teclado.nextLine();

        FileWriter fw=new FileWriter(ruta);
        BufferedWriter bw = new BufferedWriter(fw);

        bw.write(nombre + files.SEPARATOR + ciudad + files.SEPARATOR + siglas);
        bw.close();

    }



}
