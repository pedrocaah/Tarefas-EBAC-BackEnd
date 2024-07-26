import java.util.ArrayList;

public class Programa {
    public static void main(String args[]) {
        ArrayList<Carros> listaCarros = new ArrayList<>();
        listaCarros.add(new Honda());
        listaCarros.add(new Volkswagen());
        listaCarros.add(new Renault());

        for (Carros carros : listaCarros){
            carros.criarSedan();
            carros.criarHatch();
            carros.criarSUV();
        }
    }
}
