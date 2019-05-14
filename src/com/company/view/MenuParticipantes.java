package com.company.view;

import java.util.Scanner;

import com.company.manager.*;

public class MenuParticipantes {
    void show() {
        Scanner sc = new Scanner(System.in);
        InscribirParticipantes inscribirParticipantes = new InscribirParticipantes();
        ModificarParticipantes modificarParticipantes = new ModificarParticipantes();
        BorrarParticipantes borrarParticipantes = new BorrarParticipantes();
        ListarParticipantes listarParticipantes = new ListarParticipantes();


        System.out.println("1. Participantes");
        System.out.println("    1. Inscribir");
        System.out.println("    2. Modificar");
        System.out.println("    3. Borrar");
        System.out.println("    4. Listar");
        System.out.println("    5. Salir");

        int opcion = sc.nextInt();
        switch (opcion) {
            case 1:
                inscribirParticipantes.inscribir();
                break;
            case 2:
                modificarParticipantes.modificar();
                break;
            case 3:
                borrarParticipantes.borrar();
                break;
            case 4:
                listarParticipantes.listar();
                break;
            case 5:
                break;
        }
    }
}
