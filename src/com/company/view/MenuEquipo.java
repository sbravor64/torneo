package com.company.view;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import com.company.manager.*;
import com.company.model.Equipo;
import com.company.model.Files;

public class MenuEquipo {
    void show() throws IOException {
        Scanner teclado = new Scanner(System.in);
        Equipo equipo = new Equipo();
        Inscribir inscribir = new Inscribir();
        Modificar modificar = new Modificar();
        Borrar borrar = new Borrar();
        Listar listar = new Listar();

        while (true) {
            System.out.println("1. Equipo");
            System.out.println("    1. Inscribir");
            System.out.println("    2. Modificar");
            System.out.println("    3. Borrar");
            System.out.println("    4. Listar");
            System.out.println("    5. Salir");

            int opcion = teclado.nextInt();
            teclado.nextLine();
            switch (opcion) {
                case 1:

                    System.out.print("NOMBRE: ");
                    String nombre = teclado.nextLine();
                    System.out.print("AÑO DE FUNDACIÓN: ");
                    String año = teclado.nextLine();
                    System.out.print("CIUDAD: ");
                    String ciudad = teclado.nextLine();
                    System.out.print("SIGLAS: ");
                    String siglas = teclado.nextLine();
                    int puntos;

                    inscribir.inscribirEquipo(nombre, año, ciudad, siglas, puntos);

                    break;
                case 2:

                    System.out.print("Dime el ID del equipo que quieres modificar: ");
                    int idModificar = teclado.nextInt();
                    teclado.nextLine();

                    System.out.print("NOMBRE: ");
                    nombre = teclado.nextLine();
                    System.out.print("AÑO DE FUNDACIÓN: ");
                    año = teclado.nextLine();
                    System.out.print("CIUDAD: ");
                    ciudad = teclado.nextLine();
                    System.out.print("SIGLAS: ");
                    siglas = teclado.nextLine();

                    modificar.modificarEquipo(idModificar, nombre, año, ciudad, siglas);

                    break;
                case 3:

                    System.out.print("Dime el ID del equipo que quieres borrar: ");
                    int idBorrar = teclado.nextInt();
                    borrar.borrarEquipo(idBorrar);

                    break;
                case 4:
                    String[][] equipos = listar.listarEquipo();

                    System.out.println("ID | NOMBRE | AÑO | CIUDAD | SIGLAS");
                    for (int i = 0; i < equipos.length; i++) {
                        for (int j = 0; j < equipos[i].length; j++) {
                            System.out.print(equipos[i][j] + " | ");
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
