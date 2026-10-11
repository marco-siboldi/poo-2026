package ar.edu.unlu.poo.clase05.ejercicio02_tarjetas;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class TarjetaTest {
    private Tarjeta tarjeta;

    @BeforeEach
    public void setUp() {
        tarjeta = new Tarjeta("4405-7773-0025-2324");

    }

    @Test
    public void validarTarjeta() {
        assertEquals("4405-7773-0025-2324", tarjeta.getNumero());
    }
}
