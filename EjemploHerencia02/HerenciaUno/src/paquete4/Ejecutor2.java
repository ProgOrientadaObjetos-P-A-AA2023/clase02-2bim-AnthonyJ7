/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete4;

/**
 *
 * @author reroes
 */
public class Ejecutor2 {
    public static void main(String[] args) {
        // 1. Crear y presentar un obj de tipo Estudiante Presencial
        
        String nombre = "Jhordy";
        String apellido = "Agila";
        String identificacion = "1150256673";
        int edad = 18;
        
        EstudiantePresencial estPresencial = new EstudiantePresencial(nombre, apellido, identificacion, edad);
        
        estPresencial.establecerNumeroCreditos(20);
        estPresencial.establecerCostoCredito(15);
        estPresencial.calcularMatriculaPresencial();
        
        System.out.println(estPresencial);
        
        
    }
}
