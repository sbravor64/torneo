package com.company.view;

import com.company.manager.*;

import java.io.IOException;
import java.util.Scanner;

public class MenuResultado {
    void show() throws IOException {
        Scanner sc = new Scanner(System.in);
        Introducir introducir = new Introducir();
        System.out.println("3. Resultado");
        System.out.println("    1. Introducir resultado");
        System.out.println("    2. Salir");

        int opcion = sc.nextInt();
        switch (opcion) {
            case 1:
                introducir.introducirResultado();
                break;
            case 2:
                break;
        }
        if (opcion != 2) {show();}

    }
}
