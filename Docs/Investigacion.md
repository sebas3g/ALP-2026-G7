# INVESTIGACIÓN: LISTAS EN JAVA

## 1. Introducción

En programación, las estructuras de datos permiten almacenar y organizar información para facilitar su utilización dentro de un programa. Una de estas estructuras son las listas, que forman parte del Java Collections Framework y permiten almacenar varios elementos dentro de una misma colección.

Las listas representan una alternativa a los arreglos tradicionales, ya que permiten agregar, eliminar y modificar elementos de manera dinámica, sin tener que establecer un tamaño fijo desde el principio.

En Java existen diferentes implementaciones de listas, entre las principales se encuentran ArrayList, LinkedList y Vector. Cada una posee características particulares que permiten utilizarlas según las necesidades de un programa.

## 2. ¿Qué son las listas en Java?

Una lista es una estructura de datos que permite almacenar y organizar varios elementos dentro de una misma colección.

Sus principales características son:

- **Ordenadas:** mantienen el orden en el que se agregan los elementos.
- **Acceso por índice:** permiten consultar elementos mediante su posición.
- **Permiten duplicados:** un mismo valor puede aparecer varias veces.
- **Tamaño dinámico:** pueden crecer o reducirse según la cantidad de elementos.
- **Modificables:** permiten agregar, eliminar y reemplazar elementos.

Los índices de una lista comienzan desde cero, al igual que en los arreglos.

## 3. Java Collections Framework

El Java Collections Framework es un conjunto de interfaces y clases que proporciona Java para almacenar, organizar y manipular grupos de objetos.

Este framework facilita el trabajo con diferentes estructuras de datos y proporciona métodos que permiten realizar operaciones como agregar, eliminar, buscar y recorrer elementos.

Entre sus principales componentes se encuentran:

- **List:** interfaz que representa colecciones ordenadas.
- **Set:** interfaz que representa colecciones sin elementos duplicados.
- **Queue:** interfaz que representa estructuras de tipo cola.
- **Map:** interfaz que permite almacenar información mediante pares de clave y valor.

## 4. La interfaz List

List es una interfaz del Java Collections Framework que define las operaciones que debe ofrecer una lista.

No se puede crear directamente un objeto utilizando `new List()`, porque es una interfaz. Para trabajar con ella se utilizan clases que implementan sus operaciones, como ArrayList y LinkedList.

Ejemplo:

```java
List<String> nombres = new ArrayList<>();
```

En esta declaración:

- `List`: interfaz que define las operaciones.
- `<String>`: indica que se almacenarán cadenas de texto.
- `nombres`: nombre de la variable.
- `new ArrayList<>()`: crea una lista utilizando la implementación ArrayList.

## 5. Tipos de listas en Java

Java proporciona diferentes implementaciones de la interfaz List. Las tres principales estudiadas son:

### 5.1. ArrayList

ArrayList es una implementación de List que utiliza internamente un arreglo dinámico para almacenar sus elementos.

Su principal ventaja es que permite acceder rápidamente a los elementos mediante sus índices.

Características:

- Su tamaño puede aumentar o disminuir dinámicamente.
- Mantiene el orden de inserción.
- Permite elementos duplicados.
- Permite acceder rápidamente a los elementos mediante `get()`.
- Al insertar o eliminar elementos en medio de la lista, puede necesitar desplazar otros elementos.

Ejemplo:

```java
import java.util.ArrayList;

public class EjemploArrayList {
    public static void main(String[] args) {

        ArrayList<String> nombres = new ArrayList<>();

        nombres.add("Ana");
        nombres.add("Luis");
        nombres.add("Mia");

        System.out.println(nombres.get(1));
    }
}
```

Resultado:

```text
Luis
```

### 5.2. LinkedList

LinkedList es una implementación de List que utiliza nodos enlazados entre sí. Cada nodo almacena un dato y referencias al nodo anterior y al siguiente.

Esta estructura permite agregar y eliminar elementos en los extremos de manera eficiente.

Características:

- Utiliza una estructura doblemente enlazada.
- Mantiene el orden de inserción.
- Permite elementos duplicados.
- Puede aumentar o disminuir dinámicamente.
- Permite agregar y eliminar elementos al inicio y al final.
- Para acceder a un elemento mediante un índice necesita recorrer los nodos.

Ejemplo:

