package ar.edu.unlu.poo.clase06.ejercicio03_flota;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class ReservaTest {
    Reserva reserva;
    Vehiculo vehiculo;

    @BeforeEach
    public void setUp() {
        vehiculo = new Vehiculo(100.0); // Tarifa diaria estándar de ejemplo
        reserva = new Reserva(vehiculo, 5);
    }

    @Test
    public void testCalcularMontoTotal() {
        double montoTotalEsperado = 5 * 100.0; // 5 días * tarifa diaria
        double montoTotalCalculado = reserva.calcularMontoTotal();
        assertEquals(montoTotalEsperado, montoTotalCalculado, 0.001);
    }

    @Test
    public void testCalcularMontoTotalConCamioneta() {
        Camioneta camioneta = new Camioneta(100.0, 50.0); // Tarifa diaria estándar y costo adicional
        Reserva reservaCamioneta = new Reserva(camioneta, 3);
        double montoTotalEsperado = 3 * 100.0 + 50.0 * 10.0; // 3 días * tarifa diaria + costo por kg
        double montoTotalCalculado = reservaCamioneta.calcularMontoTotal();
        assertEquals(montoTotalEsperado, montoTotalCalculado, 0.001);
    }

    @Test
    public void testCalcularMontoTotalConAutoVIP() {
        AutoVIP autoVIP = new AutoVIP(100.0); // Tarifa diaria estándar
        Reserva reservaAutoVIP = new Reserva(autoVIP, 2);
        double montoTotalEsperado = 2 * 100.0 + 50; // 2 días * tarifa diaria + recargo fijo de AutoVIP
        double montoTotalCalculado = reservaAutoVIP.calcularMontoTotal();
        assertEquals(montoTotalEsperado, montoTotalCalculado, 0.001);
    }

    @Test
    public void testCrearReservaConDiasNegativos() {
        assertThrows(IllegalArgumentException.class, () -> {
            new Reserva(vehiculo, -3);
        });
    }

    @Test
    public void testCrearReservaConVehiculoNulo() {
        assertThrows(IllegalArgumentException.class, () -> {
            new Reserva(null, 3);
        });
    }

}
