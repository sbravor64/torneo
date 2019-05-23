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

        while (true) {
            System.out.println("2. Participantes");
            System.out.println("    1. Inscribir");
            System.out.println("    2. Modificar");
            System.out.println("    3. Borrar");
            System.out.println("    4. Listar");
            System.out.println("    5. Salir");

            int opcion = sc.nextInt();
            sc.nextLine();
            switch (opcion) {
                case 1:
                    System.out.print("NOMBRE: ");
                    String nombre = sc.nextLine();
                    System.out.print("APELLIDOS: ");
                    String apellidos = sc.nextLine();
                    System.out.print("CIUDAD: ");
                    String ciudad = sc.nextLine();
                    System.out.print("ID del Equipo: ");
                    int idEquipo = sc.nextInt();

                    inscribir.inscribirParticipantes(nombre, apellidos, ciudad, idEquipo);
                    break;
                case 2:

                    System.out.print("Dime el ID del participante que quieres modificar: ");
                    int idModificar = sc.nextInt();
                    sc.nextLine();
                    System.out.print("NOMBRE: ");
                    nombre = sc.nextLine();
                    System.out.print("APELLIDOS: ");
                    apellidos = sc.nextLine();
                    System.out.print("CIUDAD: ");
                    ciudad = sc.nextLine();
                    System.out.print("ID del Equipo: ");
                    idEquipo = sc.nextInt();

                    modificar.modificarParticipantes(idModificar, nombre, apellidos, ciudad, idEquipo);
                    break;
                case 3:

                    System.out.print("Dime el ID del participante que quieres borrar: ");
                    int idBorrar = sc.nextInt();

                    borrar.borrarParticipantes(idBorrar);
                    break;
                case 4:
                    String[][] participantes = listar.listarParticipantes();

                    System.out.println("ID | NOMBRE | APELLIDOS | CIUDAD | ID_EQUIPO");
                    for (int i = 0; i < participantes.length; i++) {
                        for (int j = 0; j < participantes[i].length; j++) {
                            System.out.print(participantes[i][j] + " | ");
                        }
                        System.out.println();
                    }
                    System.out.println();
                    break;
                case 5:
                    return;
            }

        }
    }
}
