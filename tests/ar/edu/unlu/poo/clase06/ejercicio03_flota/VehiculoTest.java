package ar.edu.unlu.poo.clase06.ejercicio03_flota;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class VehiculoTest {
    Vehiculo vehiculo;

    @BeforeEach
    public void setUp() {
        // Configuración inicial antes de cada prueba
        vehiculo = new Vehiculo(100.0); // Tarifa diaria estándar de ejemplo
    }

    @Test
    public void testCalcularTarifa() {
        assertEquals(200.0, vehiculo.calcularTarifa(2), 0.001);
    }


    @Test
    public void testCrearVehiculoConTarifaNegativa() {
        assertThrows(IllegalArgumentException.class, () -> {new Vehiculo(-100.0);});
    }


}