```java
import java.util.LinkedList;

public class EjemploLinkedList {
    public static void main(String[] args) {

        LinkedList<String> canciones = new LinkedList<>();

        canciones.add("Cancion 1");
        canciones.add("Cancion 2");

        canciones.addFirst("Cancion 0");
        canciones.addLast("Cancion 3");

        canciones.removeFirst();

        System.out.println(canciones);
    }
}
```

Resultado:

```text
[Cancion 1, Cancion 2, Cancion 3]
```

### 5.3. Vector

Vector es una implementación de List que funciona de manera similar a ArrayList, utilizando un arreglo dinámico para almacenar elementos.

Su característica principal es que sus métodos principales están sincronizados, lo que permite coordinar el acceso de varios hilos a la colección.

Características:

- Utiliza un arreglo dinámico.
- Mantiene el orden de inserción.
- Permite elementos duplicados.
- Su tamaño puede aumentar o disminuir.
- Sus métodos principales están sincronizados.
- Se conserva principalmente por compatibilidad con código antiguo.

Ejemplo:

```java
import java.util.Vector;

public class EjemploVector {
    public static void main(String[] args) {

        Vector<Integer> numeros = new Vector<>();

        numeros.add(10);
        numeros.add(20);
        numeros.add(30);

        System.out.println(numeros.get(0));
        System.out.println(numeros);
    }
}
```

Resultado:

```text
10
[10, 20, 30]
```

## 6. Comparación entre ArrayList, LinkedList y Vector

Las tres implementaciones permiten trabajar con listas, pero presentan diferencias en su estructura interna y funcionamiento.

| Característica | ArrayList | LinkedList | Vector |
|---|---|---|---|
| Estructura interna | Arreglo dinámico | Nodos enlazados | Arreglo dinámico |
| Tamaño dinámico | Sí | Sí | Sí |
| Mantiene el orden | Sí | Sí | Sí |
| Permite duplicados | Sí | Sí | Sí |
| Acceso por índice | Rápido | Más lento | Rápido |
| Operaciones en extremos | Eficiente al final | Eficiente en ambos extremos | Eficiente al final |
| Métodos sincronizados | No | No | Sí |

La elección de una implementación depende de las operaciones que necesite realizar el programa.

## 7. Diferencias entre arreglos y listas

Los arreglos y las listas permiten almacenar varios elementos, pero presentan diferencias importantes.

| Característica | Arreglos | Listas |
|---|---|---|
| Tamaño | Fijo | Dinámico |
| Datos almacenados | Primitivos u objetos | Objetos |
| Acceso a elementos | Mediante índices | Mediante métodos e índices |
| Agregar elementos | Asignación en una posición disponible | Método `add()` |
| Eliminar elementos | Reorganización manual | Método `remove()` |
| Obtener cantidad | `length` | `size()` |

Ejemplo de arreglo:

```java
String[] nombres = new String[3];

nombres[0] = "Juan";
nombres[1] = "Pedro";
nombres[2] = "Ana";
```

Ejemplo de lista:

```java
ArrayList<String> nombres = new ArrayList<>();

nombres.add("Juan");
nombres.add("Pedro");
nombres.add("Ana");
nombres.add("Carlos");
```

La principal diferencia es que el arreglo tiene un tamaño establecido al crearse, mientras que la lista permite agregar y eliminar elementos de manera dinámica.

## 8. Declaración de listas y tipos de datos

Para utilizar ArrayList es necesario importar la clase correspondiente.

```java
import java.util.ArrayList;
```

Posteriormente, se declara la lista indicando el tipo de dato que almacenará.

Ejemplos:

```java
ArrayList<String> nombres = new ArrayList<>();

ArrayList<Integer> edades = new ArrayList<>();

ArrayList<Double> precios = new ArrayList<>();

ArrayList<Boolean> estados = new ArrayList<>();
```

Los genéricos de Java trabajan con tipos de referencia. Por esta razón, se utilizan clases envoltorio en lugar de tipos primitivos.

| Tipo primitivo | Clase envoltorio |
|---|---|
| int | Integer |
| double | Double |
| boolean | Boolean |
| char | Character |
| float | Float |

## 9. Métodos principales de ArrayList

Los métodos permiten realizar diferentes operaciones sobre los elementos de una lista.

### 9.1. Método add()

Permite agregar elementos al final de la lista.

```java
ArrayList<String> frutas = new ArrayList<>();

frutas.add("Manzana");
frutas.add("Pera");
frutas.add("Uva");
```

