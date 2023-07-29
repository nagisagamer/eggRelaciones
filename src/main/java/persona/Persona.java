/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package persona;

import Objetos.Perro;
import java.util.Objects;

/**
 *
 * @author Usuario
 */
public class Persona {
     //nombre, apellido, edad, documento y Perro
    private String nombre, apellido;
    private Integer DNI, edad;
    private Perro perro;

    public Persona() {
    }

    public Persona(String nombre, String apellido, Integer DNI, Integer edad, Perro perro) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.DNI = DNI;
        this.edad = edad;
        this.perro = perro;
    }

    public Persona(String nombre, String apellido, Integer DNI, Integer edad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.DNI = DNI;
        this.edad = edad;
       
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public Integer getDNI() {
        return DNI;
    }

    public void setDNI(Integer DNI) {
        this.DNI = DNI;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public Perro getPerro() {
        return perro;
    }

    public void setPerro(Perro perro) {
        this.perro = perro;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 19 * hash + Objects.hashCode(this.nombre);
        hash = 19 * hash + Objects.hashCode(this.apellido);
        hash = 19 * hash + Objects.hashCode(this.DNI);
        hash = 19 * hash + Objects.hashCode(this.edad);
        hash = 19 * hash + Objects.hashCode(this.perro);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Persona other = (Persona) obj;
        if (!Objects.equals(this.nombre, other.nombre)) {
            return false;
        }
        if (!Objects.equals(this.apellido, other.apellido)) {
            return false;
        }
        if (!Objects.equals(this.DNI, other.DNI)) {
            return false;
        }
        if (!Objects.equals(this.edad, other.edad)) {
            return false;
        }
        return Objects.equals(this.perro, other.perro);
    }

    @Override
    public String toString() {
        return  nombre  + apellido + " con DNI " + DNI + " de " + edad + " años tiene un " + perro;
    }
    
}
