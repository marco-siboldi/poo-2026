package ar.edu.unlu.poo.clase06.ejercicio02_envios;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class EmpresaLogisticaTest {

    private EmpresaLogistica empresaLogistica;

    @BeforeEach
    public void setUp() {
        // Configuración inicial antes de cada prueba
        this.empresaLogistica = new EmpresaLogistica();
    }

    @Test
    public void testEmpresaLogisticaVacia() {
        // Verificar que el costo total de una empresa logística vacía sea 0
        double costoTotal = empresaLogistica.calcularCostoTotal();
        assertEquals(0.0, costoTotal, 0.01);
    }

    @Test
    public void testCalcularCostoTotal() {
        // Crear envíos de prueba
        EnvioEstandar envio1 = new EnvioEstandar(10.0, 100.0); // Peso: 10, Distancia: 100
        EnvioInternacional envio2 = new EnvioInternacional(5.0, 200.0); // Peso: 5, Distancia: 200
        EnvioExpress envio3 = new EnvioExpress(8.0, 150.0); // Peso: 8, Distancia: 150
        // Agregar envíos a la empresa logística
        empresaLogistica.agregarEnvio(envio1);
        empresaLogistica.agregarEnvio(envio2);
        empresaLogistica.agregarEnvio(envio3);

        double costoTotal = empresaLogistica.calcularCostoTotal();

        assertEquals(29150.0, costoTotal, 0.01);
    }

    @Test
    public void testPesoExcedidoCobraRecargoEnvioEstandar() {
        EnvioEstandar envio1 = new EnvioEstandar(20.0, 100.0);
        assertEquals(6000, envio1.calcularCosto(), 0.01);
        assertEquals(20.0, envio1.getPeso(), 0.01);
        assertEquals(100.0, envio1.getDistanciaARecorrer(), 0.01);
    }

    @Test
    public void testPesoExcedidoCobraRecargoEnvioInternacional() {
        EnvioEstandar envio1 = new EnvioInternacional(20.0, 200.0);
        assertEquals(12150.0, envio1.calcularCosto(), 0.01);
        assertEquals(20.0, envio1.getPeso(), 0.01);
        assertEquals(200.0, envio1.getDistanciaARecorrer(), 0.01);
    }

    @Test
    public void testEnvioExpress() {
        EnvioExpress envio1 = new EnvioExpress(5.0, 100.0);
        assertEquals(9500.0, envio1.calcularCosto(), 0.01);
        assertEquals(5.0, envio1.getPeso(), 0.01);
        assertEquals(100.0, envio1.getDistanciaARecorrer(), 0.01);
    }

}
