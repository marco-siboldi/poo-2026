package ar.edu.unlu.poo.clase02.ejercicio02_vetcare;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ClinicaVeterinaria {
    private final List<ConsultaMedica> historialConsultaMedicas;
    private final List<Mascota> mascotas;

    public ClinicaVeterinaria() {
        this.mascotas = new ArrayList<>();
        this.historialConsultaMedicas = new ArrayList<>();
    }

    public void registrarMascota(Mascota mascota){
        if(mascota == null){
            throw new IllegalArgumentException("La mascota no puede ser null");
        }
            this.mascotas.add(mascota);
    }

    public void registrarConsulta(Mascota m, Veterinario v, String diagnostico, double costo){
        if(!this.mascotas.contains(m)){
            throw new MascotaNoEncontradaException("La mascota no está registrada.");
        }
        ConsultaMedica consulta = new ConsultaMedica(m,v,diagnostico,costo);
        this.historialConsultaMedicas.add(consulta);
    }

    public List<ConsultaMedica> getConsultasPorMascota(String chip){
        List<ConsultaMedica> consultasPorMascota = new ArrayList<>();
        Iterator<ConsultaMedica> iterator = this.historialConsultaMedicas.iterator();
        while(iterator.hasNext()){
            ConsultaMedica consultaMedica = iterator.next();
            if(consultaMedica.getMascotaAtendida().getChip().equals(chip)){
                consultasPorMascota.add(consultaMedica);
            }
        }
        return consultasPorMascota;
    }




}
