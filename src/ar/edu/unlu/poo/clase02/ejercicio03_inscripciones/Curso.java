package ar.edu.unlu.poo.clase02.ejercicio03_inscripciones;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Curso {

    private final String codigo;
    private String nombre;
    private int maximaCantidadEstudiantes;
    private List<Inscripcion> inscripciones;

    private static int totalInscripcionesPlataforma = 0;

    public Curso(String codigoCurso, String nombreCurso, int maximaCantidadEstudiantes) {
        if(maximaCantidadEstudiantes < 1) {
            throw new IllegalArgumentException("El maximo de inscripciones debe ser al menos 1.");
        }
        this.codigo = codigoCurso;
        this.nombre = nombreCurso;
        this.maximaCantidadEstudiantes = maximaCantidadEstudiantes;
        this.inscripciones = new ArrayList<>();
    }

    private boolean estaInscripto (Estudiante estudiante) {
        for (Inscripcion inscripcionAux : this.inscripciones){
            if (estudiante.equals(inscripcionAux.getEstudiante())) {
                return true;
            }
        }
        return false;
    }

    public void inscribir (Estudiante estudiante){
        if(this.inscripciones.size() < this.maximaCantidadEstudiantes){
            if(!estaInscripto(estudiante)){
                Inscripcion inscripcion = new Inscripcion(estudiante, this);
                this.inscripciones.add(inscripcion);
                totalInscripcionesPlataforma++;
            }
            else {
                throw new EstudianteYaInscriptoException("El estudiante " + estudiante.getNombre() + " ya está inscripto.");
            }
        } else {
            throw new CupoExcedidoException("El curso tiene el cupo máximo de estudiantes.");
        }
    }

    public static int getTotalInscripcionesPlataforma() {
        return totalInscripcionesPlataforma;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public int getMaximaCantidadEstudiantes() {
        return maximaCantidadEstudiantes;
    }

    public int getCantidadInscriptos() {
        return this.inscripciones.size();
    }

    public List<Inscripcion> getInscripciones() {
        return Collections.unmodifiableList(inscripciones);
    }



}
