package ar.edu.unlu.poo.clase05.ejercicio02_tarjetas;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class BancoTest {
    private Banco banco;

    @BeforeEach
    public void setUp() {
        banco = new Banco();
    }

    @Test
    public void testRegistroDeCliente() {
        banco.registrarCliente("40543765", "Marco");
        Cliente buscar = banco.buscarCliente("40543765");
        assertEquals("Marco", buscar.getNombre());
        assertEquals("40543765", buscar.getDni());
    }

    @Test
    public void testBuscarCliente_inexistente_lanzaExcepcion(){
        banco.registrarCliente("40543765", "Marco");
        assertThrows(IllegalArgumentException.class, () -> banco.buscarCliente("40543743"));
    }

}
