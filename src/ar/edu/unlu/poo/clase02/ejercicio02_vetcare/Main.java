package ar.edu.unlu.poo.clase02.ejercicio02_vetcare;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("Ejercicio02: Clinica Veterinaria\n");

        ClinicaVeterinaria clinica = new ClinicaVeterinaria();
        Veterinario veterinaria = new Veterinario("MP-1234", "Dra. Pérez");

        Mascota firulais = new Mascota("CHIP-001", "Firulais", "Canino", 4);
        Mascota michi = new Mascota("CHIP-002", "Michi", "Felino", 2);
        clinica.registrarMascota(firulais);
        clinica.registrarMascota(michi);

        clinica.registrarConsulta(firulais, veterinaria, "Otitis", 1500);
        clinica.registrarConsulta(michi, veterinaria, "Vacuna antirrábica", 800);
        clinica.registrarConsulta(firulais, veterinaria, "Control de otitis", 1200);

        List<ConsultaMedica> consultasFirulais = clinica.getConsultasPorMascota("CHIP-001");
        System.out.println("Consultas de " + firulais.getNombre() + ": " + consultasFirulais.size());
        for (ConsultaMedica consulta : consultasFirulais) {
            System.out.println("  - " + consulta.getDiagnostico()
                    + " | " + consulta.getVeterinarioACargo().getNombre()
                    + " | $" + consulta.getCosto());
        }
        System.out.println("Consultas de " + michi.getNombre() + ": "
                + clinica.getConsultasPorMascota("CHIP-002").size());

        Mascota desconocida = new Mascota("CHIP-999", "Intruso", "Canino", 1);
        try {
            clinica.registrarConsulta(desconocida, veterinaria, "Control", 500);
        } catch (MascotaNoEncontradaException e) {
            System.out.println("Error: " + e.getMessage());
        }

        try {
            clinica.registrarConsulta(michi, veterinaria, "Gratis", 0);
        } catch (CostoInvalidoException e) {
            System.out.println("Error: " + e.getMessage());
        }

        // La lista devuelta es una copia: modificarla no afecta a la clínica
        consultasFirulais.clear();
        System.out.println("Tras vaciar la lista recibida, la clínica sigue con "
                + clinica.getConsultasPorMascota("CHIP-001").size()
                + " consultas de " + firulais.getNombre());
    }
}
