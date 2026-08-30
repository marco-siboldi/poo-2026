# Ejercicio 3: Cursos e Inscripciones

## Contexto

En este ejercicio integraremos los conceptos centrales de la Clase 2:
encapsulamiento, desambiguación con `this`, atributos globales de clase
(`static`) para métricas de plataforma y validación estricta de invariantes de
negocio.

## Enunciado

Una plataforma de educación en línea gestiona la inscripción de alumnos a sus
cursos.

Cada Estudiante (`Estudiante`) posee un legajo universitario único y un nombre.
Cada Curso (`Curso`) posee un código, un nombre, un cupo máximo de alumnos y
almacena sus inscripciones. Además, la clase `Curso` lleva el conteo global de
todas las inscripciones realizadas a través de toda la plataforma mediante un
atributo de clase `static`. Una Inscripción (`Inscripcion`) vincula a un
`Estudiante` con un `Curso` y registra la fecha de alta.

### Tareas

1. Diseñe la clase `Estudiante` en Java.
2. Diseñe la clase `Inscripcion` que reciba al `Estudiante` y al `Curso` en su
   constructor.
3. Diseñe la clase `Curso` ofreciendo el método `inscribir(Estudiante estudiante)`
   que:
   - Instancie la `Inscripcion` enviándose a sí mismo como parámetro (`this`).
   - Valide que no se haya alcanzado el cupo máximo del curso (de lo contrario,
     lanzar `CupoExcedidoException`).
   - Valide que el estudiante no esté inscripto previamente en este curso (de lo
     contrario, lanzar `EstudianteYaInscriptoException`).
   - Incremente el contador global `static` de inscripciones de la plataforma.

## Restricciones y Tips

- **Uso de `this`**: Al instanciar la `Inscripcion` desde `Curso`, pase la
  autorreferencia `this` para vincular el curso.
- **Atributo Estático**: El acumulador `totalInscripcionesPlataforma` debe ser
  miembro de clase (`static`).
- **Protección de Lista**: No exponga la lista editable interna de inscripciones
  del curso al cliente externo.

## Preguntas Conceptuales

Al finalizar el ejercicio, reflexione sobre las siguientes preguntas:

1. ¿De qué manera ayuda la palabra reservada `this` al instanciar
   `new Inscripcion(estudiante, this)` dentro de la clase `Curso`?
2. ¿Por qué el conteo global de inscripciones pertenece a la clase `Curso` como
   atributo `static` en lugar de residir como atributo de instancia en cada
   `Inscripcion` individual?
