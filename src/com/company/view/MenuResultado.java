package com.company.view;

import java.util.Scanner;

public class MenuResultado {
    void show() {
        Scanner sc = new Scanner(System.in);

        System.out.println("3. Resultado");
        System.out.println("    1. Introducir resultado");
        System.out.println("    2. Salir");

        int opcion = sc.nextInt();
        switch (opcion) {
            case 1:
                System.out.println("holaequipo1");
                break;
            case 2:
                break;
        }
    }
}
