package ar.edu.unlu.poo.clase06.ejercicio02_envios;

public class EnvioEstandar extends Envio {

    private static final double TARIFA_POR_KM = 50.0;
    private static final double RECARGO_PESO = 0.2;
    private static final double PESO_LIMITE_RECARGO = 10.0;
    public EnvioEstandar(double peso, double distanciaARecorrer) {
        super(peso, distanciaARecorrer);
    }

    @Override
    public double calcularCosto() {
        double peso = getPeso();
        double distancia = getDistanciaARecorrer();
        double costo = distancia * TARIFA_POR_KM;

        if(peso > PESO_LIMITE_RECARGO) {
            costo += costo * RECARGO_PESO;
        }

        return costo;
    }
}
