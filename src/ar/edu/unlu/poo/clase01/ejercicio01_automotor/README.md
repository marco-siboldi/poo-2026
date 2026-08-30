# Ejercicio 1: El Automóvil y su Motor

## Contexto

En este ejercicio práctico trabajaremos con la interacción básica entre
diferentes objetos en nuestro código y cómo se reparten las responsabilidades
respetando el encapsulamiento.

## Enunciado

Estamos construyendo una aplicación para un sistema de gestión de flotas de
vehículos. Necesitamos calcular el consumo estimado de combustible para realizar
un viaje.

1. El Motor (`Motor`) conoce su cilindrada en litros y su factor de eficiencia.
   La fórmula para estimar el consumo de combustible en litros para una
   distancia dada es:

   `Consumo = (Cilindrada × 0.05 + Factor de Eficiencia) × (Distancia en Km / 100)`

2. El Viaje (`Viaje`) registra la distancia a recorrer en kilómetros y cuenta con
   un `Motor` asociado.

### Tareas

- Diseñe las clases `Motor` y `Viaje` en Java.
- El viaje necesitará colaborar con el motor para obtener el consumo total de
  combustible requerido.
- **Regla de Diseño Estricta**: Está prohibido que la clase `Viaje` pida los
  atributos de la cilindrada o el factor de eficiencia a `Motor` para realizar el
  cálculo del consumo por su cuenta.

## Tips y Buenas Prácticas

- **Variables privadas**: Mantenga los datos internos protegidos (`private`).
- **Responsabilidades y Delegación**: Intente que cada clase resuelva lo que le
  corresponde. Evite que una clase "extraiga" datos de otra para realizar
  cálculos matemáticos que la clase dueña de los datos podría resolver por sí
  misma (Enfoque Tell, Don't Ask).

## Preguntas Conceptuales

Al finalizar el ejercicio, discuta con su docente:

1. ¿Por qué es mejor pedirle al motor que nos dé la estimación de consumo para la
   distancia dada en lugar de pedirle sus partes (cilindrada y eficiencia) para
   calcularlo desde la clase viaje?
2. Si en el futuro se cambia la fórmula de consumo del motor (por ejemplo,
   agregando un modo eléctrico híbrido), ¿qué clases del sistema tendríamos que
   modificar en cada caso?
