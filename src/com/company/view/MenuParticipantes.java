package com.company.view;

import java.io.IOException;
import java.util.Scanner;

import com.company.manager.*;
import com.company.model.Participante;

public class MenuParticipantes {
    void show() throws IOException {
        Scanner sc = new Scanner(System.in);
        Inscribir inscribir = new Inscribir();
        Modificar modificar = new Modificar();
        Borrar borrar = new Borrar();
        Listar listar = new Listar();


        System.out.println("2. Participantes");
        System.out.println("    1. Inscribir");
        System.out.println("    2. Modificar");
        System.out.println("    3. Borrar");
        System.out.println("    4. Listar");
        System.out.println("    5. Salir");

        int opcion = sc.nextInt();
        switch (opcion) {
            case 1:
                inscribir.inscribirParticipantes();
                break;
            case 2:
                modificar.modificarParticipantes();
                break;
            case 3:
                borrar.borrarParticipantes();
                break;
            case 4:
                Participante[] participantes = listar.listarParticipantes();

                for (int i = 0; i < participantes.length; i++) {
                    System.out.println(participantes[i].nombre);
                }
                break;
            case 5:
                break;
        }

    }
}
