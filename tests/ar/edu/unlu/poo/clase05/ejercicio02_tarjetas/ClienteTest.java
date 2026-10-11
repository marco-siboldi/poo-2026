package ar.edu.unlu.poo.clase05.ejercicio02_tarjetas;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ClienteTest {
    private Cliente cliente;

    @BeforeEach
    public void setUp() {
        cliente = new Cliente("26756875", "Marco");
    }

    @Test
    public void validarCliente() {
        assertEquals("26756875", cliente.getDni());
        assertEquals("Marco", cliente.getNombre());
        assertEquals(0, cliente.getTarjetas().size());
    }

    @Test
    public void validarTarjetas() {
        Tarjeta nuevaTarjeta = new Tarjeta("4321-5432-6543-7654");
        assertThrows(UnsupportedOperationException.class, () -> cliente.getTarjetas().add(nuevaTarjeta));
        assertEquals(0, cliente.getTarjetas().size());
    }
    @Test
    public void agregarTarjeta() {
        Tarjeta nuevaTarjeta = new Tarjeta("1234-2345-3456-4567");
        cliente.agregarTarjeta(nuevaTarjeta);
        assertEquals(1, cliente.getTarjetas().size());
        assertTrue(cliente.getTarjetas().contains(nuevaTarjeta));
    }

}
