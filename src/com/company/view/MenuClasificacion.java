package com.company.view;

import java.util.Scanner;

public class MenuClasificacion {
    void show() {
        Scanner sc = new Scanner(System.in);

        System.out.println("4. Clasificacion");
        System.out.println("    1. Por equipos");
        System.out.println("    2. Por participantes");
        System.out.println("    3. Salir");

        int opcion = sc.nextInt();
        switch (opcion) {
            case 1:
                System.out.println("holaequipo1");
                break;
            case 2:
                System.out.println("holae2");
                break;
            case 3:
                break;
        }
    }
}
