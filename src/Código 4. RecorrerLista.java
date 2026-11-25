import java.util.ArrayList;

public class RecorrerLista {
    public static void main(String[] args) {

        ArrayList<String> nombres = new ArrayList<>();

        nombres.add("Francis");
        nombres.add("Dixon");
        nombres.add("David");
        nombres.add("Sebas");

        System.out.println("Recorrido con FOR:");

        for (int i = 0; i < nombres.size(); i++) {
            System.out.println(nombres.get(i));
        }

        System.out.println("Recorrido con FOR-EACH:");

        for (String nombre : nombres) {
            System.out.println(nombre);
        }
    }
}
