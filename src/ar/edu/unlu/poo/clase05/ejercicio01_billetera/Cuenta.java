package ar.edu.unlu.poo.clase05.ejercicio01_billetera;

public class Cuenta {
    private final String divisa;
    private double saldo;
    public Cuenta(String divisa) {
        this.divisa = divisa.toUpperCase().strip();
        this.saldo = 0.0;
    }

    public void depositar(double valor){
        if(valor <= 0){
            throw new IllegalArgumentException("El valor debe ser mayor o igual a 0.");
        }
        this.saldo += valor;
    }

    public void extraer(double valor) {
        if(valor <= 0){
            throw new IllegalArgumentException("El valor debe ser mayor o igual a 0.");
        }
        if(valor > this.saldo){
            throw new SaldoInsuficienteException("El valor a extraer debe ser mayor al saldo.");
        }
        this.saldo -= valor;
    }


    public double getSaldo() {
        return saldo;
    }
    public String getDivisa() {
        return divisa;
    }


}
