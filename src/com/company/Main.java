package com.company;

import com.company.manager.*;
import com.company.model.*;
import com.company.view.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        MenuPrincipal menuPrincipal = new MenuPrincipal();
        menuPrincipal.show();
        Files crearFile = new Files();

        crearFile.crearFicheros("equipo");


    }
}
