# PREGUNTAS: LISTAS EN JAVA

## 1. Evaluación diagnóstica: conocimientos sobre arreglos

**Objetivo:** Identificar los conocimientos previos de los estudiantes sobre los arreglos en Java, antes de iniciar el tema de las listas.

**Preguntas:**

**1. ¿Qué es un arreglo en Java?**

- A) Una estructura que almacena varios elementos.
- B) Un tipo de operador.
- C) Una instrucción para imprimir.

**2. ¿Desde qué posición empiezan los índices de un arreglo?**

- A) 1
- B) 0
- C) -1

**3. ¿Cómo se obtiene la longitud de un arreglo?**

- A) size()
- B) get()
- C) length

**4. ¿Un arreglo cambia su tamaño automáticamente?**

- A) Sí.
- B) No.
- C) Siempre que se utilice un ciclo for.

**5. ¿Qué estructura permite recorrer los elementos de un arreglo?**

- A) Un ciclo for.
- B) Un comentario.
- C) Una clase abstracta.

**6. ¿Cómo se declara un arreglo de números enteros en Java?**

- A) int numeros;
- B) int[] numeros;
- C) numeros int[];

---

## 2. Preguntas de participación

**Objetivo:** Comprobar la comprensión de los conceptos básicos de las listas en Java mediante preguntas orales.

**1. Si tenemos una lista de cinco estudiantes y llega uno nuevo, ¿qué necesitamos hacer?**

**2. ¿Podemos eliminar un elemento de una lista?**

**3. ¿Los elementos de una lista tienen posiciones?**

**4. ¿Desde qué número comienzan los índices de una lista?**

---

## 3. Mini evaluación: tipos de listas en Java

**Objetivo:** Evaluar los conocimientos adquiridos sobre la interfaz List y sus principales implementaciones: ArrayList, LinkedList y Vector.

**Pregunta 1. ¿Cuál de estas implementaciones utiliza un arreglo dinámico?**

- A) ArrayList.
- B) LinkedList.
- C) Ninguna.

**Pregunta 2. ¿Cuál de estas implementaciones utiliza nodos enlazados?**

- A) Vector.
- B) LinkedList.
- C) ArrayList.

**Pregunta 3. ¿Cuál tiene sus métodos principales sincronizados?**

- A) ArrayList.
- B) LinkedList.
- C) Vector.

**Pregunta 4. ¿Qué es List en Java?**

- A) Un ciclo.
- B) Una interfaz.
- C) Una variable.

---

## 4. Reto de programación

**Objetivo:** Aplicar los métodos principales de ArrayList mediante un ejercicio práctico.

**Enunciado:**

Crear una lista de números enteros y realizar las siguientes operaciones:

1. Declarar una lista de números enteros.
2. Agregar los números 10, 20 y 30.
3. Cambiar el número 20 por 50.
4. Eliminar el número 10.
5. Mostrar cuántos elementos quedan en la lista.

**Código esperado:**

```java
import java.util.ArrayList;

public class RetoNumeros {
    public static void main(String[] args) {

        ArrayList<Integer> numeros = new ArrayList<>();

        numeros.add(10);
        numeros.add(20);
        numeros.add(30);

        numeros.set(1, 50);

        numeros.remove(Integer.valueOf(10));

        System.out.println("Lista: " + numeros);
        System.out.println("Cantidad: " + numeros.size());
    }
}
```

**Resultado esperado:**

```text
Lista: [50, 30]
Cantidad: 2
```

---

## 5. Respuestas de las evaluaciones

### 5.1. Respuestas de la evaluación diagnóstica

| Pregunta | Respuesta correcta |
|---|---|
| 1 | A) Una estructura que almacena varios elementos. |
| 2 | B) 0 |
| 3 | C) length |
| 4 | B) No |
| 5 | A) Un ciclo for |
| 6 | B) int[] numeros; |

### 5.2. Respuestas de participación

| Pregunta | Respuesta |
|---|---|
| 1 | Agregar al nuevo estudiante a la lista. |
| 2 | Sí, se pueden eliminar elementos. |
| 3 | Sí, cada elemento tiene una posición. |
| 4 | Desde cero. |

### 5.3. Respuestas de la mini evaluación

| Pregunta | Respuesta correcta |
|---|---|
| 1 | A) ArrayList |
| 2 | B) LinkedList |
| 3 | C) Vector |
| 4 | B) Una interfaz |

### 5.4. Resultado del reto de programación

Al finalizar las operaciones, la lista contiene los números 50 y 30.

- Lista final: `[50, 30]`
- Cantidad de elementos: `2`

---

## 6. Conclusión

Las actividades realizadas permiten evaluar los conocimientos previos sobre arreglos y comprobar el aprendizaje de los conceptos relacionados con las listas en Java.

Mediante las preguntas de participación, la mini evaluación y el reto de programación, los estudiantes pueden identificar las diferencias entre ArrayList, LinkedList y Vector, así como comprender la utilización de los métodos principales para administrar los elementos de una lista.
