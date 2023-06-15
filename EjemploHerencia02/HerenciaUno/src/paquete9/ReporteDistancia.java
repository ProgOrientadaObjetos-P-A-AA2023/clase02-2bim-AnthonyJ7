/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete9;

import java.util.ArrayList;

/**
 *
 * @author reroes
 */
public class ReporteDistancia extends Reporte {

    private ArrayList<EstudianteDistancia> lista;
    private double totalMatriculaDistancia;

    public ReporteDistancia(String nombre, String carrera, String ciclo) {
        super(nombre, carrera, ciclo);

    }

    public void establecerLista(ArrayList<EstudianteDistancia> listado) {
        lista = listado;
    }

    public void establecerTotalMatriculasDistancia() {

        for (int i = 0; i < lista.size(); i++) {
            totalMatriculaDistancia = totalMatriculaDistancia
                    + lista.get(i).obtenerMatriculaDistancia();
        }
    }

    public ArrayList<EstudianteDistancia> obtenerLista() {
        return lista;
    }

    public double obtenerTotalMatriculasDistancia() {
        return totalMatriculaDistancia;
    }

    @Override
    public String toString() {

        
 /*@Override
    public String toString() {
        String cadena = "Lista de Profesores\n";
        for (int i = 0; i < obtenerProfesores().size(); i++) {
            Profesor p = obtenerProfesores().get(i);
            cadena = String.format("%s(%d) %s-%s-%s\n", cadena,
                    i + 1,
                    p.obtenerNombre(),
                    p.obtenerTipo(),
                    p.obtenerCedula());
        }

        return cadena;
    }*/

            String cadena = String.format("%s\nCarrera: %s\nCiclo: %s\n", obtenerNombre(), obtenerCarrera(), obtenerCiclo());
            
            cadena = String.format("%sEstudiante\n", cadena);
            
                for(int i = 0; i < obtenerLista().size(); i++){
                
                    EstudianteDistancia ed = obtenerLista().get(i);
                    
                    cadena = String.format("%s%s", cadena, ed);
                
                }
            cadena = String.format("%s\n"
                    + "El total de matriculas es: %.2f\n",
                    cadena, 
                    obtenerTotalMatriculasDistancia());

        

        return cadena;
    }

}
