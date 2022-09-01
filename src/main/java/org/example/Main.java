package org.example;
import clases.Estudiante;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner lea = new Scanner(System.in);
        Estudiante estudiante = new Estudiante();
        estudiante.setNombre(lea.next());
        estudiante.setNotaPromedio(6);

        System.out.println(estudiante.getNombre());
        System.out.println();
    }
}