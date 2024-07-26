public class Renault extends Carros {

    @Override
    void criarSedan() {
        System.out.println("Criando Megane");
    }

    @Override
    void criarSUV() {
        System.out.println("Criando Duster");
    }

    @Override
    void criarHatch() {
        System.out.println("Criando Sandero");
    }
}
