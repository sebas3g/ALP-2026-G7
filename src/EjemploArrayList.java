import java.util.ArrayList;

public class EjemploArrayList {
    public static void main(String[] args) {

        ArrayList<String> estudiantes = new ArrayList<>();

        // Agregar elementos
        estudiantes.add("Francis");
        estudiantes.add("Dixon");
        estudiantes.add("David");
        estudiantes.add("Sebas");

        System.out.println("Lista inicial: " + estudiantes);

        // Obtener un elemento
        System.out.println("Primer estudiante: " + estudiantes.get(0));

        // Modificar un elemento
        estudiantes.set(1, "Carlos");

        // Eliminar un elemento
        estudiantes.remove("David");

        // Mostrar cantidad
        System.out.println("Cantidad: " + estudiantes.size());

        // Buscar un elemento
        System.out.println("Existe Sebas: " + estudiantes.contains("Sebas"));

        // Recorrer la lista
        System.out.println("Lista actualizada:");

        for (String estudiante : estudiantes) {
            System.out.println(estudiante);
        }

        // Vaciar la lista
        estudiantes.clear();

        System.out.println("Lista vacia: " + estudiantes);
    }
}
