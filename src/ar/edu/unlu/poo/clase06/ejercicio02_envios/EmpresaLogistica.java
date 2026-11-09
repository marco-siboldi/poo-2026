package ar.edu.unlu.poo.clase06.ejercicio02_envios;

import java.util.ArrayList;
import java.util.List;

public class EmpresaLogistica {
    private List<Envio> envios;

    public EmpresaLogistica() {
        this.envios = new ArrayList<>();
    }


    public void agregarEnvio(Envio envio) {
        this.envios.add(envio);
    }

    public double calcularCostoTotal() {
        double costoTotal = 0.0;
        for (Envio envio : envios) {
            costoTotal += envio.calcularCosto();
        }
        return costoTotal;
    }

}
