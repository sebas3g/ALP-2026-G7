import java.util.LinkedList;

public class EjemploLinkedList {
    public static void main(String[] args) {

        LinkedList<String> canciones = new LinkedList<>();

        // Agregar elementos
        canciones.add("Cancion 1");
        canciones.add("Cancion 2");
        canciones.add("Cancion 3");

        // Agregar al inicio
        canciones.addFirst("Cancion 0");

        // Agregar al final
        canciones.addLast("Cancion 4");

        System.out.println("Lista inicial:");
        System.out.println(canciones);

        // Eliminar el primer elemento
        canciones.removeFirst();

        // Eliminar el ultimo elemento
        canciones.removeLast();

        System.out.println("Lista actualizada:");
        System.out.println(canciones);

        // Obtener un elemento
        System.out.println("Primera cancion: " + canciones.get(0));

        // Cantidad de elementos
        System.out.println("Cantidad: " + canciones.size());
    }
}
