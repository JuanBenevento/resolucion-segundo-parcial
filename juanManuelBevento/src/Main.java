import modelos.ExcepcionKit;
import modelos.Registro;
import servicios.SSMServicio;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws ExcepcionKit, FileNotFoundException {
        SSMServicio smmservicio = new SSMServicio(5);
        Map<Integer, Registro> teasteados = new HashMap<>();


        smmservicio.registrarPersona("Sergio", "Pettis", 25, "Las Lilas", "408899666", "Arquitecto");
        smmservicio.registrarPersona("Lautaro", "Gomez", 29, "Libertad", "4533399", "Albañil");
        smmservicio.registrarPersona("Cristian", "Lugano", 18, "Jara", "785551112", "Guardavidas");
        smmservicio.registrarPersona("Alberto", "Fernandez", 42, "Los Troncos", "365655535", "Ingeniero");

        smmservicio.mostrarLista();
        smmservicio.testear(teasteados);

        smmservicio.registrarPersona("Luis", "Perez", 32, "La Perla", "23252525", "Juez");

        //smmservicio.registrarPersona("Alejandro", "Perez", 45, "Etchepare", "23252525", "Operador");

        //smmservicio.registrarPersona("Alejandro", "Perez", 45, "Etchepare", "2366665566", "Operador");

        smmservicio.aislar(teasteados);


    }
}