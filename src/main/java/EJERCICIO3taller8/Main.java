/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package EJERCICIO3taller8;

/**
 *
 * @author asd
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Empleado empleado = new Empleado("Juan Pérez", 2500.0);

        Gerente gerente = new Gerente("Ana López", 5000.0, "Ventas");

        System.out.println("Detalles del Empleado:");
        empleado.mostrarDetalles();

        System.out.println("\nDetalles del Gerente:");
        gerente.mostrarDetalles();
    }
    
}
