package ar.edu.unlu.poo.clase06.ejercicio03_flota;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class AutoVIPTest {
    AutoVIP autoVIP;

    @BeforeEach
    public void setUp() {
        // Configuración inicial antes de cada prueba
        autoVIP = new AutoVIP(100.0); // Tarifa diaria estándar de ejemplo
    }

    @Test
    public void testCalcularTarifa() {
        assertEquals(250.0, autoVIP.calcularTarifa(2), 0.001);
    }


    @Test
    public void testCrearVehiculoConTarifaNegativa() {
        assertThrows(IllegalArgumentException.class, () -> {new AutoVIP(-100.0);});
    }


}