Resultado:

```text
[Manzana, Pera, Uva]
```

### 9.2. Método get()

Permite obtener un elemento mediante su posición o índice.

```java
System.out.println(frutas.get(0));
```

Resultado:

```text
Manzana
```

### 9.3. Método set()

Permite reemplazar un elemento existente por otro.

```java
frutas.set(1, "Naranja");
```

Resultado:

```text
[Manzana, Naranja, Uva]
```

### 9.4. Método remove()

Permite eliminar un elemento por su valor o por su índice.

```java
frutas.remove("Uva");
```

También se puede eliminar mediante una posición:

```java
frutas.remove(0);
```

### 9.5. Método size()

Permite conocer la cantidad de elementos que contiene la lista.

```java
System.out.println(frutas.size());
```

### 9.6. Método contains()

Permite comprobar si un elemento existe dentro de la lista. Devuelve un valor booleano: true o false.

```java
System.out.println(frutas.contains("Naranja"));
```

### 9.7. Método clear()

Permite eliminar todos los elementos de una lista.

```java
frutas.clear();
```

Después de utilizar este método, la lista queda vacía.

## 10. Formas de recorrer una lista

Para mostrar o consultar todos los elementos de una lista se pueden utilizar diferentes ciclos.

### 10.1. Ciclo for tradicional

Permite recorrer los elementos utilizando sus índices.

```java
for (int i = 0; i < nombres.size(); i++) {
    System.out.println(nombres.get(i));
}
```

En este ciclo:

- `int i = 0`: comienza desde la primera posición.
- `i < nombres.size()`: controla que existan elementos por recorrer.
- `i++`: aumenta el índice.
- `nombres.get(i)`: obtiene el elemento de la posición actual.

### 10.2. Ciclo for-each

Permite recorrer directamente los elementos sin manejar índices.

```java
for (String nombre : nombres) {
    System.out.println(nombre);
}
```

Esta forma es más sencilla cuando solamente necesitamos mostrar o leer los elementos de una lista.

## 11. Aplicaciones de las listas en la vida cotidiana

Las listas tienen diferentes aplicaciones dentro de los programas informáticos. Algunos ejemplos son:

- **Instituciones educativas:** almacenar nombres, edades y calificaciones de estudiantes.
- **Tiendas:** organizar productos disponibles y precios.
- **Videojuegos:** almacenar objetos dentro del inventario de un personaje.
- **Aplicaciones de mensajería:** organizar mensajes de una conversación.
- **Sistemas de ventas:** registrar productos de una compra.
- **Reproductores de música:** organizar canciones en una lista de reproducción.

Estas aplicaciones demuestran la importancia de las listas para administrar información que puede cambiar durante la ejecución de un programa.

## 12. Importancia de las listas en la programación

Las listas son importantes porque permiten administrar grandes cantidades de información de una manera organizada y flexible.

Su utilización facilita el desarrollo de programas que necesitan almacenar datos variables, realizar búsquedas, modificar información y eliminar elementos.

Además, conocer sus diferentes implementaciones permite seleccionar la estructura más adecuada según las necesidades de cada aplicación.

## 13. Conclusión de la investigación

Las listas en Java constituyen una herramienta fundamental para almacenar y administrar colecciones de datos. A diferencia de los arreglos tradicionales, permiten modificar dinámicamente la cantidad de elementos, facilitando su manipulación durante la ejecución de un programa.

Mediante el estudio de List, ArrayList, LinkedList y Vector es posible comprender que existen diferentes formas de organizar y administrar la información. Cada implementación presenta características específicas que determinan su utilidad dependiendo de las operaciones que se necesiten realizar.

Finalmente, el conocimiento de los métodos principales, como `add()`, `get()`, `set()`, `remove()`, `size()`, `contains()` y `clear()`, permite desarrollar programas más flexibles, organizados y eficientes.

## 14. Bibliografía y fuentes de consulta

- Oracle. *Java Documentation*. https://docs.oracle.com/en/java/
- Oracle. *Java Collections Framework*. https://docs.oracle.com/javase/8/docs/technotes/guides/collections/overview.html
- Oracle. *Class ArrayList*. https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/util/ArrayList.html
- Oracle. *Class LinkedList*. https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/util/LinkedList.html
- Oracle. *Class Vector*. https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/util/Vector.html
