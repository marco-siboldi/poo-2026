package ar.edu.unlu.poo.clase05.ejercicio01_billetera;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class BilleteraTest {

    private Billetera billetera;

    @BeforeEach
    public void setUp() {
        billetera = new Billetera();
        billetera.abrirCuenta("ARS");
    }

    @Test
    public void testAbrirCuenta_ValidoEInvalido () {
        assertEquals(0.0, billetera.getSaldo("ARS"));

        assertThrows(IllegalArgumentException.class, () -> billetera.abrirCuenta(""));

    }

    @Test
    public void testCuentaDuplicada() {
        assertThrows(CuentaDuplicadaException.class, () -> billetera.abrirCuenta("ARS"));
    }

    @Test
    public void testExtraerYDepositarSaldo() {
        assertEquals(0.0, billetera.getSaldo("ARS"));
        billetera.depositar("ARS", 1000.0);
        billetera.extraer("ARS", 500.0);
        assertEquals(500.0, billetera.getSaldo("ARS"));

    }

    @Test
    public void testOperacionesEnCuentasNoRegistradas() {
        assertThrows(IllegalArgumentException.class, () -> billetera.depositar("EUR", 1000.0));
    }


}
