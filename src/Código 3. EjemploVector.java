import java.util.Vector;

public class EjemploVector {
    public static void main(String[] args) {

        Vector<Integer> numeros = new Vector<>();

        // Agregar elementos
        numeros.add(10);
        numeros.add(20);
        numeros.add(30);
        numeros.add(40);

        System.out.println("Vector inicial:");
        System.out.println(numeros);

        // Obtener un elemento
        System.out.println("Primer numero: " + numeros.get(0));

        // Modificar un elemento
        numeros.set(1, 50);

        // Eliminar un elemento
        numeros.remove(2);

        // Mostrar cantidad
        System.out.println("Cantidad: " + numeros.size());

        System.out.println("Vector actualizado:");
        System.out.println(numeros);
    }
}
