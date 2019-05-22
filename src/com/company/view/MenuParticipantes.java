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
        sc.nextLine();
        switch (opcion) {
            case 1:
                System.out.print("NOMBRE: ");
                String nombre=sc.nextLine();
                System.out.print("APELLIDOS: ");
                String apellidos=sc.nextLine();
                System.out.print("CIUDAD: ");
                String ciudad=sc.nextLine();

                inscribir.inscribirParticipantes(nombre,apellidos,ciudad);
                break;
            case 2:

                System.out.print("Dime el ID del participante que quieres modificar: ");
                int idModificar=sc.nextInt();
                sc.nextLine();
                System.out.print("NOMBRE: ");
                nombre=sc.nextLine();
                System.out.print("APELLIDOS: ");
                apellidos=sc.nextLine();
                System.out.print("CIUDAD: ");
                ciudad=sc.nextLine();

                modificar.modificarParticipantes(idModificar,nombre,apellidos,ciudad);
                break;
            case 3:

                System.out.print("Dime el ID del participante que quieres borrar: ");
                int idBorrar=sc.nextInt();

                borrar.borrarParticipantes(idBorrar);
                break;
            case 4:
                Participante[] participantes = listar.listarParticipantes();

                for (int i = 0; i < participantes.length; i++) {
                    System.out.print(participantes[i].id + " ");
                    System.out.print(participantes[i].nombre + " ");
                    System.out.print(participantes[i].apellidos+ " ");
                    System.out.print(participantes[i].ciudad+ " ");
                    System.out.println();
                }

                break;
            case 5:
                break;
        }

    }
}
