/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package EJERCICIO2taller8;

/**
 *
 * @author asd
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Persona persona = new Persona("Juan Pérez", 40);

        Estudiante estudiante = new Estudiante("Ana López", 20, "123456789");

        System.out.println("Información de la Persona:");
        persona.mostrarInformacion();

        System.out.println("\nInformación del Estudiante:");
        estudiante.mostrarInformacion();
    }
    
}
