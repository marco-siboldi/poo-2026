package ar.edu.unlu.poo.clase02.ejercicio01_reactores;

public class Reactor {

    private static Double temperaturaMaxima = 300.0;
    private static Integer conteoAlertas = 0;

    private final String codigo; //codigo individual de cada Reactor
    private Double temperaturaActual; //temperatura de cada Reactor
    private boolean enAlerta; //estado de cada Reactor

    public Reactor(String codigo, Double temperatura){
        this.codigo = codigo;
        this.temperaturaActual = temperatura;
        this.enAlerta = false;
    }

    public static void setTemperaturaMaxima(Double temperaturaMaxima){
        if(temperaturaMaxima == null){
            throw new NullPointerException("Temperatura maxima no puede ser null");
        }
        Reactor.temperaturaMaxima = temperaturaMaxima;
    }
    public static Double getTemperaturaMaxima(){
        return temperaturaMaxima;
    }

    public void actualizarTemperatura(Double temperatura){
        if(temperatura == null){
            throw new IllegalArgumentException("Temperatura no puede ser nulo");
        }
        this.temperaturaActual = temperatura;
        if(temperatura > temperaturaMaxima){
            if(!this.enAlerta) {
                this.enAlerta = true;
                conteoAlertas++;
            }
            throw new TemperaturaCriticaException("Temperatura mayor a temperatura Maxima");
        } else {
            this.enAlerta = false;
        }
    }

    public String getCodigo() {
        return this.codigo;
    }

    public Double getTemperatura() {
        return this.temperaturaActual;
    }

    public boolean isEnAlerta() {
        return this.enAlerta;
    }

    public static Integer getConteoAlertas() {
        return conteoAlertas;
    }
}
