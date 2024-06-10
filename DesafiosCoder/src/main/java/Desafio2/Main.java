package Desafio2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Persona> personas = new ArrayList<>();

        personas.add(new Persona("Pepito", "Suarez"));
        personas.add(new Persona("Maria","Delbarrio"));
        personas.add(new Persona("Federico", "Martinez"));
        personas.add(new Persona("Florencia", "Rodriguez"));
        personas.add(new Persona("Juanito", "Perez"));

        // Ordenar y mostrar la lista por nombre
        personas.sort(Comparator.comparing(Persona::getNombre));
        System.out.println("Personas de la lista ordenada por nombre:");
        for (Persona persona : personas) {
            System.out.println(persona.getNombre());
        }

        // Ordenar y mostrar la lista por apellido
        personas.sort(Comparator.comparing(Persona::getApellido));
        System.out.println("\nPersonas de la lista ordenada por apellido:");
        for (Persona persona : personas) {
            System.out.println(persona.getApellido());
        }

        // Ordenar y mostrar la lista por apellido de forma inversa
        personas.sort(Comparator.comparing(Persona::getApellido).reversed());
        System.out.println("\nPersonas de la lista ordenada inversamente por apellido:");
        for (Persona persona : personas) {
            System.out.println(persona.getApellido());
        }
    }
}
