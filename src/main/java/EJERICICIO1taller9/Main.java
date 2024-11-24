/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package EJERICICIO1taller9;

/**
 *
 * @author asd
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Persona persona = new Persona("Jhon Arrieta", 30);

        Empleado empleado = new Empleado("Alexis Cera", 18, "Ventas");

        System.out.println("Detalles de la Persona:");
        persona.mostrarDetalles();

        System.out.println("\nDetalles del Empleado:");
        empleado.mostrarDetalles();
    }
    
}
