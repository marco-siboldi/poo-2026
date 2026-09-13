package ar.edu.unlu.poo.clase02.ejercicio02_vetcare;

public class ConsultaMedica {
    private Mascota mascotaAtendida;
    private Veterinario veterinarioACargo;
    private String diagnostico;
    private double costo;

    public ConsultaMedica(Mascota mascotaAtendida, Veterinario veterinarioACargo,  String diagnostico, double costo) {
        this.mascotaAtendida = mascotaAtendida;
        this.veterinarioACargo = veterinarioACargo;
        this.diagnostico = diagnostico;
        if(costo <= 0){
            throw new CostoInvalidoException("El costo debe ser mayor a cero.");
        }
        this.costo = costo;
    }

    public Mascota getMascotaAtendida() {
        return mascotaAtendida;
    }

    public Veterinario getVeterinarioACargo() {
        return veterinarioACargo;
    }

    public double getCosto() {
        return costo;
    }

    public String getDiagnostico() {
        return diagnostico;
    }
}
