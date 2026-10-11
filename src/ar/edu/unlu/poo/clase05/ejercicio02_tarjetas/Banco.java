package ar.edu.unlu.poo.clase05.ejercicio02_tarjetas;

import java.util.ArrayList;
import java.util.List;

public class Banco {
    private final List<Cliente> clientes;
    public Banco() {
        this.clientes = new ArrayList<>();
    }

    public void registrarCliente(String dni, String nombre) {
        Cliente cliente = new Cliente(dni, nombre);
        this.clientes.add(cliente);
    }

    public Cliente buscarCliente(String dni) {
        for (Cliente cliente : this.clientes) {
            if (cliente.getDni().equals(dni)) {
                return cliente;
            }
        }
        throw new IllegalArgumentException("No se encontro el cliente");
    }

}
