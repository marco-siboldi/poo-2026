package ar.edu.unlu.poo.clase02.ejercicio03_inscripciones;

public class Main {
    public static void main(String[] args) {
        System.out.println("Ejercicio03: Cursos e Inscripciones\n");

        Curso poo = new Curso("POO-01", "Programación Orientada a Objetos", 2);
        Curso algoritmos = new Curso("ALG-01", "Algoritmos", 3);

        Estudiante ana = new Estudiante(1001, "Ana");
        Estudiante bruno = new Estudiante(1002, "Bruno");
        Estudiante carla = new Estudiante(1003, "Carla");

        poo.inscribir(ana);
        poo.inscribir(bruno);
        algoritmos.inscribir(ana);

        mostrar(poo);
        mostrar(algoritmos);
        System.out.println("Inscripciones en toda la plataforma: " + Curso.getTotalInscripcionesPlataforma());

        try {
            poo.inscribir(carla);
        } catch (CupoExcedidoException e) {
            System.out.println("Error: " + e.getMessage());
        }

        try {
            algoritmos.inscribir(new Estudiante(1001, "Ana"));
        } catch (EstudianteYaInscriptoException e) {
            System.out.println("Error: " + e.getMessage());
        }

        // La lista que entrega el curso no se puede modificar desde afuera
        try {
            poo.getInscripciones().clear();
        } catch (UnsupportedOperationException e) {
            System.out.println("Error: la lista de inscripciones de " + poo.getNombre() + " es de solo lectura");
        }

        System.out.println("Inscripciones en toda la plataforma tras los intentos fallidos: "
                + Curso.getTotalInscripcionesPlataforma());
    }

    private static void mostrar(Curso curso) {
        System.out.println(curso.getCodigo() + " - " + curso.getNombre()
                + " (" + curso.getCantidadInscriptos() + "/" + curso.getMaximaCantidadEstudiantes() + ")");
        for (Inscripcion inscripcion : curso.getInscripciones()) {
            System.out.println("  - " + inscripcion.getEstudiante().getNombre()
                    + " (legajo " + inscripcion.getEstudiante().getLegajo() + ")"
                    + " | alta: " + inscripcion.getFechaAlta());
        }
    }
}
