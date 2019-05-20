package com.company.model;

import java.util.Scanner;

public class Equipo {
    public String id;
    public String cognoms;
    Scanner teclado = new Scanner(System.in);


    public String nombre=teclado.nextLine();
    public String  siglas=teclado.nextLine();
    public String ciudad=teclado.nextLine();
}
