/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package EJERCICIO2taller9;

/**
 *
 * @author asd
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Animal animal = new Animal("León");

        Pez pez = new Pez("Salmón", "Agua dulce");

        System.out.println("Detalles del Animal:");
        animal.mostrarEspecie();

        System.out.println("\nDetalles del Pez:");
        pez.mostrarEspecie();
    }
    
}
