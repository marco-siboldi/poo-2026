# Ejercicio 2: El Registro de Mascotas y Consultas VetCare

## Contexto

En este ejercicio aprenderemos a modelar relaciones estructurales de asociación
de conocimiento entre múltiples clases del dominio, respetando el ocultamiento de
información (information hiding) y validando invariantes con excepciones.

## Enunciado

Una clínica veterinaria ("VetCare") necesita gestionar el registro de las
consultas médicas realizadas a sus pacientes.

Cada Mascota (`Mascota`) posee un código de microchip único, nombre, especie (ej.
Canino, Felino) y edad. Cada Veterinario (`Veterinario`) posee una matrícula
profesional y su nombre. Una Consulta Médica (`ConsultaMedica`) actúa como
asociación que relaciona a una `Mascota` atendida por un `Veterinario`,
registrando el diagnóstico y el costo de la atención.

La Clínica Veterinaria (`ClinicaVeterinaria`) administra las mascotas registradas
y el historial de consultas.

### Tareas

1. Diseñe las clases `Mascota`, `Veterinario` y `ConsultaMedica` garantizando que
   todos sus atributos sean privados.
2. Diseñe la clase `ClinicaVeterinaria` que permita:
   - `registrarMascota(Mascota m)`: Agrega una nueva mascota al sistema de la
     clínica.
   - `registrarConsulta(Mascota m, Veterinario v, String diagnostico, double costo)`:
     Crea y almacena una nueva consulta médica.
   - `getConsultasPorMascota(String chip)`: Retorna la lista de todas las
     consultas médicas realizadas a una mascota identificada por su microchip.

## Restricciones y Tips

- **Validaciones de Registro**:
  - Al registrar una consulta, se debe verificar que la mascota esté previamente
    registrada en la clínica. Si no lo está, se debe lanzar
    `MascotaNoEncontradaException`.
  - El costo de la consulta debe ser estrictamente mayor a cero. Si se ingresa un
    costo menor o igual a cero, se debe lanzar `CostoInvalidoException`.
- **Ocultamiento de Información**: La clase `ClinicaVeterinaria` no debe retornar
  referencias directas de sus listas de mascotas o historial de consultas.

## Preguntas Conceptuales

Al finalizar el ejercicio, reflexione sobre las siguientes preguntas:

1. ¿Por qué es una buena práctica de encapsulamiento que `ClinicaVeterinaria`
   entregue listas no modificables o copias de sus consultas en lugar de retornar
   directamente su atributo `historialConsultas`?
2. ¿Qué tipo de asociación existe entre `ConsultaMedica`, `Mascota` y
   `Veterinario` en el modelo de dominio?
3. ¿De que objeto es la responsabilidad de controlar que el costo sea mayor a
   cero?
