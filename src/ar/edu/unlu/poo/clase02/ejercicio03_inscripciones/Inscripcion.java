package ar.edu.unlu.poo.clase02.ejercicio03_inscripciones;

import java.time.LocalDate;

public class Inscripcion {
    private final Estudiante estudiante;
    private final Curso curso;
    private final LocalDate fechaAlta;

    public Inscripcion(Estudiante estudiante, Curso curso) {
        this.estudiante = estudiante;
        this.curso = curso;
        this.fechaAlta = LocalDate.now();
    }

    public Estudiante getEstudiante() {
        return estudiante;
    }

    public Curso getCurso() {
        return curso;
    }

    public LocalDate getFechaAlta() {
        return fechaAlta;
    }

}
