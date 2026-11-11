package ar.edu.unlu.poo.clase06.ejercicio03_flota;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class CamionetaTest {
    private Camioneta camioneta;

    @BeforeEach
    public void setUp() {
        camioneta = new Camioneta(100.0, 50.0);
    }

    @Test
    public void testCrearCamionetaConPesoInvalido() {
        assertThrows(IllegalArgumentException.class, () -> {
            new Camioneta(100.0, -50.0);
        });
    }

    @Test
    public void testCalcularTarifaCamioneta() {
        double tarifaEsperada = 2 * 100.0 + 50.0 * 10.0; // 2 días * tarifa diaria + costo adicionalal
        double tarifaCalculada = camioneta.calcularTarifa(2);
        assertEquals(tarifaEsperada, tarifaCalculada, 0.001);
    }


}
