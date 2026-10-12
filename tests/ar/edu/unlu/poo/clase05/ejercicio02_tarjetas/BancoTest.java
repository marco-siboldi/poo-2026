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

    @Test
    public void testClienteDuplicadoPorDni(){
        banco.registrarCliente("40543765", "Marco");
        assertThrows(ClienteDuplicadoException.class, () -> banco.registrarCliente("40543765", "Juan"));
        assertEquals("Marco", banco.buscarCliente("40543765").getNombre());
    }

    @Test
    public void testAsociarTarjetaACliente (){
        banco.registrarCliente("40543765", "Marco");
        banco.asociarTarjeta("40543765", "1234-2345-3456-4567");
        Cliente buscar = banco.buscarCliente("40543765");
        assertEquals(1, buscar.getTarjetas().size());
        assertEquals("1234-2345-3456-4567", buscar.getTarjetas().getFirst().getNumero());
    }


    @Test
    public void testAsociarTarjetaACliente_inexistente(){
        banco.registrarCliente("40543765", "Marco");
        assertThrows(IllegalArgumentException.class, () -> banco.asociarTarjeta("40543712", "1234-2345-3456-4567"));
    }


}
