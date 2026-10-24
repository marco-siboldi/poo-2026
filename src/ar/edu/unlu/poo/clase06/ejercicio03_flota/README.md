# Ejercicio 3: Flota de Vehículos de Alquiler (super)

## Contexto

En este ejercicio aprenderemos a reutilizar el comportamiento de la clase padre
extendiéndolo mediante la invocación explícita a `super.metodo()`, evitando
duplicar lógica de negocio base.

## Enunciado

Una empresa de alquiler de automóviles administra su flota de Vehículos
(`Vehiculo`).
Todo vehículo alquilado calcula su tarifa base en función de los días de
alquiler multiplicados por su tarifa diaria estándar.

Existen tipos de vehículos específicos:

- **Auto VIP** (`AutoVIP`): Invoca la tarifa base del vehículo y le suma un
  costo fijo adicional por seguro premium.
- **Camioneta** (`Camioneta`): Invoca la tarifa base del vehículo y le suma un
  recargo proporcional a los kg de carga declarados.

Una Reserva (`Reserva`) relaciona la cantidad de días solicitados con el
vehículo contratado.

### Tareas

1. Diseñe la clase base `Vehiculo` con su método `calcularTarifa(int dias)`.
2. Diseñe las subclases `AutoVIP` y `Camioneta` sobreescribiendo
   `calcularTarifa(int dias)` e invocando explícitamente a
   `super.calcularTarifa(dias)`.
3. Diseñe la clase `Reserva` que delegue el cálculo del monto total al vehículo
   inyectado.

## Restricciones y Tips

- **Prohibición de Duplicación**: Está prohibido re-multiplicar los días por la
  tarifa diaria dentro de las subclases. Debe llamarse a
  `super.calcularTarifa(dias)`.

## Preguntas Conceptuales

Al finalizar el ejercicio, reflexione sobre las siguientes preguntas:

1. ¿Qué beneficio de mantenibilidad aporta llamar a `super.calcularTarifa(dias)`
   si mañana la empresa decide aplicar un descuento global por cantidad de días
   en la clase base `Vehiculo`?
2. ¿Qué ocurriría si olvidamos la palabra reservada `super.` y llamamos a
   `calcularTarifa(dias)` desde dentro del propio método `calcularTarifa` de la
   subclase?
