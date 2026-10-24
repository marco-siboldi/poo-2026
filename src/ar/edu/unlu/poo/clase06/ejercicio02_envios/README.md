# Ejercicio 2: Sistema de Envíos y Tarifas (LSP)

## Contexto

En este ejercicio ejercitaremos el diseño de jerarquías de herencia cohesivas
donde distintas modalidades de servicio extienden la lógica base sin alterar el
contrato esperado por las clases clientes.

## Enunciado

Una Empresa de Logística (`EmpresaLogistica`) administra el cálculo de costos
para diferentes tipos de Envíos (`Envio`).

Todos los envíos poseen un peso en kg y una distancia a recorrer en km.

Existen 3 tipos de envíos:

1. **Envío Estándar** (`EnvioEstandar`): Multiplica la distancia por una tarifa
   fija por km ($50/km). Si el peso supera los 10 kg, suma un recargo del 20%
   sobre el total.
2. **Envío Express** (`EnvioExpress`): Multiplica la distancia por una tarifa
   preferencial por km ($90/km) y suma un costo fijo de despacho prioritario
   ($500) independientemente del peso.
3. **Envío Internacional** (`EnvioInternacional`): Calcula el costo como un
   envío estándar pero añade una tasa aduanera fija.

La `EmpresaLogistica` administra una lista de envíos y debe poder calcular el
costo total del servicio prestado.

### Tareas

1. Diseñe la jerarquía de herencia con la superclase `Envio` y sus subclases.
2. Implemente en las subclases la sobreescritura del método `calcularCosto()`
   reutilizando adecuadamente la lógica base.
3. Diseñe `EmpresaLogistica` con la operación `calcularCostoTotal()`.

## Restricciones y Tips

- **Uso de Visibilidad Adaptada**: Utilice modificadores de visibilidad
  `protected` para los atributos comunes en la superclase `Envio` o provea
  getters protegidos.
- **Polimorfismo**: `EmpresaLogistica` no debe conocer si un envío es estándar,
  express o internacional; únicamente invoca `envio.calcularCosto()`.

## Preguntas Conceptuales

Al finalizar el ejercicio, reflexione sobre las siguientes preguntas:

1. ¿Por qué es conceptualmente erróneo definir los atributos específicos (como
   la tasa aduanera) en la superclase `Envio`?
2. ¿Qué ocurriría si una subclase rompiera el Principio de Sustitución de
   Liskov lanzando una excepción inesperada para un parámetro válido?
