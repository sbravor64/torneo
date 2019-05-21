package com.company.view;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import com.company.manager.*;
import com.company.model.Files;

public class MenuEquipo {
    void show() throws IOException {
        Scanner sc = new Scanner(System.in);
        Inscribir inscribir = new Inscribir();
        Modificar modificar = new Modificar();
        Borrar borrar = new Borrar();
        Listar listar = new Listar();


        System.out.println("1. Equipo");
        System.out.println("    1. Inscribir");
        System.out.println("    2. Modificar");
        System.out.println("    3. Borrar");
        System.out.println("    4. Listar");
        System.out.println("    5. Salir");

        int opcion = sc.nextInt();
        switch (opcion) {
            case 1:
                inscribir.inscribirEquipo();
                break;
            case 2:
                modificar.modificarEquipo();
                break;
            case 3:
                borrar.borrarEquipo();
                break;
            case 4:
                listar.listarEquipo();
                break;
            case 5:
                break;
        }
        if (opcion != 5) {show();}

    }
}
