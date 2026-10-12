package ar.edu.unlu.poo.clase05.ejercicio02_tarjetas;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Banco {
    private final List<Cliente> clientes;
    public Banco() {
        this.clientes = new ArrayList<>();
    }

    public void registrarCliente(String dni, String nombre) {
        if(buscarPorDni(dni).isPresent()){
            throw new ClienteDuplicadoException("Ya existe un cliente con el dni: " + dni);
        }
        Cliente cliente = new Cliente(dni, nombre);
        this.clientes.add(cliente);
    }

    public Cliente buscarCliente(String dni) {
        return buscarPorDni(dni)
                .orElseThrow(() -> new IllegalArgumentException("No se encontro el cliente"));
    }



    private Optional<Cliente> buscarPorDni(String dni) {
        return clientes.stream().filter(cliente -> cliente.getDni().equals(dni)).findFirst();
    }

    public void asociarTarjeta(String dni, String numeroTarjeta) {
        Cliente c = buscarCliente(dni);
        Tarjeta tarjeta = new Tarjeta(numeroTarjeta);
        c.agregarTarjeta(tarjeta);
    }
}
