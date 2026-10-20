package ar.edu.unlu.poo.clase05.ejercicio03_mercado;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PortafolioTest {
    private Portafolio portafolio;

    @BeforeEach
    public void setUp() {
        Mercado  mercado = new Mercado();
        portafolio = new Portafolio(mercado);
    }

    @Test
    public void testAgregarPosicionAPortafolio() {
        portafolio.agregarPosicion("ARS", 150.0);

        assertEquals(150.0, portafolio.getPosicion("ARS"));

    }

    @Test
    public void testAcumularPosicionesEnPortafolio() {
        portafolio.agregarPosicion("ARS", 100.0);
        portafolio.agregarPosicion("ARS", 50.0);
        assertEquals(150.0, portafolio.getPosicion("ARS"));
    }

    @Test
    public void testPosicionDeDivisaNoRegistradaEsCero() {
        assertEquals(0.0, portafolio.getPosicion("ARS"));
        assertEquals(0.0, portafolio.getPosicion("USD"));

    }
}
