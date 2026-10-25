package ar.edu.unlu.poo.clase06.ejercicio01_tienda;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class VentaTest {

    private Venta venta;

    @BeforeEach
    public void setUp() {
        venta = new Venta();
    }

    @Test
    public void testCalcularTotalConPantalonDeTemporadaAnterior() {
        Pantalon pantalon = new Pantalon("Pantalón de temporada anterior", 10000, true);
        venta.agregarPrenda(pantalon);
        double total = venta.calcularTotal();
        assertEquals(9000, total, 0.01); // 10% de descuento aplicado
    }

    @Test
    public void testVentaMixta() {
        Pantalon pantalon = new Pantalon("Pantalón de temporada anterior", 10000, true);
        Remera remera = new Remera("Remera importada", 8000, true);
        venta.agregarPrenda(pantalon);
        venta.agregarPrenda(remera);
        double total = venta.calcularTotal();
        assertEquals(9000 + 13000, total, 0.01); // 10% de descuento en pantalón y recargo en remera
    }

    @Test
    public void testVentaVacia() {
        double total = venta.calcularTotal();
        assertEquals(0, total, 0.01); // Venta vacía debería dar total 0
    }

    @Test
    public void testRemeraNoImportada() {
        Remera remera = new Remera("Remera nacional", 8000, false);
        venta.agregarPrenda(remera);
        double total = venta.calcularTotal();
        assertEquals(8000, total, 0.01); // Sin recargo por ser nacional
    }

    @Test
    public void testPantalonDeTemporada() {
        Pantalon pantalon = new Pantalon("Pantalón de temporada", 12000, false);
        venta.agregarPrenda(pantalon);
        double total = venta.calcularTotal();
        assertEquals(12000, total, 0.01); // Sin descuento por ser de temporada
    }

}
