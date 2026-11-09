package ar.edu.unlu.poo.clase06.ejercicio02_envios;

public abstract class Envio {
    private double peso;
    private double distanciaARecorrer;

    public Envio(double peso, double distanciaARecorrer) {
        this.peso = peso;
        this.distanciaARecorrer = distanciaARecorrer;
    }

    public abstract double calcularCosto();

    protected double getPeso(){
        return this.peso;
    }

    protected double getDistanciaARecorrer(){
        return this.distanciaARecorrer;
    }


}
