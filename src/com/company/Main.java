package com.company;

import com.company.manager.InscribirEquipo;
import com.company.model.Equipo;
import com.company.model.Files;
import com.company.model.CrearFicheros;
import com.company.model.Participante;
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {

        CrearFicheros ficheros = new CrearFicheros();
        ficheros.newsFiles();
    }
}
