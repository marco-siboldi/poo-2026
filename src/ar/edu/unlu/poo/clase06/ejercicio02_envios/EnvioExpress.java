package ar.edu.unlu.poo.clase06.ejercicio02_envios;

public class EnvioExpress extends Envio{

    private static final double TARIFA_PREFERENCIAL_POR_KM = 90.0;
    private static final double COSTO_DESPACHO_PRIORITARIO = 500.0;

    public EnvioExpress(double peso, double distanciaARecorrer) {
        super(peso, distanciaARecorrer);
    }

    @Override
    public double calcularCosto() {
        double distancia = getDistanciaARecorrer();
        return distancia * TARIFA_PREFERENCIAL_POR_KM + COSTO_DESPACHO_PRIORITARIO;
    }
}
