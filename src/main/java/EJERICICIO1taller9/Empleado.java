/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EJERICICIO1taller9;

/**
 *
 * @author asd
 */
public class Empleado extends Persona {
    private String departamento;

    public Empleado(String nombre, int edad, String departamento) {
        super(nombre, edad); // Llamada al constructor de Persona
        this.departamento = departamento;
    }

    @Override
    public void mostrarDetalles() {
        super.mostrarDetalles(); // Llamada al método mostrarDetalles de Persona
        System.out.println("Departamento: " + departamento);
    }
}

