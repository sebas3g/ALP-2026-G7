import java.util.ArrayList;

public class RetoNumeros {
    public static void main(String[] args) {

        ArrayList<Integer> numeros = new ArrayList<>();

        // Agregar numeros
        numeros.add(10);
        numeros.add(20);
        numeros.add(30);

        System.out.println("Lista inicial: " + numeros);

        // Cambiar 20 por 50
        numeros.set(1, 50);

        // Eliminar el numero 10
        numeros.remove(Integer.valueOf(10));

        // Mostrar resultados
        System.out.println("Lista final: " + numeros);
        System.out.println("Cantidad de elementos: " + numeros.size());
    }
}
