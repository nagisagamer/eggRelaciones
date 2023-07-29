/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package metodos;

import Objetos.Perro;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;
import persona.Persona;

/**
 *
 * @author Usuario
 */
public class Metodos {

    Scanner leer = new Scanner(System.in);
    private ArrayList<Perro> Perros;
    private ArrayList<Perro> PerrosAdoptados;
    private ArrayList<Persona> PersonasSolas;
    private ArrayList<Persona> PersonasPerrunas;

    public Metodos() {
    }

    public Metodos(ArrayList<Perro> Perros, ArrayList<Persona> PersonasSolas, ArrayList<Persona> PersonasPerrunas, ArrayList<Perro> PerrosAdoptados) {
        this.Perros = Perros;
        this.PersonasSolas = PersonasSolas;
        this.PersonasPerrunas = PersonasPerrunas;
        this.PerrosAdoptados = PerrosAdoptados;
    }

    public void Llenarlistas() {
        //lista perros
        Perros = new ArrayList();
        Perro p1 = new Perro("Pancho", "Coquer", "mediano", 5);
        Perro p2 = new Perro("Moli", "Boxer", "grande", 10);
        Perro p3 = new Perro("C", "Coquer", "mediano", 5);
        Perro p4 = new Perro("D", "Boxer", "grande", 10);
        Perro p5 = new Perro("Goofy", "Coquer", "mediano", 5);
        Perro p6 = new Perro("Yuma", "Boxer", "grande", 10);
        Perros.add(p1);
        Perros.add(p2);
        Perros.add(p3);
        Perros.add(p4);
        Perros.add(p5);
        Perros.add(p6);
        //lista personas
        PersonasSolas = new ArrayList();
        Persona P1 = new Persona("Ariel", "A", 1234567, 25);
        Persona P2 = new Persona("Camila", "B", 1234561, 22);
        Persona P3 = new Persona("Pao", "C", 1234568, 30);
        Persona P4 = new Persona("Laureano", "D", 1234569, 26);
        PersonasSolas.add(P1);
        PersonasSolas.add(P2);
        PersonasSolas.add(P3);
        PersonasSolas.add(P4);
    }

    public void Cargarpersona() {
//        System.out.println("Para adoptar un perro rellene el sig formulario");
//        System.out.println("-------------------------------------------------");
//        Persona P1 = new Persona();
//        System.out.println("Nombre y apellido: ");
//        P1.setNombre(leer.next());
//        P1.setApellido(leer.next());
//        System.out.println("DNI: ");
//        P1.setDNI(leer.nextInt());
//        System.out.println("Edad: ");
//        P1.setEdad(leer.nextInt());
//        PersonasSolas.add(P1);
    }

    public void Mostrarperros() {
        Perros.forEach((e) -> System.out.println(e));
    }

    public void Mostrarpersonas() {
        for (Persona p : PersonasSolas) {
            System.out.println(p);
        }
    }

    public void Adopcion() {
        PersonasPerrunas = new ArrayList();
        PerrosAdoptados = new ArrayList();
        System.out.println("Identifiquese como alguien de esta lista");
        this.Mostrarpersonas();
        String nomPersona = leer.next();

        for (Persona Person : PersonasSolas) {
            if (Person.getNombre().equalsIgnoreCase(nomPersona)) {
                System.out.println("De los perros de la lista cual desea adoptar: ");
                this.Mostrarperros();
                String nomperro = leer.next();
                for (Perro Perro1 : Perros) {
                    if (Perro1.getNombre().equalsIgnoreCase(nomperro)) {
                        Person.setPerro(Perro1);
                        this.PersonasPerrunas.add(Person);
                        this.PerrosAdoptados.add(Perro1);
                        System.out.println("El perro fue adoptado");
                    }

                }
            }

        }

    }

    public void Compararlistas() {
        for (Iterator <Persona> iterator = PersonasSolas.iterator(); iterator.hasNext();) {
            Persona Persona = iterator.next();
            if (PersonasPerrunas.contains(Persona)) {
                iterator.remove();
                //PersonasSolas.remove(Persona);
            }
        }
         for (Iterator <Perro> iterator = Perros.iterator(); iterator.hasNext();) {
            Perro Perro = iterator.next();
            if (PerrosAdoptados.contains(Perro)) {
                iterator.remove();
               
            }
        }
         
    }

    public void MostrarPersonasPerrunas() {
        PersonasPerrunas.forEach((e) -> System.out.println(e));
    }

    public void MostrarPAdoptados() {
        PerrosAdoptados.forEach((e) -> System.out.println(e));
    }
}
