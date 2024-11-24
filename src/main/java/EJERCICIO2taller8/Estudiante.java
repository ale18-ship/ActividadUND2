/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EJERCICIO2taller8;

/**
 *
 * @author asd
 */
public class Estudiante extends Persona {
    private String matricula;

    public Estudiante(String nombre, int edad, String matricula) {
        super(nombre, edad); // Llamada al constructor de Persona
        this.matricula = matricula;
    }

    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion(); // Llamada al método mostrarInformacion de Persona
        System.out.println("Matrícula: " + matricula);
    }
}
