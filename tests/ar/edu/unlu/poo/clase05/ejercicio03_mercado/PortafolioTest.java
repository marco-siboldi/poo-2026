package ar.edu.unlu.poo.clase05.ejercicio03_mercado;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class PortafolioTest {
    private Portafolio portafolio;
    private Mercado mercado;

    @BeforeEach
    public void setUp() {
        mercado = new Mercado();
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

    @Test
    public void testRecibirMercadoNulo() {
        assertThrows(IllegalArgumentException.class, () -> new Portafolio(null));
    }

    @Test
    public void testPosicionesInvalidasMenoresOIgualesACero() {
        portafolio.agregarPosicion("ARS", 150.0);
        assertThrows(IllegalArgumentException.class, () -> portafolio.agregarPosicion("ARS", -100.0));
        assertThrows(IllegalArgumentException.class, () -> portafolio.agregarPosicion("ARS", 0.0));
        assertEquals(150.0, portafolio.getPosicion("ARS"));
    }

    @Test
    public void testCalcularValorTotalEnUSD() {
        mercado.actualizarCotizacion("EUR", 1.1);
        mercado.actualizarCotizacion("ARS", 0.001);
        portafolio.agregarPosicion("EUR", 100.0);
        portafolio.agregarPosicion("ARS", 10000.0);
        assertEquals(120.0, portafolio.calcularValorTotalUSD(), 0.01);
    }

    @Test
    public void testValorTotalReflejaCambioDeCotizacionEnMercado() {
        portafolio.agregarPosicion("ARS", 10000.0);
        mercado.actualizarCotizacion("ARS", 0.001);
        assertEquals(10.0, portafolio.calcularValorTotalUSD(), 0.01);
        mercado.actualizarCotizacion("ARS", 0.0001);
        assertEquals(1.0, portafolio.calcularValorTotalUSD(), 0.01);
    }

    @Test
    public void testCalcularTotalConDivisaNoCotizada() {
        portafolio.agregarPosicion("ARS", 10000.0);
        portafolio.agregarPosicion("JPY", 20000.0);
        mercado.actualizarCotizacion("JPY", 0.1038);
        assertThrows(CotizacionNoEncontradaException.class , () -> portafolio.calcularValorTotalUSD());

    }

}
