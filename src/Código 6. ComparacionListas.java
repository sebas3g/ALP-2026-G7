import java.util.List;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Vector;

public class ComparacionListas {
    public static void main(String[] args) {

        List<String> lista1 = new ArrayList<>();
        List<String> lista2 = new LinkedList<>();
        List<String> lista3 = new Vector<>();

        lista1.add("Ana");
        lista2.add("Luis");
        lista3.add("Pedro");

        System.out.println("ArrayList: " + lista1);
        System.out.println("LinkedList: " + lista2);
        System.out.println("Vector: " + lista3);
    }
}
