package com.company.view;

import java.util.Scanner;

public class MenuEquipo {
    void show() {
        Scanner sc = new Scanner(System.in);

        System.out.println("1. Equipo");
        System.out.println("    1. Inscribir");
        System.out.println("    2. Modificar");
        System.out.println("    3. Borrar");
        System.out.println("    4. Listar");
        System.out.println("    5. Salir");

        int opcion = sc.nextInt();
        switch (opcion) {
            case 1:
                System.out.println("holaequipo1");
                break;
            case 2:
                System.out.println("holae2");
                break;
            case 3:
                System.out.println("holae3");
                break;
            case 4:
                System.out.println("holae4");
                break;
            case 5:
                break;
        }
    };
}