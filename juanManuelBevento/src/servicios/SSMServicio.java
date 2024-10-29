package servicios;

import modelos.ExcepcionKit;
import modelos.ExcepcionTempreaturaMayor;
import modelos.Persona;
import modelos.Registro;

import java.io.FileNotFoundException;
import java.util.*;

public class SSMServicio {

    private Integer cantidadKits;
    private Integer contadorKit = 1;
    private Queue<Persona> personas = new LinkedList<>();
    private Set<String> dnisRegistrados = new HashSet<>();

    public SSMServicio(Integer cantidadInicialKits) {
        this.cantidadKits = cantidadInicialKits;
    }

    public void registrarPersona(String nombre, String apellido, Integer edad, String barrio, String dni, String ocupacion) throws ExcepcionKit, ExcepcionKit {
        if (dnisRegistrados.contains(dni)) {
            System.out.println("Error, el DNI ya esta registrado.");
            return;
        }

        if (cantidadKits <= 0) {
            throw new ExcepcionKit("No hay disponibilidad de reactivos para el test.");
        }

        Persona persona = new Persona(nombre, apellido, edad, barrio, dni, ocupacion, contadorKit++);
        personas.add(persona);
        dnisRegistrados.add(dni);
        cantidadKits--;

        System.out.println("La persona se registro correctamente. Numero de kit asignado: " + persona.getNumeroKit());
    }

    public void agregarReactivos(Integer cantidad) {
        cantidadKits += cantidad;
        System.out.println("Cantidad de reactivos actualizada." + cantidadKits);
    }

    public void mostrarLista(){
        for (Persona persona : personas) {
            System.out.println(persona);
        }
    }

    public void testear(Map<Integer, Registro> tablaTesteados) {
        Random random = new Random();

        for (Persona persona : personas) {
            Double temperatura = 36 + (3 * random.nextDouble());
            Registro registro = new Registro(persona.getDni(), temperatura);
            tablaTesteados.put(persona.getNumeroKit(), registro);
        }

        System.out.println("Testeo completado. Resultados:");
        for (Map.Entry<Integer, Registro> entry : tablaTesteados.entrySet()) {
            System.out.println("Kit #" + entry.getKey() + " - " + entry.getValue());
        }
    }



    public void aislar(Map<Integer, Registro> tablaTesteados) throws FileNotFoundException {
        ArrayList<String> urgentes = new ArrayList<>();
        for (Persona persona : personas) {
            Registro registro = tablaTesteados.get(persona.getNumeroKit());

            if (registro != null && registro.getTemperatura() >= 38) {
                try {
                    throw new ExcepcionTempreaturaMayor(persona.getNumeroKit(), persona.getBarrio());
                } catch (ExcepcionTempreaturaMayor e) {
                    System.out.println(e.getMessage());
                }
            }
        }

    }


    public void mostrarLista(ArrayList<String> urgentes) {
        for (String urgente : urgentes) {
            System.out.println(urgente);
        }
    }

}


