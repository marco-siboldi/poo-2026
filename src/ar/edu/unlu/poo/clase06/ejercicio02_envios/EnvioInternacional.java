package ar.edu.unlu.poo.clase06.ejercicio02_envios;

public class EnvioInternacional extends EnvioEstandar  {

    private static final double TASA_ADUANERA = 150.0;


    public EnvioInternacional(double peso, double distanciaARecorrer) {
        super(peso, distanciaARecorrer);
    }

    @Override
    public double calcularCosto() {
        double costo = super.calcularCosto();
        return costo + TASA_ADUANERA;
    }
}
