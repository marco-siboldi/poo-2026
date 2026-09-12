package ar.edu.unlu.poo.clase02.ejercicio01_reactores;

public class Main {
    public static void main(String[] args) {
        System.out.println("Límite de seguridad de la planta: " + Reactor.getTemperaturaMaxima() + " °C"
                + " | alertas en la planta: " + Reactor.getConteoAlertas());

        Reactor reactor1 = new Reactor("R-01", 250.0);
        Reactor reactor2 = new Reactor("R-02", 200.0);
        Reactor reactor3 = new Reactor("R-03", 180.0);

        TableroControl tablero = new TableroControl("Planta Norte");
        tablero.agregarReactor(reactor1);
        tablero.agregarReactor(reactor2);
        tablero.agregarReactor(reactor3);
        System.out.println("Tablero de " + tablero.getNombrePlanta() + " con los reactores asignados");

        reactor1.actualizarTemperatura(280.0);
        mostrar(reactor1);

        try {
            reactor1.actualizarTemperatura(350.0);
        } catch (TemperaturaCriticaException e) {
            System.out.println("Error en " + reactor1.getCodigo() + ": " + e.getMessage());
        }
        mostrar(reactor1); // el objeto quedó consistente aunque haya lanzado
        System.out.println("Alertas en la planta: " + Reactor.getConteoAlertas());

        try {
            reactor1.actualizarTemperatura(360.0);
        } catch (TemperaturaCriticaException e) {
            System.out.println("Error en " + reactor1.getCodigo() + ": " + e.getMessage());
        }
        System.out.println("Alertas en la planta (sin re-contar): " + Reactor.getConteoAlertas());

        reactor1.actualizarTemperatura(120.0);
        mostrar(reactor1);

        // El límite es de la planta (static): bajarlo afecta a todos los reactores
        Reactor.setTemperaturaMaxima(190.0);
        System.out.println("Nuevo límite de seguridad: " + Reactor.getTemperaturaMaxima() + " °C");
        try {
            reactor2.actualizarTemperatura(200.0); // 200 era seguro con el límite anterior
        } catch (TemperaturaCriticaException e) {
            System.out.println("Error en " + reactor2.getCodigo() + ": " + e.getMessage());
        }
        mostrar(reactor2);
        reactor3.actualizarTemperatura(185.0);
        mostrar(reactor3);
        System.out.println("Alertas en la planta (suma de todos los reactores): " + Reactor.getConteoAlertas());

        // Argumentos inválidos
        try {
            tablero.agregarReactor(null);
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
        try {
            reactor3.actualizarTemperatura(null);
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
        try {
            Reactor.setTemperaturaMaxima(null);
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    private static void mostrar(Reactor reactor) {
        System.out.println(reactor.getCodigo() + " -> temperatura: " + reactor.getTemperatura()
                + " °C | en alerta: " + reactor.isEnAlerta());
    }
}
