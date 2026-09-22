package ar.edu.unlu.poo.clase05.ejercicio01_billetera;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Billetera {
    private final List<Cuenta> cuentas;
    public Billetera() {
        cuentas = new ArrayList<>();
    }

    public void abrirCuenta(String divisa) {
        if (divisa == null || divisa.isEmpty()) {
            throw new IllegalArgumentException("La divisa no puede ser nulo");
        }
        if (buscarCuenta(divisa).isPresent()) {
            throw new CuentaDuplicadaException("La cuenta con esa divisa ya existe.");
        }
        cuentas.add(new Cuenta(divisa));
    }

    public double getSaldo(String divisa) {
        return obtenerCuenta(divisa)
                .getSaldo();
    }

    private Optional<Cuenta> buscarCuenta(String divisa) {
/*        for  (Cuenta cuenta : cuentas) {
            if(cuenta.getDivisa().equals(divisa)) {
                return cuenta;
            }
        }
        return null;
*/
        return cuentas.stream()
                .filter(c -> c.getDivisa().equals(divisa))
                .findFirst();
    }

    private Cuenta obtenerCuenta(String divisa) {
        return buscarCuenta(divisa)
                .orElseThrow(() -> new IllegalArgumentException("Divisa no registrada: " + divisa));
    }

    public void depositar(String divisa, double valor) {
        obtenerCuenta(divisa)
                .depositar(valor);
    }

    public void extraer(String divisa, double valor) {
        obtenerCuenta(divisa)
                .extraer(valor);
    }
}
