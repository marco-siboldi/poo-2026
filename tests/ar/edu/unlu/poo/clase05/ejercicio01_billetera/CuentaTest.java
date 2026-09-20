package ar.edu.unlu.poo.clase05.ejercicio01_billetera;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class CuentaTest {
    private Cuenta cuenta;

    @BeforeEach
    public void setUp() {
        cuenta = new Cuenta("ARS");
    }

    @Test
    public void testCrearCuenta_saldoInicialCero(){
        assertEquals(0.0, cuenta.getSaldo());
        assertEquals("ARS", cuenta.getDivisa());

        Cuenta cuenta2 = new Cuenta("USD");
        assertEquals("USD", cuenta2.getDivisa());
    }

    @Test
    public void testDepositar_saldoValidoEInvalido() {
        cuenta.depositar(1000.0);
        assertEquals(1000.0, cuenta.getSaldo());

        // valores menores o iguales a 0 deben ser rechazados

        assertThrows(IllegalArgumentException.class, new Executable() {
            @Override
            public void execute() {
                cuenta.depositar(0.0);
            }
        });

        assertThrows(IllegalArgumentException.class, () -> cuenta.depositar(-50.0));

        assertEquals(1000.0, cuenta.getSaldo());
    }

    @Test
    public void testExtraer(){
        cuenta.depositar(1000.0);
        assertEquals(1000.0, cuenta.getSaldo());
        cuenta.extraer(600.0);
        assertEquals(400.0, cuenta.getSaldo());

        assertThrows(SaldoInsuficienteException.class, new Executable() {
            @Override
            public void execute() {
                cuenta.extraer(1000.0);
            }
        });
        assertEquals(400.0, cuenta.getSaldo());

        assertThrows(IllegalArgumentException.class, () -> cuenta.extraer(-50.0));
        assertThrows(IllegalArgumentException.class, () -> cuenta.extraer(0.0));
        assertEquals(400.0, cuenta.getSaldo());
    }




}
