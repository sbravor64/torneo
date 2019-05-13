package com.company.view;

import java.util.Scanner;

public class MenuPrincipal {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        MenuEquipo menuEquipo = new MenuEquipo();
        System.out.println("TORNEO PLUS");
        System.out.println("  1. Equipos");
        System.out.println("  2. Participantes");
        System.out.println("  3. Resultado");
        System.out.println("  4. Clasificacion");
        System.out.println("  5. Salir");

        int opcion = sc.nextInt();

        switch (opcion) {
            case 1:
                menuEquipo.show();
                break;
            case 2:
                System.out.println("hola");
                break;
            case 3:
                System.out.println("hola");
                break;
            case 4:
                System.out.println("hola");
                break;
            case 5:
                break;
        }
    }
}
