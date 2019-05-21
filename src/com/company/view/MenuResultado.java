package com.company.view;

import com.company.manager.*;

import java.io.IOException;
import java.util.Scanner;

public class MenuResultado {
    void show() throws IOException {
        Scanner sc = new Scanner(System.in);
        Introducir introducir = new Introducir();

        while(true) {
            System.out.println("\033[92m3. Resultado\033[0m");
            System.out.println("    1. Introducir resultado");
            System.out.println("    2. Salir");

            int opcion = sc.nextInt();
            sc.nextLine();
            switch (opcion) {
                case 1:
                    System.out.print("IDJugador1: ");
                    String idjugador1 = sc.nextLine();
                    System.out.print("PuntosJ1: ");
                    String puntosj1 = sc.nextLine();
                    System.out.print("IDJugador2: ");
                    String idjugador2 = sc.nextLine();
                    System.out.print("PuntosJ2: ");
                    String puntosj2 = sc.nextLine();

                    introducir.introducirResultado(idjugador1, puntosj1, idjugador2, puntosj2);
                    break;
                case 2:
                    return;
            }
        }



    }
}
