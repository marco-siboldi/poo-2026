# Ejercicio 0 (Demo Guiada): El Registro de Temperatura

## Contexto

Este ejercicio sirve para romper el hielo y dar los primeros pasos en la
Programación Orientada a Objetos (POO). Se desarrollará en conjunto con el
docente en la pizarra/pantalla para introducir los conceptos básicos.

## Enunciado

En una aplicación meteorológica, necesitamos registrar las temperaturas de
diferentes ciudades.

Con el enfoque de la programación estructurada, los programadores guardan estos
datos en variables numéricas simples (como `double` o `float`). Sin embargo,
manipular información en estas variables tiene dos problemas:

1. Permite guardar valores imposibles (por ejemplo, temperaturas por debajo del
   cero absoluto: -273.15 °C).
2. Es fácil confundirse y mezclar un número que representa una temperatura con
   un número que representa otra medida (como una altura o un precio).

Para resolver esto, modelaremos la temperatura utilizando nuestro propio tipo de
dato (orientado a objetos).

### Tareas

- Diseñe una clase llamada `Temperatura` en Java.
- Asegúrese de que no se puedan crear temperaturas físicamente imposibles
  (menores a -273.15 °C).
- Agregue un mecanismo para poder obtener esa misma temperatura expresada en
  grados Fahrenheit.
- Diseñe una clase `ReporteMeteorologico` que asocie una ciudad con su
  temperatura actual.

## Tips y Buenas Prácticas

- **El Constructor como Guardián**: Use el constructor para validar los datos que
  entran. Si el dato es incorrecto, detenga la creación del objeto.
- **Evite los números sueltos**: Prefiera crear clases específicas para conceptos
  importantes de su negocio en lugar de usar números (`double`, `int`) sueltos
  por todos lados.

## Preguntas Conceptuales

Al finalizar la demostración, discuta con el docente:

1. ¿Cuál es la diferencia real entre la "clase" `Temperatura` y un "objeto"
   temperatura que creamos con la palabra `new`?
2. ¿Por qué es más seguro usar una clase `Temperatura` dentro de un reporte en
   lugar de usar un simple `double`?

## Para profundizar

- El tipo de dato `double` se llama tipo primitivo. Existen muchos otros
  primitivos. Investigue en Internet los tipos primitivos de Java y verifique si
  se podría haber utilizado otro diferente. ¿Fue correcto usar `double`?

- Ideas introducidas en el ejericio: Clase, Objeto/Instancia, Constructor, Tipos
  primitivos. ¿Se pueden escribir Clases sin constructores? ¿Como se crean los
  diferentes objetos en esos casos?

- Si `double` es un tipo primitivo, llamamos tipos definidos por el usuario a
  `Temperatura`. ¿Porque es importante la distinción? Reflexione acerca de las
  similitudes y diferencias respecto a los `struct` de C.

## Repasar brevemente

- ¿A que se llama getter en el contexto de los objetos/clases?
- Comenzar a leer como funcionan las excepciones y porque son importantes
