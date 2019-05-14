package com.company.view;

import java.util.Scanner;
import com.company.manager.InscribirEquipo;
import com.company.manager.ModificarEquipo;
import com.company.manager.BorrarEquipo;
import com.company.manager.ListarEquipo;



public class MenuEquipo {
    void show() {
        Scanner sc = new Scanner(System.in);
        InscribirEquipo inscribirEquipo = new InscribirEquipo();
        ModificarEquipo modificarEquipo = new ModificarEquipo();
        BorrarEquipo borrarEquipo = new BorrarEquipo();
        ListarEquipo listarEquipo = new ListarEquipo();


        System.out.println("1. Equipo");
        System.out.println("    1. Inscribir");
        System.out.println("    2. Modificar");
        System.out.println("    3. Borrar");
        System.out.println("    4. Listar");
        System.out.println("    5. Salir");

        int opcion = sc.nextInt();
        switch (opcion) {
            case 1:
                inscribirEquipo.inscribir();
                break;
            case 2:
                inscribirEquipo.inscribir();
                break;
            case 3:
                inscribirEquipo.inscribir();
                break;
            case 4:
                inscribirEquipo.inscribir();
                break;
            case 5:
                break;
        }
    };
}
