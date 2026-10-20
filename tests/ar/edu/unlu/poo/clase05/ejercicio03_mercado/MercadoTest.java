package ar.edu.unlu.poo.clase05.ejercicio03_mercado;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class MercadoTest {
    private Mercado mercado;

    @BeforeEach
    public void setUp() {
        mercado = new Mercado();
    }

    @Test
    public void testRegistrarCotizacion() {
        mercado.actualizarCotizacion("ARS", 100.0);
        assertEquals(100.0, mercado.getCotizacion("ARS"));
    }

    @Test
    public void testActualizarCotizacionesValidas(){
        mercado.actualizarCotizacion("ARS", 100.0);
        assertEquals(100.0, mercado.getCotizacion("ARS"));
        mercado.actualizarCotizacion("ARS", 200.0);
        assertEquals(200.0, mercado.getCotizacion("ARS"));
    }


    @Test
    public void testActualizarCotizacionesInvalidas(){
        mercado.actualizarCotizacion("ARS", 100.0);
        assertThrows(IllegalArgumentException.class, () -> mercado.actualizarCotizacion("ARS", 0.0));
        assertEquals(100.0, mercado.getCotizacion("ARS"));
        assertThrows(IllegalArgumentException.class, () -> mercado.actualizarCotizacion("ARS", -100.0));
        assertEquals(100.0, mercado.getCotizacion("ARS"));

    }

    @Test
    public void testGetCotizacionDivisaNoCotizadaLanzaExcepcion(){
        mercado.actualizarCotizacion("ARS", 100.0);
        mercado.actualizarCotizacion("EUR", 20.0);
        assertThrows(CotizacionNoEncontradaException.class, () -> mercado.getCotizacion("YEN"));
    }

}
