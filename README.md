# AccesoEvento

Ejercicio de Java para practicar estructuras de selección (`if`/`else`) y operadores lógicos con un ejemplo de acceso a un evento.

## Reglas de acceso

- Una persona de 18 años o más puede entrar si tiene entrada.
- Una persona menor de 18 años puede entrar si tiene entrada y va acompañada por un adulto.
- Si no cumple esas condiciones, el programa deniega el acceso.

## Conceptos que practico

- `Scanner` para leer datos desde la consola.
- `int` para guardar la edad y `boolean` para representar respuestas verdaderas o falsas.
- `if` para preguntar por el acompañamiento solo cuando la persona es menor de edad y tiene entrada.
- `if`/`else` para decidir si permite o deniega el acceso.
- `&&` significa “y”; `||` significa “o”.
- `trim()` quita espacios al principio y al final de una respuesta.
- `equalsIgnoreCase("si")` compara la respuesta con “si” sin distinguir mayúsculas y minúsculas. No acepta “sí” con tilde.

## Métodos usados

El programa empieza en `main`. Dentro se usan métodos de `Scanner` y de `String`:

- `nextInt()`: lee la edad como número entero.
- `nextLine()`: lee una línea de texto. La llamada justo después de `nextInt()` consume el salto de línea pendiente.
- `trim()`: elimina espacios sobrantes alrededor del texto.
- `equalsIgnoreCase()`: compara dos textos ignorando mayúsculas y minúsculas.
- `close()`: cierra el lector al terminar.

## Cómo ejecutarlo

En IntelliJ IDEA, abre `src/AcessoEvento.java` y ejecuta la clase `AcessoEvento`.

## Ejemplo

```text
Introduce tu edad: 16
¿Tienes entrada? (si/no): si
¿Estás acompañado por un adulto? (si/no): si
Puedes acceder al evento.
```
