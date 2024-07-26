import java.util.ArrayList;
import java.util.List;

public class JavaGenerics {
    public static void main(String[] args) {
        List lista = new ArrayList();
        lista.add("Pedro");
        lista.add(1);
        imprimir(lista);
    }

    public static void imprimir(List<String> lista) {
        for (String st : lista) {
            System.out.println(st);
        }
    }
}