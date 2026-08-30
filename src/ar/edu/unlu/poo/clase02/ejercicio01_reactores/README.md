# Ejercicio 1 (Live Coding): El Tablero de Control de la Planta de Energía

## Contexto

En este ejercicio exploraremos la anatomía de una clase Java, la ocultación de
información mediante visibilidad privada, la desambiguación con `this`, el uso de
variables de clase (`static`) para métricas globales y la asociación entre
objetos.

## Enunciado

Una planta de energía nuclear necesita monitorear la temperatura de sus reactores
en tiempo real.

Cada Reactor (`Reactor`) posee un código identificador, una temperatura actual y
un estado de alerta. En toda la planta existe un límite máximo global de
seguridad de temperatura (compartido por todos los reactores de la planta).
Además, la planta necesita llevar un conteo global de cuántas alertas se han
activado en total.

El Tablero de Control (`TableroControl`) supervisa la lista de reactores
asignados a la planta.

### Tareas

1. Diseñe la clase `Reactor` utilizando visibilidad privada (`private`) para sus
   atributos de instancia y desambiguando los parámetros del constructor con la
   referencia `this`.
2. Utilice atributos y métodos de clase (`static`) para definir el límite de
   temperatura global de seguridad y el contador global de alertas de la planta.
3. Si al actualizar la temperatura de un reactor se supera el límite global de
   seguridad, el reactor debe cambiar su estado a alerta, incrementar el contador
   global de alertas y lanzar una `TemperaturaCriticaException`.
4. Diseñe la clase `TableroControl` que mantenga la asociación de conocimiento
   con la lista de reactores de la planta.

## Restricciones y Tips

- **Encapsulamiento Privado**: Todos los atributos de estado deben ser
  estrictamente privados (`private`).
- **Tipos de Referencia**: Utilice tipos wrapper (`Double`) para representar las
  temperaturas.
- **Uso de Static**: Los métodos y atributos que corresponden a métricas o reglas
  globales de la planta deben declararse con la palabra reservada `static`.

## Preguntas Conceptuales

Al finalizar la demostración, discuta con el docente:

1. ¿Cuál es la diferencia conceptual y en memoria entre un atributo de instancia
   (`temperaturaActual`) y un atributo de clase (`totalAlertasPlanta` declarado
   con `static`)?
2. ¿Por qué es necesario desambiguar con `this.codigo = codigo` en el constructor
   de la clase `Reactor`?
3. ¿Es posible mostrar ejemplos del concepto "ocultamiento de información" en el
   código de la solución? Explique en qué parte del código se puede observar y
   por qué es relevante.
4. ¿Por qué la clase `Reactor` expone un método con comportamiento como
   `actualizarTemperatura(Double)` en lugar de simplemente ofrecer setters
   tradicionales como `setTemperaturaActual(Double)` y `setEnAlerta(boolean)`?
5. ¿Qué consecuencias o limitaciones tiene el uso de atributos y métodos `static`
   (como `limiteTemperaturaSeguridad` y `totalAlertasPlanta`) si el sistema
   necesitara gestionar múltiples plantas de energía independientes en una misma
   ejecución?
6. ¿Se podría utilizar la clase `Temperatura` del ejercicio del primer encuentro?
   Piense las ventajas de hacerlo y si las hubiera, las desventajas.
