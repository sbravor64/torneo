package com.company.view;

import java.util.Scanner;
import com.company.manager.*;

public class MenuClasificacion {
    void show() {
        Scanner sc = new Scanner(System.in);
        Clasificar clasificar = new Clasificar();

        System.out.println("4. Clasificacion");
        System.out.println("    1. Por equipos");
        System.out.println("    2. Por participantes");
        System.out.println("    3. Salir");

        int opcion = sc.nextInt();
        switch (opcion) {
            case 1:
                //clasificar.porEquipos();
                break;
            case 2:
                clasificar.porParticipantes();
                break;
            case 3:
                break;
        }

    }
}
