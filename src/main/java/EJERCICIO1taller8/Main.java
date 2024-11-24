/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package EJERCICIO1taller8;

/**
 *
 * @author asd
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Vehiculo vehiculo = new Vehiculo("Toyota", 180);

        Coche coche = new Coche("Ford", 220, 4);

        System.out.println("Información del Vehículo:");
        vehiculo.mostrarInformacion();

        System.out.println("\nInformación del Coche:");
        coche.mostrarInformacion();
    }
    
}
