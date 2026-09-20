package ar.edu.unlu.poo.clase05.ejercicio01_billetera;

public class SaldoInsuficienteException extends RuntimeException {
    public SaldoInsuficienteException(String mensaje) {
        super(mensaje);
    }
}
