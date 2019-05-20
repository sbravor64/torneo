package com.company;

import com.company.manager.*;
import com.company.model.*;
import com.company.view.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        Files files = new Files();
        files.crearEquipos();
        files.crearParticipantes();

        MenuPrincipal menuPrincipal = new MenuPrincipal();
        menuPrincipal.show();

    }
}
