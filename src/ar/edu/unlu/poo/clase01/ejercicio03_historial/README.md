# Ejercicio 3: El Historial del Navegador (TAD Pila)

## Contexto

En este ejercicio modelaremos el funcionamiento del botón "Atrás" de un navegador
web mediante una estructura de datos basada en objetos (Pila LIFO - Last In,
First Out) sin utilizar colecciones de Java.

## Enunciado

Cuando un usuario navega por Internet, las páginas web visitadas se acumulan en
el historial de forma que al presionar "Atrás" se regresa inmediatamente a la
última página visitada.

Cada Página Web (`PaginaWeb`) posee una URL y un título descriptivo. El Historial
de Navegación (`HistorialNavegacion`) gestiona las páginas visitadas utilizando
una Pila basada en nodos enlazados internos (`NodoPagina`).

### Tareas

1. Diseñe la clase `PaginaWeb` en Java.
2. Diseñe la clase de implementación interna `NodoPagina` que contenga una
   referencia a una `PaginaWeb` y a su `NodoPagina` inferior en la pila.
3. Diseñe la clase `HistorialNavegacion` con las siguientes operaciones públicas:
   - `visitarPagina(PaginaWeb pagina)`: Apila una nueva página web visitada en el
     tope del historial.
   - `retrocederPagina()`: Desapila y retorna la última página web visitada.
   - `estaVacio()`: Indica si no hay páginas registradas en el historial.
   - `getCantidadPaginas()`: Retorna el número actual de páginas en el historial.

## Restricciones y Tips

- **Prohibición de Colecciones**: No utilice `java.util.Stack`, `List`,
  `ArrayList` ni ninguna otra colección prediseñada de Java.
- **Encapsulamiento del TAD**: Los nodos internos (`NodoPagina`) deben permanecer
  ocultos. La clase `HistorialNavegacion` nunca debe exponer ni recibir objetos
  de tipo `NodoPagina`.
- **Manejo de Excepciones**: Si se intenta invocar `retrocederPagina()` sobre un
  historial vacío, se debe lanzar la excepción del dominio
  `HistorialVacioException`.

## Preguntas Conceptuales

Al finalizar el ejercicio, reflexione sobre las siguientes preguntas:

1. ¿Cómo garantiza el constructor de `HistorialNavegacion` que el objeto nace en
   un estado inicial consistente y válido?
2. ¿Por qué es más seguro lanzar una excepción explícita
   (`HistorialVacioException`) al retroceder en un historial vacío en lugar de
   retornar el valor `null`?
