/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.relacioneseje1;

import java.util.Scanner;
import metodos.Metodos;

/**
 *
 * @author Usuario
 */
public class RelacionesEJE1 {

    public static void main(String[] args) {
      //Falta Remover de la lista al perro y persona que ya adoptaron
        //Falta mostrar si no se pudo hacer el proceso
           Scanner leer = new Scanner(System.in);
    Metodos m = new Metodos();
    int op;
    m.Llenarlistas();
    do {
        System.out.println("MENU");
        System.out.println("1. Cargar persona");
        System.out.println("2. Adoptar un perro");
        System.out.println("3. Mostrar personas con sus mascotas adoptadas");
        System.out.println("4. Mostrar personas solas");
        System.out.println("5. Mostrar perros en adopción");
        System.out.println("6. Mostrar perros ya adoptados");
        System.out.println("7. Salir del menú");
        System.out.println("Ingrese una opción: ");
        op = leer.nextInt();

        switch (op) {
            case 1:
                System.out.println("Cargar nueva persona a la lista de adoptantes");
                m.Cargarpersona();
                System.out.println("Persona cargada exitosamente.");
                break;
            case 2:
                System.out.println("Proceso de adopción");
                m.Adopcion();
                m.Compararlistas();
                System.out.println("Adopción realizada con éxito.");
                break;
            case 3:
                System.out.println("Personas que ya adoptaron con sus mascotas:");
                m.MostrarPersonasPerrunas();
                break;
            case 4:
                System.out.println("Las personas disponibles para ser adoptantes:");
                m.Mostrarpersonas();
                break;
            case 5:
                System.out.println("Los perros en adopción son los siguientes:");
                m.Mostrarperros();
                break;
            case 6:
                System.out.println("Los perros ya adoptados son los siguientes:");
                m.MostrarPAdoptados();
                break;
            case 7:
                System.out.println("Saliendo del menú");
                System.out.println("Adopte, no compre!!!");
                break;
            default:
                System.out.println("Ingrese una opción válida.");
        }
        System.out.println(); // Agregar una línea en blanco para mejorar la legibilidad
    } while (op != 7);
}}